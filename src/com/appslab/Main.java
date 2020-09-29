package com.appslab;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiplyByLength(new int[]{2,3,1,0})));
        System.out.println(Arrays.toString(multiplyByLength(new int[]{4,1,1})));
        System.out.println(Arrays.toString(multiplyByLength(new int[]{1,0,3,3,7,2,1})));
        System.out.println(Arrays.toString(multiplyByLength(new int[]{0})));
    }
    public static int[] multiplyByLength(int[] array){
        int length = array.length;
        for (int a = 0; a < length; a++ )
        {
            array[a] *= length;
        }
        return array;
    }
}
