package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Priyanka
 * Date: 26/7/12
 * Time: 9:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaTest extends TestCase {

    Biblioteca biblioteca = new Biblioteca();
    /* test whether the customer sees the welcome message*/
    @Test
    public void test_to_check_welcome_message_display() throws Exception {
        String welcome_message="------------Welcome to TWU Biblioteca-----------";
        Assert.assertEquals(welcome_message,biblioteca.welcomeMessage());
    }
    @Test
    public void test_to_check_menuloaded() throws Exception {
        String menu_options=" 1.View all books\n" +
                "2.Reserve a book\n" +
                "3.Check library number\n" +
                "4.View movie list\n" +
                "5.Please login\n" +
                "Please enter your choice";
        Assert.assertEquals(menu_options,biblioteca.loadmenu());

    }
    @Test
    public void test_invalid_option_selection() throws Exception {
     String invalid_option_message="Please enter a valid choice";
        Assert.assertEquals(invalid_option_message,biblioteca.optionSelection(-1));
    }
    @Test
    public void test_display_correct_message_for_unauthorized_user() throws Exception {
     User user= new User("xxxx-xxxx","yyyy");
        String message="Please talk to the librarian";
        Assert.assertEquals(message,biblioteca.checkLibraryNumber());
    }
}
