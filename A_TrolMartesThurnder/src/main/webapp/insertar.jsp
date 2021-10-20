<%-- 
    Document   : insertar
    Created on : 20 oct. 2021, 10:01:36
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
        <form action="PostInsertar" method="GET" id="formulario">
            <p for="text">Nombre:
            <input type="text" id="nombre" placeholder="Manuel" name="nombre" maxlength="45" required></p>
            <p for="text">Apellido:
            <input type="text" id="apellido" placeholder="Gonzalez" name="apellido" maxlength="45" required></p>
            <p for="text">Salario:
            <input type="number" id="salario" placeholder="30"  name="salario" required></p>
            <p for="departamento">Departamento:
            <input type="departamento" id="departamento" placeholder="Dep4" name="departamento" required></p>
            <input type="submit" name="action" value="Insertar">
            <input type="reset" name="action" value="Limpiar">
            <a href="PreIndex">Volver</a>
        </form>
    </body>
</html>
