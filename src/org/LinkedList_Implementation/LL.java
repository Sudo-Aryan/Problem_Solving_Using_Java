package org.LinkedList_Implementation;

public class LL {
    private Node head;
    private Node tail;

    public int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }



    public void display(){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        private int value; //12,13,14 Output: 14->13->12
        private Node next; //head=node


        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}