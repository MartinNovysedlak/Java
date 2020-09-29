package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("mom"));
        System.out.println(checkPalindrome("scary"));
        System.out.println(checkPalindrome("reviver"));
        System.out.println(checkPalindrome("stressed"));
    }
    public static boolean checkPalindrome(String word){
        char[] arrChar = word.toCharArray();
        for (int i = 0; i < arrChar.length; i++ )
        {
            char a = arrChar[i];
            char b = arrChar[arrChar.length - 1 - i];

            if(a != b) {
                return false;
            }
        }
        return true;
    }
}
