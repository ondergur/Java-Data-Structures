package com.company;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(int data){
        Node tmp = new Node(data,head,null);
        if(head != null){
            head.prev = tmp;
        }
        head = tmp;
        if(tail == null){
            tail = tmp;
        }
        size++;
        System.out.println("Adding as first: " + data);
    }

    public void addLast(int data){
        Node tmp = new Node(data,null,tail);
        if(tail != null){
            tail.next = tmp;
        }
        tail = tmp;
        if (head == null){
            head = tmp;
        }
        size++;
        System.out.println("Adding as last: " + data);
    }

    public void iterateForward(){
        System.out.println("Iterating forward: ");
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.data + "   ");
            tmp = tmp.next;
        }
    }

    public void iterateBackward(){
        System.out.println("Iterating backward: ");
        Node tmp = tail;
        while(tmp != null){
            System.out.println(tmp.data + "   ");
            tmp = tmp.prev;
        }
    }

    public int removeFirst(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        Node tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("Deleting from first: " + tmp.data);
        return tmp.data;
    }

    public int removeLast(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("Deleting from last: " + tmp.data);
        return tmp.data;
    }


}
