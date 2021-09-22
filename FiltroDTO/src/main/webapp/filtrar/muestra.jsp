<%-- 
    Document   : muestra
    Created on : 22 sept. 2021, 13:17:16
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
        <h1>Hello World!</h1>
        <%
            String mostrar = (String) request.getAttribute("filtro");
        %>
        <p><%=mostrar%></p>
    </body>
</html>
