package com.aisha.exercises.oop;

public class Dog extends Animal{
    public Dog(float mass, float height, float waist) {
        super(mass, height, waist);
        this.plantEater = true;
        this.meatEater = true;
        this.twoLimbsAsLegs = false;
    }
}
