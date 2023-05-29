package org.problem_solving;

import java.util.Scanner;
public class ascs {
    public static String getSmallestAndLargest(String str0, int k) {
//      we initialise the smallest and largest substrings of String str0 of length `k`, so to compare it with remaining substrings of str for largest and smallest substrings
        String smallest = str0.substring(0,k);
        String largest = str0.substring(0,k);
//         "Compare to" method doesn't turn just the equal case it also turns a value.
        for(int i=0; i<str0.length()-k+1; i++ ){
            String str = str0.substring(i,i+k);
//          we update the values accordingly and return the final value(substring str) of the comparison
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            else if(largest.compareTo(str)<0){
                largest = str;
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        in.close();

        if(str.matches("^[a-zA-Z]*$")) {
            System.out.println(getSmallestAndLargest(str, k));
        } else{
            System.out.println("Invalid string literal");
        }
    }
}