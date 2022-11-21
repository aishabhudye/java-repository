package com.aisha.exercises.games;

import java.util.Scanner;

public class MorseCodeRunner {

    public static void main (String[] args){
        MorseCode morseCode = new MorseCode();

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to decode or encode? Type E for Encode and D for Decode");
        String operation = input.nextLine();
        if (operation.equalsIgnoreCase("D")){
            System.out.println("Enter the string you want to decode");
            String encoded = input.nextLine();
            String decoded = morseCode.decoder(encoded);
            System.out.println(String.format("You wrote %s", decoded));
        }
        if (operation.equalsIgnoreCase("E")){
            System.out.println("Enter the string you want to encode");
            String unencoded = input.nextLine();
            String encoded = morseCode.encoder(unencoded);
            System.out.println(String.format("You wrote %s", encoded));
        }

    }
}
