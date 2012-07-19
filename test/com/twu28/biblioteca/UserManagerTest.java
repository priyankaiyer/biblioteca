package com.twu28.biblioteca;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;


public class UserManagerTest extends BibliotecaTest{

    private UserManager userManager = new UserManager();
    
    @Test
    public void test_should_login_menu_item() throws IOException{
        String loginMenuItem = "Please login";

        Assert.assertTrue(biblioteca.loadmenu().contains(loginMenuItem));
    }

    @Test
    public void test_should_be_able_login_with_correct_username_and_password(){
        User user = new User("111-1111", "user1");

        Assert.assertEquals("Successfully logged in", userManager.login(user));
    }

    @Test
    public void test_should_fail_to_login_when_provide_wrong_username_or_password(){
        User user_invalid_name = new User("111-0001", "user1");
        User user_invalid_password = new User("111-1112", "pass2");
        User user_invalid = new User("111-000", "0000");

        Assert.assertEquals("Invalid username/ password", userManager.login(user_invalid_name));
        Assert.assertEquals(false, user_invalid_name.isLogged_in());

        Assert.assertEquals("Invalid username/ password", userManager.login(user_invalid_password));
        Assert.assertEquals(false, user_invalid_password.isLogged_in());

        Assert.assertEquals("Invalid username/ password", userManager.login(user_invalid));
        Assert.assertEquals(false, user_invalid.isLogged_in());
    }
}
