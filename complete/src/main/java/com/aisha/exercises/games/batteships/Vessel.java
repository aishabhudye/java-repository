package com.aisha.exercises.games.batteships;


public class Vessel {
    private String name;
    private int size;

    private Orientation orientation;

    public Vessel(String name, int size, Orientation orientation) {
        this.name = name;
        this.size = size;
        this.orientation = orientation;
    }

    public boolean fitsOnBoard(){
        return false;
    }

}
