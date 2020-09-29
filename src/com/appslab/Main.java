package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(isTriangle(2,3,4));
        System.out.println(isTriangle(3,4,5));
        System.out.println(isTriangle(4,3,8));
    }
    public static boolean isTriangle(int a, int b, int c){
     if(a + b > c && a + c > b && b + c > a) {
         return true;
     }
     return false;
    }
}
