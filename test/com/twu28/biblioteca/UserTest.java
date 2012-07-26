package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Priyanka
 * Date: 26/7/12
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserTest extends TestCase {
    @Test
    public void test_gets_logged_user_status() throws Exception{
     User user= new User("111-1111","user1");
     String status="111-1111 is logged in";
        Assert.assertEquals(status,user.userlogin());
    }
}
