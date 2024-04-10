package com.learning.core.day4session2;

import java.util.Scanner;

public class D04P0103 
 {
   public static boolean linearSearch(int[] arr, int target) {
       for (int num : arr) {
           if (num == target) {
               return true;
           }
       }
       return false;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number of elements: ");
       int n = scanner.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the elements:");
       for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt();
       }
       System.out.print("Enter the element to search for: ");
       int target = scanner.nextInt();
       boolean found = linearSearch(arr, target);
       if (found) {
           System.out.println("Element is Present");
       } else {
           System.out.println("Element is Not Present");
       }
   }
}