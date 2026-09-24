package org.example.aarrayseraciocionio.validanagram;

import java.util.*;

public class ValidAnagram {

    //Brute Force
    public static boolean validAnagram(String s, String t) {

        // Minha solução
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> chavesValorS = new HashMap<>();
        Map<Character, Integer> chavesValorT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!chavesValorS.containsKey(s.charAt(i))) {
                chavesValorS.put(s.charAt(i), 1);
                continue;
            }

            chavesValorS.put(s.charAt(i), chavesValorS.get(s.charAt(i)) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!chavesValorT.containsKey(t.charAt(i))) {
                chavesValorT.put(t.charAt(i), 1);
                continue;
            }

            chavesValorT.put(t.charAt(i), chavesValorT.get(t.charAt(i)) + 1);
        }

        Set<Character> characters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (characters.contains(s.charAt(i))) {
                continue;
            }

            characters.add(s.charAt(i));

            if (!chavesValorS.get(s.charAt(i)).equals(chavesValorT.get(s.charAt(i)))) {
                return false;
            }
        }

        return true;
    }

    public static boolean validAnagram2(String s, String t) {

        // Com dica do chatGPT

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> chavesValor = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(!chavesValor.containsKey(s.charAt(i))){
                chavesValor.put(s.charAt(i), 1);
                continue;
            }

            chavesValor.put(s.charAt(i), chavesValor.get(s.charAt(i)) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if(!chavesValor.containsKey(t.charAt(i))){
                chavesValor.put(t.charAt(i), -1);
                continue;
            }

            chavesValor.put(t.charAt(i), chavesValor.get(t.charAt(i)) - 1);
        }

        for (Integer value : chavesValor.values()) {
            if(value != 0) {
                return false;
            }
        }

        return true;

    }

}