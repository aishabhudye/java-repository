package com.aisha.exercises.games.batteships;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class VesselTest {
    public static final Board board = new Board(10,10);



    @Test
    void scenario1_vessel_fits_on_board_horizontally() {
        Vessel vessel = new Vessel("destroyer",4,3,1,Orientation.HORIZONTAL);
        assertTrue(vessel.fitsOnBoard(board));

    }

    @Test
    void scenario2_vessel_fits_on_board_vertically() {
        Vessel vessel = new Vessel("sinker",4,3,1,Orientation.VERTICAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario3_vessel_does_not_fit_on_board_horizontally() {
        Vessel vessel = new Vessel("tank",3,9,9
                ,Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario4_vessel_does_not_fit_on_board_horizontally() {
    }

}