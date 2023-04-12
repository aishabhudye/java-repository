package com.aisha.exercises.games.batteships;

public class Cell {
    private int XCoordinate;
    private int YCoordinate;

    public int getXCoordinate() {
        return XCoordinate;
    }

    public int getYCoordinate() {
        return YCoordinate;
    }

    public Cell(int XCoordinate, int YCoordinate) {
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
    }
}
