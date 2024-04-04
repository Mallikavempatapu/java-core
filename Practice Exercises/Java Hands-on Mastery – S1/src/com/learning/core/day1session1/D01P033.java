package com.learning.core.day1session1;

import java.util.Scanner;
public class D01P033 {
 
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the percentage :");
	int per = sc.nextInt();
	
	if(per>=60)
		System.out.println("A Grade");
	else if(per>=45)
		System.out.println("B Grade");
	else if(per>=35)
		System.out.println("C Grade");
	else
		System.out.println("Fail");
		
}
}
