package com.aisha.exercises.games;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private final TicTacToe ticTacToe = new TicTacToe();

    @Test
    public void test_that_someone_has_won_in_a_row1() {
        String[] noughtsCrosses = {"X", "X", "X", "", "", "", "", "", ""};
        assertTrue(ticTacToe.someoneHasWonInARow(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_row2(){
        String[] noughtsCrosses = {"0", "0", "0", "", "", "", "", "", ""};
        assertTrue(ticTacToe.someoneHasWonInARow(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_row3(){
        String[] noughtsCrosses = {"", "", "", "X", "X", "X", "", "", ""};
        assertTrue(ticTacToe.someoneHasWonInARow(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_row4(){
        String[] noughtsCrosses = {"", "", "", "0", "0", "0", "", "", ""};
        assertTrue(ticTacToe.someoneHasWonInARow(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_row5(){
        String[] noughtsCrosses = {"", "", "", "", "", "", "X", "X", "X"};
        assertTrue(ticTacToe.someoneHasWonInARow(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_row6(){
        String[] noughtsCrosses = {"", "", "", "", "", "", "0", "0", "0"};
        assertTrue(ticTacToe.someoneHasWonInARow(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_column1(){
        String[] noughtsCrosses = {"X", "", "", "X", "", "", "X", "", ""};
        assertTrue(ticTacToe.someoneHasWonInAColumn(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_column2(){
        String[] noughtsCrosses = {"0", "", "", "0", "", "", "0", "", ""};
        assertTrue(ticTacToe.someoneHasWonInAColumn(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_column3(){
        String[] noughtsCrosses = {"", "X", "", "", "X", "", "", "X", ""};
        assertTrue(ticTacToe.someoneHasWonInAColumn(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_column4(){
        String[] noughtsCrosses = {"", "0", "", "", "0", "", "", "0", ""};
        assertTrue(ticTacToe.someoneHasWonInAColumn(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_column5(){
        String[] noughtsCrosses = {"", "", "X", "", "", "X", "", "", "X"};
        assertTrue(ticTacToe.someoneHasWonInAColumn(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_column6(){
        String[] noughtsCrosses = {"", "", "0", "", "", "0", "", "", "0"};
        assertTrue(ticTacToe.someoneHasWonInAColumn(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_diagonal1(){
        String[] noughtsCrosses = {"X", "", "", "", "X", "", "", "", "X"};
        assertTrue(ticTacToe.someoneHasWonInADiagonal(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_diagonal2(){
        String[] noughtsCrosses = {"0", "", "", "", "0", "", "", "", "0"};
        assertTrue(ticTacToe.someoneHasWonInADiagonal(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_diagonal3(){
        String[] noughtsCrosses = {"", "", "X", "", "X", "", "X", "", ""};
        assertTrue(ticTacToe.someoneHasWonInADiagonal(noughtsCrosses));
    }

    @Test
    public void test_that_someone_has_won_in_a_diagonal4(){
        String[] noughtsCrosses = {"", "", "0", "", "0", "", "0", "", ""};
        assertTrue(ticTacToe.someoneHasWonInADiagonal(noughtsCrosses));
    }

    @Test
    public void test_all_locations_are_not_populated1(){
        String[] noughtsCrosses = {"", "", "", "", "", "", "", "", ""};
        assertTrue(ticTacToe.boardIsNotFull(noughtsCrosses));
    }

    @Test
    public void test_all_locations_are_not_populated2(){
        String[] noughtsCrosses = {"", "", "", "", "", "", "", "", "X"};
        assertTrue(ticTacToe.boardIsNotFull(noughtsCrosses));
    }

    @Test
    public void test_all_locations_are_not_populated3(){
        String[] noughtsCrosses = {"X", "O", "X", "0", "X", "0", "X", "0", "X"};
        assertTrue(ticTacToe.boardIsNotFull(noughtsCrosses));
    }

    @Test
    public void test_all_locations_are_populated4(){
        String[] noughtsCrosses = {"X", "0", "X", "0", "X", "0", "X", "0", "X"};
        assertFalse(ticTacToe.boardIsNotFull(noughtsCrosses));
    }

    @Test
    public void test_validate_input1(){
        String input = "8:X";
        Move expectedMove = new Move(8, "X");
        Move actualMove = ticTacToe.validateInput(input);
        assertEquals(expectedMove, actualMove);
    }

    @Test
    public void test_validate_input2(){
        String input = "8:0";
        Move expectedMove = new Move(8, "0");
        Move actualMove = ticTacToe.validateInput(input);
        assertEquals(expectedMove, actualMove);
    }

    @Test
    public void test_validate_input3(){
        String input = "8:Z";
        Move expectedMove = new Move(-1, "!");
        Move actualMove = ticTacToe.validateInput(input);
        assertEquals(expectedMove, actualMove);
    }

    @Test
    public void test_validate_input4(){
        String input = "9:0";
        Move expectedMove = new Move(-1, "!");
        Move actualMove = ticTacToe.validateInput(input);
        assertEquals(expectedMove, actualMove);
    }

    @Test
    public void test_validate_input5(){
        String input = "9:Z";
        Move expectedMove = new Move(-1, "!");
        Move actualMove = ticTacToe.validateInput(input);
        assertEquals(expectedMove, actualMove);
    }

    @Test
    public void test_duplicate_attempt1(){
        Move currentMove = new Move(0,"X");
        Move previousMove = new Move(0,"X");
        boolean duplicateAttempt = ticTacToe.duplicateAttempt(currentMove, previousMove);
        assertTrue(duplicateAttempt);
    }

    @Test
    public void test_duplicate_attempt2(){
        Move currentMove = new Move(0,"0");
        Move previousMove = new Move(0,"0");
        boolean duplicateAttempt = ticTacToe.duplicateAttempt(currentMove, previousMove);
        assertTrue(duplicateAttempt);
    }

    @Test
    public void test_duplicate_attempt3(){
        Move currentMove = new Move(0,"0");
        Move previousMove = new Move(1,"0");
        boolean duplicateAttempt = ticTacToe.duplicateAttempt(currentMove, previousMove);
        assertTrue(duplicateAttempt);
    }

    @Test
    public void test_duplicate_attempt4(){
        Move currentMove = new Move(0,"0");
        Move previousMove = new Move(0,"X");
        boolean duplicateAttempt = ticTacToe.duplicateAttempt(currentMove, previousMove);
        assertTrue(duplicateAttempt);
    }

    @Test
    public void test_duplicate_attempt5(){
        Move currentMove = new Move(0,"0");
        Move previousMove = new Move(0,"X");
        boolean duplicateAttempt = ticTacToe.duplicateAttempt(currentMove, previousMove);
        assertTrue(duplicateAttempt);
    }

}
