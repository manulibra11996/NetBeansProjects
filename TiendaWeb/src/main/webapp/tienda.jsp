<%-- 
    Document   : paginaFinal
    Created on : 9 jul. 2021, 12:58:56
    Author     : Manuel
--%>

<%@page import="java.util.Set"%>
<%@page import="com.arelance.tiendaweb.beans.Articulos"%>
<%@page import="com.arelance.tiendaweb.beans.TipoArticulos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <p>Bienvenido 
            <%
                String nick = request.getParameter("nick");
                out.print(nick);
            %>
        <form action="./PostTienda" method="GET">
            <%
                Set<Articulos> articulosv = (Set<Articulos>) request.getAttribute("articulosv"); 
                for (Articulos articulos : articulosv) {
                    out.print("<p><input type=\"checkbox\" name=\"articulos\" value=\" " + articulos + "\">" + articulos + "</p>");
                }
 
            %>
            <input type="submit" name="boton" value="carrito">
            <input type="submit" name="boton" value="cerrar">
            <input type="reset"  value="Limpiar campos">
        </form>
    </p>
</body>
</html>
