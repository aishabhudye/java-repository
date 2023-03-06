package com.aisha.exercises.games;

public class BattleShips {
    public static void main(String[] args) {
        BattleShips battleShips = new BattleShips();
        battleShips.setShips();
    }

    public void setShips(){
        String[][] grid = {
                { " ", " ", " ", " ", " ", " ", " ", " ", " ", "X" },
                { " ", " ", " ", " ", " ", " ", " ", " ", " ", "X" },
                { " ", " ", "X", "X", "X", " ", " ", " ", " ", " " },
                { "X", " ", " ", " ", " ", " ", " ", " ", " ", " " },
                { "X", " ", " ", " ", " ", "X", " ", "X", " ", " " },
                { "X", " ", " ", " ", " ", "X", " ", "X", " ", " " },
                { "X", " ", " ", " ", " ", "X", " ", "X", " ", " " },
                { "X", " ", " ", " ", " ", "X", " ", "X", " ", " " },
                { " ", " ", " ", " ", " ", "X", " ", " ", " ", " " },
                { " ", " ", " ", " ", " ", "X", " ", " ", " ", " " }
        };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print("|"+ grid[i][j]);
            }
            System.out.println("|");
        }
    }

}
