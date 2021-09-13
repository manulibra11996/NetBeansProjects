<%-- 
    Document   : index
    Created on : 15 jul. 2021, 10:55:38
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%if(request.getSession().getAttribute("nick") == null){  
        %>
            <%@include file="./login.jspf" %>
        <%}else{%>
            <%@include file="./logeado.jspf" %>
        <%}%>
        
        <%@include file="./ofertas.jspf" %>
    </body>
</html>
