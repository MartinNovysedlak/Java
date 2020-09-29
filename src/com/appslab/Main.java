package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(equality(3,4,3));
        System.out.println(equality(1,1,1));
        System.out.println(equality(3,4,1));
    }
    public static int equality (int a, int b, int c)
    {
        if (a == b || a == c)
        {
            if (b == c)
            {
                return 3;
            }
                return 2;
        }
        if(b==c)
        {
            return 2;
        }
        return 0;
    }
}
