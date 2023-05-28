package com.problemsolving.Leetcode.easy;

public class RomanToInt {
    public static int romanToInt(String str) {
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            switch (str.charAt(i)) {
                case 'I' -> result += (result >= 5) ? -1 : 1;
                case 'V' -> result += (result >= 10) ? -5 : 5;
                case 'X' -> result += (result >= 50) ? -10 : 10;
                case 'L' -> result += (result >= 100) ? -50 : 50;
                case 'C' -> result += (result >= 500) ? -100 : 100;
                case 'D' -> result += (result >= 1000) ? -500 : 500;
                case 'M' -> result += 1000;
                default -> System.out.println("Invalid roman numeral");
            }
        }
        return result;
    }
}
