<%-- 
    Document   : clearbloodtable
    Created on : Jul 30, 2019, 10:48:30 AM
    Author     : Porag
--%>

<%@page import="main.Task"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood Table Clearing</title>
    </head>
    <body style="background-color: #00cccc">
        <%
            Task task=new Task();
            int x=task.clearTableList("bloodlist");
            
            %>
            <script type="text/javascript">
                alert("Table Successfully clear!!!");
                
            </script>
            <%
            response.sendRedirect("admintask.jsp");
            %>
    </body>
</html>
