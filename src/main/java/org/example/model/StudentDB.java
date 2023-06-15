package org.example.model;

import java.util.Arrays;

public class StudentDB {
    Student2[] students;


    public StudentDB(Student2... values){
        students = getAllStudents(values);
    }

    public Student2[] getAllStudents(Student2... values){
        return values;
    }

    public Student2[] getAllStudentsArray(){
        return students;
    }

    public Student2 randomStudent(){
        int randomIndex = (int) (Math.random() * students.length);
        return students[randomIndex];
    }

    public void addStudent(Student2 newStudent){
        Student2[] newArray = Arrays.copyOf(students, students.length + 1);
        newArray[students.length] = newStudent;
        students = newArray;
    }

    public void removeStudent(Student2 oldStudent){
        int indexToRemove = -1;
        for (int i = 0; i < students.length; i++){
            if (students[i] == oldStudent){
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            Student2[] newStudents = new Student2[students.length - 1];

            // Copy the elements before the index
            if (indexToRemove > 0) {
                System.arraycopy(students, 0, newStudents, 0, indexToRemove);
            }

            // Copy the elements after the index
            if (indexToRemove < students.length - 1) {
                System.arraycopy(students, indexToRemove + 1, newStudents, indexToRemove, students.length - indexToRemove - 1);
            }
            students = newStudents;
        }
    }

    public Student2 findStudentById(String id) throws Exception{

        for (Student2 student : students){
            if (student.getId().equals(id)){
                return student;
            }
        }
        throw new Exception("Student not found");
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}

