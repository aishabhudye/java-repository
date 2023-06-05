package com.aisha.exercises.games.batteships;

import java.util.*;

public class UserInterface {

    List<Player> playerList = new ArrayList<>();


    private Map<Integer, VesselType> numberToVesselTypeDictionary = new HashMap<Integer, VesselType>() {{
        put(2, VesselType.CORVETTE);
        put(3, VesselType.SUBMARINE);
        put(4, VesselType.DESTROYER);
        put(5, VesselType.CRUISER);
        put(6, VesselType.CARRIER);
    }};

    private Map<String, Orientation> letterToOrientationDictionary = new HashMap<String, Orientation>() {{
        put("H", Orientation.HORIZONTAL);
        put("V", Orientation.VERTICAL);
    }};


    public void promptUserForVessels() {
        while (playerList.size() <= 2) {
            Board board = new Board(10, 10);
            List<Cell> opponentBombedCells = new ArrayList<>();
            Player player = new Player(board, opponentBombedCells);
            while (board.getVesselList().size() < 5) {
                Scanner input = new Scanner(System.in);
                System.out.println("Please specify a number for the vessel: 2 Corvette, 3 Submarine, 4 Destroyer, 5 Cruiser, 6 Carrier");
                int vesselSize = input.nextInt();
                VesselType vesselType = numberToVesselTypeDictionary.get(vesselSize);
                System.out.println(vesselType.getName());
                System.out.println("Enter the starting x value: ");
                int X = input.nextInt();
                System.out.println("Enter the starting y value: ");
                int Y = input.nextInt();
                System.out.println("Enter the orientation H or V: ");
                String usersOrientation = input.next();
                Orientation orientation = letterToOrientationDictionary.get(usersOrientation);
                System.out.println(orientation);
                Vessel vessel = new Vessel(vesselType, X, Y, orientation);

                if (vessel.fitsOnBoard(board)) {
                    int oldVesselListSize = board.getVesselList().size();
                    int newVesselListSize = player.getBoard().updateVesselList(vessel);
                    if (newVesselListSize > oldVesselListSize) {
                        System.out.println("This is how the board looks now");
                        //Draw the board
                        board.populateGrid();
                        board.draw();
                    }
                }
                System.out.println(player.getBoard().getVesselList().size());
            }
            playerList.add(player);
            System.out.println("Player" + playerList.size() + "has placed their ships");

        }
    }

    public void promptUserToBombCell() {
        Board boardUnderAttack = new Board(10, 10);
        List<Cell> cellsUnderAttack = new ArrayList<>();
        Player attacker = new Player(boardUnderAttack, cellsUnderAttack);
        List<Vessel> vesselsUnderAttack = boardUnderAttack.getVesselList();
        for (Vessel currentVesselUnderAttack : vesselsUnderAttack) {
            for (Cell vesselCell : currentVesselUnderAttack.getCellList()) {
                for (Cell cellUnderAttack : cellsUnderAttack) {
                    if (vesselCell.getXCoordinate() != cellUnderAttack.getXCoordinate() && vesselCell.getYCoordinate() != cellUnderAttack.getYCoordinate()) {
                        Scanner input = new Scanner(System.in);
                        System.out.println("Please specify X coordinate to bomb");
                        int xCoordinateToBomb = input.nextInt();
                        System.out.println("Please specify Y coordinate to bomb");
                        int yCoordinateToBomb = input.nextInt();
                        Cell cellBombedByAttacker = new Cell(xCoordinateToBomb, yCoordinateToBomb);
                        if (attacker.hasBombedAValidCell(cellBombedByAttacker, boardUnderAttack)) {
                            for (int index = 0; index < currentVesselUnderAttack.getCellList().size(); index++) {
                                if (cellBombedByAttacker.getXCoordinate() == currentVesselUnderAttack.getCellList().get(index).getXCoordinate() && cellBombedByAttacker.getYCoordinate() == currentVesselUnderAttack.getCellList().get(index).getYCoordinate()) {
                                    attacker.updateCell(cellBombedByAttacker, boardUnderAttack);
                                    System.out.println("Player had bombed cell " + xCoordinateToBomb + yCoordinateToBomb + "of vessel" + currentVesselUnderAttack.getVesselType().getName());
                                }
                            }
                        }
                    } else {
                        System.out.println("Player has won");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.promptUserForVessels();
        //At this stage, both players should have a valid board of vessels EACH

        //userInterface.promptUserToBombCell();
    }
}
