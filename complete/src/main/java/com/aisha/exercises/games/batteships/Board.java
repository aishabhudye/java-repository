package com.aisha.exercises.games.batteships;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int length;
    private int width;
    private String[][] grid = {};
    private List<Vessel> vesselList = new ArrayList<>();


    public Board(int length, int width, String[][] grid) {
        this.length = length;
        this.width = width;
        this.grid = grid;
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

        if (vesselList.size() == 0) {
            vesselList.add(vessel);
        } else {
            boolean allowedOnBoard = false;
            for (int index = 0; index < vesselList.size(); index++) {
                Vessel previousVessel = vesselList.get(index);
                List<Cell> previousVesselCellList = previousVessel.getCellList();
                List<Cell> currentVesselCellList = vessel.getCellList();
                for (Cell currentCell : currentVesselCellList) {
                    for (Cell previousCell : previousVesselCellList) {
                        if (vessel.getVesselType() == previousVessel.getVesselType()) {
                            allowedOnBoard = false;
                        } else {
                            if (currentCell.getXCoordinate() != previousCell.getXCoordinate() && currentCell.getYCoordinate() != previousCell.getYCoordinate()) {
                                allowedOnBoard = true;
                            }
                        }
                    }
                }
            }
            if(allowedOnBoard){
                vesselList.add(vessel);
            }



            //perform check to see if vessel can be added to board
            //if so, add it to the vessel list and return true
            //if not, just return false, without adding it to the list
        }

        //Remove once logic has been built for else
        return vesselList.size();
    }
}
