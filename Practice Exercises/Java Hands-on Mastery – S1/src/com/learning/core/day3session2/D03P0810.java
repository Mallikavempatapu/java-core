package com.learning.core.day3session2;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class D03P0810 {

	
	public static void main(String[] args) {
        // Creating a Hashtable to store employee details with ID as key
        Map<Integer, Employee> employeeHashtable = new Hashtable<>();

        // Adding predefined information of four employees
        employeeHashtable.put(1001, new Employee(1001, "Daniel ", "Analyst", "L&D"));
        employeeHashtable.put(1002, new Employee(1002, "Thomas", "Tester", "Testing"));
        employeeHashtable.put(1003, new Employee(1003, "Robert", "Product Manager", "Development"));
        employeeHashtable.put(1004, new Employee(1004, "Grace", "QA Lead", "Testing"));

        
     
        // Allowing the user to search for a specific employee by ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee ID to search for: ");
        int searchId = scanner.nextInt();

        // Searching for the employee
       
Employee employee = employeeHashtable.get(searchId);
        if (employee != null) {
            System.out.println("Employee found: " + employee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}

