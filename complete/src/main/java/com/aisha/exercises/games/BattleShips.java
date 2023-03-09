package com.aisha.exercises.games;

import java.util.Scanner;

public class BattleShips {
    public static void main(String[] args) {
        BattleShips battleShips = new BattleShips();
        battleShips.placeShips();
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

    public void placeShips() {
        int[][] grid = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int X;
        int Y;
        int size;
        boolean horizontal;
        boolean vertical;
        int numberOfShips = 5;
        for (int j = 0; j < numberOfShips; j++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size: ");
            size = input.nextInt();
            System.out.println("Enter the starting x value: ");
            X = input.nextInt();
            System.out.println("Enter the starting y value: ");
            Y = input.nextInt();
            System.out.println("Enter the orientation H or V: ");
            horizontal = input.hasNext("H");
            vertical = input.hasNext("V");
            for (int i = 0; i < size; i++) {
                if (horizontal) {
                    grid[X][Y + i] = Integer.parseInt("1");
                } else if (vertical) {
                    grid[X + i][Y] = Integer.parseInt("1");
                }
            }
        }
        System.out.println("After updating an array element: ");
        printArray(grid);
    }

    private static void printArray(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + "|");
            }
            System.out.println("");
        }
    }


}



