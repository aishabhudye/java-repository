package com.aisha.exercises.games.batteships;

public class Cell {

    private int xStartCoordinate;
    private int yStartCoordinate;

    public int getXStartCoordinate() {
        return xStartCoordinate;
    }

    public int getYStartCoordinate() {
        return yStartCoordinate;
    }

    public Cell(int xStartCoordinate, int yStartCoordinate) {
        this.xStartCoordinate = xStartCoordinate;
        this.yStartCoordinate = yStartCoordinate;
    }
}
