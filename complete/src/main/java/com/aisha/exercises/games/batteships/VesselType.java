package com.aisha.exercises.games.batteships;

public enum VesselType {

    CORVETTE(2,"Corvette"),
    SUBMARINE (3, "Attack Submarine"),
    DESTROYER (4,"Destroyer"),
    CRUISER(5,"Heavy Cruiser"),
    CARRIER(6,"AirCraft Carrier");

    private final int size;
    private final String name;

    VesselType(int size, String name){
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
