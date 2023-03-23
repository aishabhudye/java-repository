package com.aisha.exercises.games.batteships;

public class Board {
    private int length;
    private int width;
    private  String[][] grid = {};


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String[][] getGrid() {
        return grid;
    }


    public Board(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public String[][] createEmptyBoard(){
        grid = new String[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = " ";
                System.out.print(grid[i][j] +"|");
            }
            System.out.println(" ");
        }
        return grid;
    }

}
