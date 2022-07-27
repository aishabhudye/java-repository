package com.example.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterationExercisesTest {

    private final IterationExercises exercises = new IterationExercises();

    @Test
    void test_reverse_method(){
        String[] siblings = {"Aisha", "Hafsa", "Talha"};
        String[] reversedSiblings = {"Talha", "Hafsa", "Aisha"};
        String[] reversedArray = exercises.reverseArray(siblings);
        assertArrayEquals(reversedSiblings, reversedArray);
    }
}