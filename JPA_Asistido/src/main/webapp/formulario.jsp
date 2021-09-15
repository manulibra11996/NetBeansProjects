<%-- 
    Document   : formulario
    Created on : 14 sept. 2021, 11:43:28
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
        <h1>Formulario para añadir un usuario</h1>
        <form action="PreInsersion" method="GET">
            <p>Nombre: <input type="text" name="nombre" placeholder="Escribe tu nombre" required="required"></p>
            <p>Apellidos: <input type="text" name="apellido" placeholder="Escribe tu apellido" required="required"></p>
            <p>Email: <input type="text" name="email" placeholder="Escribe tu correo electronico" required="required"></p>
            <p>Telefono: <input type="text" name="telefono" placeholder="Escribe tu telefono" required="required"></p>
            <input type="submit" name="boton" value="Registro">
            <input type="reset"  value="Limpiar campos">
        </form>
    </body>
</html>
