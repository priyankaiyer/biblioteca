package com.twu28.biblioteca;

public class Book {
	private String name;
	private String author;
    private	int bookno;
    private boolean reservedStatus;
	public Book(String name,String author,int i, boolean reservedStatus)
	
	{
		this.name= name;
		this.author=author;
		this.bookno= i;
		this.reservedStatus=reservedStatus;
		
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public int getBookno() {
		return bookno;
	}
	public boolean getReservedStatus() {
		return reservedStatus;
	}
	public void setReservedStatus(boolean reservedStatus) {
		this.reservedStatus = reservedStatus;
	}
public static String getbookDetails(Book d)
{
	String reserved="available";
	if(d.getReservedStatus())
	{
		reserved="reserved";
	}
	return d.getBookno()+" "+d.getName()+" "+d.getAuthor()+" "+"is"+" "+ reserved;
}
}