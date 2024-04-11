package com.learning.core.day4session1;

public class D04P091 {
    private int maxSize;
    private String[] stackArray;
    private int top;
    public D04P091(int size) {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }
 
    public void push(String element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            top++;
            stackArray[top] = element;
        }
    }
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        } else {
            String poppedElement = stackArray[top];
            top--;
            return poppedElement;
        }
    }
 
    public boolean isEmpty() {
        return (top == -1);
    }
 
    public boolean isFull() {
        return (maxSize - 1 == top);
    }
 
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
    	D04P091 stack = new D04P091(5); // Create a stack with size 5
 
        // Push elements onto the stack
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");
 
        System.out.println("After Pushing 4 Elements:");
        stack.displayStack();
 
        // Pop an element from the stack
        stack.pop();
 
        System.out.println("After a Pop:");
        stack.displayStack();
    }
}