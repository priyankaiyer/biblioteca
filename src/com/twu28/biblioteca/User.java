package com.twu28.biblioteca;

public class User {

private String user_name;
private String password;
boolean logged_in= false;

public User(String user_name,String password)
{
	this.user_name=user_name;
	this.password=password;
}

public boolean isLogged_in() {
	return logged_in;
}

public String getUser_name() {
	return user_name;
}

public String getPassword() {
	return password;
}

public void setLogged_in(boolean logged_in) {
	this.logged_in = logged_in;
}

public String userlogin()
{
    this.setLogged_in(true);
    return toString();
}
@Override
public String toString() {
    String reserved= "is not logged in";
    if(isLogged_in())
    {
        reserved="is logged in" ;
    }
    return getUser_name()+" "+reserved;
}

}
