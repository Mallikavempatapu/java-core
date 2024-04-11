package com.learning.core.day3session2;
import java.util.HashMap;
import java.util.Map;

public class  D03P081 {
	 public static void main(String[] args) {
	        // Creating a HashMap to store phone book details
	        Map<String, String> phoneBook = new HashMap<>();

	        // Adding predefined information of five phone book details
	        phoneBook.put("Amal", "1234567890");
	        phoneBook.put("Manvitha", "2345678901");
	        phoneBook.put("Joseph", "3456789012");
	        phoneBook.put("Smith", "4567890123");
	        phoneBook.put("Kathe", "5678901234");

	        // Listing all the phone book details
	        System.out.println("Phone Book Details:");
	        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
	            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
	        }
	    }
}
