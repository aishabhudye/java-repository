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
    void first_vessel_should_be_added_successfully_to_list() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        assertTrue(boardTestTarget.updateVesselList(carrierVessel));
    }

    @Test
    void duplicate_vertical_vessels_are_not_allowed() {
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

    @Test
    void vessels_are_not_allowed_due_to_same_coordinates() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 5, 6, Orientation.VERTICAL);
        assertFalse(boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    void vessels_are_not_allowed_due_to_same_type() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.VERTICAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.SUBMARINE, 7, 8, Orientation.VERTICAL);
        assertFalse(boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    void duplicate_horizontal_vessels_are_not_allowed() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.HORIZONTAL);
        assertFalse(boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    @DisplayName("Horizontal vessels of different types without overlapping coordinates should be allowed")
    void horizontal_vessels_are_allowed() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.HORIZONTAL);
        assertTrue(boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    void different_vessel_types_are_not_allowed_due_to_same_coordinates() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.CARRIER, 5, 6, Orientation.HORIZONTAL);
        assertFalse(boardTestTarget.updateVesselList(secondVessel));
    }

    @Test
    void same_vessel_types_are_not_allowed_despite_different_coordinates() {
        //Create a carrierVessel
        Vessel firstVessel = new Vessel(VesselType.SUBMARINE, 5, 6, Orientation.HORIZONTAL);
        boardTestTarget.updateVesselList(firstVessel);

        //Create a carrierVessel
        Vessel secondVessel = new Vessel(VesselType.SUBMARINE, 7, 8, Orientation.HORIZONTAL);
        assertFalse(boardTestTarget.updateVesselList(secondVessel));
    }

}