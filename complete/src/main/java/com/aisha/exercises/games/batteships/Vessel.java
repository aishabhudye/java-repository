package com.aisha.exercises.games.batteships;


public class Vessel {
    private String name;
    private int size;
    private int xStartCoordinate;
    private int yStartCoordinate;

    public Vessel(String name, int size, int xStartCoordinate, int yStartCoordinate, Orientation orientation) {
        this.name = name;
        this.size = size;
        this.xStartCoordinate = xStartCoordinate;
        this.yStartCoordinate = yStartCoordinate;
        this.orientation = orientation;
    }

    private Orientation orientation;


    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public boolean fitsOnBoard(Board board){
        return false;
    }

}