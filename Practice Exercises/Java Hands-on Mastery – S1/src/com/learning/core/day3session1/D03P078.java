package com.learning.core.day3session1;
import java.util.HashSet;
import java.util.TreeSet;
 
public class D03P078 {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>();
 
        // Adding predefined information of 6 persons
        personTreeSet.add(new Person(1,"Jerry", 30, 999.0));
        personTreeSet.add(new Person(2,"Smith", 35, 2999.0));
        personTreeSet.add(new Person(3,"Popeye", 25, 5999.0));
        personTreeSet.add(new Person(4,"Jones", 40, 6999.0));
        personTreeSet.add(new Person(5,"John", 28, 1999.0));
        personTreeSet.add(new Person(6,"Tom", 32, 3999.0));
 
        // Printing the sum of all salaries
        double sum = 0;
        for (Person person : personTreeSet) {
            sum += person.getSalary();
        }
        System.out.println("Sum of all salaries: " + sum);
    }
}