package org.hackerrank_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int min = arr.get(0);
        int max = arr.get(arr.size()-1);
        for (int i = 1; i < arr.size()-1; i++) {
            max+=arr.get(i);
            min+=arr.get(i);
        }
        System.out.print(min +" "+ max);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(); //256741038 623958417 467905213 714532089 938071625
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        miniMaxSum(arr);
    }
}
