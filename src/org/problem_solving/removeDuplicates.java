package org.problem_solving;

public class removeDuplicates {

    static String removeDuplicate(String test){
        char[] array = test.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            boolean found = false;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }

    static  String removeDuplicateUseLambda(String test){
        StringBuilder sb = new StringBuilder();
        test.chars().distinct().forEach(c -> sb.append((char)c));
        return sb.toString();
    }

    public static void main(String[] args) {
        String test = "aryann"; // output : "aryn"
        System.out.println(removeDuplicate(test));
        System.out.println(removeDuplicateUseLambda(test));
        // we can also use Set (LinkedHashSet)... and indexof method (in StringBuilder) for this
    }
}