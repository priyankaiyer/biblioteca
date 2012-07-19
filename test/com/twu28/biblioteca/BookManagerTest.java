package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;



public class BookManagerTest {
    BookManager bookManager= new BookManager();
	@Test
    /*customer views all the books.*/
	public void loadbooks_test() throws Exception {
		String books_list="1 Book1 author1 is available"+"\n"+"2 Book2 author2 is available"+"\n"+"3 Book3 author3 is reserved"+"\n"+"4 Book4 author4 is available"+"\n"+"5 Book5 author5 is reserved"+"\n";
		Assert.assertEquals(books_list,bookManager.listBooks());
		
	}
    /*customer reserves the and gets the notification for available book*/
    @Test
    public void reserveBook_test_available() {
        String available_result="Reserved for you!! Happy reading";
        Assert.assertEquals(available_result,bookManager.reserveBook(1));

    }
    /*customer is unable to reserve an unavailable book and gets the correct notification */
    @Test
    public void reserveBook_test_reserved()
    {
        String reserved_result="Sorry the book is already reserved";
        Assert.assertEquals(reserved_result,bookManager.reserveBook(3));
    }

}
