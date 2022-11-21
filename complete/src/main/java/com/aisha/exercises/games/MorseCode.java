package com.aisha.exercises.games;

import java.util.*;

public class MorseCode {

    private Map<String, String> morseDictionary = new HashMap<String, String>() {{
        put("A", ".-");
        put("B", "-...");
        put("C", "-.-.");
        put("D", "-..");
        put("E", ".");
        put("F", "..-.");
        put("G", "--.");
        put("H", "....");
        put("I", "..");
        put("J", ".---");
        put("K", "-.-");
        put("L", ".-..");
        put("M", "--");
        put("N", "-.");
        put("O", "---");
        put("P", ".--.");
        put("Q", "--.-");
        put("R", ".-.");
        put("S", "...");
        put("T", "-");
        put("U", "..-");
        put("V", "...-");
        put("W", ".--");
        put("X", "-..-");
        put("Y", "-.--");
        put("Z", "--..");
        put(" ", "/");
    }};


    public String encoder(String morseDecodedMessage) {
        morseDecodedMessage.equalsIgnoreCase("");
        String[] alphabetLetters = morseDecodedMessage.split("");
        String encodedMessage = "";
        int count = 0;
        for (String alphabetChar : alphabetLetters) {
            System.out.println(alphabetChar);
            if (alphabetChar.equals(" ")) {
                alphabetChar.equals("/");
            }
            String morse = (String) morseDictionary.get(alphabetChar);
            if (count > 0) {
                encodedMessage = encodedMessage + " " + morse;
            }else{
                encodedMessage = encodedMessage + morse;
            }
            count ++;
        }

        return encodedMessage;
    }

    public String decoder(String morse_encoded_message) {

        Map<String, String> invertedMorseDictionary = invertMap(morseDictionary);

        String[] morseLetters = morse_encoded_message.split(" ");
        String decodedMessage = "";
        if (valid_morse(morse_encoded_message) == true) {
            for (String morseChar : morseLetters) {
                System.out.println(morseChar);
                if (morseChar.equals("/")) {
                    morseChar.equals(" ");
                }
                String message = invertedMorseDictionary.get(morseChar);
                decodedMessage = decodedMessage + message;
            }
        } else {
            return "ERROR";
        }
        System.out.println("The message is: " + decodedMessage);  // Output user input
        return decodedMessage;

    }

    public static <V, K> Map<V, K> invertMap(Map<K, V> map) {
        Map<V, K> inversedMap = new HashMap<V, K>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            inversedMap.put(entry.getValue(), entry.getKey());
        }
        return inversedMap;
    }


    public boolean valid_morse(String morse_encoded_message) {
        String[] morse_char = morse_encoded_message.split(";");
        boolean validMorse = morse_char.equals("-") || morse_char.equals(".");
        if (validMorse != morse_char.equals("-") || validMorse != morse_char.equals(".")) {
            return false;
        } else {
            return true;
        }


    }

}





