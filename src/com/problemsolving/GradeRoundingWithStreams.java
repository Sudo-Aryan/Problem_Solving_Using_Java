package com.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeRoundingWithStreams {
    public static ArrayList<Integer> gradingStudents(ArrayList<Integer> grades) {
        Integer[] gradesArray = grades.toArray(new Integer[0]);
        int[] roundedGradesArray = Arrays.stream(gradesArray)
                .mapToInt(grade -> {
                    if (grade < 38) {
                        // failing grade, no rounding
                        return grade;
                    } else {
                        // check if rounding is needed
                        int nextMultiple = ((grade / 5) + 1) * 5;
                        if (nextMultiple - grade < 3) {
                            // round up to next multiple of 5
                            return nextMultiple;
                        } else {
                            // no rounding needed
                            return grade;
                        }
                    }
                })
                .toArray();
        return new ArrayList<>(Arrays.asList(Arrays.stream(roundedGradesArray).boxed().toArray(Integer[]::new)));
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<Integer>();
        arr.add(67);
        arr.add(68);
        arr.add(70);
        arr.add(2);
        arr.add(49);
        arr.add(38);

        System.out.println((gradingStudents(arr)));
    }
}
