package com.aisha.exercises.games;

import java.util.Scanner;

public class BattleShips {
    public static void main(String[] args) {
        BattleShips battleShips = new BattleShips();
        battleShips.R();
    }

    public void setShips() {
        String[][] grid = {
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", "X"},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", "X"},
                {" ", " ", "X", "X", "X", " ", " ", " ", " ", " "},
                {"X", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {"X", " ", " ", " ", " ", "X", " ", "X", " ", " "},
                {"X", " ", " ", " ", " ", "X", " ", "X", " ", " "},
                {"X", " ", " ", " ", " ", "X", " ", "X", " ", " "},
                {"X", " ", " ", " ", " ", "X", " ", "X", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " "}
        };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print("|" + grid[i][j]);
            }
            System.out.println("|");
        }
    }

    public void R(){
        int[][] grid = {
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0}
        };
        int X;
        int Y;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        size = input.nextInt();
        for (int i = 0; i<size;i++){
            System.out.println("Enter x value: ");
            X = input.nextInt();
            System.out.println("Enter y value: ");
            Y = input.nextInt();
            grid[X][Y] = Integer.parseInt("1");
        }
        System.out.println("After updating an array element: ");
        printArray(grid);
    }
    private static void printArray(int[][] grid){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                System.out.print(grid[i][j] + "|");
            }
            System.out.println("");
        }
    }




}



