package org.problem_solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lexicographical {
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

        String str0 = in.nextLine();

        ArrayList<String> str = new ArrayList<>();
        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<Integer> test = new ArrayList<>();

        if (str0.matches("^[a-zA-Z]*$")) {
            str0+=" ";
            int k = in.nextInt();
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
            System.out.println("max = "+alist.get(alist.size()-1)+"  ele = " +str.get(index(test,alist.get(alist.size()-1))) );
            System.out.println("min = "+alist.get(0)+"  ele = " +str.get(index(test,alist.get(0))));

            in.close();
        } else {
            System.out.println("The string is not purely alphabetic!!");
        }
    }
}