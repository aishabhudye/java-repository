package com.aisha.exercises.games;

import java.util.Scanner;


public class CeasarCipherRunner {

    public static void main(String[]args){
        CeasarCipher ceasarCipher = new CeasarCipher();

        Scanner input  = new Scanner(System.in);
        System.out.println("Enter message");
        String message  = input.nextLine();
        System.out.println("Enter shift");
        int shift = Integer.parseInt(input.nextLine());
        String cipher_message = ceasarCipher.caesarCipher(message,shift);
        System.out.println(cipher_message);
    }
}
