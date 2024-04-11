package com.learning.core.day3session2;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private int bookID;
    private String title;
    private double price;
    private String dateOfPublisher;
    private String author;

    public Book(int bookID, String title, double price, String dateOfPublisher, String author) {
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.dateOfPublisher = dateOfPublisher;
        this.author = author;
    }

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDateOfPublisher() {
		return dateOfPublisher;
	}

	public void setDateOfPublisher(String dateOfPublisher) {
		this.dateOfPublisher = dateOfPublisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return " bookID=" + bookID + ", title=" + title + ", price=" + price + ", dateOfPublisher="
				+ dateOfPublisher + ", author=" + author ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookID, dateOfPublisher, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookID == other.bookID
				&& Objects.equals(dateOfPublisher, other.dateOfPublisher)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Book other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.bookID, other.bookID);
	}
	public int compareTo1(Book other) {
		// TODO Auto-generated method stub
		return this.author.compareTo(other.author);
	}
}
