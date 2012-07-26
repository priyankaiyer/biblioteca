package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Priyanka
 * Date: 26/7/12
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieManagerTest extends TestCase {
    MovieManager movieManager= new MovieManager();
    public void test_to_check_listing_of_movielist() throws Exception {
        String movie_list= "Ridley Scott Promethesus 7.9\n" +
                "Christopher Nolan The Dark Knight Rises N/A\n" +
                "Barry Sonnenfield Men In Black 3 6.9\n" +
                "Marc Webb The Amazing Spiderman 7.8\n" +
                "Martin Scorsese Hugo 8.3\n" +
                "Joss Whedon The Avengers 8.6\n" +
                "Eric Darnell Madagascar 3: Europe's most wanted 7.3\n" +
                "Rupert Scanders Snow white and the Huntsman 7.2\n" +
                "Peter Berg Battleship 6.2\n" +
                "J. R. R. Tolkien Hobbit N/A\n" +
                "Phyllida Lloyd The Iron Lady 6.9\n" +
                "Jonathan Liesbesman Wrath of titans 7.5\n" +
                "Timur bekmambetov Abraham Lincoln: Vampire Hunter 6.5\n" +
                "John gulager Piranha 3DD 6.1\n" +
                "Bennett Miller Moneyball 8.3\n";
        Assert.assertEquals(movie_list,movieManager.viewmovies());

    }
}
