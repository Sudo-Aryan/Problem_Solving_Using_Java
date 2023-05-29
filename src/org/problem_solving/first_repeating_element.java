package org.problem_solving;

import java.util.Scanner;
public class first_repeating_element {

    static void getKey(String str){
        int count;
        for(int i = 0; i < str.length(); i++){
            count = 0;
            for(int j = i; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count > 1){
                System.out.print(str.charAt(i) + " is the key!!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "62345665431";
        getKey(str);
    }
}