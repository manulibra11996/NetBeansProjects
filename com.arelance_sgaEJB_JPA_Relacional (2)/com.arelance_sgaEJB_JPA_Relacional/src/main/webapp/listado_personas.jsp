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
        <form id="filtroForm" action="MainServlet">
            <label for="filtro">filtro:</label> <input type="text" id=filtro name="nombre"> 
            <input type="submit" name="filtro_action" value="filtrar">
            <fieldset name="edad">edad</fieldset>
        </form>
        <h1>listado personas</h1>
        <c:forEach var="persona" items="${lista}">  
            <hr>
            <a href="PreUpdatePersona?idPersona=${persona.idPersona}"><c:out value="${persona.nombre}"/><p></a>
                <c:forEach var="aficion" items="${persona.aficiones}">  
                    <c:out value="${aficion.nombre}:-->>${aficion.descripcion}"/><br>
            </c:forEach>  
            <hr>
        </c:forEach>  
  <a href="PreUpdatePersona"><c:out value="alta"/><p></a>
  <c:out value="${'id menor:'.concat(min)}"/>
  <c:out value="${'id mayor:'.concat(max)}"/>
  <c:out value="${'total personas:'.concat(total)}"/>
  <c:out value="${'promedio edad:'.concat(media)}"/>
    <c:forEach var="aficion" items="${aficiones}">  
            <hr>
                     <c:out value="${aficion}"/><br>
            
            <hr>
        </c:forEach>  
  aficiones
    </body>
</html>
