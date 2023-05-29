package org.problem_solving;

import java.util.Scanner;
public class elements_in_range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] arr = new int[length];
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i = 0; i < length; i++){
            arr[i]=in.nextInt(); // input: 9 2 6 1 2 3 4 5 6 7 8 9 //output: 1 2 3 4 // output: 2 3 4 //output: elements or indices
        }
        for(int i = 0; i < length; i++){
            if(arr[i]>=start && arr[i]<end){
                System.out.print(i + " "); // System.out.print(arr[i] + " ");
            }
        }
    }
}