package org.problem_solving;

public class count {

    private static int Count(int num, int count){
        if(num == 0){
            return count;
        }
        if(num % 10 == 4){
            return Count(num/10, count + 1);
        } else{
            return Count(num/10, count);
        }
    }

    public static void main(String[] args) {
        int ans = Count(3020044, 0);
        System.out.println(ans);
    }
}