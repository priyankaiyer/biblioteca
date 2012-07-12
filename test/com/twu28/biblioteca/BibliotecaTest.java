package com.twu28.biblioteca;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.twu28.biblioteca.*;

import junit.framework.Assert;
import junit.framework.TestCase;


public class BibliotecaTest  {
@Test
public void welcomemessage_test() {
	String welcome_message="------------Welcome to TWU Biblioteca-----------";
	Assert.assertTrue(Biblioteca.welcomeMessage().contains(welcome_message));
}
@Test
public void loadmenu_test() throws IOException{
	String loadmenu_message="1.View all books"+"\n"+"2.Reserve a book"+"\n"+"3.Check library number"+"\n"+"Please enter your choice";
	Assert.assertTrue(Biblioteca.loadmenu().contains(loadmenu_message));
	
}
@Test
public void optionselection_test () throws NullPointerException, IOException
{
	Assert.assertEquals("Please enter a valid choice", Biblioteca.optionSelection(-1));
}
@Test
public void test_checklibrayNumber() throws NullPointerException, IOException
{
	Assert.assertEquals("Hello 111 Please contact the librarian", Biblioteca.checkLibraryNumber("111"));
}
}
