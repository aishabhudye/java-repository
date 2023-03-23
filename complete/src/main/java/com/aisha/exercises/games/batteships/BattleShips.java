package com.aisha.exercises.games.batteships;

import java.util.Scanner;

public class BattleShips {
    public static void main(String[] args) {
        BattleShips battleShips = new BattleShips();
        battleShips.placeVessels();
    }

    public int[][] placeVessels() {
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
        //promptForVessels(grid);
        printArray(grid);
        return grid;
    }

    private static void promptForVessels(int[][] grid) {
        int X;
        int Y;
        int size;
        boolean horizontal;
        boolean vertical;
        int numberOfShips = 2;
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
                    grid[X][Y + i] = 1;
                } else if (vertical) {
                    grid[X + i][Y] = 1;
                }
            }
        }
    }

    public void printArray(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + "|");
            }
            System.out.println("");
        }
    }


}



