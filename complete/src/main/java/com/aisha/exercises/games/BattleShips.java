package com.aisha.exercises.games;

public class BattleShips {
    public static void main(String[] args) {
        BattleShips battleShips = new BattleShips();
        battleShips.printBoard();
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

}
