package com.learning.core.day3session2;

import java.util.Hashtable;

public class D03P089 {
	public static void main(String[] args) {
        // Creating a Hashtable to store employee details with ID as key
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();

        // Adding predefined information of four employees
        employeeHashtable.put(1, new Employee(1, "Alice", "HR", "Manager"));
        employeeHashtable.put(2, new Employee(2, "Bob", "IT", "Developer"));
        employeeHashtable.put(3, new Employee(3, "Charlie", "Finance", "Accountant"));
        employeeHashtable.put(4, new Employee(4, "David", "Marketing", "Sales Executive"));

        // Verifying whether the Hashtable is empty or not
        boolean isEmpty = employeeHashtable.isEmpty();
        System.out.println("Is the Hashtable empty? " + isEmpty);
    }

}
