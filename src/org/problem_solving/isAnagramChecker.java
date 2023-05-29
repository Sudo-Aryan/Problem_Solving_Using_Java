package org.problem_solving;

import java.util.Arrays;
import java.util.Scanner;

public class isAnagramChecker {

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length() == str2.length()){
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        in.close();
        System.out.println(isAnagram(str1.toLowerCase(),str2.toLowerCase()) ? "Anagrams" : "Not Anagrams");
    }
}