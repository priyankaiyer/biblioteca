package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserManager {
Map<String, String> users= new HashMap<String, String>();
public UserManager()
{
	loadUsers();
}
private void loadUsers() {
	users.put("111-1111","user1");
	users.put("111-1112","user2");
	users.put("111-1113","user3");
	users.put("111-1114","user4");
	users.put("111-1115","user4");
}
public String login(User current_user)

{
if(users.containsKey(current_user.getUser_name())&& current_user.getPassword().equals(users.get(current_user.getUser_name())))
{
	current_user.setLogged_in(true);
return "Successfully logged in";	
}
else
{
	return "Invalid username/ password";
}
}
}
