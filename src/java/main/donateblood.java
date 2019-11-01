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
public class donateblood extends HttpServlet {

   

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
                String bloodgroup=request.getParameter("bloodgroup");
                String packet=request.getParameter("packet");
                //out.println(packet);
                if(packet.equals(""))packet="0";
                //out.println(packet);
                Task task=new Task();
                 
                int x=task.createBloodList();
                //out.println(x);
                boolean y=task.checkBloodName(bloodgroup);
                String amount=task.getAmount(bloodgroup);
                x=Integer.parseInt(amount)+Integer.parseInt(packet);
                //out.println(x);
                amount=String.valueOf(x);
                BloodListModel m=new BloodListModel();
                m.setBloodname(bloodgroup);
                m.setAmount(amount);
               
                if(y==false)
                {
                    int t=task.insertIntoBloodList(m);
                    out.println("You have successfully donated blood");
                    //out.println("<a href='homepage.jsp'>Homepage</a>");
                    //response.sendRedirect("homepage.jsp");
                }
                else
                {
                    x=task.updateBloodList(amount, bloodgroup);
                    out.println("You have successfully donated blood");
                    //out.println("<a href='/homepage.jsp'>Homepage</a>");
                    response.sendRedirect("homepage.jsp");
                }
                
    }


}
