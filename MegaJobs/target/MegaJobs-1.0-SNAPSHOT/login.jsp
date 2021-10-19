<%-- 
    Document   : login
    Created on : 15 jul. 2021, 12:06:50
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
        <h1>Inicio de sesion</h1>
        <% if(request.getAttribute("mensaje") != null){
           out.print("<h3>"+request.getAttribute("mensaje")+"</h3>");
       }%>
        <form action="./PostLogin" method="GET">
            <p>Nick: <input type="text" name="nick" placeholder="Escribe tu nick" required="required"></p>
            <p>Password: <input type="password" name="password" placeholder="Escribe una contraseña" required="required"></p>
            <input type="submit" name="boton" value="Login">
            <input type="reset"  value="Limpiar campos">
        </form>
    </body>
</html>
