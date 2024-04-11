package com.learning.core.day3session2;
import java.util.TreeMap;

public class D03P087 {

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
	        System.out.println("Car with greatest price:");
	        String greatestPriceCar = carMap.lastKey();
	        System.out.println(greatestPriceCar + " - " + carMap.get(greatestPriceCar));

	        System.out.println("\nCar with least price:");
	        String leastPriceCar = carMap.firstKey();
	        System.out.println(leastPriceCar + " - " + carMap.get(leastPriceCar));
	    }
}
