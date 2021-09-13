<%-- 
    Document   : index
    Created on : 9 sept. 2021, 12:37:59
    Author     : Manuel
--%>

<%@page import="java.util.List"%>
<%@page import="com.benas.dominio.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Usuario> mostrar = (List < Usuario >) request.getAttribute("mostrar");

            for (Usuario usuario : mostrar) {
                    out.println(usuario.getNombre());
            }

        %>
    </body>
</html>
