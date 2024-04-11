package com.learning.core.day3session2;
import java.util.TreeMap;

public class D03P085 {
	
	  public static void main(String[] args) {
	        // Creating a TreeMap to store car details with names as keys
	        TreeMap<String, Car> carMap = new TreeMap<>();

	        // Adding predefined information of four car details
	        carMap.put("Bugatti", new Car("Bugatti", 80050.0));
	        carMap.put("Swift", new Car("Swift", 305000.0));
	        carMap.put("Audi", new Car("Audi", 600100.0));
	        carMap.put("Benz", new Car("Benz", 900000.0));

	        // Retrieving and printing the car details
	        System.out.println("Car Details:");
	        for (Car car : carMap.values()) {
	            System.out.println(car);
	        }
	  }

}
