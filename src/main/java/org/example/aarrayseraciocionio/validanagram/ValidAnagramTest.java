package org.example.aarrayseraciocionio.validanagram;

import java.util.Arrays;
import java.util.List;

public class ValidAnagramTest {

    static void main() {
        String nome = "Jefferson";
        String nome2 = "nefefsorJ";
        String nome3 = "neefsforJ";
        String nome4 = "Jfefrsnop";

        System.out.println("Valid Anagram");
        System.out.println(ValidAnagram.validAnagram(nome3, nome2));
        System.out.println(ValidAnagram.validAnagram(nome3, nome4));
        System.out.println("Valid Anagram 2");
        System.out.println(ValidAnagram.validAnagram2(nome2, nome));
        System.out.println(ValidAnagram.validAnagram2(nome3, nome4));
    }

}