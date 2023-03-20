package com.aisha.exercises.games.batteships;

public class Board {
    private int length;
    private int width;
    private  String[][] grid = {};

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String[][] getGrid() {
        return grid;
    }

    public Board(int length, int width, String[][] grid) {
        this.length = length;
        this.width = width;
        this.grid = grid;
    }

    public void putVesselOnBoard(){

    }
}
