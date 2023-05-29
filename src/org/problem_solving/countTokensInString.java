package org.problem_solving;

import java.util.Scanner;

public class countTokensInString {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String str = in.nextLine().trim();
            in.close();
            if (str.matches("[a-zA-Z !,?._'@]+") && str.length() != 0) {
                String[] tokens = str.split("[ !,?._'@]+");
                System.out.println(tokens.length);
                for (String token : tokens) {
                    System.out.println(token);
                }
            } else {
                System.out.println(0);
            }
    }
}