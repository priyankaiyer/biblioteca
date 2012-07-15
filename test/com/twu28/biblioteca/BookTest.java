package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class BookTest {
    /* test to check whether it shows the correct book availability*/
	@Test
	public void getdetails_testfor_availability()
	{
   Book book1 =new Book("Book1","author1",01,false);
	Assert.assertEquals("1 Book1 author1 is available", book1.getbookDetails());
	}
    /* test to check whether it shows the book is reserved*/
	@Test
	public void getdetails_testfor_reservation()
	{
   Book book1 =new Book("Book3","author3",03,true);
	Assert.assertEquals("3 Book3 author3 is reserved", book1.getbookDetails());
	}
}
