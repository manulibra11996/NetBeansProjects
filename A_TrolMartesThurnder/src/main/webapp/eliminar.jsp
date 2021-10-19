<%-- 
    Document   : eliminar
    Created on : 19 oct. 2021, 19:56:23
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
         <form action="../PostEliminar" method="GET" id="formulario">
            <fieldset>
                    <label for="text">Nombre:</label>
                    <input type="text" id="nombre" value="${modificar.getEmpName()}" name="nombre" maxlength="45" readonly="readonly">
                    <label for="text">Apellido:</label>
                    <input type="text" id="apellido" value="${modificar.getEmpLastName()}" name="apellido" maxlength="45" readonly="readonly">
                    <label for="text">Salario:</label>
                    <input type="number" id="salario" value="${modificar.getEmpSalary()}"  name="salario" readonly="readonly">
                    <label for="departamento">Departamento:</label>
                    <input type="departamento" id="departamento" value="${modificar.getEmpDep()}" name="departamento" readonly="readonly">
                    <input type="submit" name="action" value="Eliminar">
                    <input type="reset" name="action" value="Limpiar">
                    <a href="../PreIndex" role="button">Volver</a>
            </fieldset>
        </form>
    </body>
</html>
