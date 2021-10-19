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
        <form name="Datos personales" action="./PostDatosPersonales" method="GET">
            <p>Nombre: <input type="text" name="nombre"></p>
            <p>Apellido: <input type="text" name="apellido"></p>
            <p>Edad: <input type="text" name="edad"></p>
            <input type="submit" name="accion" value="alta">
            <input type="submit" name="accion" value="baja">
        </form>
        <% List<Usuario> usuarios = (List<Usuario>) session.getAttribute("listado");%>

        <h4>Total de usuarios: <%=usuarios.size()%></h4>
    </body>
</html>
