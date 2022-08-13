package com.aisha.exercises.maths;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SimpleMathsTest {

    private final SimpleMaths simpleMaths = new SimpleMaths();


    @Test
    public void test_list_even_numbers() {
        int[] evenNumbers = simpleMaths.listEvenNumbers(10);
        int[] expectedEvenNumbers = {0, 2, 4, 6, 8, 10};
        assertArrayEquals(expectedEvenNumbers, evenNumbers);
    }

    @Disabled
    public void test_list_odd_numbers() {
        int[] oddNumbersNumbers = simpleMaths.listOddNumbers(10);
        int[] expectedOddNumbers = {1, 3, 5, 7, 9};
        assertArrayEquals(expectedOddNumbers, oddNumbersNumbers);
    }

    @Disabled
    public void test_list_triangular_numbers() {
        int[] triangularNumbers = simpleMaths.listTriangularNumbers(10);
        int[] expectedTriangularNumbers = {1, 3, 6, 10};
        assertArrayEquals(expectedTriangularNumbers, triangularNumbers);
    }

}
