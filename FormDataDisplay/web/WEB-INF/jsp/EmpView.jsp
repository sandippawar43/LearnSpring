

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employee View</h1>
        <form:form  action="save" method="post">
             <table>
            <tr>
                <td>Employee ID</td>
                <td><form:input path="id"></form:input></td>
            </tr>
             <tr>
                <td>Employee Name</td>
                <td><form:input path="name"></form:input></td>
            </tr>
             <tr>
                <td>Employee Address</td>
                <td><form:input path="address"></form:input></td>
            </tr>
             <tr>
                <td>Employee Salary</td>
                <td><form:input path="salary"></form:input></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"></td>
            </tr>
        </table>
        </form:form>
    </body>
</html>
