<%-- 
    Document   : logout
    Created on : Jul 28, 2019, 10:57:31 AM
    Author     : Porag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body style="background-color: #00cccc">
         <%
    if(session.getAttribute("Email")==null||session.getAttribute("Email")=="")
    {
%>
You are not logged in!!! <a href="adminlogin.jsp">Please Login</a><br></br> 
<%}else{
        session.setAttribute("Email", null);
%>
You have Successfully logout!!! <a href="index.jsp">Login Now</a>
      
    <%}%>        
    </body>
</html>


