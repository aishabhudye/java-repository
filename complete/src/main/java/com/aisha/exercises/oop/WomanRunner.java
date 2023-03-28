package com.aisha.exercises.oop;

public class WomanRunner {
    public static void main(String[]args){
        Woman woman = new Woman(50,1.6f,36);
        System.out.println(String.format("Woman is %bly meat eater and %bly a plant eater",woman.isObese(),woman.hasHighDiabetesRisk()));
    }
}
