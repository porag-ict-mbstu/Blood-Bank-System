<%-- 
    Document   : signup
    Created on : Jul 28, 2019, 10:56:50 AM
    Author     : Porag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp Here</title>
    </head>
    <body style="background-color: #00cccc">
        <form action="registration" method="post">
            <center>
                <table border="1" width="30%" cellpadding="3">
                    <thead>
                        <tr>
                            <th colspan="2">Please fill all requirement</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>NID: </td>
                            <td><input type="text" name="nid" value=""></td>
                        </tr>
                        <tr>
                            <td>Name: </td>
                            <td><input type="text" name="name" value=""></td>
                        </tr>
                        <tr>
                            <td>Sex: </td>
                            <td><input type="text" name="sex" value=""></td>
                        </tr>
                        <tr>
                            <td>Blood Group: </td>
                            <td><input type="text" name="bloodgroup" value=""></td>
                        </tr>
                        <tr>
                            <td>Address: </td>
                            <td><input type="text" name="address" value=""></td>
                        </tr>
                        <tr>
                            <td>Phone No: </td>
                            <td><input type="text" name="phone" value=""></td>
                        </tr>
                        <tr>
                            <td>Username: </td>
                            <td><input type="text" name="username" value=""></td>
                        </tr>
                        <tr>
                            <td>Email: </td>
                            <td><input type="text" name="email" value=""></td>
                        </tr>
                        <tr>
                            <td>Password: </td>
                            <td><input type="password" name="pass" value=""></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="SignUp"></td>
                            <td><input type="reset" value="Reset"></td>
                        </tr>
                    </tbody>
                </table>
            </center>
        </form>
    </body>
</html>
