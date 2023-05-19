package com.aisha.exercises.games.batteships;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board boardTestTarget;

    @BeforeEach
    void setUp() {
        boardTestTarget = new Board(10, 10);
    }

    @Test
    @DisplayName("first vessel should be added successfully to list")
    void scenario1() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        assertEquals(1, boardTestTarget.updateVesselList(carrierVessel));
    }

    @Test
    @DisplayName("duplicate vertical vessels are not allowed")
    void scenario2() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        assertEquals(1, boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    @DisplayName("vessels are allowed")
    void scenario3() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 4, 6, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        assertEquals(2, boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    @DisplayName("vessels are not allowed due to same coordinates")
    void scenario4() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 5, 6, Orientation.VERTICAL);
        assertEquals(1, boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    @DisplayName("vessels are not allowed due to same_type")
    void scenario5() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.SUBMARINE, 7, 8, Orientation.VERTICAL);
        assertEquals(1, boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    @DisplayName("duplicate horizontal vessels are not allowed")
    void scenario6() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.HORIZONTAL);
        assertEquals(1, boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    @DisplayName("Horizontal vessels of different types without overlapping coordinates should be allowed")
    void scenario7() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.HORIZONTAL);
        assertEquals(2, boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    @DisplayName("different vessel types are not allowed due to same coordinates")
    void scenario8() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 5, 6, Orientation.HORIZONTAL);
        assertEquals(1, boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    @DisplayName("same vessel types are not allowed despite different coordinates")
    void scenario9() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.SUBMARINE, 7, 8, Orientation.HORIZONTAL);
        assertEquals(1, boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    @DisplayName("three different type vessels of different coordinates added to board")
    void scenario10() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CORVETTE, 7, 8, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(secondVessel);

        Vessel thirdVessel = new Vessel(VesselType.DESTROYER, 2, 3, Orientation.HORIZONTAL);
        assertEquals(3, boardTestTarget.updateVesselList(thirdVessel));
    }

    @Test
    @DisplayName("three vessels of the same type of different coordinates added to board")
    void scenario11() {
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        Vessel secondVessel = new Vessel(VesselType.SUBMARINE, 7, 8, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(secondVessel);

        Vessel thirdVessel = new Vessel(VesselType.SUBMARINE, 2, 3, Orientation.HORIZONTAL);
        assertEquals(1, boardTestTarget.updateVesselList(thirdVessel));
    }

    @Test
    @DisplayName("two vessels of the same type of different coordinates added to board")
    void scenario12() {
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        Vessel secondVessel = new Vessel(VesselType.CORVETTE, 7, 8, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(secondVessel);

        Vessel thirdVessel = new Vessel(VesselType.CORVETTE, 2, 3, Orientation.HORIZONTAL);
        assertEquals(2, boardTestTarget.updateVesselList(thirdVessel));
    }

    @Test
    @DisplayName("horizontal five vessels of different types of different coordinates added to board")
    void scenario13() {
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        Vessel secondVessel = new Vessel(VesselType.CORVETTE, 7, 8, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(secondVessel);

        Vessel thirdVessel = new Vessel(VesselType.CARRIER, 2, 3, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(thirdVessel);

        Vessel fourthVessel = new Vessel(VesselType.DESTROYER, 3, 5, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(fourthVessel);

        Vessel fithVessel = new Vessel(VesselType.CRUISER, 1, 3, Orientation.HORIZONTAL);
        assertEquals(5, boardTestTarget.updateVesselList(fithVessel));
    }

    @Test
    @DisplayName("vertical five vessels of different types of different coordinates added to board")
    void scenario14() {
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(firstVessel);

        Vessel secondVessel = new Vessel(VesselType.CORVETTE, 7, 8, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(secondVessel);

        Vessel thirdVessel = new Vessel(VesselType.CARRIER, 2, 3, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(thirdVessel);

        Vessel fourthVessel = new Vessel(VesselType.DESTROYER, 3, 5, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(fourthVessel);

        Vessel fithVessel = new Vessel(VesselType.CRUISER, 1, 3, Orientation.VERTICAL);
        assertEquals(5, boardTestTarget.updateVesselList(fithVessel));
    }

    @Test
    @DisplayName("Grid is set up with a carrier at 3,4")
    void grid_scenario1() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(carrierVessel);
        int[][] grid = boardTestTarget.populateGrid();
        boardTestTarget.draw();
        assertEquals(6, grid[3][4]);
        assertEquals(6, grid[3][5]);
        assertEquals(6, grid[3][6]);
        assertEquals(6, grid[3][7]);
        assertEquals(6, grid[3][8]);
        assertEquals(6, grid[3][9]);
    }

    @Test
    @DisplayName("Grid is set up with a corvette at 2,3")
    void grid_scenario2() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.CORVETTE, 2, 3, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(carrierVessel);
        int[][] grid = boardTestTarget.populateGrid();
        boardTestTarget.draw();
        assertEquals(2, grid[2][3]);
        assertEquals(2, grid[3][3]);
    }

    @Test
    @DisplayName("Grid is set up with a cruiser at 3,9")
    void grid_scenario3() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.CRUISER, 3, 9, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(carrierVessel);
        int[][] grid = boardTestTarget.populateGrid();
        boardTestTarget.draw();
        assertEquals(5, grid[3][9]);
        assertEquals(5, grid[4][9]);
        assertEquals(5, grid[5][9]);
        assertEquals(5, grid[6][9]);
        assertEquals(5, grid[7][9]);
    }

    @Test
    @DisplayName("Grid is set up with a destroyer at 8,5")
    void grid_scenario4() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.DESTROYER, 8, 5, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(carrierVessel);
        int[][] grid = boardTestTarget.populateGrid();
        boardTestTarget.draw();
        assertEquals(4, grid[8][5]);
        assertEquals(4, grid[8][6]);
        assertEquals(4, grid[8][7]);
        assertEquals(4, grid[8][8]);
    }

    @Test
    @DisplayName("Grid is set up with a submarine at 6,5")
    void grid_scenario5() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.SUBMARINE, 6, 5, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(carrierVessel);
        int[][] grid = boardTestTarget.populateGrid();
        boardTestTarget.draw();
        assertEquals(3, grid[6][5]);
        assertEquals(3, grid[7][5]);
        assertEquals(3, grid[8][5]);
    }


}