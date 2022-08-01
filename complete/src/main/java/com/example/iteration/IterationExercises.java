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

    private String joinArrayElments(String[] separated_letters_in_reverse) {
        String join = "";
        for (int i = 0; i < separated_letters_in_reverse.length; i++) {
            String element = separated_letters_in_reverse[i];
            join = join + element;
        }
        return join;
    }

    public String reverseWord(String word) {
        System.out.println(word);
        String[] separated_letters = word.split("");
        String[] separated_letters_in_reverse = reverseArray(separated_letters);
        String reversedWord = joinArrayElments(separated_letters_in_reverse);
        return reversedWord;
    }
}







    
