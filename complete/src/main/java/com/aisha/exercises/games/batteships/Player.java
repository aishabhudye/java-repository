package com.aisha.exercises.games.batteships;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public boolean updateOpponentBoardBombedCells(Cell bombedCell, Board opponentBoard) {
        if (cellIsOnBoard(bombedCell, opponentBoard)) {
            if (opponentBoardBombedCells.size() == 0) {
                opponentBoardBombedCells.add(bombedCell);
                return true;
            } else {
                boolean allowedCell = false;
                for (int i = 0; i < opponentBoardBombedCells.size(); i++) {
                    for (Cell previousCell : opponentBoardBombedCells) {
                        previousCell = opponentBoardBombedCells.get(i);
                        int previousXCoordinate = previousCell.getXCoordinate();
                        int previousYCoordinate = previousCell.getYCoordinate();
                        if ((bombedCell.getXCoordinate() != previousXCoordinate && bombedCell.getYCoordinate() != previousYCoordinate) || (bombedCell.getXCoordinate() != previousXCoordinate && bombedCell.getYCoordinate() == previousYCoordinate) || (bombedCell.getXCoordinate() == previousXCoordinate && bombedCell.getYCoordinate() != previousYCoordinate)) {
                            allowedCell = true;
                        }
                    }
                }
                opponentBoardBombedCells.add(bombedCell);
                return allowedCell;
            }
        } else {
            return false;
        }
    }

    boolean cellIsOnBoard(Cell bombedCell, Board board) {
        int xCellCoordinate = bombedCell.getXCoordinate();
        int yCellCoordinate = bombedCell.getYCoordinate();
        boolean cellFitsInLength = 0 <= xCellCoordinate && xCellCoordinate <= board.getLength();
        boolean cellFitsInWidth = 0 <= yCellCoordinate && yCellCoordinate <= board.getWidth();
        if (cellFitsInLength && cellFitsInWidth) {
            return true;
        } else {
            return false;
        }
        //TODO: Build this up

    }

}
