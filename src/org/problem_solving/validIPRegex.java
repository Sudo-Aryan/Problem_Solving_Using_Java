package org.problem_solving;

class IP{
    static String pattern = "[0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}";
}
public class validIPRegex {
    public static void main(String[] args) {
        String str = "";
        System.out.println((str.matches(IP.pattern)));
    }
}