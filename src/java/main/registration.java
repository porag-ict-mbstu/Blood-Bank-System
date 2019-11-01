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
public class registration extends HttpServlet {

    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nid=request.getParameter("nid");
        String name=request.getParameter("name");
        String sex=request.getParameter("sex");
        String bloodgroup=request.getParameter("bloodgroup");
        String address=request.getParameter("address");
        String phone=request.getParameter("phone");
        String username=request.getParameter("username");
        String email=request.getParameter("email");
        String pass=request.getParameter("pass");
        DonorListModel m=new DonorListModel();
        m.setNid(nid);
        m.setName(name);
        m.setSex(sex);
        m.setBloodgroup(bloodgroup);
        m.setAddress(address);
        m.setPhone(phone);
        m.setUsername(username);
        m.setEmail(email);
        m.setPassword(pass);
        
        Task task=new Task();
        int y=task.createDonorList();
        int x=task.insertIntoDonorList(m);
        if(x==1)
        {
            response.sendRedirect("userlogin.jsp");
        }else
        {
            response.sendRedirect("signup.jsp");
        }
    }

    

}
