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
        <form action="../PostModificar" method="GET" id="formulario">
            <fieldset>
                    <label for="text">Nombre:</label>
                    <input type="text" id="nombre" value="${modificar.getEmpName()}" name="nombre" maxlength="45" required>
                    <label for="text">Apellido:</label>
                    <input type="text" id="apellido" value="${modificar.getEmpLastName()}" name="apellido" maxlength="45" required>
                    <label for="text">Salario:</label>
                    <input type="number" id="salario" value="${modificar.getEmpSalary()}"  name="salario" required>
                    <label for="departamento">Departamento:</label>
                    <input type="departamento" id="departamento" value="${modificar.getEmpDep()}" name="departamento" required>
                    <input type="submit" name="action" value="Modificar">
                    <input type="reset" name="action" value="Limpiar">
                    <a href="../PreIndex" role="button">Volver</a>
            </fieldset>
        </form>
    </body>
</html>
