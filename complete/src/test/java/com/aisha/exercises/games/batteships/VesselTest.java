package com.aisha.exercises.games.batteships;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class VesselTest {
    public static final Board board = new Board(10, 10);


    @Test
    void scenario1_vessel_fits_on_top_right_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 6, 1, Orientation.HORIZONTAL);
        assertTrue(vessel.fitsOnBoard(board));

    }

    @Test
    void scenario2_vessel_fits_on_top_right_board_vertically() {
        Vessel vessel = new Vessel(VesselType.DESTROYER, 6, 1, Orientation.VERTICAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario3_vessel_does_not_fit_on_top_right_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.DESTROYER, 9, 9, Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario4_vessel_does_not_fit_on_top_right_board_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 9, 9, Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario5_vessel_does_fit_on_top_left_corner_of_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.CRUISER, 1, 1, Orientation.HORIZONTAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario6_vessel_does_fit_on_top_left_corner_of_board_vertically() {
        Vessel vessel = new Vessel(VesselType.CARRIER, 3, 1, Orientation.VERTICAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario7_vessel_does_not_fit_on_top_left_corner_of_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, -4, 1, Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario8_vessel_does_not_fit_on_top_left_corner_of_board_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, -4, 1, Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario9_vessel_does_fit_on_board_bottom_left_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 2, 6, Orientation.HORIZONTAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario10_vessel_does_fit_on_board_bottom_left_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 1, 6, Orientation.VERTICAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario11_vessel_does_not_fit_on_board_bottom_left_horizontally() {
        Vessel vessel = new Vessel(VesselType.DESTROYER, -4, 9, Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario12_vessel_does_not_fit_on_board_bottom_left_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 1, 9, Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario13_vessel_does_fit_on_board_bottom_right_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 6, 10, Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario14_vessel_does_fit_on_board_bottom_right_vertically() {
        Vessel vessel = new Vessel(VesselType.CORVETTE, 10, 6, Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario15_vessel_does_not_fit_on_board_bottom_right_horizontally() {
        Vessel vessel = new Vessel(VesselType.CORVETTE, 9, 10, Orientation.HORIZONTAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario16_vessel_does_not_fit_on_board_bottom_right_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 10, 9, Orientation.VERTICAL);
        assertFalse(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario17_vessel_does_fit_in_the_centre_of_board_horizontally() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 5, 5, Orientation.HORIZONTAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void scenario18_vessel_does_fit_in_the_centre_of_board_vertically() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 5, 5, Orientation.VERTICAL);
        assertTrue(vessel.fitsOnBoard(board));
    }

    @Test
    void test_cells_of_submarine_horizontal_cruiser() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 1, 1, Orientation.HORIZONTAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(3, cellList.get(VesselType.SUBMARINE.getSize() - 1).getXCoordinate());
        assertEquals(1, cellList.get(VesselType.SUBMARINE.getSize() - 1).getYCoordinate());
    }

    @Test
    void test_cells_of_submarine_vertical_cruiser() {
        Vessel vessel = new Vessel(VesselType.SUBMARINE, 2, 3, Orientation.VERTICAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(2, cellList.get(VesselType.SUBMARINE.getSize() - 1).getXCoordinate());
        assertEquals(5, cellList.get(VesselType.SUBMARINE.getSize() - 1).getYCoordinate());
    }

    @Test
    void test_cells_of_corvette_horizontal_cruiser() {
        Vessel vessel = new Vessel(VesselType.CORVETTE, 3, 3, Orientation.HORIZONTAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(4, cellList.get(VesselType.CORVETTE.getSize() - 1).getXCoordinate());
        assertEquals(3, cellList.get(VesselType.CORVETTE.getSize() - 1).getYCoordinate());
    }

    @Test
    void test_cells_of_corvette_vertical_cruiser() {
        Vessel vessel = new Vessel(VesselType.CORVETTE, 3, 3, Orientation.VERTICAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(3, cellList.get(VesselType.CORVETTE.getSize() - 1).getXCoordinate());
        assertEquals(4, cellList.get(VesselType.CORVETTE.getSize() - 1).getYCoordinate());
    }

    @Test
    void test_cells_of_cruiser_horizontal_cruiser() {
        Vessel vessel = new Vessel(VesselType.CRUISER, 3, 4, Orientation.HORIZONTAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(7, cellList.get(VesselType.CRUISER.getSize() - 1).getXCoordinate());
        assertEquals(4, cellList.get(VesselType.CRUISER.getSize() - 1).getYCoordinate());
    }

    @Test
    void test_cells_of_cruiser_vertical_cruiser() {
        Vessel vessel = new Vessel(VesselType.CRUISER, 3, 4, Orientation.VERTICAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(3, cellList.get(VesselType.CRUISER.getSize() - 1).getXCoordinate());
        assertEquals(8, cellList.get(VesselType.CRUISER.getSize() - 1).getYCoordinate());
    }

    @Test
    void test_cells_of_destroyer_horizontal_cruiser() {
        Vessel vessel = new Vessel(VesselType.DESTROYER, 4, 4, Orientation.HORIZONTAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(7, cellList.get(VesselType.DESTROYER.getSize() - 1).getXCoordinate());
        assertEquals(4, cellList.get(VesselType.DESTROYER.getSize() - 1).getYCoordinate());
    }

    @Test
    void test_cells_of_destroyer_vertical_cruiser() {
        Vessel vessel = new Vessel(VesselType.DESTROYER, 4, 4, Orientation.VERTICAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(4, cellList.get(VesselType.DESTROYER.getSize() - 1).getXCoordinate());
        assertEquals(7, cellList.get(VesselType.DESTROYER.getSize() - 1).getYCoordinate());
    }

    @Test
    void test_cells_of_carrier_horizontal_cruiser() {
        Vessel vessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.HORIZONTAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(8, cellList.get(VesselType.CARRIER.getSize() - 1).getXCoordinate());
        assertEquals(4, cellList.get(VesselType.CARRIER.getSize() - 1).getYCoordinate());
    }

    @Test
    void test_cells_of_carrier_vertical_cruiser() {
        Vessel vessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        List<Cell> cellList = vessel.getCellList();
        assertEquals(3, cellList.get(VesselType.CARRIER.getSize() - 1).getXCoordinate());
        assertEquals(9, cellList.get(VesselType.CARRIER.getSize() - 1).getYCoordinate());
    }

}