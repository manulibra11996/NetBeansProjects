<%-- 
    Document   : comprobacion
    Created on : 16 nov. 2021, 10:08:57
    Author     : manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>¿Quieres enviar estos datos?</h1>
        <label>Nombre:</label> <p>${ComprobarTest.comprobarBeanLocal.nombre}</p>
        <label>Apellido:</label> <p>${ComprobarTest.comprobarBeanLocal.apellido}</p>
         <form action="ComprobadorSerlet" method="GET">
            <input type="submit"name="action"value="Si">
            <input type="submit"name="action"value="No">
            <input type="hidden"name="nombre" value="${ComprobarTest.comprobarBeanLocal.nombre}">
            <input type="hidden"name="apellido"value="${ComprobarTest.comprobarBeanLocal.nombre}">
        </form>
    </body>
</html>
