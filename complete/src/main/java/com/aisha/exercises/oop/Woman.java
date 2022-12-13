package com.aisha.exercises.oop;

public class Woman extends Animal{

    public Woman(float mass, float height, float waist) {
        super(mass, height, waist);
        this.plantEater = true;
        this.meatEater = true;
        this.twoLimbsAsLegs = true;
    }
}
