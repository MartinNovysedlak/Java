package com.appslab;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("John", 21,23000);
        Person person2 = new Person("Steve", 32,40000);
        Person person3 = new Person("Martin", 16,2700);
        System.out.println("Name:" + person1.getName() + ",Age:" + person1.getAge() + ",Budget:" + person1.getBudget());
        System.out.println("Name:" + person2.getName() + ",Age:" + person2.getAge() + ",Budget:" + person2.getBudget());
        System.out.println("Name:" + person3.getName() + ",Age:" + person3.getAge() + ",Budget:" + person3.getBudget());
        System.out.println(sum(new Person[] {person1, person2, person3}));
    }
    public static int sum(Person[] sume){
        var budget = 0;
        for(Person person:sume){
            budget += person.getBudget();
        }
        return budget;
    }
}
