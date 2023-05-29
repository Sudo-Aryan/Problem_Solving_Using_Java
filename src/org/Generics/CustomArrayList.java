package org.Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data= new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            reSize();
        }
        data[size++] = num;
    }

    private void reSize() {
        int[] newArr = new int[data.length + (data.length/2) + 1];
        int i=0;
        for (int arrData: data) {
            newArr[i] = arrData;
            i++;
        }
        this.data = newArr;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void remove(){
        int removedItem = data[--size];
    }
    public void set(int index, int value){
        CustomArrayList list = new CustomArrayList();
        list.add(value);
    }
    @Override
    public String toString(){
        return "Custom ArrayList items: "+ Arrays.toString(data)+", size: "+size;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);

        System.out.println(list);
    }
}
