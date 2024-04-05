package com.learning.core.day1session2;


public class D01P042 {
	 
	public static void main(String[] args) {
		 int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		 //System.out.println(A[]);
		 
		 A[17]=A[0];
		 for(int i=0;i<15;i++) {
			 A[15]=A[15]+A[i];
			 
			 if(A[i]<A[17]) 
				 A[17]=A[i];
			 } 
		 	A[16]=A[15]/15;
	System.out.println("After performing the sum(16th) and average(17th) and minimum(18th) operations:");
	for(int i=0;i<18;i++)
	{
		System.out.print(A[i]);
	}
	}
	}