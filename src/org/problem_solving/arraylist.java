package org.problem_solving;

import java.util.ArrayList;
import java.util.List;
public class arraylist {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(10);
        List<Integer> arr2 = new ArrayList<>(10);
        arr2.add(22);
        arr.add(12);
        arr.add(1,13);
        int j = 14;
        for(int i = 2; i < 10; i++){
            arr.add(i,j);
            j+=1;
        }
        System.out.println(arr);
        arr.addAll(arr2);
//        System.out.println(arr);
//        System.out.println(arr.get(arr.size()-1));
//        arr.remove(Integer.valueOf(12));
//        System.out.println(arr);
//        arr2.clear();
//        System.out.println(arr2);
        arr.set(0,2);
        System.out.println(arr);
        System.out.println(arr2.contains(19));

    }
}