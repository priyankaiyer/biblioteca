package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Priyanka
 * Date: 26/7/12
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest extends TestCase {
    public void test_to_print_avaialbe_book_details() throws Exception {
        Book book1= new Book("Book1","author1",01,false);
        String prompt_message="1 Book1 author1 is available";
        Assert.assertEquals(prompt_message,book1.getbookDetails());

    }
    public void test_to_print_reserved_book_details() throws Exception{
        Book book2= new Book("Book2","author2",02,true);
       String prompt_message="2 Book2 author2 is reserved";
        Assert.assertEquals(prompt_message,book2.getbookDetails());
    }

    public void test_to_reserve_available_book() throws Exception {
        Book book1= new Book("Book1","author1",01,false);
        String reserved_message="Reserved for you!! Happy reading";
        Assert.assertEquals(reserved_message,book1.bookReservation());
    }
    public void test_to_pop_error_for_reserved_book() throws Exception{
        Book book2= new Book("Book2","author2",02,true);
        String error_message="Sorry the book is already reserved";
        Assert.assertEquals(error_message,book2.bookReservation());
    }
}
