package com.aisha.exercises.maths;

import java.util.Scanner;

public class FlooringCostCalculator {

    public static void main(String[] args) {
        FlooringCostCalculator flooringCosts = new FlooringCostCalculator();
        flooringCosts.run();
    }

    public float run() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of your floor : ");
        float length = scn.nextFloat();
        System.out.println("Enter width of your floor : ");
        float width = scn.nextFloat();
        return flooringCosts(length, width);
    }


    public float flooringCosts(float length, float width) {
        float cost = 0.0F;
        if (length <= 0.0 || width > 4.0) {
            System.out.println("ERROR");
        } else {
            cost = length * width * 10;
            System.out.println(cost);
        }
        return cost;
    }

}



