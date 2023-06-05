package com.aisha.exercises.games.batteships;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    public static final Board board = new Board(10,10);
    public static final List<Cell> opponentBombedCells = new ArrayList<>();

    Player playerTestTarget = new Player(board,opponentBombedCells);


    @Test
    @DisplayName("first cell should be added successfully to the list ")
    void scenario1() {
        Cell cell = new Cell(1, 1);
        assertTrue(playerTestTarget.trackCellsBombedOnOpponentsBoard(cell, board));
    }

    @Test
    @DisplayName("d" +
            "Duplicate cells are not allowed")
    void scenario2() {
        Cell cell = new Cell(1, 1);
        playerTestTarget.trackCellsBombedOnOpponentsBoard(cell, board);
        Cell cell2 = new Cell(1, 1);
        assertFalse(playerTestTarget.trackCellsBombedOnOpponentsBoard(cell2, board));
    }

    @Test
    @DisplayName("Different cells are allowed")
    void scenario3() {
        Cell cell = new Cell(1, 1);
        playerTestTarget.trackCellsBombedOnOpponentsBoard(cell, board);
        Cell cell2 = new Cell(2, 3);
        assertTrue(playerTestTarget.trackCellsBombedOnOpponentsBoard(cell2, board));
    }

    @Test
    @DisplayName("Different cells are allowed")
    void scenario4() {
        Cell cell = new Cell(1, 1);
        playerTestTarget.trackCellsBombedOnOpponentsBoard(cell, board);
        Cell cell2 = new Cell(3, 1);
        assertTrue(playerTestTarget.trackCellsBombedOnOpponentsBoard(cell2, board));
    }

}