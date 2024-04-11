package com.learning.core.day3session2;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class D03P0881 {
	
	  public static void main(String[] args) {
	        // Predefine car details
	        Car car1 = new Car("Benz", 900000.0);
	        Car car2 = new Car("Audi", 600100.0);
	        Car car3 = new Car("Swift", 305000.0);
	        Car car4 = new Car("Buggati", 80050.0);

	        // Store car details in a TreeMap
	        TreeMap<Car, String> carMap = new TreeMap<>();
	        carMap.put(car1, "Car1");
	        carMap.put(car2, "Car2");
	        carMap.put(car3, "Car3");
	        carMap.put(car4, "Car4");

	        // Remove a car
	        carMap.remove(car1);

	        // Get key-value mapping associated with the greatest key
	        Map.Entry<Car, String> entry = carMap.lastEntry();

	        // Display output
	        System.out.println("Car details after removal:");
	        for (Map.Entry<Car, String> carEntry : carMap.entrySet()) {
	            System.out.println(carEntry.getValue() + ": " + carEntry.getKey());
	        }

//	        System.out.println("\nKey-value mapping associated with the greatest key:");
//	        System.out.println(entry.getValue() + ": " + entry.getKey());
	    }
}
