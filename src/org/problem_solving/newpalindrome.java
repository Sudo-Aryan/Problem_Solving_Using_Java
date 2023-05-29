package org.problem_solving;

import java.util.Scanner;

public class newpalindrome {
    newpalindrome(String str){
        for (int i=0; i<str.length(); i++){
            for(int j= str.length()-1; j>=i; j--){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println("Palindrome");
                }
                else{
                    System.out.println("not palindrome");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = in.nextLine();
        newpalindrome pal = new newpalindrome(str.toUpperCase());
    }
}
