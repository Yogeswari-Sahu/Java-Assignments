<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.io.*,java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
   // Get session creation time.
   Date createTime = new Date(session.getCreationTime());
   // Get last access time of this web page.
   Date lastAccessTime = new Date(session.getLastAccessedTime());

   String title = "Welcome Back to my website";
   Integer visitCount = new Integer(0);
   String visitCountKey = new String("visitCount");
   String userIDKey = new String("userID");
   String userID = new String("Yogeswari Sahu");

   // Check if this is new comer on your web page.
   if (session.isNew())
   {
      title = "Welcome to my website";
      session.setAttribute(userIDKey, userID);
      session.setAttribute(visitCountKey,  visitCount);
   }
   visitCount = (Integer)session.getAttribute(visitCountKey);
   visitCount = visitCount + 1;
   userID = (String)session.getAttribute(userIDKey);
   session.setAttribute(visitCountKey,  visitCount);
%>
<html>
    <head>
        <title>Session Tracking</title>
    </head>
    <body>
        <center>
            <h1>Session Tracking using JSP YOGESWARI SAHU 18BCE0928 26-05-2021</h1>
        </center>
        <table border="1" align="center">
            <tr bgcolor="blue">
                <th>Session info</th>
                <th>Value</th>
            </tr>
            <tr >
                <td>id</td>
                <td><% out.print( session.getId()); %></td>
            </tr>
            <tr>
                <td>Creation Time</td>
                <td><% out.print(createTime); %></td>
            </tr>
            <tr>
                <td>Time of Last Access</td>
                <td><% out.print(lastAccessTime); %></td>
            </tr>
            <tr>
                <td>User ID</td>
                <td><% out.print(userID); %></td>
            </tr>
            <tr>
                <td>Number of visits</td>
                <td><% out.print(visitCount); %></td>
            </tr>
        </table>
    </body>
</html>

