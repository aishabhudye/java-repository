package com.example.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IterationExercisesTest {

    private final IterationExercises exercises = new IterationExercises();

    @Test
    void test_reverse_method(){
        String[] siblings = {"Aisha", "Hafsa", "Talha"};
        String[] reversedSiblings = {"Talha", "Hafsa", "Aisha"};
        String[] reversedArray = exercises.reverseArray(siblings);
        assertArrayEquals(reversedSiblings, reversedArray);

    }

    @Test
    void test_reverse_alphabet(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j",};
        String[] reversedAlphabet = {"j","i","h","g","f","e","d","c","b","a"};
        String[] reversedLetters = exercises.reverseArray(alphabet);
        assertArrayEquals(reversedAlphabet, reversedLetters);

    }

    @Test
    void test_reverse_numbers(){
        int[] numbers = {10,20,30,40,50};
        int[] reversedNumbers = {50,40,30,20,10};
        int[] reversedIntegers = exercises.reverseIntegers(numbers);
        assertArrayEquals(reversedNumbers, reversedIntegers);

    }

    @Test
    void test_reverse_word(){
        String longestEnglishWord = "Pneumonoultramicroscopicsilicovolcanoconiosis";
        String longestEnglishWordInReverse = exercises.reverseWord(longestEnglishWord);
        assertEquals("sisoinoconaclovociliscipocsorcimartluonomuenP", longestEnglishWordInReverse);
    }
}
