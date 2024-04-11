package com.learning.core.day2session2;
	 public class D02P062 {
	    private String playerName;
	    private float critic1;
	    private float critic2;
	    private float critic3;
	    private float avgRating;
	    private String coins;
	 
	    // Constructor
	    public D02P062(String playerName, float critic1, float critic2, float critic3) {
	        this.playerName = playerName;
	        this.setCritic1(critic1);
	        this.setCritic2(critic2);
	        this.setCritic3(critic3);
	    }
	 
	    // Calculate average rating based on two critics
	    public void calculateAverageRating(float critic1, float critic2) {
	        avgRating = (critic1 + critic2) / 2;
	    }
	 
	    // Calculate average rating based on three critics
	    public void calculateAverageRating(float critic1, float critic2, float critic3) {
	        avgRating = (critic1 + critic2 + critic3) / 3;
	    }
	 
	    // Calculate coins based on average rating
	    public String calculateCoins() throws NotEligibleException {
	        if (avgRating >= 7)
	            coins = "Gold";
	        else if (avgRating >= 5)
	            coins = "Silver";
	        else if (avgRating >= 2)
	            coins = "Copper";
	        else
	            throw new NotEligibleException("Player not eligible for coins");
	        return coins;
	    }
	 
	    // Display information
	    public void display() {
	        System.out.println("Player Name: " + playerName);
	        System.out.println("Average Rating: " + avgRating);
	        System.out.println("Coins: " + coins);
	    }

		public float getCritic1() {
			return critic1;
		}

		public void setCritic1(float critic1) {
			this.critic1 = critic1;
		}

		public float getCritic2() {
			return critic2;
		}

		public void setCritic2(float critic2) {
			this.critic2 = critic2;
		}

		public float getCritic3() {
			return critic3;
		}

		public void setCritic3(float critic3) {
			this.critic3 = critic3;
		}
	}
	 
	// Define NotEligibleException
	class NotEligibleException extends Exception {
	    public NotEligibleException(String message) {
	        super(message);
	    }
	}
	 

