package com.learning.core.day2session1;

public class D02P054 {
	 
	
	 
    private static int longestPalindromicSubsequence(String s) {
 
        int n = s.length();
 
        int[][] dp = new int[n][n];
 
        
 
        for(int i = 0; i < n; i++) {
 
            dp[i][i] = 1;
 
        }
 
        
 
        for(int cl = 2; cl <= n; cl++) {
 
            for(int i = 0; i < n - cl + 1; i++) {
 
                int j = i + cl - 1;
 
                if(s.charAt(i) == s.charAt(j) && cl == 2) {
 
                    dp[i][j] = 2;
 
                } else if(s.charAt(i) == s.charAt(j)) {
 
                    dp[i][j] = dp[i + 1][j - 1] + 2;
 
                } else {
 
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
 
                }
 
            }
 
        }
 
        
 
        return dp[0][n - 1];
 
    }
 
    
 
 
    public static int minDeletionsToMakePalindrome(String s) {
 
        int n = s.length();
 
        int lengthOfLPS = longestPalindromicSubsequence(s);
 
        return n - lengthOfLPS;
 
    }
 
    
 
    public static void main(String[] args) {
 
        String str = "aebcbda";
 
        System.out.println("Minimum number of deletions to make a palindrome: "
 
                            + minDeletionsToMakePalindrome(str));
 
    }
 
}
 