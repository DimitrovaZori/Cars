package org.example;

import java.util.HashSet;
import java.util.Set;

public class Remove {
    public static void main(String[] args) {
        String[] colours = {"red", "blue", "yellow", "green", "red", "red", "blue"};
        Set<String> unrepeatedWord = new HashSet<String>();

        for (String colour : colours) {
            unrepeatedWord.add(colour);
        }
        System.out.println(unrepeatedWord);

    }
}
