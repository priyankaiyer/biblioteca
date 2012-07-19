package com.twu28.biblioteca;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

public class FunctionManagerTest {
	
    protected Biblioteca biblioteca = new Biblioteca();

    @Test
    public void test_should_execute_view_all_book() throws NullPointerException, IOException{
        int optionNumber = 1;
        FunctionManager functionManager = FunctionManager.getFromKey(optionNumber);

        String books_list="1 Book1 author1 is available"+"\n"+"2 Book2 author2 is available"+"\n"+"3 Book3 author3 is reserved"+"\n"+"4 Book4 author4 is available"+"\n"+"5 Book5 author5 is reserved"+"\n";
        Assert.assertEquals(books_list, functionManager.getFunction().execute(biblioteca));
    }

    @Test
    public void test_should_execute_check_library_number() throws NullPointerException, IOException{
        int optionNumber = 3;
        FunctionManager functionManager = FunctionManager.getFromKey(optionNumber);
        String notifiedMessage = "Please talk to the librarian";
        
        Assert.assertEquals(notifiedMessage, functionManager.getFunction().execute(biblioteca));
    }

    @Test
    public void test_should_execute_view_all_movies() throws NullPointerException, IOException{
        int optionNumber = 4;
        FunctionManager functionManager = FunctionManager.getFromKey(optionNumber);
        String movie_list=	"Ridley Scott Promethesus 7.9"+"\n"+
        "Christopher Nolan The Dark Knight Rises N/A"+"\n"+
        "Barry Sonnenfield Men In Black 3 6.9"+"\n"+
        "Marc Webb The Amazing Spiderman 7.8"+"\n"+
        "Martin Scorsese Hugo 8.3"+"\n"+
        "Joss Whedon The Avengers 8.6"+"\n"+
        "Eric Darnell Madagascar 3: Europe's most wanted 7.3"+"\n"+
        "Rupert Scanders Snow white and the Huntsman 7.2"+"\n"+
        "Peter Berg Battleship 6.2"+"\n"+
        "J. R. R. Tolkien Hobbit N/A"+"\n"+
        "Phyllida Lloyd The Iron Lady 6.9"+"\n"+
        "Jonathan Liesbesman Wrath of titans 7.5"+"\n"+
        "Timur bekmambetov Abraham Lincoln: Vampire Hunter 6.5"+"\n"+
        "John gulager Piranha 3DD 6.1"+"\n"+
        "Bennett Miller Moneyball 8.3"+"\n";

        Assert.assertEquals(movie_list, functionManager.getFunction().execute(biblioteca));
    }


}
