package com.appslab;

public class Student {
    private int studentNumber = 12345;
    private String name = "John";
    private String phoneNumber = "0948000555";
    private String address = "Čadca 144";
    public void setName(String Name, int studentNumber, String phoneNumber, String address){
    }

    public Student(int studentNumber, String name, String phoneNumber, String address) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress(){ return address;}

    public String getPhoneNumber(){ return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
