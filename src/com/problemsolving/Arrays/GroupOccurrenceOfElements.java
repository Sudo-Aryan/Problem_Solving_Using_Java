package com.problemsolving.Arrays;

public class GroupOccurrenceOfElements {
    private static String str = "";
    private static void groupOcccurencesTogether(int[] arr){
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
                for (int j = 0; j < freq[i]; j++) {
                    str += arr[i] + " ";
                }
            }
        }
    }
    public static void main(String[] args) {
        groupOcccurencesTogether(new int[] {6,-1,7,6,6,-1,9,9,2,4,1,7});
        System.out.print(str);
    }
}
