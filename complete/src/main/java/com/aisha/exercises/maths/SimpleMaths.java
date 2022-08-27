package com.aisha.exercises.maths;

import java.util.ArrayList;
import java.util.List;

public class SimpleMaths {
    /**
     * It helps to think of arrays as a pigeonhole system and the index as a location in the system
     * This is a method list even number up to a limit defined by the input/argument.
     * It is defined wtih public access meaning other classes can invoke it.
     *
     * @param limit - this is the limit up to which we will find the even numbers
     * @return an array of even numbers
     */
    public int[] listEvenNumbers(int limit) {


        //Declare a counter variable of type int and initialise its value to 0
        int counter = 0;
        //The div operation works here as 10/2=5 and 11/2=5#
        //evenNumber is the pigeonhole and limit/2 is its size
        int[] evenNumbers = new int[limit / 2 + 1];
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println(counter);
                //Since we are using a mod operation, we will get inside this block ONLY and ONLY if i is an even number
                //evenNumbers is the name of the pigeonhole system and counter is the location
                evenNumbers[counter] = i;
                //Increment after first use
                counter = counter + 1;
            }
        }
        return evenNumbers;
    }

    public int[] listOddNumbers(int limit) {
        System.out.println(limit);

        //Declare a counter variable of type int and initialise its value to 0
        int counter = 0;
        //The div operation works here as 10/2=5 and 11/2=5#
        //evenNumber is the pigeonhole and limit/2 is its size
        int[] oddNumbersNumbers = new int[limit / 2];
        for (int i = 0; i <= limit; i++) {
            System.out.println(counter);
            if (i % 2 != 0) {
                //Since we are using a mod operation, we will get inside this block ONLY and ONLY if i is an even number
                //oddNumbersNumbers is the name of the pigeonhole system and counter is the location
                oddNumbersNumbers[counter] = i;
                //Increment after first use
                counter = counter + 1;
            }
        }


        //Use a loop
        //Lookup the mod or div operation in Java
        return oddNumbersNumbers;
    }

    public List<Integer> listTriangularNumbers(int limit) {

        List<Integer> triangularNumbers = new ArrayList<>();

        int triangularNumber = 1;
        for (int i = 1; triangularNumber <= limit - 1; i++) {

            //Calculate the triangular number
            triangularNumber = i * (i + 1) / 2;
            triangularNumbers.add(triangularNumber);
        }
        return triangularNumbers;
    }


    public String determineRoots(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return "2 distinct real roots";
        } else if (discriminant == 0) {
            return "single real root";
        } else {
            return "no real roots";
        }
    }

}












//Use a loop
//Lookup the mod or div operation in Java






