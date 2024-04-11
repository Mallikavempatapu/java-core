package com.learning.core.day3session2;
import java.util.TreeSet;

public class D03P084 {

	
	public static void main(String[] args) {
        // Creating a TreeSet to store book details and sort by author name
        TreeSet<Book> bookTreeSet = new TreeSet<>();

        // Adding predefined information of five book details
        // Adding predefined information of five book details
        bookTreeSet.add(new Book(1001, "Python Learning", 715.0,"Martic C.Brown" ,"2/2/2020"));
        bookTreeSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));
        bookTreeSet.add(new Book(1003, "Java Programming", 523.0, "Gilad ","23/11/1984"));
        bookTreeSet.add(new Book(1004, "Read C++", 295.0,"Henry Harvin" ,"19/11/1984" ));
        bookTreeSet.add(new Book(1005, ".Net Platform", 3497.0,"Mark J.Price", "6/3/1984"));

        
//        bookSet.add(new Book(101, "Java Programming", 45.99, "2022-01-15", "John Smith"));
//        bookSet.add(new Book(102, "Data Structures and Algorithms", 55.50, "2021-12-30", "Alice Johnson"));
//        bookSet.add(new Book(103, "Introduction to Machine Learning", 65.25, "2022-02-20", "Bob Brown"));
//        bookSet.add(new Book(104, "Python for Beginners", 35.75, "2022-03-10", "Emily Davis"));
//        bookSet.add(new Book(105, "Database Management Systems", 40.00, "2022-02-05", "Michael Wilson"));

        // Printing all the book details sorted by author name
        System.out.println("All Book Details (Sorted by Author Name):");
        for (Book book : bookTreeSet) {
            System.out.println(book);
        }
    }
}
