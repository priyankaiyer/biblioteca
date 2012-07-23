package com.twu28.biblioteca;

public class Movie {

	private String movie_name;
	private String movie_director;
	private String movie_rating="N/A";
	public Movie(String movie_name, String movie_director, String movie_rating) {
		this.movie_director = movie_director;
		this.movie_name = movie_name;
		this.movie_rating = movie_rating;
	}
	public Movie(String movie_name,String movie_director)
	{
		this.movie_name=movie_name;
		this.movie_director=movie_director;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public String getMovie_director() {
		return movie_director;
	}
	public String getMovie_rating() {
		return movie_rating;
	}

	public String getmovieDetails()
	{
	StringBuffer stringBuffer= new StringBuffer();
	stringBuffer.append(getMovie_director()).append(" ").append(getMovie_name()).append(" ").append(getMovie_rating());
	String result= stringBuffer.toString();
	return result;
	}
	
	
}
