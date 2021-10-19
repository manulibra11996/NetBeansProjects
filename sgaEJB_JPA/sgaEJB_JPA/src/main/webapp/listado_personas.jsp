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
            <c:out value="${persona.nombre}"/><p>  
            </c:forEach>  

    </body>
</html>
