package org.problem_solving;

import java.util.Scanner;
import java.util.regex.Pattern;

public class patternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test_case = Integer.parseInt(in.nextLine());
        String[] patterns = new String[test_case];

        for (int i = 0; i < test_case; i++) {
            patterns[i] = in.nextLine();
        }
        for (String pattern : patterns) {
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}