package com.aisha.exercises.games.batteships;


import java.util.LinkedList;
import java.util.List;

public class Vessel {
    private VesselType vesselType;
    private List<Cell> cellList = new LinkedList<>();

    public Vessel(VesselType vesselType, int xStartCoordinate, int yStartCoordinate, Orientation orientation) {
        this.vesselType = vesselType;
        this.orientation = orientation;
        updateStartCell(xStartCoordinate, yStartCoordinate);
    }

    private Orientation orientation;

    public VesselType getVesselType() {
        return vesselType;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public List<Cell> getCellsList() {
        return cellList;
    }


    public boolean fitsOnBoard(Board board) {
        int endX = this.cellList.get(0).getXStartCoordinate() + vesselType.getSize();
        int endY = this.cellList.get(0).getYStartCoordinate() + vesselType.getSize();
        boolean fitsInLength = 0 <= endX && endX <= board.getLength();
        boolean fitsInWidth = 0 <= endY && endY <= board.getWidth();
        if (fitsInLength && fitsInWidth) {
            return true;
        } else {
            return false;
        }
    }

    public int updateStartCell(int xStartCoordinate, int yStartCoordinate){
        Cell startCell = new Cell(xStartCoordinate, yStartCoordinate);
        cellList.add(0, startCell);
        return cellList.size();
    }

    public int updateCellList() {
        int xCoordinate = 0;
        int yCoordinate = 0;
        int index = 0;
        Cell cell = new Cell(xCoordinate,yCoordinate);
        for (int i = 0; i < vesselType.getSize(); i++) {
            if(i!=0){
                cellList.add(index + 1,cell);
            }
        }
        return cellList.size();
    }

}