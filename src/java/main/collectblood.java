/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Porag
 */
public class collectblood extends HttpServlet {

   
    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String bloodgroup=request.getParameter("bloodgroup");
        String packet=request.getParameter("packet");
        if(packet.equals(""))packet="0";
        Task task=new Task();
        String x=task.getAmount(bloodgroup);
        int total=Integer.parseInt(x)-Integer.parseInt(packet);
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
         
        if(total>-1)
        {
            total=task.updateBloodList(String.valueOf(total), bloodgroup);
            out.println("You have successfully collected blood");
            //out.println("<a href='/homepage.jsp'>Homepage</a>");
            response.sendRedirect("homepage.jsp");
        }
        else
        {
            out.println("We have not enough blood as you want.");
            //out.println("<a href='/homepage.jsp'>Homepage</a>");
            response.sendRedirect("homepage.jsp");
        }
        
    }

    
}
