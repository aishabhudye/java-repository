package com.aisha.exercises.games.batteships;


import java.util.List;

public class Vessel {
    private VesselType vesselType;
    private String name;
    private int size;
    private int xStartCoordinate;
    private int yStartCoordinate;
    private List<Cell> cellList;


    public Vessel(VesselType vesselType, int xStartCoordinate, int yStartCoordinate, List<Cell> cellList, Orientation orientation) {
        this.vesselType = vesselType;
        this.xStartCoordinate = xStartCoordinate;
        this.yStartCoordinate = yStartCoordinate;
        this.cellList = cellList;
        this.orientation = orientation;
    }

    public Vessel(String name, int size, int xStartCoordinate, int yStartCoordinate, Orientation orientation) {
        this.name = name;
        this.size = size;
        this.xStartCoordinate = xStartCoordinate;
        this.yStartCoordinate = yStartCoordinate;
        this.orientation = orientation;
    }

    public Vessel(VesselType vesselType, int xStartCoordinate, int yStartCoordinate, Orientation orientation) {
        this.vesselType = vesselType;
        this.xStartCoordinate = xStartCoordinate;
        this.yStartCoordinate = yStartCoordinate;
        this.orientation = orientation;
    }

    private Orientation orientation;


    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public VesselType getVesselType() {
        return vesselType;
    }

    public int getXStartCoordinate() {
        return xStartCoordinate;
    }

    public int getYStartCoordinate() {
        return yStartCoordinate;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public List<Cell> getCellsList() {
        return cellList;
    }


    public boolean fitsOnBoard(Board board) {
        int endX = xStartCoordinate + vesselType.getSize();
        int endY = yStartCoordinate + vesselType.getSize();
        boolean fitsInLength = 0 <= endX && endX <= board.getLength();
        boolean fitsInWidth = 0 <= endY && endY <= board.getWidth();
        if (fitsInLength && fitsInWidth) {
            return true;
        } else {
            return false;
        }
    }

}