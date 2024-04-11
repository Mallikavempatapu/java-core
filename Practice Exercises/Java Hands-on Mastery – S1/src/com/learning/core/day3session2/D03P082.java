package com.learning.core.day3session2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D03P082{

	  public static void main(String[] args) {
	        // Creating a HashMap to store phone book details
	        Map<String, String> phoneBook = new HashMap<>();

	        // Adding predefined information of five phone book details
	        phoneBook.put("Amal", "9987878232");
	        phoneBook.put("Manvitha", "937843978");
	        phoneBook.put("Joseph", "782221113");
	        phoneBook.put("Smith", "8523641952");
	        phoneBook.put("Kathe", "9678901234");
	        // Allowing the user to search for a phone number
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the name to search for phone number: ");
	        String name = scanner.nextLine();

	        // Searching for the phone number
	        String phoneNumber = phoneBook.get(name);
	        if (phoneNumber != null) {
	            System.out.println("Phone number for " + name + " is: " + phoneNumber);
	        } else {
	            System.out.println("Phone number for " + name + " not found.");
	        }
	    }
}
