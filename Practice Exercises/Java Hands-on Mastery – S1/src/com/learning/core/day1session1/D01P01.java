package com.learning.core.day1session1;

class Book {
    private String book_title;
    private int book_price;
    public void setBookTitle(String btitle)
    {
       book_title=btitle;
    }
    public String getBookTitle()
    {
        return book_title;
    }
    public void setBookPrice(int bprice)
    {
       book_price=bprice;
    }
    public int getBookPrice()
    {
        return book_price ;
    }
 
    
    
}
 
public class D01P01 {
 
	public static void main(String[] args) {
		Book b=new Book();
	       b.setBookTitle("java programmming");
	       b.setBookPrice(350);
	       System.out.println("Book Title:"+b.getBookTitle()+ " "+"and"+" "+"Book Price:"+b.getBookPrice());
	       //System.out.println("Book Price:"+b.getBookPrice());
 
	}
}