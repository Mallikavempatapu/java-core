package com.learning.core.day4session1;
	public class D04P096 {
	    private int[] queue;
	    private int front, rear, size;
	    private int capacity;
	 
	    public D04P096(int capacity) {
	        this.capacity = capacity;
	        this.queue = new int[capacity];
	        this.front = -1;
	        this.rear = -1;
	        this.size = 0;
	    }
	 
	    public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full, cannot add element");
	            return;
	        }
	        if (isEmpty()) {
	            front = rear = 0;
	        } else {
	            rear = (rear + 1) % capacity;
	        }
	        queue[rear] = item;
	        size++;
	    }
	 
	    public void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty, cannot remove element");
	            return;
	        }
	        int removedElement = queue[front];
	        if (front == rear) {
	            front = rear = -1;
	        } else {
	            front = (front + 1) % capacity;
	        }
	        size--;
	        System.out.println("Element removed from circular queue: " + removedElement);
	    }
	 
	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Circular queue is empty");
	            return;
	        }
	        System.out.print("Elements in circular queue: ");
	        int count = size;
	        int i = front;
	        while (count > 0) {
	            System.out.print(queue[i] + " ");
	            i = (i + 1) % capacity;
	            count--;
	        }
	        System.out.println();
	    }
	 
	    public boolean isEmpty() {
	        return size == 0;
	    }
	 
	    public boolean isFull() {
	        return size == capacity;
	    }
	 
	    public static void main(String[] args) {
	    	D04P096 cq = new D04P096(5);
	        cq.enqueue(14);
	        cq.enqueue(13);
	        cq.enqueue(22);
	        cq.enqueue(-8);
	        cq.display();
	        cq.dequeue();
	        System.out.println("After removing first element:");
	        cq.display();
	    }
	}
