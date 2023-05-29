package org.problem_solving;

public class swap_2_nos {
    public void swapwithvar(int i, int j){
        int temp = i;
        i = j;
        j = temp;
        System.out.println(i + " " + j);
    }

    public void swapwithoutvar(int i, int j){
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println(i + " " + j);

    }
    public void swap_string(String str1, String str2){
        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println(str1 + " " + str2);
    }

    public static void main(String[] args){
        int i = 12, j = 13;
        swap_2_nos obj = new swap_2_nos();
        obj.swap_string("Aryan", "Arjun");
    }
}