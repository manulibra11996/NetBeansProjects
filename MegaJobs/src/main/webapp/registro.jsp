<%-- 
    Document   : registro
    Created on : 15 jul. 2021, 12:06:28
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
       <h1>Registro</h1>
       <form action="./PostRegistro" method="GET">
            <% if(request.getAttribute("mensaje") != null){
                out.print("<h3>"+request.getAttribute("mensaje")+"</h3>");
            }%>
            <p>Nick: <input type="text" name="nick" placeholder="Escribe tu nick" required="required"></p>
            <% if(request.getAttribute("mensajePassword") != null){
                out.print("<h3>"+request.getAttribute("mensajePassword")+"</h3>");
            }%>
            <p>Password: <input type="password" name="password" placeholder="Escribe una contraseña" required="required"></p>
            <p>Confirmar password: <input type="password" name="cpassword" placeholder="Vuelve a escribir la contraseña" required="required"></p>
            <input type="submit" name="boton" value="Registro">
            <input type="reset"  value="Limpiar campos">
        </form>
    </body>
</html>
