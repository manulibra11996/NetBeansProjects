<%-- 
    Document   : update
    Created on : 14 sept. 2021, 19:35:29
    Author     : salvador
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Persona</title>
    </head>
    <body>
        <h1>Modificar Persona:</h1>
        <form id="form" action="PostUpdatePersona">
            <c:if test="${persona!=null}">
                <label for="nombre">nombre:</label><input id="nombre" type="text" name="nombre" value="${persona.nombre}" onchange="comprobar()">
                <label for="apellido">apellido:</label><input id="apellido" type="text" name="apellido" value="${persona.apellido}" onchange="comprobar()">
                <label for="email">email:</label><input id="email" type="text" name="email" value="${persona.email}" onchange="comprobar()">
                <label for="telefono">telefono:</label><input id="telefono" type="text" name="telefono" value="${persona.telefono}" onchange="comprobar()">
            </c:if>
            <c:if test="${persona==null}">
                <c:out value="no existe la perona seleccionada"/>
            </c:if>
            <input type="submit" id="actualizar" name=action value="actualizar" >
            <input type="submit" id="eliminar" name=action value="eliminar">
        </form>
        <script>
            var nombre = form.nombre.value;
            function comprobar() {
                form.actualizar.disabled = (nombre === form.nombre.value);

            }
        </script>
    </body>
</html>
