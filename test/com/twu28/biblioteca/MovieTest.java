package com.twu28.biblioteca;

import junit.framework.Assert;

import org.junit.Test;

public class MovieTest {

	@Test
	public void test_for_showing_rating_notapplicable()
	{
   Movie movie1= new Movie("Movie1","Director1");
	Assert.assertEquals("Director1 Movie1 N/A", movie1.getmovieDetails());
	}
    /* test to check whether it shows the book is reserved*/
	@Test
	public void getdetails_testfor_reservation()
	{
  Movie movie2=new Movie("Movie2","Director2","9");
	Assert.assertEquals("Director2 Movie2 9", movie2.getmovieDetails());
	}
}
