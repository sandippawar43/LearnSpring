<%-- 
    Document   : EditStudent
    Created on : Jul 4, 2018, 8:14:22 AM
    Author     : Sandip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Update Student Form</h2>
        <form:form action="/SpringCRUD/save" method="post">
            <table>
                <tr>
                    <td>Roll No</td>
                    <td><form:input path="rno"></form:input></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><form:input path="name"></form:input></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><form:input path="address"></form:input></td>
                    </tr>
                    <tr>
                        <td>Mobile Number</td>
                        <td><form:input path="mobile"></form:input></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit"></td>
                    </tr>
                </table>
        </form:form>

    </body>
</html>
