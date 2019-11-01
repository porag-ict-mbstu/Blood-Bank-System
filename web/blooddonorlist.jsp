<%-- 
    Document   : blooddonorlist
    Created on : Jul 29, 2019, 11:22:31 AM
    Author     : Porag
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="main.DonorListModel"%>
<%@page import="main.Task"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of Blood Donor</title>
    </head>
    <body style="background-color: #00cccc">
        <%
           Task task=new Task();
           List<DonorListModel>L=new ArrayList<DonorListModel>();
           L=task.readDonor();
           DonorListModel m=new DonorListModel();
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
                String a="No Blood donor Availble right now";
                    %>
                <tbody>
                        <tr>
                            <td><%=a%></td>
                        </tr>
                        
                    </tbody>
            <%
                }
            else
            {%>
            <tbody>
				                        <tr>
                            <td>NID</td>
                            <td>Name</td>
                            <td>Sex</td>
                            <td>Blood Group</td>
                            <td>Address</td>
                            <td>Phone</td>
                            <td>Username</td>
                            <td>Email</td>
                            
                            <td>Password</td>
                        </tr>
            </tbody>
            <tbody>
			<%
			   for(int i=0;i<sz;i++)
                {
                    m=L.get(i);
                 %>
                  
                    
                        <tr>
                            <td><%=m.getNid()%></td>
                            <td><%=m.getName()%></td>
                            <td><%=m.getSex()%></td>
                            <td><%=m.getBloodgroup()%></td>
                            <td><%=m.getAddress()%></td>
                            <td><%=m.getPhone()%></td>
                            <td><%=m.getUsername()%></td>
                            <td><%=m.getEmail()%></td>
                            
                            <td><%=m.getPassword()%></td>
                        </tr>
                        
                    
                    
                <%}%>
                </tbody>
                </table>
            </center>
                           
                <%}%>
            
            <a href="admintask.jsp"><b>Goto HomePage</b></a>
    </body>
</html>
