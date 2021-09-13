<%-- 
    Document   : datospersonales
    Created on : 6 jul. 2021, 12:57:57
    Author     : Manuel
--%>

<%@page import="java.util.List"%>
<%@page import="com.arelance.holamundoweb.beans.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% List<Usuario> usuarios = (List<Usuario>) session.getAttribute("listado");%>
       
       <h4>Total de usuarios: <%=usuarios.size()%></h4>
       <%
           for (Usuario usuario : usuarios) {
               out.print("<p>" + usuario.toString() + "</p>");
            }
       %>
    </body>
</html>
