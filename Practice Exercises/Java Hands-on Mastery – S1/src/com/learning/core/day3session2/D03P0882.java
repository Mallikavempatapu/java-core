package com.learning.core.day3session2;
import java.util.Scanner;
import java.util.TreeMap;

public class D03P0882 {
	
	 public static void main(String[] args) {
	        // Creating a TreeMap to store car details
	        TreeMap<String, Car> carMap = new TreeMap<>();

	        // Adding predefined information of four car details
	        carMap.put("Bugatti", new Car("Bugatti", 80050.0));
	        carMap.put("Swift", new Car("Swift", 305000.0));
	        carMap.put("Audi", new Car("Audi", 600100.0));
	        carMap.put("Benz", new Car("Benz", 900000.0));
	        
	        // Allowing the user to replace the price of a car by specifying the key (car name)
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the name of the car to update the price: ");
	        String carName = scanner.nextLine();
	        System.out.print("Enter the new price of the car: ");
	        double newPrice = scanner.nextDouble();

	        // Replacing the price of the specified car
	        if (carMap.containsKey(carName)) {
	            carMap.get(carName).setPrice(newPrice);
	            System.out.println("Price of " + carName + " updated successfully!");
	        } else {
	            System.out.println("Car with name " + carName + " not found.");
	        }

	        // Printing all the car details after the update
	        System.out.println("All Car Details:");
	        for (Car car : carMap.values()) {
	            System.out.println(car);
	        }

	 }
}
