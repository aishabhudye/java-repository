package com.aisha.exercises.games.batteships;


import java.util.LinkedList;
import java.util.List;

public class Vessel {
    private VesselType vesselType;
    private List<Cell> cellList = new LinkedList<>();
    private boolean sunk;

    public boolean isSunk() {
        return sunk;
    }

    public Vessel(VesselType vesselType, List<Cell> cellList, boolean sunk, Orientation orientation) {
        this.vesselType = vesselType;
        this.cellList = cellList;
        this.sunk = sunk;
        this.orientation = orientation;
    }

    public Vessel(VesselType vesselType, int xStartCoordinate, int yStartCoordinate, Orientation orientation) {
        this.vesselType = vesselType;
        this.orientation = orientation;
        updateCellList(xStartCoordinate, yStartCoordinate);
    }

    private Orientation orientation;

    public VesselType getVesselType() {
        return vesselType;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public List<Cell> getCellList() {
        return cellList;
    }


    public boolean fitsOnBoard(Board board) {
        int endX = this.cellList.get(0).getXCoordinate() + vesselType.getSize();
        int endY = this.cellList.get(0).getYCoordinate() + vesselType.getSize();
        boolean fitsInLength = 0 <= endX && endX <= board.getLength();
        boolean fitsInWidth = 0 <= endY && endY <= board.getWidth();
        if (fitsInLength && fitsInWidth) {
            return true;
        } else {
            return false;
        }
    }

    public void updateCellList(int xCoordinate, int yCoordinate) {
        Cell cell = new Cell(xCoordinate, yCoordinate);
        Orientation orientation = getOrientation();
        for (int i = 0; i < vesselType.getSize(); i++) {
            if (orientation.equals(Orientation.HORIZONTAL)) {
                int newXCoordinate = cell.getXCoordinate() + i;
                Cell newCell = new Cell(newXCoordinate, yCoordinate);
                cellList.add(newCell);
            } else if (orientation.equals(Orientation.VERTICAL)) {
                int newYCoordinate = cell.getYCoordinate() + i;
                Cell newCell = new Cell(xCoordinate, newYCoordinate);
                cellList.add(newCell);
            }
        }
    }


}