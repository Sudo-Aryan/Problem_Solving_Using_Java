package org.problem_solving;

import java.util.Scanner;

public class palindrome {

    void palindrom(String org_str) {
        String rev_str = "";
        boolean flag = false;
        for(int i = org_str.length() - 1; i >= 0; i--){
        rev_str += org_str.charAt(i);
    }

        if(rev_str.equals(org_str)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
}

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = in.nextLine();
        palindrome pal = new palindrome();
        pal.palindrom(str.toUpperCase());
    }

}