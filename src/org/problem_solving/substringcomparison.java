package org.problem_solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class substringcomparison {

    static String getSmallestAndLargest(String str0, int k){
        ArrayList<String> str = new ArrayList<>();
        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<Integer> test = new ArrayList<>();

        if (str0.matches("^[a-zA-Z]*$")) {
            str0+=" ";
            int i = 0;
            int j = i + k;
            while (j < str0.length()) {
                str.add(str0.substring(i, j));

                char[] s = str.get(i).toCharArray();
                for (int l = 0; l <= 0; l++) {
                    char c = s[l];
                    alist.add((int) c);
                    test.add((int) c);
                }
                i++;
                j++;
            }
            Collections.sort(alist);

            String min = str.get(index(test,alist.get(0)));
            String max = str.get(index(test,alist.get(alist.size()-1)));

            return min + "\n" + max;
        } else {
            return "The string is not purely alphabetic!!";
        }
    }

    static int index(ArrayList<Integer> list,int x){
        for (int i = 0; i <list.size() ; i++) {
            if (x == list.get(i)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        int k = in.nextInt();

        System.out.println(getSmallestAndLargest(str1,k));
    }
}