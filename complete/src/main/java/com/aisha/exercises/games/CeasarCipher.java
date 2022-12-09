package com.aisha.exercises.games;

import java.util.HashMap;
import java.util.Map;

public class CeasarCipher {

    private Map<Integer , String> numberToLetterDictionary = new HashMap<Integer , String>() {{
        put(1,"A");
        put(2,"B");
        put(3,"C");
        put(4,"D");
        put(5,"E");
        put(6,"F");
        put(7,"G");
        put(8,"H");
        put(9,"I");
        put(10,"J");
        put(11,"K");
        put(12,"L");
        put(13,"M");
        put(14,"N");
        put(15,"O");
        put(16,"P");
        put(17,"Q");
        put(18,"R");
        put(19,"S");
        put(20,"T");
        put(21,"U");
        put(22,"V");
        put(23,"W");
        put(24,"X");
        put(25,"Y");
        put(26,"Z");
    }};


    public int calculateRank(int naturalRank,int shift){
        int cipher_rank = (naturalRank+shift)%26;
        return cipher_rank;

    }

    public String caesarCipher(String userInput,int shift) {
        Map<String, Integer> letterToNumberDictionary = invertMap(numberToLetterDictionary);
        String[] listOfLetters = userInput.split("");
        String cipherMessage = "";
        for (String letter : listOfLetters) {
            String cipherLetter = " ";
            if (letter.equals(" ")) {
                 cipherLetter= " ";
            }
            else {
                int naturalRank = letterToNumberDictionary.get(letter.toUpperCase());
                int cipherRank = calculateRank(naturalRank, shift);
                cipherLetter = numberToLetterDictionary.get(cipherRank);
            }
            cipherMessage = cipherMessage + cipherLetter;


        }
        return cipherMessage;

    }

    public static <V, K> Map<V, K> invertMap(Map<K, V> map) {
        Map<V, K> inversedMap = new HashMap<V, K>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            inversedMap.put(entry.getValue(), entry.getKey());
        }
        return inversedMap;
    }
}
