package com.aisha.exercises.games.batteships;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {


    public void userInput() {

        Board board = new Board(10, 10);
        List<Cell> opponentBombedCells = new ArrayList<>();
        Player player = new Player(board, opponentBombedCells);
        while (player.getBoard().getVesselList().size() < 5) {

            VesselType typeOfVessel = null;
            Orientation userOrientation;
            int X;
            int Y;
            Scanner input = new Scanner(System.in);
            System.out.println("Please specify a number for the vessel: 2 Corvette, 3 Submarine, 4 Destroyer, 5 Cruiser, 6 Carrier");
            int vesselSize = input.nextInt();
            if (vesselSize == 2) {
                typeOfVessel = VesselType.CORVETTE;
                System.out.println(typeOfVessel.getName());
            }
            if (vesselSize == 3) {
                typeOfVessel = VesselType.SUBMARINE;
                System.out.println(typeOfVessel.getName());
            }
            if (vesselSize == 4) {
                typeOfVessel = VesselType.DESTROYER;
                System.out.println(typeOfVessel.getName());
            }
            if (vesselSize == 5) {
                typeOfVessel = VesselType.CRUISER;
                System.out.println(typeOfVessel.getName());
            }
            if (vesselSize == 6) {
                typeOfVessel = VesselType.CARRIER;
                System.out.println(typeOfVessel.getName());
            }
            System.out.println("Enter the starting x value: ");
            X = input.nextInt();
            System.out.println("Enter the starting y value: ");
            Y = input.nextInt();
            System.out.println("Enter the orientation H or V: ");
            userOrientation = Orientation.valueOf(input.next());
            System.out.println(userOrientation);
            Vessel vessel = new Vessel(typeOfVessel, X, Y, userOrientation);
            if (vessel.fitsOnBoard(player.getBoard())) {
                player.getBoard().updateVesselList(vessel);
            }
            System.out.println(player.getBoard().getVesselList().size());
        }

    }

    public static void main(String args[]) {
        UserInterface userInterface = new UserInterface();
        userInterface.userInput();
    }
}
