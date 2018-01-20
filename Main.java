package com.company;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList linked = new DoublyLinkedList();
        linked.addFirst(10);
        linked.addFirst(34);
        linked.addLast(56);
        linked.addLast(364);
        linked.iterateForward();
        linked.removeFirst();
        linked.removeLast();
        linked.iterateBackward();

    }
}
