package org.hackerrank_problems;

public class demo {
    static void staircase(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(new String(new char[n-i]).replaceAll("\0"," ") + new String(new char[i]).replaceAll("\0","#"));
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
