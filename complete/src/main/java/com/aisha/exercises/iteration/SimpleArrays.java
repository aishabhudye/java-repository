package com.aisha.exercises.iteration;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrays {

    public static void main(String[] args) {
        new SimpleArrays().runCode();
    }

    private void runCode() {
        String[] siblings = {"Aisha", "Hafsa", "Talha"};
        iterateUsingIndex(siblings);
        iterateWithoutIndex(siblings);


        System.out.println("==============================");
        System.out.println();

        for (String sibling : siblings) {
            System.out.println("Loop over array without index, child name is " + sibling);
        }

        System.out.println("==============================");
        System.out.println();


        int z = 0;
        while (z < siblings.length) {
            System.out.println(siblings[z]);
            z++;
        }


        List<String> children = new ArrayList<>();
        children.add("Aisha");
        children.add("Hafsa");
        children.add("Talha");
        for (String child : children) {
            System.out.println("Loop over list without index, child name is " + child);
        }

    }

    private static void iterateWithoutIndex(String[] siblings) {
        int count = 0;
        for (String item : siblings) {
            System.out.println("Item at index " + count + " is " + item);
            count ++;
        }
    }

    private static void iterateUsingIndex(String[] siblings) {
        /*
         Start of loop
         i is initialised to 0
         a check is carried to see if i is less than the length of the array
         if the check passes, it then executes the body
         finally i is incremented
         End of loop
         Repeat loop
         */
        for (int i = 0; i < siblings.length; i++) {
            System.out.println("Loop over array with index, child name is " + siblings[i]);
        }
    }
}


