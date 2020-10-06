package com.appslab;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(2, "John", "123456", "01001 Zilina");
        Student student2 = new Student(5, "Sam", "456789", "01001 Zilina" );
        System.out.println(student1.getName() + ": " + student1.getStudentNumber()  + "," + student1.getPhoneNumber() + "," + student1.getAddress());
        System.out.println(student2.getName() + ": " + student2.getStudentNumber() + "," + student2.getPhoneNumber() + "," + student2.getAddress());
    }
}
