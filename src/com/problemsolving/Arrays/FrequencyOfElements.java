package com.problemsolving.Arrays;

public class FrequencyOfElements {

    private static void frequency(int[] arr){
        int[] freq = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
//            System.out.println("hello");
            if(freq[i] != visited){
                freq[i] = count;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != visited){
                System.out.println(arr[i] + " : " + freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        frequency(new int[] {6,7,6,6,9,9,2,4,1,7});
    }
}
