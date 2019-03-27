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
public class Response 
{
    private String url = "http://";
    public void sendRedirect(String url)
    {
        this.url = url;
    }
    
    public String getURL()
    {
        return url;
    }
}
