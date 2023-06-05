package com.aisha.exercises.games.batteships;

public class Cell {

    private int xCoordinate;
    private int yCoordinate;
    private boolean bombed;

    public boolean isBombed() {
        return bombed;
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

    public void setBombed(boolean bombed) {
        this.bombed = bombed;
    }
}
