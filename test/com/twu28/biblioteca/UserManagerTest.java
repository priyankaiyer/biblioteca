package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: Priyanka
 * Date: 26/7/12
 * Time: 9:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserManagerTest extends TestCase {
    UserManager userManager1= new UserManager(System.out,System.in);
    public void test_to_check_correct_logging_in() throws Exception{

        UserManager userManager= mock(UserManager.class);
        when(userManager.ask("Please enter your username")).thenReturn("111-1113");
        when(userManager.ask("Please enter your password")).thenReturn("user3");
        User current_user= new User(userManager.ask("Please enter your username"),userManager.ask("Please enter your password"));
        Assert.assertEquals("111-1113 is logged in",userManager1.verify_user(current_user));


    }
    public void test_to_check_invalid_logging_in() throws Exception{

        UserManager userManager= mock(UserManager.class);
        when(userManager.ask("Please enter your username")).thenReturn("111-1110");
        when(userManager.ask("Please enter your password")).thenReturn("user4");
        User current_user= new User(userManager.ask("Please enter your username"),userManager.ask("Please enter your password"));
        Assert.assertEquals("Invalid username/ password",userManager1.verify_user(current_user));


    }

}
