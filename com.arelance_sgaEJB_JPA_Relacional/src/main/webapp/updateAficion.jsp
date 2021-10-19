<%-- 
    Document   : updateAficion
    Created on : 16 sept. 2021, 10:29:19
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Aficion</title>
    </head>
    <body>

        <h1>Modificar Aficion:</h1>
        <form id="form" action="PostUpdateAficion">
            <c:if test="${aficion!=null}">
                <label for="nombre">nombre:</label><input id="nombre" type="text" name="nombre" value="${aficion.nombre}" onchange="comprobar()">
                <label for="descripcion">descripcion:</label><input id="descripcion" type="text" name="descripcion" value="${aficion.descripcion}" onchange="comprobar()">
            </c:if>
            <c:if test="${aficion==null}">
                <c:out value="no existe la aficion elegida"/>
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
