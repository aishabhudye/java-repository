package com.aisha.exercises.games.batteships;

import java.util.*;

public class UserInterface {


    private Map<Integer, VesselType> numberToVesselTypeDictionary = new HashMap<Integer, VesselType>() {{
        put(2, VesselType.CORVETTE);
        put(3, VesselType.SUBMARINE);
        put(4, VesselType.SUBMARINE);
        put(5, VesselType.CRUISER);
        put(6, VesselType.CARRIER);
    }};

    private Map<String, Orientation> letterToOrientationDictionary = new HashMap<String, Orientation>() {{
        put("H", Orientation.HORIZONTAL);
        put("V", Orientation.VERTICAL);
    }};


    public void userInput() {
        for (int i = 0; i < 2; i++) {
            Board board = new Board(10, 10);
            List<Cell> opponentBombedCells = new ArrayList<>();
            Player player = new Player(board, opponentBombedCells);
            while (player.getBoard().getVesselList().size() < 5) {
                int X;
                int Y;
                Scanner input = new Scanner(System.in);
                System.out.println("Please specify a number for the vessel: 2 Corvette, 3 Submarine, 4 Destroyer, 5 Cruiser, 6 Carrier");
                int vesselSize = input.nextInt();
                VesselType vesselType = numberToVesselTypeDictionary.get(vesselSize);
                System.out.println(vesselType.getName());
                System.out.println("Enter the starting x value: ");
                X = input.nextInt();
                System.out.println("Enter the starting y value: ");
                Y = input.nextInt();
                System.out.println("Enter the orientation H or V: ");
                String usersOrientation = input.next();
                Orientation orientation = letterToOrientationDictionary.get(usersOrientation);
                System.out.println(orientation);
                Vessel vessel = new Vessel(vesselType, X, Y, orientation);
                if (vessel.fitsOnBoard(player.getBoard())) {
                    player.getBoard().updateVesselList(vessel);
                }
                System.out.println(player.getBoard().getVesselList().size());
            }

        }
    }

    public static void main(String args[]) {
        UserInterface userInterface = new UserInterface();
        userInterface.userInput();
    }
}
