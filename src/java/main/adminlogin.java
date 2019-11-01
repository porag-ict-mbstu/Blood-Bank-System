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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Porag
 */
public class adminlogin extends HttpServlet {

  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email=request.getParameter("Email");
        String pass=request.getParameter("pass");
        HttpSession session=request.getSession();
        if(email.equals("porag989@gmail.com")&&pass.equals("arp15002"))
        {
            session.setAttribute("Email",email);
            response.sendRedirect("admintask.jsp");
        }
        else
        {
            response.sendRedirect("homepage.jsp");
        }
    }

    

}
