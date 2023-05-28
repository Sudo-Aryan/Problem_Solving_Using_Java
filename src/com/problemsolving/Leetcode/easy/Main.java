package com.problemsolving.Leetcode.easy;

public class Main {
    public static void main(String[] args) {
        System.out.print(RomanToInt.romanToInt("ll".toUpperCase()));
    }
}


















// VI -> first it will check last element, which in this case is 'I', then 'V' is checked
// Soln -> I = 5, added to result, V = 5, added to results which is -> 6
// IV
// Soln -> V = 5, added to result, I = 1, since result is already >= 5, we subtract 1 from result.