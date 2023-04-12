package com.aisha.exercises.games.batteships;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class VesselTest {
    public static final Board board = new Board(10,10);


    @Test
    void scenario1_vessel_fits_on_top_right_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,6,1,Orientation.HORIZONTAL);
        assertTrue(vessel.fitsOnBoard(board));

    }

    @Test
    void scenario2_vessel_fits_on_top_right_board_vertically() {
        Vessel vessel = new Vessel(VesselType.DESTROYER,6,1,Orientation.VERTICAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario3_vessel_does_not_fit_on_top_right_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.DESTROYER,9,9,Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario4_vessel_does_not_fit_on_top_right_board_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,9,9,Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario5_vessel_does_fit_on_top_left_corner_of_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.CRUISER,1,1,Orientation.HORIZONTAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario6_vessel_does_fit_on_top_left_corner_of_board_vertically() {
        Vessel vessel = new Vessel(VesselType.CARRIER,3,1,Orientation.VERTICAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario7_vessel_does_not_fit_on_top_left_corner_of_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,-4,1,Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario8_vessel_does_not_fit_on_top_left_corner_of_board_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,-4,1,Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario9_vessel_does_fit_on_board_bottom_left_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,2,6,Orientation.HORIZONTAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario10_vessel_does_fit_on_board_bottom_left_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,1,6,Orientation.VERTICAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario11_vessel_does_not_fit_on_board_bottom_left_horizontally() {
        Vessel vessel = new Vessel(VesselType.DESTROYER,-4,9,Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario12_vessel_does_not_fit_on_board_bottom_left_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,1,9,Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario13_vessel_does_fit_on_board_bottom_right_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,6,10,Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario14_vessel_does_fit_on_board_bottom_right_vertically() {
        Vessel vessel = new Vessel(VesselType.CORVETTE,10,6,Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario15_vessel_does_not_fit_on_board_bottom_right_horizontally() {
        Vessel vessel = new Vessel(VesselType.CORVETTE,9,10,Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario16_vessel_does_not_fit_on_board_bottom_right_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,10,9,Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario17_vessel_does_fit_in_the_centre_of_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,5,5,Orientation.HORIZONTAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario18_vessel_does_fit_in_the_centre_of_board_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE,5,5,Orientation.VERTICAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void add5VesselsToAList(){
        List<Cell>cellList = null;
        Vessel vessel = new Vessel(VesselType.CORVETTE,1,1,cellList,Orientation.HORIZONTAL);
        List<Vessel>vessels = board.updateVesselList(vessel);
        Vessel vessel2 = new Vessel(VesselType.CRUISER,1,2,cellList,Orientation.HORIZONTAL);
        vessels = board.updateVesselList(vessel2);
        Vessel vessel3 = new Vessel(VesselType.SUBMARINE,1,3,cellList,Orientation.HORIZONTAL);
        vessels = board.updateVesselList(vessel3);
        Vessel vessel4 = new Vessel(VesselType.DESTROYER,1,4,cellList,Orientation.HORIZONTAL);
        vessels = board.updateVesselList(vessel4);
        Vessel vessel5 = new Vessel(VesselType.CARRIER,1,5,cellList,Orientation.HORIZONTAL);
        vessels = board.updateVesselList(vessel5);
        assertEquals(vessels.size(),5);

    }

}