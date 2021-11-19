<%-- 
    Document   : login
    Created on : 06-oct-2021, 12:23:50
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
    </head>
    <body>
        <%@include file="./jsf/headernav.jspf"%>
        <h2 class="text-center text-white pt-5">Inicio de sesion</h2>

        <div id="login">

            <div class="container">
                <div id="login-row" class="row justify-content-center align-items-center">
                    <div id="login-column" class="col-md-6">
                        <div id="login-box" class="col-md-12">
                            <h3 class="text-center text-info">Login</h3>
                            <form id="login-form" class="form" action="./PostLoginServlet" method="GET">
                                <div class="form-group">
                                    <label for="email" class="text-info">Email</label><br>
                                    <input type="email" name="email" id="email" class="form-control" required><br>
                                    <label for="password" class="text-info">Password:</label><br>
                                    <input type="password" name="password" id="password" class="form-control" required>
                                    <input type="submit" class="text-info" name="actionLogin" value="Identificate">
                                    <input type ="reset" class="text-info" name="actionLogin" value="Borrar">
                                </div>
                            </form>
                        </div>
                        ${msg}
                    </div>
                </div>
            </div>
        </div>
         <%@include file="./jsf/footer.jspf"%>
    </body>
</html>
