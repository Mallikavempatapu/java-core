package com.learning.core.day3session1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D03P074 {
    public static void main(String[] args) {
    
    	   Product product1 = new Product("P001", "Maruti 800");
           Product product2 = new Product("P002", "Maruti Zen");
           Product product3 = new Product("P003", "Maruti Denzire");
           Product product4 = new Product("P004", "Maruti ALt0");

      
        Set<Product> productSet = new HashSet<>();
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID to remove: ");
        String productIdToRemove = scanner.nextLine();

        // Create a  product as name product ID
        Product productToRemove = new Product(productIdToRemove, "");

        // Remove the product from the HashSet
        boolean removed = productSet.remove(productToRemove);
        if (removed) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found in the list.");
        }
        // Display the updated product list
        System.out.println("Updated Product List:");
        for (Product product : productSet) {
            System.out.println("Product ID: " + product.getProductId() + ", Product Name: " + product.getProductName());
        }

        scanner.close();
    }
}

