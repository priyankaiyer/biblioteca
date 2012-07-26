package com.twu28.biblioteca;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UserManager {
    BufferedReader bufferedReader;
    private PrintStream printStream;
    public static User current_user=new User("xxx","xxx");
Map<String, String> users= new HashMap<String, String>();
public UserManager(PrintStream printStream, InputStream in)
{
    this.printStream = printStream;
    loadUsers();
    bufferedReader= new BufferedReader(new InputStreamReader(in));
}
private void loadUsers() {
	users.put("111-1111","user1");
	users.put("111-1112","user2");
	users.put("111-1113","user3");
	users.put("111-1114","user4");
	users.put("111-1115","user4");
}
public String login() throws IOException

{
    if(current_user.isLogged_in())
         {
          return "Hello" + current_user.getUser_name()+"you have already logged in";
         }
    else
                {
    String username=ask("Please enter your username");
    String password=ask("Please enter your password");
    current_user= new User(username, password);
        return verify_user(current_user);
                }
}
    public String verify_user(User current_user)
    {
    if(users.containsKey(current_user.getUser_name())&& current_user.getPassword().equals(users.get(current_user.getUser_name())))
{
	return current_user.userlogin();
}
else
{
	return "Invalid username/ password";
}
    }
    public String ask(String message) throws IOException {
        printStream.println(message);
        return bufferedReader.readLine() ;
    }

}










