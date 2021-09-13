<%-- 
    Document   : Registro
    Created on : 9 jul. 2021, 11:40:59
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
            <p>Datos personales</p>
            <p>Nombre: <input type="text" name="nombre" placeholder="Escribe tu nombre" required="required"></p>
            <p>Apellidos: <input type="text" name="apellido" placeholder="Escribe tu apellido" required="required"></p>
            <p>Edad: <input type="text" name="edad" placeholder="Escribe tu edad"></p>
            <p>Direccion</p>
            <p>Calle: <input type="text" name="calle" placeholder="Escribe la calle"></p>
            <p>Numero: <input type="text" name="numero" placeholder="Escribe el numero"></p>
            <p>Codigo Postal: <input type="text" name="cp" placeholder="Escribe el codigo postal"></p>
            <p>Login</p>
            <p>Nick: <input type="text" name="nick" placeholder="Escribe tu nick" required="required"></p>
            <% if(request.getParameter("password") != null && request.getParameter("cpassord") != null){
                out.print("<h3>"+request.getAttribute("mensaje")+"</h3>");
            }%>
            <p>Password: <input type="text" name="password" placeholder="Escribe una contraseña" required="required"></p>
            <p>Confirmar password: <input type="text" name="cpassword" placeholder="Vuelve a escribir la contraseña" required="required"></p>
            <input type="submit" name="boton" value="Registro">
            <input type="reset"  value="Limpiar campos">
        </form>
    </body>
</html>
