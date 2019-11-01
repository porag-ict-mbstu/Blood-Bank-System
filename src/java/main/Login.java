package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email=request.getParameter("email");
        String pass=request.getParameter("pass");
        Task task=new Task();
        boolean x=task.checkValidity(email, pass);
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        if(x==true)
        {
            session.setAttribute("email",email);
            response.sendRedirect("homepage.jsp");
        }
        else
        {
            /*
            out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"	<title></title>\n" +
"</head>\n" +
"<body>\n" +
"	<script type=\"text/javascript\">\n" +
"		alert(\"Login Fail???\");\n" +
"	</script>\n" +
"\n" +
"</body>\n" +
"</html>");
                    */
            response.sendRedirect("userlogin.jsp");
        }
    }


}
