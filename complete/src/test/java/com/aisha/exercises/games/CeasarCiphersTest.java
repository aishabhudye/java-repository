package com.aisha.exercises.games;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarCiphersTest {
    private final CeasarCipher ceasarCipher = new CeasarCipher();

    @Test
    public void test_rank_1(){
        int natural_rank = 0;
        int shift = 3;
        assertEquals(3,ceasarCipher.calculateRank(natural_rank,shift));
    }

    @Test
    public void test_rank_2(){
        int natural_rank = 1;
        int shift = 3;
        assertEquals(4,ceasarCipher.calculateRank(natural_rank,shift));
    }
    @Test
    public void test_rank_3(){
        int natural_rank = 24;
        int shift = 3;
        assertEquals(1,ceasarCipher.calculateRank(natural_rank,shift));
    }

    @Test
    public void test_rank_4(){
        int natural_rank = 20;
        int shift = -4;
        assertEquals(16,ceasarCipher.calculateRank(natural_rank,shift));
    }

    @Test
    public void test_caesar_cipher_encode(){
        String message = "CAT";
        int shift = 3;
        assertEquals("FDW",ceasarCipher.caesarCipher(message,shift));
    }

    @Test
    public void test_sentence(){
        String message = "THE FAT CAT";
        int shift = 3;
        assertEquals("WKH IDW FDW",ceasarCipher.caesarCipher(message,shift));
    }

    @Test
    public void test_case(){
        String message = "cat";
        int shift = 3;
        assertEquals("FDW",ceasarCipher.caesarCipher(message,shift));
    }






}