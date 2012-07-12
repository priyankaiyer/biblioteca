package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Biblioteca {
    static BookManager bookManager= new BookManager();
    static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<String> menuOptions;
    public Biblioteca() throws IOException
    {
        while(true)
        {
            String welcome= welcomeMessage();
            System.out.println(welcome);
            String menu=loadmenu();
            System.out.println(menu);
            int choice= Integer.parseInt(bufferedReader.readLine());
            optionSelection(choice);
        }
    }
    public static String welcomeMessage()
    {
        String welcomeMessage="------------Welcome to TWU Biblioteca-----------";
        return welcomeMessage;
    }
    public static String loadmenu() throws IOException
    {
        menuOptions= new ArrayList<String>();
        String menuoptions=" ";
        menuOptions.add("View all books");
        menuOptions.add("Reserve a book");
        menuOptions.add("Check library number");
        for(String entry :menuOptions)
        {
            menuoptions+=(menuOptions.indexOf(entry)+1+"."+entry)+"\n";
        }
        menuoptions += "Please enter your choice";
        return menuoptions;
    }
    public static String optionSelection(int choice) throws NullPointerException, IOException
    {

        if(choice <= 0 ||choice > menuOptions.size())
        {
            return "Please enter a valid choice" ;
        }
        if(choice==1)
        {
            String bookDetails = BookManager.loadBooks();
            System.out.println(bookDetails);

        }
        else if (choice==2)
        {
            System.out.println("Please enter the book no");
            int bookno=Integer.parseInt( bufferedReader.readLine());
            String reservationResult= bookManager.reserveBook(bookno);
            System.out.println(reservationResult);
        }
        else
        {
            String libraryNumber;
            System.out.println("Please enter your library number");
            BufferedReader bufferedReader= new BufferedReader( new InputStreamReader(System.in));
            libraryNumber= bufferedReader.readLine();
            String result=checkLibraryNumber(libraryNumber);
            System.out.println(result);
        }
        return null;
    }
    public static String checkLibraryNumber(String libraryNumber) throws IOException
    {
        return "Hello "+libraryNumber+ " Please contact the librarian";
    }

    public static void main(String args[]) throws IOException
    {
        Biblioteca biblioteca= new Biblioteca();

    }

}
