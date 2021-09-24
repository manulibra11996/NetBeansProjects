<%-- 
    Document   : muestra
    Created on : 22 sept. 2021, 13:17:16
    Author     : Manuel
--%>

<%@page import="com.arelance.filtrodto.dtos.Filtro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
             Object aux = request.getAttribute("filtro");
            if(aux != null){
            Filtro fx = (Filtro) aux;
            fx.execute();
                out.print(fx.getSqlSentence());
            }
        %>
    </body>
</html>
