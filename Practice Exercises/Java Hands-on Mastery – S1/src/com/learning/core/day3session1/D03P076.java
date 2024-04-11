package com.learning.core.day3session1;


import java.util.TreeSet;


public class D03P076 {
    public static void main(String[] args) {
    	 Person person1 = new Person(1, "Jerry", 30, 50000.0);
         Person person2 = new Person(2, "Smith", 28, 55000.0);
         Person person3 = new Person(3, "Popeye", 25, 60000.0);
         Person person4 = new Person(4, "Jones", 35, 70000.0);
         Person person5 = new Person(5, "JOhn", 20, 45000.0);
         Person person6 = new Person(6, "Tom", 40, 80000.0);

        // Store persons in a TreeSet 
        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        // Print ID, name, and salary of each person
        for (Person person : personSet) {
            System.out.println( + person.getId() + ", " + person.getName() + "," + person.getSalary());
        }
    }
}