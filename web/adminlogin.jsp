<%-- 
    Document   : donorlist
    Created on : Jul 29, 2019, 11:12:52 AM
    Author     : Porag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign in As Admin</title>
    </head>
    <body style="background-color: #00cccc">
        <form action="adminlogin" method="post">
            <center>
                <table border="1" width="30%" cellpadding="3">
                    <thead>
                        <tr>
                            <th colspan="2">Admin Login</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Email</td>
                            <td><input type="text" name="Email" value=""></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="pass" value=""></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Login"></td>
                            <td><input type="reset" value="Reset"></td>
                        </tr>
                    </tbody>
                </table>
            </center>
        </form>
    </body>
</html>
