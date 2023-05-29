package org.problem_solving;

public class persistent3 {

    static int sum(int[] arr, int target){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        return target * count;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3,5,2,7,3,9,2};
        System.out.print(sum(arr,2));
    }
}