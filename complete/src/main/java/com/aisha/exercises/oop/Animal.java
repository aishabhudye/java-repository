package com.aisha.exercises.oop;

public class Animal {

    /*
    Why are some of these variables be private and others protected? Read about encapsulation in Object Oriented Programming (OOP) concepts
    How does this work in conjunction with getter methods?
    What is the role of the various modifiers in OOP (private, protected, public and none)
     */
    protected boolean plantEater;
    protected boolean meatEater;
    protected boolean twoLimbsAsLegs;
    private float mass; //In Kgs
    private float height; //In metres
    private float waist; //In metres

    /*
    Why is a property with a public method bad practice?
     */
    public String name;

    /*
    This is a property with no modifier or the default modifier (i.e. not private, protected or public)
     */
    String id;

    /*
    Why is it good to use a constructor?
     */
    public Animal(boolean plantEater, boolean meatEater, boolean walksOnTwoLimbs, float mass, float height, float waist) {
        this.plantEater = plantEater;
        this.meatEater = meatEater;
        this.twoLimbsAsLegs = walksOnTwoLimbs;
        this.mass = mass;
        this.height = height;
        this.waist = waist;
    }

    /*
    Why is this variation of the constructor needed?
    It's called an overloaded constructor method as it has the same name but different number of parameters
     */
    public Animal(float mass, float height, float waist) {
        this.mass = mass;
        this.height = height;
        this.waist = waist;
    }

    public boolean isPlantEater() {
        return plantEater;
    }

    public boolean isMeatEater() {
        return meatEater;
    }

    public boolean hasTwoLimbsAsLegs() {
        return twoLimbsAsLegs;
    }

    public float getMass() {
        return mass;
    }

    public float getHeight() {
        return height;
    }

    public float getWaist() {
        return waist;
    }

    //TODO: Why is this method in the wrong place (i.e. in this superclass)? Move it to the right place
    public boolean isObese() {
        return false;
    }

    //TODO: Why is this method in the wrong place (i.e. in this superclass)? Move it to the right place
    public boolean hasHighDiabetesRisk() {
        return false;
    }

    //TODO: Implement this method; why is better placed in this superclass as opposed to the subclass
    public boolean isOmnivorous(){
        return false;
    }

    //TODO: Override this method, so each animal makes the right noise for its species
    public String makeSomeNoise(){
        return "GRRRR!";
    }

}
