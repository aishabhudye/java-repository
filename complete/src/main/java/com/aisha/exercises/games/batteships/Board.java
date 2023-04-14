package com.aisha.exercises.games.batteships;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int length;
    private int width;
    private String[][] grid = {};
    private List<Vessel> vesselList = new ArrayList<>();


    public Board(int length, int width, String[][] grid, List<Vessel> vesselList) {
        this.length = length;
        this.width = width;
        this.grid = grid;
        this.vesselList = vesselList;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String[][] getGrid() {
        return grid;
    }

    public List<Vessel> getVesselList() {
        return vesselList;
    }


    public Board(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String[][] createEmptyBoard() {
        grid = new String[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = " ";
                System.out.print(grid[i][j] + "|");
            }
            System.out.println(" ");
        }
        return grid;
    }

    public int updateVesselList(Vessel vessel) {
        vesselList.add(vessel);
        return vesselList.size();
    }

}
