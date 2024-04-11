package com.learning.core.day3session2;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class D03P0811 {
	  public static void main(String[] args) {
	        // Creating a Hashtable to store employee details with ID as key
	        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

	        // Adding predefined information of four employees
	        employeeTable.put(1001, new Employee(1001, "Daniel ", "Analyst", "L&D"));
	        employeeTable.put(1002, new Employee(1002, "Thomas", "Tester", "Testing"));
	        employeeTable.put(1003, new Employee(1003, "Robert", "Product Manager", "Development"));
	        employeeTable.put(1004, new Employee(1004, "Grace", "QA Lead", "Testing"));

	        // Allowing the user to add new employees if not exist
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the ID of the employee to add: ");
	        int idToAdd = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        if (!employeeTable.containsKey(idToAdd)) {
	            System.out.print("Enter the name of the employee: ");
	            String name = scanner.nextLine();
	            System.out.print("Enter the department of the employee: ");
	            String department = scanner.nextLine();
	            System.out.print("Enter the designation of the employee: ");
	            String designation = scanner.nextLine();

	            // Adding the new employee to the Hashtable
	            employeeTable.put(idToAdd, new Employee(idToAdd, name, department, designation));
	        }

	        // Displaying all the employees
	        System.out.println("All Employees:");
	        for (Map.Entry<Integer, Employee> entry : employeeTable.entrySet()) {
	            System.out.println(entry.getValue());
	        }
	    }}
