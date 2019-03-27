/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlpackage;

import java.io.IOException;

/**
 *
 * @author Chris
 */

public class Redirect 
{     
    String[] whitelist;
        
public Redirect()
{

    whitelist = new String[2];
    whitelist[0] = "http://www.abcbank.com/";
    whitelist[1] = "http://www.abcbank.com/login"; 
    
}
    
    protected void doGet(Request request, Response response) throws IOException 
    { 
    String query = request.getQueryString();
            System.out.println("Request: " + query);
            

        if (checkWhitelist(query)) 
        {
            String url = request.getParameter("http://abcbank.com/redirect?url=http://abcbank.com.attacker.example.net");
            response.sendRedirect(url);
            System.out.println("Matching whitelist query found...Redirecting.");

        }
        else
        {
            System.out.println("No matching query found. Redirect Rejected.");
        }
            System.out.println("Response: " + response.getURL());

    }
    
    
    boolean checkWhitelist(String q)
    {
        for(int i = 0; i < whitelist.length; i++)
        {
            if(q.contentEquals(whitelist[i]))
            { 
                return true;
            }
        }
        
        return false;
    }
}
