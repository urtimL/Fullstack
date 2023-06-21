package Homework.Ait.HW24User.Test;

import Homework.Ait.HW24User.Model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    User user;
    final String email = "peter@gmail.com";
    final String password = "12345Az!";

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testValidPassword(){
        String validPassword = "qwertY1@";
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword());
    }

    @Test
    void testPasswordLength(){
        String inValidPassword = "wertY1@";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordUppercase(){
        String inValidPassword = "qwerty1@";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordLowercase(){
        String inValidPassword = "QWERTY1@";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordDigits(){
        String inValidPassword = "qwertYa@";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordSpecialSymbols(){
        String inValidPassword = "qwertY12";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    //-----------------Homework 24----------------------------

    @Test
    void testValidEmail(){
        String validEmail = "validEmailTest@gmail.com";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());
    }

    @Test
    void testInavlidEmail1(){
        // without @
        String validEmail = "petergmail.com";
        user.setEmail(validEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testInavlidEmail2(){
        // more than one @
        String validEmail = "peter@gma@il.com";
        user.setEmail(validEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testInavlidEmail3(){
        // without .
        String validEmail = "peter@gmailcom";
        user.setEmail(validEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testInavlidEmail4(){
        // . in the end of email
        String validEmail = "peter@gmail.com.";
        user.setEmail(validEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testInavlidEmail5(){
        // not allowed character ~
        String validEmail = "peter@gmail~.com";
        user.setEmail(validEmail);
        assertEquals(email, user.getEmail());
    }
}