/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlpackage;

/**
 *
 * @author Chris
 */
public class Request 
{
    // URL for GET Request
    private String request = "http://abcbank.com/redirect?url=http://abcbank.com.attacker.example.net";
    
public String getQueryString()
{
    return request;
}

public String getParameter(String url)
{
    return url;
}
    
}
