package com.example.macbook13.jenkinstest;



import org.junit.Assert;
import org.junit.Test;

/**
 * Created by macbook13 on 09/06/16.
 */


public class UserTest {
    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }

}
