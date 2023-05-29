package org.LinkedList_Implementation;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(15);
        list.insertFirst(14);
        list.insertFirst(13);
        list.insertFirst(12);
        list.insertFirst(11);
        list.insertFirst(10);
        list.insertLast(101);
        list.insertLast(102);
        list.insertLast(103);
        list.insertLast(104);
        list.insertLast(105);

        list.display();
        System.out.print(list.size);
    }
}
