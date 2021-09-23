<%-- 
    Document   : index
    Created on : 22-sep-2021, 9:44:29
    Author     : Admin
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
            <label>valor1</label><input type="text" name="nombre">
            <label>valor2</label><input type="text" name="valor2">
            <input type="submit" name="envio">
        </form>
    </body>
</html>
