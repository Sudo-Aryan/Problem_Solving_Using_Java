package org.problem_solving;

import java.util.Scanner;

public class palindrome3 {

    static void checkPalindrome(String str0){
        String temp="";
        char[] str = str0.toCharArray();
        for(int i=str.length-1; i>=0; i--){
            temp+=str[i];
        }
        if(temp.equals(str0)){
            System.out.print("Yes");
        } else{
            System.out.print("No");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        checkPalindrome(str.toLowerCase());
    }
}