package com.aisha.exercises.oop;

public class Cat extends Animal{
    public Cat(float mass, float height, float waist) {
        super(mass, height, waist);
        this.plantEater = false;
        this.meatEater = true;
        this.twoLimbsAsLegs = false;
    }

    @Override
    public String makeSomeNoise() {
        return "MEOWWW!";
    }
}
