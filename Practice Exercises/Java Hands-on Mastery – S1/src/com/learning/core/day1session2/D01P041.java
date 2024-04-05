package com.learning.core.day1session2;

import java.util.Scanner;

public class D01P041 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        for(int i=0;i<2;i++) {
	        System.out.println("Enter two numbers in the range from 1 to 40:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int[] array = {7, 25, 5 ,19, 30};
	        boolean found1 = false;
	        boolean found2 = false;
	        for (int j = 0; j < array.length; j++) {
	            if (num1 == array[j]) {
	                found1 = true;
	            }
	            if (num2 == array[j]) {
	                found2 = true;
	            }
	            }
	        if (found1 && found2) {
	            System.out.println("Its Bingo");
	        } else {
	            System.out.println("Not Found");
	        }
	    }
		}
	}