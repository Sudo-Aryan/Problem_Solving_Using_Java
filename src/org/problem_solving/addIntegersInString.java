package org.problem_solving;

public class addIntegersInString {
    public static void main(String[] args) {
        String str = "Aryan8>7py6%7#pht4-6pjh7@88".trim();
        String[] strArray = str.split("[a-zA-Z -.,_@!-&<>?]+");
        int ans = 0;
        if(strArray[0].equals("")){
            strArray[0]="0";
        }
        for (String s : strArray) {
            ans += Integer.parseInt(s);
        }
        System.out.println(ans);
    }
}