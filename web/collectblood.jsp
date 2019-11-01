<%-- 
    Document   : collectblood
    Created on : Jul 29, 2019, 9:48:55 AM
    Author     : Porag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood Collection</title>
    </head>
    <body style="background-color: #00cccc">
        <%
            if(session.getAttribute("email")==null||session.getAttribute("email")=="")
            {%>
            You are not logged in...<a href="index.jsp">Please login here</a>
                
            <%}else{%>
            
            <form action="collectblood" method="post">
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
                            <td><input type="submit" value="Collect"></td>
                            <td><input type="reset" value="Reset"></td>
                            
                        </tr>
                            </tbody>
                </table>
            </center>
        </form>
            <%}%>
            
    </body>
</html>
