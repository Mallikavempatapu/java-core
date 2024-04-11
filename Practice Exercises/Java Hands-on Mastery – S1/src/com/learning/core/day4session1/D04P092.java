package com.learning.core.day4session1;
class Node {
	    double data;
	    Node next;
	 
	    Node(double data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	 
	public class D04P092 {
	    private Node top;
	 
	    public D04P092() {
	        this.top = null;
	    }
	 
	    public void push(double data) {
	        Node newNode = new Node(data);
	        if (top == null) {
	            top = newNode;
	        } else {
	            newNode.next = top;
	            top = newNode;
	        }
	    }
	 
	    public double pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty.");
	            return Double.NaN;
	        } else {
	            double poppedData = top.data;
	            top = top.next;
	            return poppedData;
	        }
	    }
	 
	    public boolean isEmpty() {
	        return (top == null);
	    }
	 
	    public void displayStack() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty.");
	        } else {
	            Node current = top;
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.next;
	            }
	            System.out.println("null");
	        }
	    }
	 
	    public static void main(String[] args) {
	    	D04P092 stack = new D04P092();
	 
	        // Push elements onto the stack
	        stack.push(10.0);
	        stack.push(20.0);
	        stack.push(30.0);
	        stack.push(40.0);
	 
	        System.out.println("The elements of the stack are:");
	        stack.displayStack();
	 
	        // Pop twice
	        stack.pop();
	        stack.pop();
	 
	        System.out.println("After popping twice:");
	        stack.displayStack();
	    }
	}
