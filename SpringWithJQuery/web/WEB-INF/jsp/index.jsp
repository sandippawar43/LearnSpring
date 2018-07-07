<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/css/bootstrap.min.css"></c:url>" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.min.js"></c:url>"></script>
<script>
    $(document).ready(function(){
        $("#numBtn").click(function(){
            
            var val1 = $("#num1").val();
            var val2 = $("#num2").val();
            $("#msg").html(val1 +"<br>"+ val2);
            $.get("/SpringWithJQuery/math/"+val1+"/"+val2,function(resp){
                $("#mult").html(resp);
            })
        });
    });
</script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <input type="text" id="num1">
        <input type="text" id="num2">
        <input type="button" value="Submit" class="btn btn-primary" id="numBtn">
        <br>
        <h3 id="msg"</h3><br>
        
        <h3 id="mult"</h3>
    </body>
</html>
