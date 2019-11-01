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
public class deletedonor extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email=request.getParameter("email");
        String pass=request.getParameter("pass");
        String nid=request.getParameter("nid");
        Task task=new Task();
        boolean x=task.checkDonor(nid,email,pass);
        if(x)
        {
            int t=task.deleteDonorfromDonorList(email, pass);
            response.sendRedirect("homepage.jsp.jsp");
        }
    }

    

}
