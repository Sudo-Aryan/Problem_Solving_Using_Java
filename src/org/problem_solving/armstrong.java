package org.problem_solving;
import java.util.Scanner;

public class armstrong {
    int sum=0;
        int cal_armstrong(int num) {
            if (num >= 1) {
                sum += ((num % 10) * (num % 10) * (num % 10));
                cal_armstrong(num/10);
            }
            return sum;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        armstrong obj = new armstrong();
        if(obj.cal_armstrong(num) == num){
            System.out.println("The number is armstrong");
        } else {
            System.out.println("The number is not armstrong");
        }
        in.close();
    }
}
