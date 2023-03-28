package com.aisha.exercises.oop;

public class ManRunner {
    public static void main(String[]args){
        //Man as a generic animal
        Man man = new Man(50,1.6f,36);
        System.out.println(String.format("Man is %bly a plant eater and is %bly a meat eater",man.isObese(),man.hasHighDiabetesRisk()));

        Man secondMan = new Man(30,1.6f,36);
        System.out.println(String.format("Man is %bly a plant eater and is %bly a meat eater",man.isObese(),man.hasHighDiabetesRisk()));
    }
}
