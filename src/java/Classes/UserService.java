/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.servlet.http.HttpSession;

import java.io.IOException;
import javafx.util.Pair;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 687159
 */
public class UserService 
{
    User us = new User();
    String user = us.getUsername();
    String pass = us.getPassword();
    boolean loginStatus = false;
    public static boolean login(String user, String pass, boolean loginStatus)
    {
        String Username1 = "Adam";
        String Username2 = "Betty";
        String password      = "password";
        
        if(user == null || pass == null )
        {
            System.out.println("Please enter your username or password");
            return loginStatus = false;
        }
        else if(user.isEmpty() || pass.isEmpty())
        {
            System.out.println("Please enter your username or password");
            return loginStatus = false;
        }
        else if(user.equals(Username1) || pass.equals(password))
        {
            System.out.println("Welcome Adam!");
            return loginStatus = true;
        }
        else if(user.equals(Username2) || pass.equals(password))
        {
            System.out.println("Welcome Betty!");
            return loginStatus = true;
        }
        else
        {
            System.out.println("Please enter the correct username or password");
        }
        return loginStatus = true;
    }
}
