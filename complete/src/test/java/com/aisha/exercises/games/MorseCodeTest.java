package com.aisha.exercises.games;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MorseCodeTest {
    private final MorseCode target = new MorseCode();

    @Test
    public void test_encode_upper_case() {
        String alphabetMessage = "DECODE/MORSE";
        String encodedMessage = target.encoder(alphabetMessage);
        assertEquals("-.. . -.-. --- -.. . / -- --- .-. ... .", encodedMessage);
    }

    @Test
    public void test_encode_upper_case_no_slash() {
        String alphabetMessage = "DECODE MORSE";
        String encodedMessage = target.encoder(alphabetMessage);
        assertEquals("-.. . -.-. --- -.. . / -- --- .-. ... .", encodedMessage);
    }

    @Test
    public void test_encode_lower_case() {
        String alphabetMessage = "Decode morse";
        String encodedMessage = target.encoder(alphabetMessage);
        assertEquals("-.. . -.-. --- -.. . / -- --- .-. ... .", encodedMessage);
    }

    @Test
    public void test_decode_upper_case() {
        String morseMessage = "-.. . -.-. --- -.. . / -- --- .-. ... .";
        String decodedMessage = target.decoder(morseMessage);
        assertEquals("DECODE/MORSE", decodedMessage);
    }

    @Test
    public void test_decode_upper_case_no_slash() {
        String morseMessage = "-.. . -.-. --- -.. . / -- --- .-. ... .";
        String decodedMessage = target.decoder(morseMessage);
        assertEquals("DECODE MORSE", decodedMessage);
    }

    @Test
    public void test_decode_lower_case() {
        String morseMessage = "-.. . -.-. --- -.. . / -- --- .-. ... .";
        String decodedMessage = target.decoder(morseMessage);
        assertEquals("decode morse", decodedMessage);
    }

    @Test
    public void test_valid_morse() {
        String morse_message = ".--...";
        assertTrue(target.isValid(morse_message));

    }

}

