package com.problemsolving.Strings;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {

    }

    private static char repeat(String str, int n){
        int[] arr = new int[91];
        char[] charr = str.toCharArray();
        int count = 0;

        for (char c : charr) {
            arr[c]++;
        }

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
}
