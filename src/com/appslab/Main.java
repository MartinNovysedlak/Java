package com.appslab;

public class Main {

    public static void main(String[] args) {
    System.out.println(totalDistance(0.2,0.4,100));
    }

    private static double totalDistance(double height, double lenght, double tower)
    {
        double steps = tower/height;
        double numberSteps = steps * (lenght + height);
        return (int)numberSteps;
    }
}
