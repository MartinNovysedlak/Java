package com.appslab;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(12345, "John");
        System.out.println(student1.getName() + ": " + student1.getStudentNumber());
    }
}
