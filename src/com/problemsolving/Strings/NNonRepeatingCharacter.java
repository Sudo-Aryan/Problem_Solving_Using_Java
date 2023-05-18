package com.problemsolving.Strings;

import java.util.Arrays;

public class NNonRepeatingCharacter {

    private static char repeat(String str, int n){
        int[] arr = new int[91];
        char[] charr = str.toCharArray();
        int count = 0;

        for (char c : charr) {
            arr[c]++;
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < charr.length; i++) {
            if(arr[charr[i]] == 1){
                count++;
                if(count == n){
                    return charr[i];
                }
            }
        }

        return ' ';
    }

    public static void main(String[] args){
        String str = "Aryan".toUpperCase();
        System.out.println(repeat(str,3));
    }
}
