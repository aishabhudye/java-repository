package com.aisha.exercises.oop;

public class AnimalRunner {

    public static void main(String[] args) {
        //Cat as a generic animal
        Animal cat = new Cat(4.0f,0.10f,  0.10f);
        System.out.println(String.format("Cats %bly eat plants, %bly eat meat and make %s noise", cat.isMeatEater(), cat.plantEater, cat.makeSomeNoise(),cat.isObese(0.10f,4.0f),cat.hasHighDiabetesRisk(0.10f,4.0f),cat.isOmnivorous()));

        //Dog as a generic animal
        Animal dog = new Dog(4.0f,0.10f,  0.10f);
        System.out.println(String.format("Dogs %bly eat plants, %bly eat meat and make %s noise", dog.isMeatEater(), dog.plantEater, dog.makeSomeNoise(),dog.isObese(0.10f,4.0f),cat.hasHighDiabetesRisk(0.10f,4.0f),cat.isOmnivorous()));

    }
}
