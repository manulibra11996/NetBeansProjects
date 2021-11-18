<%-- 
    Document   : index
    Created on : 16 nov. 2021, 9:51:47
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
        <h1>Pon tu nombre y apellido</h1>
         <form action="ControllerServlet">
            <label for="text">Nombre</label><input  type="text" id="nombre" name="nombre">
            <label for="text">Apellido</label><input  type="text" id="apellido" name="apellido">
            <input type="submit" value="enviar"/>
        </form>
    </body>
</html>
