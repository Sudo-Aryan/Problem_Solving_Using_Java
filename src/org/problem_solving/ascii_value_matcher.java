package org.problem_solving;
import java.util.Scanner;

public class ascii_value_matcher {
    static boolean match(String str1, String str2){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        int ans1 = 0, ans2 = 0;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char c = c1[i];
                char d = c2[i];
                ans1 += (int) c;
                ans2 += (int) d;
            }
            return (ans1 == ans2);

        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        in.close();
        System.out.print((match(str1.toLowerCase(), str2.toLowerCase())) ? "Matches" : "Not Matches");
    }
}