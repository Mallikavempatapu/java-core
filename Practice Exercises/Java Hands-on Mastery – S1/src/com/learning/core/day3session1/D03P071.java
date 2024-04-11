package com.learning.core.day3session1;
import java.util.ArrayList;
import java.util.Scanner;

public class D03P071 {
    public static void main(String[] args) {
       
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Jack");
        studentNames.add("Paul");
        studentNames.add("Henry");
        studentNames.add("Ronald");
        studentNames.add("David");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to search: ");
        String nameToSearch = scanner.nextLine();

        if (studentNames.contains(nameToSearch)) {
            System.out.println(nameToSearch + "Found in the list.");
        } else {
            System.out.println(nameToSearch + " does not Founs in the list.");
        }
    }
}