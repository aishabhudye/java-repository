package com.aisha.exercises.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TicTacToe {



    /*
    def display_instructions_with_board(self):
        print('Please specify which position/location you want your item to be as follows (0:X or 8:O)')
        print('The positions themselves are as follows')
        tic_tac_toe_locations = ["0", "1", "2", "3", "4", "5", "6", "7", "8"] // String[] ticTacToeLocations = (new String[]{"blah", "hey", "yo"});
        self.print_board(tic_tac_toe_locations)
        noughts_crosses_array = [" ", " ", " ", " ", " ", " ", " ", " ", " "]
        previous_location = -1
        previous_value = ''
        //Move previousMove = new Move(-1, "!")
        while self.board_is_not_full(noughts_crosses_array):
            user_input = input(
                'Please specify which position/location you want your item to be as follows (0:X or 8:O) -> ')
            current_location, current_value = self.validate_input(user_input)
            '''If the user input is correct, carry on, else prompt for input'''
            user_input_is_invalid = current_location == -1 and current_value == '!' // if block
            duplicate_attempt = self.check_duplicate(current_location, current_value, previous_location, previous_value)
            while user_input_is_invalid or duplicate_attempt:
                user_input = input(
                    'Please specify which position/location you want your item to be as follows (0:X or 8:O) -> ')
                current_location, current_value = self.validate_input(user_input)
                duplicate_attempt = False

            '''Store current value in previous value for comparison in the next iteration'''
            previous_location = current_location
            previous_value = current_value
            noughts_crosses_array[current_location] = current_value
            self.print_board(noughts_crosses_array)

            '''We need to check whether X or 0 has won at this point'''
            if self.someone_has_won(noughts_crosses_array):
                print('{} has won'.format(current_value))
                break
     */


    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.displayBoard();
    }

    public void displayBoard() {
        System.out.println("Please specify which position/location you want your item to be as follows (0:X or 8:O)");
        System.out.println("The positions themselves are as follows: \"0\", \"1\", \"2\", \"3\", \"4\", \"5\", \"6\", \"7\", \"8\"");

        String[] noughtsCrosses = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        printBoard(noughtsCrosses);
        Move previousMove = new Move(-1, "!");

        while (boardIsNotFull(noughtsCrosses)) {
            Move currentMove = promptUserForNextMove();
            boolean userInputInvalid = isUserInputInvalid(currentMove);
            boolean duplicate = duplicateAttempt(currentMove, previousMove);

            while (userInputInvalid || duplicate) {
                previousMove = currentMove;
                currentMove = promptUserForNextMove();
                userInputInvalid = isUserInputInvalid(currentMove);
                duplicate = duplicateAttempt(currentMove, previousMove);
            }

            previousMove = currentMove;
            noughtsCrosses[currentMove.getLocation()] = currentMove.getValue();
            printBoard(noughtsCrosses);

            if (someoneHasWon(noughtsCrosses)) {
                System.out.println(String.format("%s has won", currentMove.getValue()));
                break;
            }

        }
    }

    private static boolean isUserInputInvalid(Move currentMove) {
        boolean userInputInvalid = false;
        if (currentMove.getLocation() == -1 && currentMove.getValue().equals("!")) {
            userInputInvalid = true;
        }
        return userInputInvalid;
    }

    private Move promptUserForNextMove() {

        System.out.println("Please specify which position/location you want your item to be as follows (0:X or 8:O) -> ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(String.format("The user input was %s", line));
        Move move = validateInput(line);
        return move;
    }

    public boolean duplicateAttempt(Move currentMove, Move previousMove) {
        boolean duplicateAttempt = false;
        System.out.println(String.format("CURRENT:%d-->%s; PREVIOUS:%d-->%s", currentMove.getLocation(), currentMove.getValue(), previousMove.getLocation(), previousMove.getValue()));
        if (currentMove.getLocation() == previousMove.getLocation() || currentMove.getValue().equals(previousMove.getValue())) {
            duplicateAttempt = true;
        }
        return duplicateAttempt;
    }


    public boolean someoneHasWonInARow(String[] noughtsCrosses) {
        boolean win = false;
        if ((noughtsCrosses[0] .equals("0")) && (noughtsCrosses[1].equals("0")) && (noughtsCrosses[2].equals("0")))
            win = true;
        if ((noughtsCrosses[0] .equals("X")) && (noughtsCrosses[1].equals("X")) && (noughtsCrosses[2].equals("X")))
            win = true;
        if ((noughtsCrosses[3].equals("0")) && (noughtsCrosses[4].equals("0")) && (noughtsCrosses[5].equals("0")))
            win = true;
        if ((noughtsCrosses[3].equals("X")) && (noughtsCrosses[4].equals("X")) && (noughtsCrosses[5].equals("X")))
            win = true;
        if ((noughtsCrosses[6].equals("0") ) && (noughtsCrosses[7].equals("0")) && (noughtsCrosses[8].equals("0")))
            win = true;
        if ((noughtsCrosses[6].equals("X")) && (noughtsCrosses[7].equals("X")) && (noughtsCrosses[8].equals("X")))
            win = true;

        return win;
    }

    public boolean someoneHasWonInAColumn(String[] noughtsCrosses) {
        boolean win = false;
        if ((noughtsCrosses[0].equals("0")) && (noughtsCrosses[3].equals("0")) && (noughtsCrosses[6].equals("0")))
            win = true;
        if ((noughtsCrosses[0].equals("X")) && (noughtsCrosses[3].equals("X")) && (noughtsCrosses[6].equals("X")))
            win = true;
        if ((noughtsCrosses[1].equals("0")) && (noughtsCrosses[4].equals("0")) && (noughtsCrosses[7].equals("0")))
            win = true;
        if ((noughtsCrosses[1].equals("X")) && (noughtsCrosses[4].equals("X")) && (noughtsCrosses[7].equals("X")))
            win = true;
        if ((noughtsCrosses[2].equals("0")) && (noughtsCrosses[5].equals("0")) && (noughtsCrosses[8].equals("0")))
            win = true;
        if ((noughtsCrosses[2].equals("X")) && (noughtsCrosses[5].equals("X")) && (noughtsCrosses[8].equals("X")))
            win = true;

        return win;
    }

    public boolean someoneHasWonInADiagonal(String[] noughtsCrosses) {
        boolean win = false;
        if ((noughtsCrosses[0].equals("0")) && (noughtsCrosses[4].equals("0")) && (noughtsCrosses[8].equals("0")))
            win = true;
        if ((noughtsCrosses[0].equals("X") ) && (noughtsCrosses[4].equals("X")) && (noughtsCrosses[8].equals("X")))
            win = true;
        if ((noughtsCrosses[2].equals("0") ) && (noughtsCrosses[4].equals("0")) && (noughtsCrosses[6].equals("0")))
            win = true;
        if ((noughtsCrosses[2].equals("X")) && (noughtsCrosses[4].equals("X")) && (noughtsCrosses[6].equals("X")))
            win = true;

        return win;

    }

    public boolean boardIsFull(String[] noughtsCrosses) {
        int populatedLocationCount = 0;
        int emptyLocationCount = 0;
        for (String item : noughtsCrosses) {
            if (item.equals("X") || item.equals("0")) {
                populatedLocationCount = populatedLocationCount + 1;
            } else {
                emptyLocationCount = emptyLocationCount + 1;
            }
        }

        if (populatedLocationCount == 9) {
            return true;
        } else {
            return false;
        }
    }

    public boolean boardIsNotFull(String[] noughtsCrosses) {
        return !boardIsFull(noughtsCrosses);

    }

    public Move validateInput(String input) {
        String[] inputArray = input.split(":");
        int location = Integer.parseInt(inputArray[0]);
        String valueAtLocation = inputArray[1];
        boolean locationIsValid = (0 <= location) && (location <= 8);
        //NOTE:In Java we cannot use == we have to use .equals method
        boolean valueIsValid = valueAtLocation.equals("X") || valueAtLocation.equals("0");
        if (locationIsValid && valueIsValid) {
            return new Move(location, valueAtLocation);
        } else {
            return new Move(-1, "!");
        }
    }

    public void printBoard(String[] noughtsCrosses) {
        //System.out.println(String.format("CURRENT:{}-->{};PREVIOUS:{}-->{}", currentLocation, currentValue, previousLocation, previousValue));
        System.out.println(String.format("|%s|%s|%s|",noughtsCrosses[0],noughtsCrosses[1],noughtsCrosses[2]));
        System.out.println(String.format("|%s|%s|%s|",noughtsCrosses[3],noughtsCrosses[4],noughtsCrosses[5]));
        System.out.println(String.format("|%s|%s|%s|",noughtsCrosses[6],noughtsCrosses[7],noughtsCrosses[8]));


    }

    public boolean someoneHasWon(String[]noughtsCrosses){
        boolean winInARow = someoneHasWonInARow(noughtsCrosses);
        boolean winInAColumn = someoneHasWonInAColumn(noughtsCrosses);
        boolean winInADiagonal = someoneHasWonInADiagonal(noughtsCrosses);
        if (winInARow || winInADiagonal || winInAColumn) {
            return true;
        } else{
            return false;
        }
    }

}












