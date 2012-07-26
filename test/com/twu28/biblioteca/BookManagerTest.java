package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: Priyanka
 * Date: 26/7/12
 * Time: 1:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookManagerTest extends TestCase {
    BookManager bookManager= new BookManager(System.in, System.out);
    UserManager userManager= new UserManager(System.out,System.in);
    ArrayList<Book> book= new ArrayList<Book>();
    public void test_to_list_books() throws Exception {
        String book_list="1 Book1 author1 is available\n" +
                "2 Book2 author2 is available\n" +
                "3 Book3 author3 is reserved\n" +
                "4 Book4 author4 is available\n" +
                "5 Book5 author5 is reserved\n";
        Assert.assertEquals(book_list, bookManager.listBooks());
    }
 public void test_to_prompt_error_for_invalid_user() throws Exception {
     String error_message="Please Login First";
     Assert.assertEquals(error_message,bookManager.reserveBook(bookManager));
  }
    public void test_to_reserve_an_available_book() throws Exception    {
        book.add(new Book("Book1","author1",01,true));
        book.add(new Book("Book2","author2",02,false));
        String reserved_message="Please enter the book no";
    userManager.current_user= new User("111-1111","user1");
        userManager.current_user.userlogin();
        BookManager bookManager1= mock(BookManager.class);
        when(bookManager1.ask(reserved_message)).thenReturn("2");
        Book index= book.get(Integer.parseInt(bookManager1.ask(reserved_message))-1);
        Assert.assertEquals("Reserved for you!! Happy reading",index.bookReservation());

    }
    public void test_to_reserve_an_reserved_book() throws Exception    {
        book.add(new Book("Book1","author1",01,true));
        book.add(new Book("Book2","author2",02,false));
        String reserved_message="Please enter the book no";
        userManager.current_user= new User("111-1111","user1");
        userManager.current_user.userlogin();
        BookManager bookManager1= mock(BookManager.class);
        when(bookManager1.ask(reserved_message)).thenReturn("1");
        Book index= book.get(Integer.parseInt(bookManager1.ask(reserved_message))-1);
        Assert.assertEquals("Sorry the book is already reserved",index.bookReservation());

    }
}
