package com.aisha.exercises.oop;

public class Man extends Animal{

    public Man(float mass, float height, float waist) {
        super(mass, height, waist);
        this.plantEater = true;
        this.meatEater = true;
        this.twoLimbsAsLegs = true;
    }
}
