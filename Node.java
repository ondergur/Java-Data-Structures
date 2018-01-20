package com.company;

public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
