package com.example.iteration;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrays {

    public static void main(String[] args) {
        new SimpleArrays().runCode();
    }

    private void runCode() {
        String[] siblings = {"Aisha", "Hafsa", "Talha"};
        for (int i=0; i< siblings.length; i++){
            System.out.println("Loop over array with index, child name is " + siblings[i]);
        }

        System.out.println("==============================");
        System.out.println();

        for (String sibling : siblings) {
            System.out.println("Loop over array without index, child name is " + sibling);
        }

        System.out.println("==============================");
        System.out.println();

        List<String> children = new ArrayList<>();
        children.add("Aisha");
        children.add("Hafsa");
        children.add("Talha");
        for (String child : children) {
            System.out.println("Loop over list without index, child name is " + child);
        }

    }

}
