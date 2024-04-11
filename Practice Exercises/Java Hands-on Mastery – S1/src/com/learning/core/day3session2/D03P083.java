package com.learning.core.day3session2;
import java.util.TreeSet;

public class D03P083 {
	
	public static void main(String[] args) {
        // Creating a TreeSet to store book details sorted by bookID
       // TreeSet<Book> bookSet = new TreeSet<>();
        TreeSet<Book> bookTreeSet = new TreeSet<>();
        // Adding predefined information of five book details
        bookTreeSet.add(new Book(1001, "Python Learning", 715.0,"Martic C.Brown" ,"2/2/2020"));
        bookTreeSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));
        bookTreeSet.add(new Book(1003, "Java Programming", 523.0, "Gilad ","23/11/1984"));
        bookTreeSet.add(new Book(1004, "Read C++", 295.0,"Henry Harvin" ,"19/11/1984" ));
        bookTreeSet.add(new Book(1005, ".Net Platform", 3497.0,"Mark J.Price", "6/3/1984"));

        // Printing all the book details
        System.out.println("All Book Details:");
        for (Book book : bookTreeSet) {
            System.out.println(book);
        }
    }

}
