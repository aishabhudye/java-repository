package com.example.maths;

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
        System.out.println(limit);

        //Declare a counter variable of type int and initialise its value to 0
        int counter = 0;
        //The div operation works here as 10/2=5 and 11/2=5#
        //evenNumber is the pigeonhole and limit/2 is its size
        int[] evenNumbers = new int[limit / 2];
        for (int i = 0; i <= limit; i++) {
            System.out.println(counter);
            if (i % 2 == 0) {
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

    public int[] listTriangularNumbers(int limit) {
        System.out.println(limit);

        //Declare a counter variable of type int and initialise its value to 0
        int counter = 0;
        //evenNumber is the pigeonhole and limit/2 is its size
        int[] triangularNumbers = new int[limit - 6];
        for (int i = 0; i <= limit; i++) {
            System.out.println(counter);

            //Google a general formula for triangular numbers  T = (n)(n + 1) / 2.
            return triangularNumbers;
        }

        return triangularNumbers;
    }
}