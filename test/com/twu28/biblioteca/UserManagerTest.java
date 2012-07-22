package com.twu28.biblioteca;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class UserManagerTest extends BibliotecaTest{

    private UserManager userManager = new UserManager();
    
    @Test
    @Override
    public void loadmenu_test() throws IOException
    {
        String loadmenu_message = "Please login";
        Assert.assertTrue(biblioteca.loadmenu().contains(loadmenu_message));
    }

    @Test
    public void test_should_be_able_login_with_correct_username_and_password(){
        User user = new User("111-1111", "user1");

        Assert.assertEquals("Successfully logged in", userManager.login(user));
    }

    @Test
    public void test_should_fail_to_login_when_provide_wrong_username_or_password(){
        User user_invalid_name = new User("111-0001", "user1");

        Assert.assertEquals("Invalid username/ password", userManager.login(user_invalid_name));
        Assert.assertEquals(false, user_invalid_name.isLogged_in());

    }
}
