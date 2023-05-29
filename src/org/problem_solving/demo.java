package org.problem_solving;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().trim().toLowerCase();
        char[] chArr = str.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < chArr.length; i++) {
            boolean repeated = false;
            for (int j = i + 1; j < chArr.length; j++) {
                if (chArr[j] == chArr[i]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                sb1.append(chArr[i]);
            }
        }
        System.out.println(sb1);
    }
}