package com.problemsolving.Arrays;

import java.util.Arrays;

public class GroupOccurrenceOfElements {
    private static String str = "";
    private static void groupOcccurencesTogether(int[] arr){
        int[] freq = new int[arr.length];
        boolean[] check = new boolean[arr.length]; // By default value of boolean array is 'false'
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                    check[j] = true;
                }
            }
            if(check[i] != true){
                freq[i] = count;
                check[i] = false;
            }
        }
//        System.out.println(Arrays.toString(check));
//        System.out.println(Arrays.toString(freq));
        for (int i = 0; i < freq.length; i++) {
            if(check[i] != true){
                for (int j = 0; j < freq[i]; j++) {
                    str += arr[i] + " ";
                }
            }
        }
    }
    public static void main(String[] args) {
        groupOcccurencesTogether(new int[] {6,7,6,6,-1,9,9,2,4,-1,1,7});
        System.out.print(str);
    }
}
