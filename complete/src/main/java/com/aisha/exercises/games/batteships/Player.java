package com.aisha.exercises.games.batteships;

import java.util.List;

public class Player {
    private Board board;
    private List<Cell> opponentBoardBombedCells;

    public Player(Board board, List<Cell> opponentBoardBombedCells) {
        this.board = board;
        this.opponentBoardBombedCells = opponentBoardBombedCells;
    }

    public Board getBoard() {
        return board;
    }

    public List<Cell> getOpponentBoardBombedCells() {
        return opponentBoardBombedCells;
    }

    public boolean trackCellsBombedOnOpponentsBoard(Cell cellToBomb, Board opponentBoard) {
        if (hasDroppedBombOnOpponentsBoard(cellToBomb, opponentBoard)) {
            if (opponentBoardBombedCells.size() == 0) {
                opponentBoardBombedCells.add(cellToBomb);
                return true;
            } else {
                boolean allowedCell = false;
                for (int i = 0; i < opponentBoardBombedCells.size(); i++) {
                    for (Cell previousCell : opponentBoardBombedCells) {
                        previousCell = opponentBoardBombedCells.get(i);
                        int previousXCoordinate = previousCell.getXCoordinate();
                        int previousYCoordinate = previousCell.getYCoordinate();
                        if ((cellToBomb.getXCoordinate() != previousXCoordinate && cellToBomb.getYCoordinate() != previousYCoordinate) || (cellToBomb.getXCoordinate() != previousXCoordinate && cellToBomb.getYCoordinate() == previousYCoordinate) || (cellToBomb.getXCoordinate() == previousXCoordinate && cellToBomb.getYCoordinate() != previousYCoordinate)) {
                            allowedCell = true;
                        }
                    }
                }
                opponentBoardBombedCells.add(cellToBomb);
                return allowedCell;
            }
        } else {
            return false;
        }
    }

    public boolean hasVesselOnOpponentBoardBeenHit(Cell bombedCell, Board opponentBoard) {
        //Build logic to check whether a cell of a vessel on the opponent board has been hit i.e. the coordinates match
        for (Vessel vessel : opponentBoard.getVesselList()) { //for every vessel in the list
            vessel.setSunk(false);
            for (Cell vesselCell : vessel.getCellList()) { //for every cell in the current vessel from the outer loop
                if (vesselCell.getXCoordinate() == bombedCell.getXCoordinate() && vesselCell.getYCoordinate() == bombedCell.getYCoordinate()) {
                    vesselCell.setBombed(true);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasAllVesselsOnOpponentBoardBeenSunk(Board opponentBoard) {
        //Build logic to check whether a cell of a vessel on the opponent board has been hit i.e. the coordinates match
        int countOfSunkVessels = 0;
        for (Vessel vessel : opponentBoard.getVesselList()) { //for every vessel in the list
            for (Cell cell : vessel.getCellList()) {
                if (cell.isBombed()) {
                    vessel.setSunk(true);
                }
            }
            if (vessel.isSunk()) {
                countOfSunkVessels++;
            }
        }
        if (countOfSunkVessels == VesselType.values().length) {
            return true;
        }
        return false;
    }


    boolean hasDroppedBombOnOpponentsBoard(Cell bombedCell, Board opponentBoard) {
        int xCellCoordinate = bombedCell.getXCoordinate();
        int yCellCoordinate = bombedCell.getYCoordinate();
        boolean cellFitsInLength = 0 <= xCellCoordinate && xCellCoordinate <= opponentBoard.getLength();
        boolean cellFitsInWidth = 0 <= yCellCoordinate && yCellCoordinate <= opponentBoard.getWidth();
        if (cellFitsInLength && cellFitsInWidth) {
            return true;
        } else {
            return false;
        }
    }

}
