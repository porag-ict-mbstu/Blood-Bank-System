<%-- 
    Document   : admintask
    Created on : Jul 29, 2019, 11:23:15 PM
    Author     : Porag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin's Access</title>
    </head>
    <body style="background-color: #00cccc">
        <center>
                <table border="1" width="30%" cellpadding="3">
                    <thead>
                        <tr>
                            <th colspan="2">Admin Section !!!</th>
                        </tr>
                    </thead>
                    <tbody>
                       
                        <tr>
                            <td><a href="bloodavailable.jsp">Available Blood</a></td>
                        </tr>
                        <tr>
                            <td><a href="blooddonorlist.jsp">Blood Donor List</a></td>
                        </tr>
                       
                        <tr>
                            <td colspan="2"><a href="clearbloodtable.jsp">Delete Blood Details</a></td>
                        </tr>
                        <tr>
                            <td colspan="2"><a href="cleardonortable.jsp">Delete Donor Details</a></td>
                        </tr>
                        <tr>
                            <td colspan="2"><a href="adminlogout.jsp">Admin Logout</a></td>
                        </tr>
                    </tbody>
                </table>
            </center>
    </body>
</html>
