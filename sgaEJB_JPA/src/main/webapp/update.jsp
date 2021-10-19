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
            </c:if>
            <c:if test="${persona==null}">
                <c:out value="no existe la perona seleccionada"/>
            </c:if>
            <input type="submit" id="actualizar" name=action value="actualizar" disabled="true">
            <input type="submit" id="eliminar" name=action value="eliminar">
        </form>
        <script>
            var nombre = form.nombre.value;
            function comprobar() {
                form.actualizar.disabled = (nombre == form.nombre.value);

            }
        </script>
    </body>
</html>
