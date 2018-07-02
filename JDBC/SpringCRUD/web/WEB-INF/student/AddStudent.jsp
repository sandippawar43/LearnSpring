
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Student Form</h2>
        <form:form action="add" method="post">
            
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
                 <
            </tr>
        </table>
      </form:form>
       
        <h2>${msg}</h2>
        <hr/>
        
        <table border="1">
            <thead>
                <tr>
                    <td>Roll No</td>
                    <td>Name</td>
                    <td>Address</td>
                    <td>Mobile</td>

                </tr>
            </thead>
            <tbody>
                <c:forEach var="s" items="${lst}">
                 <tr>
                    <td>${s.rno}</td>
                    <td>${s.name}</td>
                    <td>${s.address}</td>
                    <td>${s.mobile}</td>

                 </tr>

                </c:forEach>
            </tbody>
                
        </table>
    </body>
</html>
