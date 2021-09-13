<%-- 
    Document   : interface
    Created on : 24 ago. 2021, 9:55:47
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Control de faltas</h1>
         <%
            String[] nombres;
            String cadena = "?";
            String nombre;
            String[] seleccionados =(String[]) request.getParameterValues("nombres");
            
            nombres = (String[]) request.getParameterValues("seleccionados");
            session.setAttribute("nombresSeleccionados", nombres);
            

        %>
        <%
            for (int i = 0; i < nombres.length; i++) {
                nombre = nombres[i];
                cadena = cadena + "nombres=" + nombre;
                if (i < nombres.length-1) {
                        cadena = cadena + "&";
                }
            }
            for (String seleccionado : seleccionados) {
                    out.print(seleccionado);
                }
        %>
        <p><a href="http://localhost:8080/RepasoWeb/index.jsp<%=cadena%>">Volver al index</a></p>
    </body>
</html>
