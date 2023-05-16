package com.problemsolving.Strings;

public class FrequencyOfCharsUsingArray {
    public static void main(String[] args) {
        String inputString = "Aryaan Halwai";

        int[] characterCounts = countCharacters(inputString);

        System.out.println((char) 1);
        for (int i = 0; i < characterCounts.length; i++) {
            if (characterCounts[i] > 0) {
                System.out.println("Character " + (char)i + " occurs " + characterCounts[i] + " time.");
            }
        }
    }

    private static int[] countCharacters(String inputString) {
        int[] characterCounts = new int[128];

        inputString = inputString.replaceAll("\\s+", "").toLowerCase();

        for (char c : inputString.toCharArray()) {
            characterCounts[c]++;
        }
//        System.out.println(Arrays.toString(characterCounts));
        return characterCounts;
    }
}
