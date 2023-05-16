package com.problemsolving.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfChars {

    static HashMap<Character, Integer> countString(String str) {
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> count = new HashMap<>();

        for (char c : arr) {
            if (count.containsKey(c)) {
                count.put(c,count.get(c)+1);
            }
            else{
                count.put(c,1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();
        System.out.println(countString(str));
    }
}