package com.twu28.biblioteca;

import junit.framework.Assert;

import org.junit.Test;

import com.twu28.biblioteca.*;



public class BookTest {
	@Test
	public void getdetails_testfor_availability()
	{
   Book book1 =new Book("Book1","author1",01,false);
	Assert.assertEquals("1 Book1 author1 is available", Book.getbookDetails(book1));
	}
	@Test
	public void getdetails_testfor_reservation()
	{
   Book book1 =new Book("Book3","author3",03,true);
	Assert.assertEquals("3 Book3 author3 is reserved", Book.getbookDetails(book1));
	}
}
