package org.problem_solving;

import java.util.Scanner;

public class fibonnacii {
    static int n1=0,n2=1,n3=0;

    fibonnacii(int count){
        if(count>0){
            n3 = n1+n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            new fibonnacii(--count);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=in.nextInt();
        System.out.print(n1 + " " + n2);
        /*for(int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }*/
        fibonnacii obj = new fibonnacii(count);
    }
}