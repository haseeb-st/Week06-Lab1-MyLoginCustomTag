/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 687159
 */
public class User 
{
    private String user;
    private String pass;

    public User(String user, String pass) 
    {
        this.user = user;
        this.pass = pass;
    }
    
    User() 
    {
        this.user = user;
        this.pass = pass;
    }
    
    public String getUsername() 
    {
        return user;
    }

    public void setUsername(String username) 
    {
        this.user = username;
    }

    public String getPassword() 
    {
        return pass;
    }

    public void setPassword(String password) 
    {
        this.pass = password;
    }
}
