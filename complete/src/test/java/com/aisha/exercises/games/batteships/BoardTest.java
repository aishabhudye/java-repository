package com.aisha.exercises.games.batteships;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board boardTestTarget;

    @BeforeEach
    void setUp(){
        boardTestTarget = new Board(10, 10);
    }

    @Test
    void updateVesselList() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        //Create a carrierVessel
        Vessel carrierVessel2 = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        assertFalse(boardTestTarget.updateVesselList(carrierVessel,carrierVessel2));
    }

    @Test
    void updateVesselList2() {
        //Create a carrierVessel
        Vessel carrierVessel = new Vessel(VesselType.CORVETTE, 3, 4, Orientation.VERTICAL);
        //Create a carrierVessel
        Vessel carrierVessel2 = new Vessel(VesselType.CARRIER, 3, 4, Orientation.VERTICAL);
        assertFalse(boardTestTarget.updateVesselList(carrierVessel,carrierVessel2));
    }
}