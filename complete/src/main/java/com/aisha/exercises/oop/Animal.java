package com.aisha.exercises.oop;

public class Animal {

    /*
    Q: Why are some of these variables be private and others protected? Read about encapsulation in Object Oriented Programming (OOP) concepts
    A: Private variables can only be accessed in it's own class however protected variables can only be accessed in it's own package.

    Q: How does this work in conjunction with getter methods?
    A: Getter and setter methods allow access to private variables

    Q: What is the role of the various modifiers in OOP (private, protected, public and none)
    A:  public : the code is accessible to all classes.
        private : the code is accessible within the declared classes
        protected : the code is accessible in the same package and subclasses
     */
    protected boolean plantEater;
    protected boolean meatEater;
    protected boolean twoLimbsAsLegs;
    private float mass; //In Kgs
    private float height; //In metres
    private float waist; //In metres

    /*
    Q: Why is a property or a field with a public modifier bad practice?
    A: If the property is public, this it can be easily changed by anyone.
     */
    public String name;

    /*
    This is a property with no modifier or the default modifier (i.e. not private, protected or public)
     */
    String id;

    /*
    Q: Why is it good to use a constructor?
    A: Constructors are used to initialize the objects of the class with initial values.
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
    Q: Why is this variation of the constructor needed?
    It's called an overloaded constructor method as it has the same name but different number of parameters
    A: Object might need to be created with less or more properties set at construction time, hence the need for overloaded constructors
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
    public boolean isObese(float height, float weight) {
        float BMI = weight / height;
        if (BMI >= 30) {
            System.out.println("Obese");
            return true;
        } else {
            System.out.println("Not obese");
            return false;
        }

    }

    //TODO: Why is this method in the wrong place (i.e. in this superclass)? Move it to the right place
    public boolean hasHighDiabetesRisk(float height, float weight) {
        float BMI = weight / height;
        if (BMI >= 30) {
            System.out.println("High Diabetes Risk");
            return true;
        } else {
            System.out.println("Low Diabetes Risk");
            return false;
        }
    }

    //TODO: Implement this method; why is better placed in this superclass as opposed to the subclass
    public boolean isOmnivorous() {
        String animal = "";
        boolean carnivorous = isMeatEater();
        boolean herbivore = isPlantEater();
        if (animal.equals(carnivorous) && animal.equals(herbivore)) {
            System.out.println("Omnivorous");
            return true;
        } else {
            System.out.println("Not Omnivorous");
            return false;
        }
    }


    //TODO: Override this method, so each animal makes the right noise for its species
    public String makeSomeNoise() {
        String dog  = "";
        String cat = "";
        String animal = "";
        String animalNoise = "";
        if(animal.equals(dog)){
            animalNoise.equals("WOOF");
        }else{
            if(animal.equals(cat)){
                animalNoise.equals("MEOW");
            }
        }
        System.out.println(animalNoise);
        return animalNoise;
    }
}
