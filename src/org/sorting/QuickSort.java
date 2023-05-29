package org.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class QuickSort {
    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int last = candles.size()-1;
        int i=0,count=0;
        for(i=candles.size()-1; i >= 0; i--){
            if(Objects.equals(candles.get(last), candles.get(i))){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(10);
        arr.add(15);
        arr.add(13);
        arr.add(12);
        arr.add(15);
        arr.add(15);

        int ans = birthdayCakeCandles(arr);
        System.out.print(ans);
    }
}

// [2,4,3,4] => [2,3,4,4]