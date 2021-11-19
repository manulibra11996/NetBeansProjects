<%-- 
    Document   : registro
    Created on : 08-oct-2021, 12:21:07
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    
    <body class="text-center">
        <%@include file="./jsf/headernav.jspf"%>
            <div id="registro">

            <div class="container">
                <div id="registro-row" class="row justify-content-center align-items-center">
                    <div id="registro-column" class="col-md-6">
                        <div id="registro-box" class="col-md-12">
                            <h3 class="text-center text-info">Datos de registro</h3>
                            <form id="registro-form" class="form" action="./PostRegistroServlet" method="GET">
                                <div class="registro-group justify-content-center">
                                    <label for = "nombre" class =" text-info">Nombre</label><br>
                                    <input type="text" name="nombre" id="nombre" class="form-control" required><br>
                                    <label for = "apellido" class = "text-info">Apellido</label>
                                    <input type="text" name="apellido" id="apellido" class="form-control" required><br>
                                    <label for="email" class="text-info">Email</label><br>
                                    <input type="email" name="email" id="email" class="form-control" required><br>
                                    <label for="password" class="text-info">Password:</label><br>
                                    <input type="password" name="password" id="password" class="form-control" required>
                                    <input type="submit" class="text-info" name="actionLogin" value="Registrarse">
                                    <input type ="reset" class="text-info" name="actionLogin" value="Limpiar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
         <%@include file="./jsf/footer.jspf"%>
    </body>
</html>
