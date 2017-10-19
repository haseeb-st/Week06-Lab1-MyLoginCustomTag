/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sait.cprg352;

import Classes.User;
import Classes.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 687159
 */
public class LoginServlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        boolean loginStatus = false;
        User User = new User (user, pass);
        User.setUsername(user);
        User.setPassword(pass);
        
        UserService us = new UserService();
        
        if(us.login(user, pass, loginStatus))
        {
            if(loginStatus = true)
            {
                getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
            }
            
        }
        else
        {
            request.setAttribute("wrongValues", "Sorry, username or password is incorrect");
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
        
    }
}
