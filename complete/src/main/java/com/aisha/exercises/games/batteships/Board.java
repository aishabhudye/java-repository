package com.aisha.exercises.games.batteships;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int length;
    private int width;
    private int[][] grid = {};
    private List<Vessel> vesselList = new ArrayList<>();


    public Board(int length, int width, int[][] grid) {
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

    public int[][] getGrid() {
        return grid;
    }

    public List<Vessel> getVesselList() {
        return vesselList;
    }


    public Board(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int[][] showEmpty() {
        grid = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = 0;
                System.out.print(grid[i][j] + "|");
            }
            System.out.println(" ");
        }
        return grid;
    }

    public void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(grid[i][j] + "|");
            }
            System.out.println(" ");
        }
    }

    public int[][] populateGrid() {
        grid = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                //Check for match with vessel and then set value corresponding to size
                for (Vessel vessel : vesselList) {
                    List<Cell> vesselsCells = vessel.getCellList();
                    for (Cell cell : vesselsCells) {
                        if (cell.getXCoordinate() == i && cell.getYCoordinate() == j) {
                            for (int k = 0; k < vessel.getVesselType().getSize(); k++) {
                                if (vessel.getOrientation().equals(Orientation.HORIZONTAL)) {
                                    grid[cell.getXCoordinate() + 1][cell.getYCoordinate()] = vessel.getVesselType().getSize();
                                }
                                if (vessel.getOrientation().equals(Orientation.VERTICAL)) {
                                    grid[cell.getXCoordinate()][cell.getYCoordinate() + 1] = vessel.getVesselType().getSize();
                                }
                            }
                        }
                    }
                }
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
            if (allowedOnBoard) {
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
