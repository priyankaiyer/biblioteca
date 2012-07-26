package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Biblioteca {
    BookManager bookManager= new BookManager(System.in, System.out);
    MovieManager movieManager= new MovieManager();
    UserManager userManager= new UserManager(System.out,System.in);
    public ArrayList<String> menuOptions;
    /* customer seeing welcome message during the start of the application*/
    public String welcomeMessage()
    {
      String welcomeMessage="------------Welcome to TWU Biblioteca-----------";
        return welcomeMessage;
    }
    public String loadmenu() throws IOException
    {
        menuOptions= new ArrayList<String>();
        String menuoptions=" ";
        menuOptions.add("View all books");
        menuOptions.add("Reserve a book");
        menuOptions.add("Check library number");
        menuOptions.add("View movie list");
        menuOptions.add("Please login");
        for(String entry :menuOptions)
        {
            menuoptions+=(menuOptions.indexOf(entry)+1+"."+entry)+"\n";
        }
        menuoptions += "Please enter your choice";
        return menuoptions;
    }
    public String optionSelection(int choice) throws NullPointerException, IOException
    {
    	 if(choice <= 0 ||choice > menuOptions.size())
    	    {
    	    	return("Please enter a valid choice");
    	    }
    FunctionManager functionManager= FunctionManager.getFromKey(choice);
    return functionManager.getFunction().execute(this);
    }
    public static void main(String args[]) throws IOException
    {
        Biblioteca biblioteca= new Biblioteca();
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String welcome= biblioteca.welcomeMessage();
            System.out.println(welcome);
            String menu;
                menu = biblioteca.loadmenu();
                System.out.println(menu);
                       int choice;
                choice = Integer.parseInt(bufferedReader.readLine());
               String print_on_screen=  biblioteca.optionSelection(choice);
               System.out.println(print_on_screen);
        }
    }
    public String checkLibraryNumber() throws IOException
    {
        if(userManager.current_user.isLogged_in())
        {
            return "Hello"+" "+userManager.current_user.getUser_name();
        }
        else
            return "Please talk to the librarian";
    }
    public BookManager getBookManager() {
        return bookManager;
    }

    public MovieManager getMovieManager() {
        return movieManager;
    }
    public UserManager getUserManager()
    {
        return userManager;
    }

}
