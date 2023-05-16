package com.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.util.Arrays.stream;

public class GradeRoundingWithStream1 {

    public static List<long[]> gradeRound(List<Integer> grades){
        Integer[] arr = grades.toArray(new Integer[0]);
        long[] arr1 = stream(arr).mapToLong(grade -> {
            if (grade >= 38) {
//                System.out.println("Helooooo..........");
                int round = ((grade / 5 + 1) * 5);
                if (round - grade < 3) return round;
            }
//            System.out.println("Another Hello...........");
            return grade;
        }).toArray();
        return Collections.singletonList(arr1);
    }

    public static void main(String[] args) {
        List<Integer> arr =new ArrayList<Integer>();
        arr.add(67);
        arr.add(68);
        arr.add(70);
        arr.add(2);
        arr.add(49);
        arr.add(38);

        for (long[] ar: gradeRound(arr)) {
            for (long ans: ar) {
                System.out.print(ans + " ");
            }
        }
    }
}
