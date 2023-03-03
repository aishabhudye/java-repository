package com.aisha.exercises.games;

import java.util.Arrays;
import java.util.Scanner;

public class BattleShips {
    public static void main(String[] args) {
        BattleShips battleShips = new BattleShips();
        battleShips.setShips1();
    }

    public void printBoard() {
        int[][] grid = new int[10][10];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.printf("|%2d ", grid[i][j]);
            }
            System.out.println("|");
        }
    }

    public void setShips(){
        String[][] grid = { { " ", " ", "X", " ", " ", " ", " ", " ", " ", "X" },
                { " ", " ", " ", " ", " ", " ", " ", " ", " ", "X" },
                { " ", " ", "X", "X", "X", " ", " ", " ", " ", " " },
                { "X", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "X", " ", " ", " ", " ", "X", " ", "X", " ", " " },
                { "X", " ", " ", " ", " ", "X", " ", "X", " ", " " },
                { "X", " ", " ", " ", " ", "X", " ", "X", " ", " " },
                { "X", " ", " ", " ", " ", "X", " ", "X", " ", " " },
                { " ", " ", " ", " ", " ", "X", " ", " ", " ", " " },
                { " ", " ", " ", " ", " ", "X", " ", " ", " ", " " }};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print("|"+ grid[i][j]);
            }

            System.out.println("|");
        }
    }

    public  void  setShips1(){
        int [][]ar = new int [10][10];

        // Fill each row with 10.
        for (int[] row : ar)
            Arrays.fill(row,1,3, 10);

        String s=Arrays.deepToString(ar);
        s=s.replace("[","");//replacing all [ to ""
        s=s.substring(0,s.length()-2);//ignoring last two ]]
        String s1[]=s.split("],");//separating all by "],"

        String my_matrics[][] = new String[s1.length][s1.length];//declaring two dimensional matrix for input

        for(int i=0;i<s1.length;i++){
            s1[i]=s1[i].trim();//ignoring all extra space if the string s1[i] has
            String single_int[]=s1[i].split(", ");//separating integers by ", "

            for(int j=0;j<single_int.length;j++){
                my_matrics[i][j]=single_int[j];//adding single values
            }
        }

        //printing result
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(my_matrics[i][j]+"|");
            }
            System.out.println(" ");
        }

    }

}
