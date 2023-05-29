package org.problem_solving;

import java.util.Arrays;

public class removespecialcharacters {
    public static void main(String[] args) {
        String test = "a&r~y!a32_0s;$d\\k@gma=il.c/o`m"; // manipulate string to remove special characters and print (arya320sdk@gmail.com) or any email with mixed special characters
        String[] str = test.split("[-~`?;$#=,!\\\\&_^/ ]");
        System.out.println(Arrays.toString(str));
        for (String s: str) {
            System.out.print(s);
        }
    }
}