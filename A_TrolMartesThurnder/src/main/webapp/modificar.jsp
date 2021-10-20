<%-- 
    Document   : modificar
    Created on : 19 oct. 2021, 19:42:52
    Author     : manul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="PostModificar" method="GET" id="formulario">
            <input type="text" id="id" value="${modificar.getIdempleado()}" name="id" hidden="hidden">
            <p for="text">Nombre:
                <input type="text" id="nombre" value="${modificar.getEmpName()}" name="nombre" maxlength="45" required></p>
            <p for="text">Apellido:
                <input type="text" id="apellido" value="${modificar.getEmpLastName()}" name="apellido" maxlength="45" required></p>
            <p for="text">Salario:
                <input type="number" id="salario" value="${modificar.getEmpSalary()}"  name="salario" required></p>
            <p for="departamento">Departamento:
                <input type="departamento" id="departamento" value="${modificar.getEmpDep()}" name="departamento" required></p>
            <input type="submit" name="action" value="Modificar">
            <input type="reset" name="action" value="Limpiar">
            <a href="PreIndex">Volver</a>
        </form>
    </body>
</html>
