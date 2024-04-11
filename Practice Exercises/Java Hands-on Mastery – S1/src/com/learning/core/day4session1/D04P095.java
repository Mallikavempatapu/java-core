package com.learning.core.day4session1;

import java.util.LinkedList;

class Queue {
    private LinkedList<Integer> list;
 
    public Queue() {
        list = new LinkedList<>();
    }
 
    public void enqueue(int data) {
        list.add(data);
    }
 
    public void dequeue(int count) {
        for (int i = 0; i < count; i++) {
            if (!list.isEmpty()) {
                list.remove();
            } else {
                System.out.println("Queue is empty");
                return;
            }
        }
    }
 
    public void display() {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
 
public class D04P095 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);
 
        System.out.print("Elements in queue: ");
        queue.display();
 
        int elementsToRemove = 2;
        queue.dequeue(elementsToRemove);
 
        System.out.print("After removing " + elementsToRemove + " elements: ");
        queue.display();
    }
}
