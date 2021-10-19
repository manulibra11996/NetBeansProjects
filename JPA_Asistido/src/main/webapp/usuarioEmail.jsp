<%-- 
    Document   : usuarioID
    Created on : 14 sept. 2021, 9:17:30
    Author     : Manuel
--%>

<%@page import="com.arelance.sgajpa.domain.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Buscando la persona con email</h1>
        <%
            Persona personaEncontrada = (Persona) request.getAttribute("personaEncontrada");
        %>
        <p><%=personaEncontrada.getNombre()%></p>
    </body>
</html>
