package com.learning.core.day2session2;

public class Tester {
    public static void main(String[] args) {
        // Create CricketRating object
    	D02P062 player = new D02P062("John", 8.5f, 7.5f, 9.0f);
 
        try {
            // Calculate average rating using three critics
            player.calculateAverageRating(player.getCritic1(), player.getCritic2(), player.getCritic3());
            // Calculate coins based on average rating
            player.calculateCoins();
            // Display player information
            player.display();
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
 }
}