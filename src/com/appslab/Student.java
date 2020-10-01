package com.appslab;

public class Student {
    private int studentNumber = 12345;
    private String name = "John";
    public void setName(String Name, int studentNumber){
    }

    public Student(int studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
