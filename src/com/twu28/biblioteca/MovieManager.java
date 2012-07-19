package com.twu28.biblioteca;

import java.util.ArrayList;
public class MovieManager {
ArrayList<Movie> movies= new ArrayList<Movie>();
public MovieManager()
{
loadmovies();
}
private void loadmovies() {
	movies.add(new Movie("Promethesus","Ridley Scott","7.9"));
	movies.add(new Movie("The Dark Knight Rises","Christopher Nolan"));
	movies.add(new Movie("Men In Black 3","Barry Sonnenfield","6.9"));
	movies.add(new Movie("The Amazing Spiderman","Marc Webb","7.8"));
	movies.add(new Movie("Hugo","Martin Scorsese","8.3"));
	movies.add(new Movie("The Avengers","Joss Whedon","8.6"));
	movies.add(new Movie("Madagascar 3: Europe's most wanted","Eric Darnell","7.3"));
	movies.add(new Movie("Snow white and the Huntsman","Rupert Scanders","7.2"));
	movies.add(new Movie("Battleship","Peter Berg","6.2"));
	movies.add(new Movie("Hobbit","J. R. R. Tolkien"));
	movies.add(new Movie("The Iron Lady","Phyllida Lloyd","6.9"));
	movies.add(new Movie("Wrath of titans","Jonathan Liesbesman","7.5"));
	movies.add(new Movie("Abraham Lincoln: Vampire Hunter","Timur bekmambetov","6.5"));
	movies.add(new Movie("Piranha 3DD","John gulager","6.1"));
	movies.add(new Movie("Moneyball","Bennett Miller","8.3"));
}
public String viewmovies()
{
	String movielist="";
for(Movie entry:movies)	
{
movielist+=	entry.getmovieDetails()+"\n";
}
return movielist;
}
}
