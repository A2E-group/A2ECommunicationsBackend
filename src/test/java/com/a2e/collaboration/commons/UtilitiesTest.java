package com.a2e.collaboration.commons;


import org.junit.Test;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class UtilitiesTest{

    @Autowired
    private Utilities utilities;

    @Test
    public void isValidEmailTest(){
        String email = "a2eCollaboration@gmail.com";
        Assert.assertTrue("email : " + email + " is  not a valid email",utilities.isValidEmail(email));
        email = "a2eCollaboration";
        Assert.assertTrue("email : " + email + " is  not a valid email",!utilities.isValidEmail(email));
        email = "a2eCollaboration@gmail";
        Assert.assertTrue("email : " + email + " is  not a valid email", !utilities.isValidEmail(email));
    }

    @Test
    public void isValidStringTest(){
        String string = "Collaboration";
        Assert.assertTrue("String : "+ string + "is not a valid string", utilities.isValidName(string));
        string = "a2e";
        Assert.assertTrue("String : "+ string + "is not a valid string", !utilities.isValidName(string));
        string = "Coll@boRat1on";
        Assert.assertTrue("String : "+ string + "is not a valid string", !utilities.isValidName(string));
    }

    @Test
    public void isNullTest(){
        Object string = null;
        Assert.assertTrue("Object is null", utilities.isNull(string));
    }

    @Test
    public void isNotNullTest(){
        String test = "collaboration";
        Assert.assertTrue("Object is not null", utilities.isNotNull(test));
    }
}
