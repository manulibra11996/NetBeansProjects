<%-- 
    Document   : index
    Created on : 22 sept. 2021, 10:34:21
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="MainServlet" method="get">
            <label>Nombre</label><input type="text" name="valor1" id="valor1">
            <label>Minimo</label><input type="text" name="valor2" id="valor2">
            <label>Maximo</label><input type="text" name="valor3" id="valor3">
            <input type="submit" name="enviar" value="enviar" id="enviar">
        </form>

    </body>

</html>
