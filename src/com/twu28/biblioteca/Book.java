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
	private String getName() {
		return name;
	}
	private String getAuthor() {
		return author;
	}
	private int getBookno() {
		return bookno;
	}
	private boolean getReservedStatus() {
		return reservedStatus;
	}
	private void setReservedStatus(boolean reservedStatus) {
		this.reservedStatus = reservedStatus;
	}
public String getbookDetails()
{
	String reserved="available";
	if(getReservedStatus())
	{
		reserved="reserved";
	}
	return getBookno()+" "+getName()+" "+getAuthor()+" "+"is"+" "+ reserved;
}
    public String bookReservation()
    {
    boolean reserved= this.getReservedStatus();
    if(!reserved)
    {
        this.setReservedStatus(true);
        return "Reserved for you!! Happy reading";
    }
    else
            return "Sorry the book is already reserved";
}
}