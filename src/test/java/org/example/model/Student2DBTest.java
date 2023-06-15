package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Student2DBTest {

    @Test
    void returnException_whenNotfindStudentById() {
        Student2 student1 = new Student2("Pia");
        Student2 student2 = new Student2("Benjamin");
        Student2 student3 = new Student2("Gökhan");
        Student2 student4 = new Student2("Enrico");
        StudentDB studentDb = new StudentDB(student1, student2, student3, student4);



        try{

            studentDb.findStudentById("1");
            Assertions.fail("Exception not thrown");
        }
        catch (Exception e){
            Assertions.assertEquals("Student not found", e.getMessage());
        }


    }
}