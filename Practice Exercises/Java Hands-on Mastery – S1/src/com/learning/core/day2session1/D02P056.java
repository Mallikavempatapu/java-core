package com.learning.core.day2session1;

public class D02P056 {
	 
	 
    public static int findLongestPrefixSuffix(String s) {
 
        int n = s.length();
 
        // The maximum possible length of a non-overlapping prefix/suffix is half the string's length
 
        for (int len = n / 2; len > 0; len--) {
 
            String prefix = s.substring(0, len);
 
            String suffix = s.substring(n - len);
 
            // If the current prefix is equal to the suffix, return its length
 
            if (prefix.equals(suffix)) {
 
                return len;
 
            }
 
        }
 
        // If no such prefix and suffix are found, return 0
 
        return 0;
 
    }
 
 
    public static void main(String[] args) {
 
        String s = "aabcdaabc";
 
        String s1 = "abcab";
 
        System.out.println("Length of the longest prefix which is also a suffix (non-overlapping): "
 
                            + findLongestPrefixSuffix(s));
 
        System.out.println("Length of the longest prefix which is also a suffix (non-overlapping): "
 
                + findLongestPrefixSuffix(s1));
 
 
    }
 
}
 