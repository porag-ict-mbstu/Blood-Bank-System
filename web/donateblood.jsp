<%-- 
    Document   : donateblood
    Created on : Jul 28, 2019, 9:52:19 PM
    Author     : Porag
--%>

<%@page import="main.BloodListModel"%>
<%@page import="main.Task"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood Donation is in progress</title>
    </head>
    <body style="background-color: #00cccc">
        <%
            if(session.getAttribute("email").equals("")||session.getAttribute("email")==null)
            {%>
            You are not logged in...<a href="userlogin.jsp">Please login here</a>
                
            <%}
            else
            {%>
                
            <form action="donateblood" method="post">
                <center>
                <table border="1" width="30%" cellpadding="3">
                    <thead>
                        <tr>
                            <th colspan="2">Please fill all requirement</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Blood Group: </td>
                            <td><input type="text" name="bloodgroup" value=""></td>
                        </tr>
                        <tr>
                            <td>Number of packet: </td>
                            <td><input type="text" name="packet" value=""></td>
                        </tr>
                        <tr>
                            <tr>
                            <td><input type="submit" value="Donate"></td>
                            <td><input type="reset" value="Reset"></td>
                            
                        </tr>
                            </tbody>
                </table>
            </center>
            </form>
            
            <%}%>
            
    </body>
</html>
