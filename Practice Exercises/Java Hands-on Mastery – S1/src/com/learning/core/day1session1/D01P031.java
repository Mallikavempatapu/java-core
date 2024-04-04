package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P031 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Month=0;
		String month;
		Scanner sc = new Scanner(System.in);
		System.out.println("* Enter the NUMBER :- ");
		Month = sc.nextInt();
 
		switch(Month) {
		case 1:
			month="January";
			break;
		case 2:
			month="February";
			break;
		case 3:	
			month="March";
			break;
		case 4:
			month="April";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="Auguest";
			break;
		case 9:
			month="September";
			break;
		case 10:
			month="Octomber";
			break;
		case 11:
			month="November";
			break;
		case 12:
			month="December";
			break;
 
		default:
			System.out.println("Enter valied Number... ");
			month="invalid Input..";
 
		}
		System.out.println(month);
 
 
	}
 
 
	}
