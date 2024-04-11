package com.learning.core.day4session1;


public class D04P094 {
    private int[] queue;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;
 
    
	public  D04P094(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }
 
    public boolean isEmpty() {
        return currentSize == 0;
    }
 
    public boolean isFull() {
        return currentSize == maxSize;
    }
 
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
        } else {
            rear = (rear + 1) % maxSize;
            queue[rear] = data;
            currentSize++;
        }
    }
 
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return Integer.MIN_VALUE;
        } else {
            int removedElement = queue[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return removedElement;
        }
    }
 
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Elements in queue: ");
            int i = front;
            for (int count = 0; count < currentSize; count++) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % maxSize;
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
    	D04P094 queue = new D04P094(5);
 
        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
 
        // Display elements
        queue.displayQueue();
 
        // Dequeue first element
        queue.dequeue();
 
        System.out.println("After removing first element:");
        queue.displayQueue();
    }
}