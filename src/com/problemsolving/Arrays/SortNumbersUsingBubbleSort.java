package com.problemsolving.Arrays;

import java.util.Arrays;

public class SortNumbersUsingBubbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{6, 7, 6, 6, 9, 9, 2, 4, 1, 7})));
    }

    private static int[] sort(int[] arr){   // 6 7 6 6 9 9 2 4 1 7 =>  6 6 6 7 7 9 9 2 4 1
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - j - 1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
