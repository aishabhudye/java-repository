package com.aisha.exercises.games.batteships;

public class BattleshipsRunner {

    public static void main(String args[]) {
        Board board = new Board(10,10);
        board.createEmptyBoard();
        Vessel vessel = new Vessel("destroyer",4,6,1,Orientation.HORIZONTAL);
        vessel.fitsOnBoard(board);
    }
}
