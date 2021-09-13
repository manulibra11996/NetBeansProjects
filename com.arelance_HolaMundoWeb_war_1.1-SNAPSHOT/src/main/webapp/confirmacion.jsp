<%-- 
    Document   : saludo
    Created on : 6 jul. 2021, 9:43:06
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
        <p>¿Quieres borrar este usuario?</p>
        <%  
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            Integer edad = Integer.parseInt(request.getParameter("edad"));
            out.print(nombre + " " + apellido + " " + edad);
        %>
        <form name="Borrado de datos" action="./PostConfirmacion" method="GET">
            <input type="text" name="nombre" value="<%=nombre%>" hidden="hidden">
            <input type="text" name="apellido" value="<%=apellido%>" hidden="hidden">
            <input type="text" name="edad" value="<%=edad%>" hidden="hidden">
            <input type="submit" name="accion" value="confirmar">
            <input type="submit" name="accion" value="cancelar">
        </form>
    </body>
</html>
