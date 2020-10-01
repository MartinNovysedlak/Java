package com.appslab;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("John");
        student1.setStudentNumber(12345);
        System.out.println(student1.getName() + ": " + student1.getStudentNumber());
    }
}
