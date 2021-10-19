<%-- 
    Document   : actualizar
    Created on : 14 sept. 2021, 12:07:01
    Author     : Manuel
--%>

<%@page import="com.arelance.sgajpa.domain.Persona"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          Persona personaEncontrada = (Persona) request.getAttribute("personaEncontrada");
        %>
        <h1>Actualizar usuario</h1>
        <form action="PostActualizar" method="GET">
            <input type="hidden" name="id" value="<%=personaEncontrada.getIdPersona()%>">
            <p>Nombre: <input type="text" name="nombre" value="<%=personaEncontrada.getNombre()%>" required="required"></p>
            <p>Apellidos: <input type="text" name="apellido" value="<%=personaEncontrada.getApellido()%>" required="required"></p>
            <p>Email: <input type="text" name="email" value="<%=personaEncontrada.getEmail()%>" required="required"></p>
            <p>Telefono: <input type="text" name="telefono" value="<%=personaEncontrada.getTelefono()%>" required="required"></p>
            <input type="submit" name="boton" value="Actualizar">
            <input type="reset"  value="Limpiar campos">
        </form>
    </body>
</html>
