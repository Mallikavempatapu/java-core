package com.learning.core.day2session1;


import java.util.Scanner;


public class D02P051 {
 
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter a string: ");
 
        String input = scanner.nextLine();
 
        System.out.println("Length of the string: " + input.length());
        String upperCaseInput = input.toUpperCase();
 
        System.out.println("String in uppercase: " + upperCaseInput);
 
        boolean isPalindrome = isPalindrome(upperCaseInput);
 
        if (isPalindrome) {
 
            System.out.println("The string is a palindrome.");
 
        } else {
 
            System.out.println("The string is not a palindrome.");
 
        }
 
 
        scanner.close();
 
    }
 
 
   
 
    private static boolean isPalindrome(String str) {
 
        int i = 0, j = str.length() - 1;
 
        while (i < j) {
 
            if (str.charAt(i) != str.charAt(j)) {
 
                return false;
 
            }
 
            i++;
 
            j--;
 
        }
 
        return true;
 
    }
 
}