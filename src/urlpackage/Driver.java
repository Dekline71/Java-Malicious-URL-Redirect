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
public class Driver 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Redirect redirect = new Redirect();
        Request request = new Request();
        Response response = new Response();
        try
        {
            redirect.doGet(request, response);
        }
        catch(IOException e)
        {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }
    
}
