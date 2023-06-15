package org.example.model;
import java.util.UUID;

// Student für Aufgabe 2
public class Student2 {
    private String name;
    private String id;

    public Student2(String name){
        this.name = name;
        id = UUID.randomUUID().toString();
    }

    public String toString(){
        return "\n"+name + ", Id: " + id;
    }

    public String getId() {
        return id;
    }
}
