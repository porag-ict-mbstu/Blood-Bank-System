<%-- 
    Document   : availableblood
    Created on : Jul 28, 2019, 3:25:39 PM
    Author     : Porag
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="main.BloodListModel"%>
<%@page import="main.Task"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Availble Blood List</title>
    </head>
    <body style="background-color: #00cccc">
        <%
            Task task=new Task();
            List<BloodListModel>L=new ArrayList<BloodListModel>();
            L=task.readBloodList();
            BloodListModel m=new BloodListModel();
            int sz=L.size();
            %>
             <center>
                <table border="1" width="30%" cellpadding="3">
                    <thead>
                        <tr>
                            <th colspan="2">Blood Details</th>
                        </tr>
                    </thead>
                    <%
            if(sz<1)
            {
                String a="No Blood Availble right now";
                    %>
                <tbody>
                        <tr>
                            <td><%=a%></td>
                        </tr>
                        
                    </tbody>
            <%
                }
            else
            {
                for(int i=0;i<sz;i++)
                {
                    m=L.get(i);
                 %>
                  
                    <tbody>
                        <tr>
                            <td><%=m.getBloodname()%></td>
                            <td><%=m.getAmount()%></td>
                        </tr>
                        
                    </tbody>
                </table>
            </center>
                    
                <%}
            }
            
                %>
            
            
            <a href="admintask.jsp"><b>Goto HomePage</b></a>
           
    </body>
</html>
