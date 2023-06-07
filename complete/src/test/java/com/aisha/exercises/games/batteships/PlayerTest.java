package com.aisha.exercises.games.batteships;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    public static final Board board = new Board(10, 10);
    public static final List<Cell> opponentBombedCells = new ArrayList<>();

    Player playerTestTarget = new Player(board, opponentBombedCells);


    @Test
    @DisplayName("first cell should be added successfully to the list ")
    void scenario1() {
        Cell cell = new Cell(1, 1);
        assertTrue(playerTestTarget.trackCellsBombedOnOpponentsBoard(cell, board));
    }

    @Test
    @DisplayName("d" +
            "Duplicate cells are not allowed")
    void scenario2() {
        Cell cell = new Cell(1, 1);
        playerTestTarget.trackCellsBombedOnOpponentsBoard(cell, board);
        Cell cell2 = new Cell(1, 1);
        assertFalse(playerTestTarget.trackCellsBombedOnOpponentsBoard(cell2, board));
    }

    @Test
    @DisplayName("Different cells are allowed")
    void scenario3() {
        Cell cell = new Cell(1, 1);
        playerTestTarget.trackCellsBombedOnOpponentsBoard(cell, board);
        Cell cell2 = new Cell(2, 3);
        assertTrue(playerTestTarget.trackCellsBombedOnOpponentsBoard(cell2, board));
    }

    @Test
    @DisplayName("Different cells are allowed")
    void scenario4() {
        Cell cell = new Cell(1, 1);
        playerTestTarget.trackCellsBombedOnOpponentsBoard(cell, board);
        Cell cell2 = new Cell(3, 1);
        assertTrue(playerTestTarget.trackCellsBombedOnOpponentsBoard(cell2, board));
    }

    @Test
    @DisplayName("Corvette is successfully hit")
    void scenario5() {
        Vessel corvette = new Vessel(VesselType.CORVETTE,2,2,Orientation.HORIZONTAL);
        board.updateVesselList(corvette);
        Cell cell = new Cell(2, 2);
        List<Cell> cellList = new ArrayList<>();
        Player player = new Player(board,cellList);
        assertTrue(player.hasVesselOnOpponentBoardBeenHit(cell,board));
    }

    @Test
    @DisplayName("Corvette is unsuccessfully hit")
    void scenario6() {
        Vessel corvette = new Vessel(VesselType.CORVETTE,2,2,Orientation.HORIZONTAL);
        board.updateVesselList(corvette);
        Cell cell = new Cell(2, 1);
        List<Cell> cellList = new ArrayList<>();
        Player player = new Player(board,cellList);
        assertFalse(player.hasVesselOnOpponentBoardBeenHit(cell,board));
    }

    @Test
    @DisplayName("All ships are sunk on the board")
    void scenario7() {
        List<Cell> opponentCellList = new ArrayList<>();
        Board playersOwnBoard = new Board(10,10);
        Player playerThatIsBombing = new Player(playersOwnBoard,opponentCellList);
        Vessel corvette = new Vessel(VesselType.CORVETTE,7,8,Orientation.HORIZONTAL);
        board.updateVesselList(corvette);
        Cell bombedCell1 = new Cell(7,8);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell1,board);
        Cell bombedCell2 = new Cell(8,8);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell2,board);

        Vessel submarine = new Vessel(VesselType.SUBMARINE,5,6,Orientation.HORIZONTAL);
        board.updateVesselList(submarine);
        Cell bombedCell3 = new Cell(5,6);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell3,board);
        Cell bombedCell4 = new Cell(6,6);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell4,board);
        Cell bombedCell5 = new Cell(7,6);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell5,board);

        Vessel destroyer = new Vessel(VesselType.DESTROYER,3,5,Orientation.HORIZONTAL);
        board.updateVesselList(destroyer);
        Cell bombedCell6 = new Cell(3,5);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell6,board);
        Cell bombedCell7 = new Cell(4,5);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell7,board);
        Cell bombedCell8 = new Cell(5,5);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell8,board);
        Cell bombedCell9 = new Cell(6,5);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell9,board);

        Vessel cruiser = new Vessel(VesselType.CRUISER,1,3,Orientation.HORIZONTAL);
        board.updateVesselList(cruiser);
        Cell bombedCell10 = new Cell(1,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell10,board);
        Cell bombedCell11 = new Cell(2,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell11,board);
        Cell bombedCell12 = new Cell(3,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell12,board);
        Cell bombedCell13 = new Cell(4,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell13,board);
        Cell bombedCell14 = new Cell(5,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell14,board);

        Vessel carrier = new Vessel(VesselType.CARRIER,2,3,Orientation.HORIZONTAL);
        board.updateVesselList(carrier);
        Cell bombedCell15 = new Cell(2,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell15,board);
        Cell bombedCell16 = new Cell(3,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell16,board);
        Cell bombedCell17 = new Cell(4,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell17,board);
        Cell bombedCell18 = new Cell(5,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell18,board);
        Cell bombedCell19 = new Cell(6,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell19,board);
        Cell bombedCell20 = new Cell(7,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell20,board);

        assertTrue(playerThatIsBombing.hasAllVesselsOnOpponentBoardBeenSunk(board));
    }

    @Test
    @DisplayName("4/5 ships are sunk on the board, carrier has not been sunk successfully")
    void scenario8() {
        List<Cell> opponentCellList = new ArrayList<>();
        Board playersOwnBoard = new Board(10,10);
        Player playerThatIsBombing = new Player(playersOwnBoard,opponentCellList);
        Vessel corvette = new Vessel(VesselType.CORVETTE,7,8,Orientation.HORIZONTAL);
        board.updateVesselList(corvette);
        Cell bombedCell1 = new Cell(7,8);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell1,board);
        Cell bombedCell2 = new Cell(8,8);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell2,board);

        Vessel submarine = new Vessel(VesselType.SUBMARINE,5,6,Orientation.HORIZONTAL);
        board.updateVesselList(submarine);
        Cell bombedCell3 = new Cell(5,6);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell3,board);
        Cell bombedCell4 = new Cell(6,6);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell4,board);
        Cell bombedCell5 = new Cell(7,6);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell5,board);

        Vessel destroyer = new Vessel(VesselType.DESTROYER,3,5,Orientation.HORIZONTAL);
        board.updateVesselList(destroyer);
        Cell bombedCell6 = new Cell(3,5);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell6,board);
        Cell bombedCell7 = new Cell(4,5);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell7,board);
        Cell bombedCell8 = new Cell(5,5);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell8,board);
        Cell bombedCell9 = new Cell(6,5);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell9,board);

        Vessel cruiser = new Vessel(VesselType.CRUISER,1,3,Orientation.HORIZONTAL);
        board.updateVesselList(cruiser);
        Cell bombedCell10 = new Cell(1,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell10,board);
        Cell bombedCell11 = new Cell(2,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell11,board);
        Cell bombedCell12 = new Cell(3,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell12,board);
        Cell bombedCell13 = new Cell(4,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell13,board);
        Cell bombedCell14 = new Cell(5,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell14,board);

        Vessel carrier = new Vessel(VesselType.CARRIER,2,3,Orientation.HORIZONTAL);
        board.updateVesselList(carrier);
        Cell bombedCell15 = new Cell(2,4);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell15,board);
        Cell bombedCell16 = new Cell(3,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell16,board);
        Cell bombedCell17 = new Cell(4,3);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell17,board);
        Cell bombedCell18 = new Cell(5,6);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell18,board);
        Cell bombedCell19 = new Cell(7,5);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell19,board);
        Cell bombedCell20 = new Cell(8,4);
        playerThatIsBombing.hasVesselOnOpponentBoardBeenHit(bombedCell20,board);


        assertFalse(playerThatIsBombing.hasAllVesselsOnOpponentBoardBeenSunk(board));
    }







}