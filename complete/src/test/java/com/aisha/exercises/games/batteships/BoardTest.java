package com.aisha.exercises.games.batteships;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board boardTestTarget;

    @BeforeEach
    void setUp() {
        boardTestTarget = new Board(10, 10);
    }

    @Test
    void first_vessel_should_be_added_successfully_to_list() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        assertTrue(boardTestTarget.updateVesselList(carrierVessel));
    }

    @Test
    void duplicate_vessels_are_not_allowed() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        assertFalse(boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    void vessels_are_allowed() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        assertTrue(boardTestTarget.updateVesselList(secondVessel));
    }

}