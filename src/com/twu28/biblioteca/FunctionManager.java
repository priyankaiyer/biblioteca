package com.twu28.biblioteca;

import java.io.IOException;

public enum FunctionManager{ 
	
	 ViewAllBooks(1, new ViewAllBooksFunction()),
	    ReserveBooks(2, new ReserveBooksFunction()),
	    CheckLibraryNumber(3, new CheckLibraryNumberFunction()),
	    ViewAllMovies(4, new ViewAllMoviesFunction()),
	    UserLogin(5, new UserLoginFunction());
	
	    private  int selectedOption;
	    private Function function;
	    
	    private FunctionManager(int selectedOption, Function function){
	      this.selectedOption= selectedOption;
	      this.function= function;
	    }

	    public static FunctionManager getFromKey(int key){
	        for(FunctionManager optionsItem : values()) {
	            if (optionsItem.selectedOption == key) {
	                return optionsItem;
	            }
	        }
	        throw new IllegalArgumentException("invalid key");

}

	    public Function getFunction() {
	        return function;
	    }
}
class ViewAllBooksFunction implements Function{
    @Override
    public String execute(Biblioteca biblioteca) throws NullPointerException, IOException {
        return biblioteca.getBookManager().listBooks();
    }
}

class ReserveBooksFunction implements Function{
    @Override
    public String execute(Biblioteca biblioteca) throws NumberFormatException, IOException{
        return biblioteca.getBookManager().reserveBook(biblioteca.getBookManager());
    }
}

class CheckLibraryNumberFunction implements Function{
    @Override
    public String execute(Biblioteca biblioteca) throws IOException{
        return biblioteca.checkLibraryNumber();
    }
}

class ViewAllMoviesFunction implements Function{
    @Override
    public String execute(Biblioteca biblioteca){
        return biblioteca.getMovieManager().viewmovies();
    }
}

class UserLoginFunction implements Function {
    @Override
    public String execute(Biblioteca biblioteca) throws IOException{
        return biblioteca.getUserManager().login();
    }
}
