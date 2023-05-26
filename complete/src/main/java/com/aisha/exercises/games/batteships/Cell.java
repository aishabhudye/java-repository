package com.aisha.exercises.games.batteships;

public class Cell {

    private int xCoordinate;
    private int yCoordinate;
    private boolean bombed;

    public boolean isBombed() {
        return bombed;
    }

    public Cell(int xCoordinate, int yCoordinate, boolean bombed) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.bombed = bombed;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public Cell(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
}
