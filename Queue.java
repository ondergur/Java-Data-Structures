package com.company;

public class Queue {
    private int front;
    private int rear;
    int N;
    int[] queue;


    public Queue(int capacity){
        queue = new int[capacity];
        this.front = -1;
        this.rear = 0;
        this.N = queue.length;
    }

    public int size() {
        return(N - front + rear) % N;
    }

    public boolean isEmpty(){
        return (front == rear);
    }

    public int front(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }else{
            return queue[front];
        }
    }

    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }else{
            int o = queue[front];
            front = (front + 1 ) % N;
            return o;
        }
    }

    public void enqueue(int value){
        if (queue.length== N-1){
            throw new IllegalStateException("Queue is full");
        }else{
            queue[rear]=value;
            rear = (rear + 1) % N;

        }
    }



}
