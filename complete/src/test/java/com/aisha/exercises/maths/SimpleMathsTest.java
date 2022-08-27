package com.aisha.exercises.maths;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathsTest {

    private final SimpleMaths simpleMaths = new SimpleMaths();


    @Test
    public void test_list_even_numbers() {
        int[] evenNumbers = simpleMaths.listEvenNumbers(10);
        int[] expectedEvenNumbers = {0, 2, 4, 6, 8, 10};
        assertArrayEquals(expectedEvenNumbers, evenNumbers);
    }

    @Test
    public void test_list_odd_numbers() {
        int[] oddNumbersNumbers = simpleMaths.listOddNumbers(10);
        int[] expectedOddNumbers = {1, 3, 5, 7, 9};
        assertArrayEquals(expectedOddNumbers, oddNumbersNumbers);
    }

    @Test
    public void test_list_triangular_numbers() {
        List<Integer> triangularNumbers = simpleMaths.listTriangularNumbers(10);
        Integer[] triangularNumbersArray = {1, 3, 6, 10};
        List<Integer> expectedTriangularNumbers = Arrays.asList(triangularNumbersArray);
        triangularNumbers.removeAll(expectedTriangularNumbers);
        assertEquals(0, triangularNumbers.size());
    }

    @Test
    public void test_2_distinct_real_roots() {
        // x*x -4*x +3 = 0
        String outcome = simpleMaths.determineRoots(1, -4, 3);
        assertEquals("2 distinct real roots",outcome );

    }

    @Test
    public void test_single_root() {
        //x*x -2*x +1 = 0
        String outcome = simpleMaths.determineRoots(1, -2, 1);
        assertEquals("single real root",outcome );
    }



    @Test
    public void test_no_real_root() {
        // x*x +1 = 0
        String outcome = simpleMaths.determineRoots(1, 0, 1);
        assertEquals("no real roots",outcome );
    }}






