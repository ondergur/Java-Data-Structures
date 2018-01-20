package com.company;

import java.util.EmptyStackException;

public class Stack {
    private int top;
    private int[] storage;


    Stack(int capacity){
        if (capacity<=0){
            throw new IllegalArgumentException( "Please define a positive capacity");
        }
        this.storage = new int[capacity];
        this.top = -1;
    }

    int size(){
        return top+1;
    }

    void push (int value){
        if (top == storage.length-1) {
            int[] storage2;
            storage2 = new int[storage.length * 2];
            /*throw new StackOverflowError();*/
            for (int i=0; i<=top; i++){
                storage2[i] = storage[i];
            }
            storage = storage2;
        }
        top++;
        storage[top] = value;
    }

    int pop(){
        if (top == -1){
            throw new EmptyStackException();
        }else{
            top--;
            return storage[top+1];
        }
    }

    int peek(){
        if(top == -1){
            throw new EmptyStackException();
        }else{
            return storage[top];
        }
    }
}
