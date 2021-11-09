<%-- 
    Document   : registro2
    Created on : 07-sep-2021, 16:34:33
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <title>Registro</title>
        <%@include file = "../JSPF/datospersonales.jspf"%>
    </head>
    <body>
        <h3>Cada día numerosos grupos de personas disfrutan de nuestras actividades.<br>
            ¡Forma parte de nosotros para disfrutar también!</h3>

        <form action="http://localhost:8080/AppWebActividades/PostRegistroServlet" method="GET" id="formulario">
            <fieldset>
                    <legend>Datos personales:</legend>
                    <label for="text">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" placeholder="Agustín" name="nombre" maxlength="30" required>
                    <label for="text">Apellido:</label>
                    <input type="text" class="form-control" id="apellido" placeholder="Rodríguez" name="apellido" maxlength="30" required>
                    <label for="tlf">Teléfono:</label>
                    <input type="tlf" class="form-control" id="tlf" placeholder="+34743618904"pattern="[0-9]{9}" name="tlf" required>
                    <label for="email">Email:</label>
                    <input type="email" class="form-control" id="email" placeholder="Agustin98@gmail.com" name="email" required>
                    <legend>Datos login:</legend>
                    <label for="nick">Nick:</label>
                    <input type="text" class="form-control" id="nick" placeholder="Amr98" name="nick" required>
                    <label for="psw">Contraseña:</label>
                    <input type="password" class="form-control" id="psw" placeholder="amr12345" name="pass" required>
                    <label for="pswc">Confirmar contraseña:</label>
                    <input type="password" class="form-control" id="pswc" placeholder="amr12345" name="passconfirm" required>
                    <input type="submit" class="btn btn-info"name="action"value="Continuar">
                    <input type="reset"class="btn btn-info"name="action"value="Limpiar">
                    <a href="../PreIndexServlet"class="btn btn-info"role="button">Volver</a>
            </fieldset>
        </form>
        <br>
        <span>${NickMsg}</span>
        <span>${TlfMsg}</span>
        <span>${EmailMsg}</span>
        <span>${PassMsg}</span>
    </body>
</html>
