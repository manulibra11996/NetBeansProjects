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
        <form method="get" action="MainServlet">
            <label>Nombre</label><input type="text" name="valor1">
            <label>Minimo</label><input type="text" name="valor2">
            <label>Maximo</label><input type="text" name="valor3">
            <input type="submit" name="enviar" value="enviar">
        </form>
            
    </body>
    
</html>
