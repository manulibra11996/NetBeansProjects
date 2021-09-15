<%-- 
    Document   : listado_personas
    Created on : 11 sept. 2021, 20:17:10
    Author     : salvador
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>listado personas</title>
    </head>
    <body>
        <h1>listado personas</h1>
        <c:forEach var="persona" items="${lista}">  
            <a href="PreActualizar?id=<c:out value="${persona.idPersona}"/>"><c:out value="${persona.nombre}"/></a><a href="PreBorrar?id=<c:out value="${persona.idPersona}"/>">
                    Borrar<br /></a> 
        </c:forEach>  
        <a href="PreBusquedaID">Buscando a Maria por id</a>
        <br />
        <a href="PreBusquedaEmail">Buscando a Maria por email</a>
        <br />
        <a href="formulario.jsp">Añadir usuario</a>
    </body>
</html>
