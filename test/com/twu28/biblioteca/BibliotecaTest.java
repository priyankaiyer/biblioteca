package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;
import java.io.IOException;


public class BibliotecaTest {
    Biblioteca biblioteca = new Biblioteca();
    /* test whether the customer sees the welcome message*/
    @Test
    public void welcomemessage_test() {
        String welcome_message="------------Welcome to TWU Biblioteca-----------";
        Assert.assertTrue(biblioteca.welcomeMessage().contains(welcome_message));
    }
    /*test whether the customer sees all the menus */
    @Test
    public void loadmenu_test() throws IOException{
        String loadmenu_message="1.View all books"+"\n"+"2.Reserve a book"+"\n"+"3.Check library number"+"\n"+"Please enter your choice";
        Assert.assertTrue(biblioteca.loadmenu().contains(loadmenu_message));

    }
    /*test whether the correct message when customer enters an invalid option*/
    @Test
    public void optionselection_test () throws NullPointerException, IOException
    {
        Assert.assertEquals("Please enter a valid choice", biblioteca.optionSelection(-1));
    }
    /*test whether correct notification is displayed after checking the library number*/
    @Test
    public void test_checklibrayNumber() throws NullPointerException, IOException
    {
        Assert.assertEquals("Hello 111 Please contact the librarian", biblioteca.checkLibraryNumber("111"));
    }
}
