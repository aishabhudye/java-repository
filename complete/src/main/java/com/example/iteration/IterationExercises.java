package com.example.iteration;

import java.lang.reflect.Array;

public class IterationExercises {

    public String[] reverseArray(String[] siblings) {
        System.out.println(siblings);
        String[] reversedSiblings = new String[siblings.length];
        for (int i = 0; i < siblings.length; i++) {
            System.out.println("Loop over array with index, child name is " + siblings[i]);
            reversedSiblings[siblings.length - (i + 1)] = siblings[i];
        }

        return reversedSiblings;
    }


    public int[] reverseIntegers(int[] numbers) {
        System.out.println(numbers);
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Loop over array with index, child name is " + numbers[i]);
            reversedNumbers[numbers.length - (i + 1)] = numbers[i];
        }

        return reversedNumbers;
    }

    public String reverseWord(String word){
        String[] separated_letters = word.split("");
        /*
        TODO Call existing function to reverse array of separated letters
        TODO Join the output from above to form a string to return
         */
        return null;
    }
}
    
