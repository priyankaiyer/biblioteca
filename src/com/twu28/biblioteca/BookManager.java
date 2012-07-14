package com.twu28.biblioteca;

import java.io.IOException;
import java.util.ArrayList;

public class BookManager {
public ArrayList<Book> book= new ArrayList<Book>();
{
book.add(new Book("Book1","author1",01,false));
book.add(new Book("Book2","author2",02,false));
book.add(new Book("Book3","author3",03,true));
book.add(new Book("Book4","author4",4,false));
book.add(new Book("Book5","author5",05,true));
}
	public String loadBooks() throws IOException, NullPointerException
	{
		String bookDetails="";
	for (Book book1:book)
	{
			 bookDetails += book1.getbookDetails() +"\n";
	}
	return bookDetails;
	}

    public String reserveBook(int bookno)
	{
	   Book index = book.get(bookno-1);
		boolean reserved= index.getReservedStatus();
		if(!reserved)
		{
			index.setReservedStatus(true);
		return "Reserved for you!! Happy reading";	
		}
		else
		return "Sorry the book is already reserved";
		}	
	}


