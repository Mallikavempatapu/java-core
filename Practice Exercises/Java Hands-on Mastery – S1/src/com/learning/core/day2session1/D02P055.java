package com.learning.core.day2session1;
import java.util.ArrayList;
 
import java.util.HashMap;
 
import java.util.List;
 
import java.util.Map;
 
import java.util.*;
 
 
 
public class D02P055 {
 
	
 
	 public static void main(String[] args) {
 
	        String[] strings1 = {"abc", "efg", "cde", "ghi", "ija"};
 
	        System.out.println("Input 1: " + Arrays.toString(strings1));
 
	        System.out.println("Output 1: " + (canFormCircle(strings1) ? "Yes" : "No"));
 
 
	        String[] strings2 = {"Ijk", "kji", "abc", "cba"};
 
	        System.out.println("Input 2: " + Arrays.toString(strings2));
 
	        System.out.println("Output 2: " + (canFormCircle(strings2) ? "No" : "Yes"));
 
	    }
 
 
	    public static boolean canFormCircle(String[] strings) {
 
	        Map<Character, List<Integer>> graph = new HashMap<>();
 
 
	       
 
	        for (int i = 0; i < strings.length; i++) {
 
	            char startChar = strings[i].charAt(0);
 
	            char endChar = strings[i].charAt(strings[i].length() - 1);
 
	            graph.putIfAbsent(startChar, new ArrayList<>());
 
	            graph.get(startChar).add(i);
 
	            graph.putIfAbsent(endChar, new ArrayList<>());
 
	        }
 
 
	       
 
	        boolean[] visited = new boolean[strings.length];
 
	        for (int i = 0; i < strings.length; i++) {
 
	            if (!visited[i] && dfs(strings, graph, visited, i)) {
 
	                return true;
 
	            }
 
	        }
 
 
	        return false;
 
	    }
 
 
	    private static boolean dfs(String[] strings, Map<Character, List<Integer>> graph, boolean[] visited, int current) {
 
	        visited[current] = true;
 
 
	        char endChar = strings[current].charAt(strings[current].length() - 1);
 
	        for (int neighbor : graph.getOrDefault(endChar, new ArrayList<>())) {
 
	            if (visited[neighbor]) {
 
	                return true;
 
	            }
 
	            if (!visited[neighbor] && dfs(strings, graph, visited, neighbor)) {
 
	                return true;
 
	            }
 
	        }
 
 
	        visited[current] = false;
 
	        return false;
 
	    }
 
}
 
