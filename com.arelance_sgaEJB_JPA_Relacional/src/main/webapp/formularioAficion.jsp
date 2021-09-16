<%-- 
    Document   : formularioAficion
    Created on : 16 sept. 2021, 10:19:39
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
        <h1>Formulario para añadir una aficion</h1>
        <form action="PreAnadirAficion" method="GET">
            <p>Nombre: <input type="text" name="nombre" placeholder="Escribe el nombre de la aficion" required="required"></p>
            <p>Descripcion: <input type="text" name="descripcion" placeholder="Escribe la descripcion de la aficion" required="required"></p>
            <input type="submit" name="boton" value="Registro">
            <input type="reset"  value="Limpiar campos">
        </form>
    </body>
</html>
