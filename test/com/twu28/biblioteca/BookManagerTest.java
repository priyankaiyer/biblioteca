package com.twu28.biblioteca;

import junit.framework.Assert;

import org.junit.Test;

import com.twu28.biblioteca.*;



public class BookManagerTest {
	@Test
	public void loadbooks_test() throws Exception {
		String books_list="1 Book1 author1 is available"+"\n"+"2 Book2 author2 is available"+"\n"+"3 Book3 author3 is reserved"+"\n"+"4 Book4 author4 is available"+"\n"+"5 Book5 author5 is reserved"+"\n";
		System.out.println(books_list);
		Assert.assertEquals(books_list,BookManager.loadBooks());
		
	}
	

}
