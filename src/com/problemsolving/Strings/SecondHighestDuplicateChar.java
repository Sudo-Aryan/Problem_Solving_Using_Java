package com.problemsolving.Strings;

public class SecondHighestDuplicateChar {
    public static void main(String[] args) {
        String inputString = "Aryaann Halwai";

        int[] characterCounts = countCharacters(inputString);

//        System.out.println((char) 1);
//        for (int i = 0; i < characterCounts.length; i++) {
//            if (characterCounts[i] > 0) {
//                System.out.println("Character " + (char)i + " occurs " + characterCounts[i] + " time.");
//            }
//        }
        int secondhigh = secondHighest(characterCounts);
        for (int i = 0; i < characterCounts.length; i++) {
            if(characterCounts[i]==secondhigh){
                System.out.println("Second highest duplicate character is : '" + (char)i + "' occurs : " + characterCounts[i]);
                break;
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
    private static int secondHighest(int[] arr){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>highest){
                secondHighest = highest;
                highest = arr[i];
            } else if(arr[i]>secondHighest && arr[i] != highest){
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }
}
