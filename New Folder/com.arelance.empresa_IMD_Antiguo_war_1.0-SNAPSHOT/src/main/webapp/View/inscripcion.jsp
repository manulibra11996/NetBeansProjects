<%-- 
    Document   : inscripcion
    Created on : 09-sep-2021, 18:05:34
    Author     : lenovo
--%>

<%@page import="com.arelance.empresa.imd.domain.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <%@include file = "../JSPF/inscripcion.jspf"%>
        <%@include file = "../JSPF/login.jspf"%>
        <title>Inscripción</title>
    </head>
    <body> 
        <header>
            <nav class="navbar navbar-expand-sm bg-info navbar-info">     
                <a class="navbar-brand" href="PreIndexServlet">IMD</a> 
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <% if (request.getSession().getAttribute("cliente") != null) {
                                Cliente cliente = (Cliente) request.getSession().getAttribute("cliente");
                        %>
                        <a class="nav-link"><%=cliente.getNick()%></a>
                        <%} else {%>
                        <a class="nav-link" href="PreRegistroServlet">Registro</a>
                        <%}%>
                    </li>
                    <li class="nav-item">
                        <% if (request.getSession().getAttribute("cliente") != null) {%>
                        <a class="nav-link" href="CierreSesion">Cerrar sesion</a>
                        <%} else {%>
                        <a class="nav-link" href="PreLoginServlet">Iniciar sesión</a>
                        <%}%>
                    </li>          
                </ul>
            </nav>
        </header>
        <br>
        <div class="container">
            <table class="table">
                <thead class="thead-info">
                    <tr>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Precio</th>
                        <th>Dia de la semana</th>
                        <th>Hora de inicio</th>
                        <th>Hora de fín</th>
                        <th>Entrenador</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>${actividad.getNombre()}</td>
                        <td>${actividad.getDescripcion()}</td>
                        <td>${actividad.getPrecio()}&#8364;</td>
                        <td>${actividad.getDiaSemana()}</td>
                        <td>${actividad.getHoraInicio()}</td>
                        <td>${actividad.getHoraFin()}</td>
                        <td>${actividad.getEntrenador()}</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <% if (request.getSession().getAttribute("cliente") != null) { %>
        <form action="PostPagoTarjeta" method="GET" id="tarjeta">
            <fieldset>
                <legend>Pago por tarjeta:</legend>
                <label for="text">Número:</label>
                <input type="number" class="form-control" id="numeroTarjeta" placeholder="1234567891234567" name="numeroTarjeta" pattern="[0-9]{16}">
                <label for="text">Fecha caducidad</label>
                <input type="text" class="form-control" id="Fecha_caducidad" placeholder="03/25" name="Fecha_caducidad" maxlength="5">
                <label for="text">CVV</label>
                <input type="number" class="form-control" id="CVV" placeholder="583" pattern="[0-9]{3}" name="CVV">
                <input type="hidden" class="form-control" id="id_actividad" name="id_actividad" value="${actividad.getIdActividad()}">
                <input type="submit" class="btn btn-info"name="action"value="Continuar">
                <input type="reset"class="btn btn-info"name="action"value="Limpiar">
                <a href="../PreIndexServlet" class="btn btn-info"role="button">Volver</a>
            </fieldset>
        </form>
        <form action="PostPagoTransferencia" method="GET" id="transferencia">
            <legend>Pago por transferencia:</legend>
            <label for="iban">IBAN:</label>
            <input type="text" class="form-control" id="iban" placeholder="1234567891234567" name="iban" pattern="[0-9]{16}">
            <label for="concepto">Copcepto de pago:</label>
            <input type="text" class="form-control" id="concepto" placeholder="pago deporte" name="concepto">
            <input type="hidden" class="form-control" id="id_actividad" name="id_actividad" value="${actividad.getIdActividad()}">
            <input type="submit" class="btn btn-info"name="action"value="Continuar">
            <input type="reset"class="btn btn-info"name="action"value="Limpiar">
            <a href="../PreIndexServlet" class="btn btn-info"role="button">Volver</a>
        </div>
    </fieldset>
</form>
<% }%>
</body>
</html>
