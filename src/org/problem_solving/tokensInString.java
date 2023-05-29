package org.problem_solving;

import java.util.HashMap;

public class tokensInString {
    public static void main(String[] args) {
        String test = "abs1=abs+72;";
        String[] tokens = test.split("[a-z]+[a-z\\d]?");
        HashMap<String,Integer> token = new HashMap<>();

        //System.out.println(Arrays.toString(tokens));
//        for(int i=0; i<test.length(); i++) {
//            for (int j = 0; j < test.length(); j++) {
//                if(test.matches("[a-z]+[a-z\\d]?")){
//                    System.out.println(test.substring(i,j));
//                }
//            }
//        }
    }
}