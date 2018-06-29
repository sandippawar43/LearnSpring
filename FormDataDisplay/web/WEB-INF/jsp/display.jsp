<%-- 
    Document   : display
    Created on : Jun 28, 2018, 8:22:38 AM
    Author     : Sandip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employee Data!</h1>
        <a href="emp">Add New</a>
            
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Salary</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach var="e" items="${lst}"> 
                    <tr>
                        <td>${e.id}</td>
                        <td>${e.name}</td>
                        <td>${e.address}</td>
                        <td>${e.salary}</td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
