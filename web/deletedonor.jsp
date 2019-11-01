<%-- 
    Document   : index
    Created on : Jul 28, 2019, 10:28:28 AM
    Author     : Porag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body style="background-color: #00cccc">
        
        <form action="deletedonor" method="post">
            <center>
                <table border="1" width="30%" cellpadding="3">
                    <thead>
                        <tr>
                            <th colspan="2">Remove Myself</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>NID</td>
                            <td><input type="text" name="nid" value=""></td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td><input type="text" name="email" value=""></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="pass" value=""></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Confirm"></td>
                            <td><input type="reset" value="Reset"></td>
                            <td><a href="homepage.jsp">Homepage</a></td>
                        </tr>
                        
                    </tbody>
                </table>
            </center>
        </form>
    </body>
</html>
