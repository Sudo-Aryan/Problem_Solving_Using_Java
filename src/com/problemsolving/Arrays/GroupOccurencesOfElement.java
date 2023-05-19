package com.problemsolving.Arrays;

import java.util.ArrayList;
import java.util.List;

public class GroupOccurencesOfElement {
    static ArrayList<Integer> list = new ArrayList<>(List.of(6,7,6,6,9,9,2,4,1,7));
    static String str = "";
    static void count(int x){
        int size = list.size();
        list.removeAll(new ArrayList<>(List.of(x)));
        for (int i = 0; i < size - list.size(); i++) {
            str += x+" ";
        }
    }

    public static void main(String[] args) {
        try{
            list.stream().forEach(x -> count(list.get(0)));
        } catch (IndexOutOfBoundsException e){}
        System.out.println(str);
    }
}
