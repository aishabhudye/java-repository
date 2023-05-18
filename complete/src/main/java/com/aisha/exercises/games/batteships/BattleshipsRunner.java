package com.aisha.exercises.games.batteships;

public class BattleshipsRunner {

    public static void main(String args[]) {
        Board board = new Board(10,10);
        board.showEmpty();
        Vessel vessel = new Vessel(VesselType.DESTROYER,4,6,Orientation.HORIZONTAL);
        vessel.fitsOnBoard(board);
    }
}
