package com.twu28.biblioteca;

import java.io.*;
import java.util.ArrayList;

public class BookManager {
    UserManager userManager= new UserManager(System.out,System.in);
public ArrayList<Book> book= new ArrayList<Book>();
BufferedReader bufferedReader;
    private PrintStream printStream;
 public BookManager( InputStream in, PrintStream printStream)
{
    this.printStream = printStream;
    loadBooks();
    bufferedReader =new BufferedReader(new InputStreamReader(in));
}
private void loadBooks(){
book.add(new Book("Book1","author1",01,false));
book.add(new Book("Book2","author2",02,false));
book.add(new Book("Book3","author3",03,true));
book.add(new Book("Book4","author4",04,false));
book.add(new Book("Book5","author5",05,true));
}
	public String listBooks() throws IOException, NullPointerException
	{
		String bookDetails="";
	for (Book book1:book)
	{
			 bookDetails += book1.getbookDetails() +"\n";
	}
	return bookDetails;
	}

    public String reserveBook(BookManager bookManager) throws IOException {
        if(!userManager.current_user.isLogged_in())
        {
            return "Please Login First";
        }
Book index = book.get((Integer.parseInt(ask("Please enter the book no")))-1);
        return (index.bookReservation());

    }
    public String ask(String message) throws IOException {
        printStream.println(message);
        return bufferedReader.readLine() ;
    }

}
