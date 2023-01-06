package com.aisha.exercises.oop;

public class Woman extends Animal {

    public Woman(float mass, float height, float waist) {
        super(mass, height, waist);
        this.plantEater = true;
        this.meatEater = true;
        this.twoLimbsAsLegs = true;
    }

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

    @Override
    public String makeSomeNoise() {
        return "Ewww";
    }
}
