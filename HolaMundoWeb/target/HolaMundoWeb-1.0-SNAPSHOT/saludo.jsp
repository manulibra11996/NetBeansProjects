<%-- 
    Document   : saludo
    Created on : 6 jul. 2021, 9:43:06
    Author     : Manuel
--%>

<%@page import="java.util.List"%>
<%@page import="com.arelance.holamundoweb.beans.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
            List<Usuario> listado = (List<Usuario>) session.getAttribute("listado");
            out.println("Los usuarios son:");
            for (Usuario usuario : listado) {
                    out.print(usuario.getNombre() + " ");
                    out.print(usuario.getApellido() + " ");
                    out.print(usuario.getEdad() + " ");
                }
        %>
    </body>
</html>
