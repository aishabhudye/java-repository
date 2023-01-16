package com.aisha.exercises.games;

public class JavaWork {
    public static void main(String[]args){
        int[]index = new int[4]; //Make new int array
        index[0]= 1; //Give each element in int array an int value
        index[1]= 3;
        index[2]= 0;
        index[3]= 2;
        String[]islands = new String[4]; //Make new String array
        islands[0] = "Bermuda";          //Give each element a String
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        int y = 0;              //Declare variable called Y of type int
        int ref;                //Declare ref variable of type int
        while (y<4){
            ref = index[y];
            System.out.println("island = ");
            System.out.println(islands[ref]);
            y=y+1;              //increment while loop
        }
    }

}
