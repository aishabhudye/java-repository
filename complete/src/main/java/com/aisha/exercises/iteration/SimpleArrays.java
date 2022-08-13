package com.aisha.exercises.iteration;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrays {

    public static void main(String[] args) {
        new SimpleArrays().runCode();
    }

    private void runCode() {
        String[] siblings = {"Aisha", "Hafsa", "Talha"};
        int i;
        for (i = 0; i < siblings.length; i++) {
            System.out.println("Loop over array with index, child name is " + siblings[i]);
        }

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


        System.out.println();
        {
            List<String> kids = new ArrayList<>();
            kids.add("Aisha");
            kids.add("Hafsa");
            kids.add("Talha");

            System.out.println("List: " + kids);
            String element = kids.get(0);
            System.out.println("the element at index 0 is "
                    + element);

            String[] things = {"Aisha", "Hafsa", "Talha"};
            int y;
            for (y = 0; y < things.length; y++) {
                System.out.println("Child at index " + y + " is " + things[y]);
            }


        }
    }
}


