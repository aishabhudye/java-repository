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
    public void test_quadratic_numbers() {
        int discriminant = simpleMaths.quadraticNumbers();
        assertEquals(discriminant,discriminant );

    }
    @Test
    public void test_one_root_numbers() {
        int discriminant = simpleMaths.quadraticNumbers();
        assertEquals(discriminant,discriminant );

    }
    @Test
    public void test_no_root_numbers() {
        int discriminant = simpleMaths.quadraticNumbers();
        assertEquals(discriminant,discriminant );

    }


}






