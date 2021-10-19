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
        <%
            Articulos articulo1 = new Articulos("Camiseta", "Camiseta blanca", TipoArticulos.textil);
            Articulos articulo2 = new Articulos("Balon de baloncesto", "Balon de baloncesto de la NBA", TipoArticulos.deportes);
            Articulos articulo3 = new Articulos("Mesa de salon", "Mesa de madera de 2m de largo, 0.5m de ancho y 1m de altura", TipoArticulos.hogar);
        %>
        <p>Bienvenido 
            <%
                String nick = request.getParameter("nick");
                out.print(nick);
            %>
        <form action="./PostTienda" method="GET">
            <p><input type="checkbox" name="articulos" value="<%=articulo1.getNombre()%>"><%=articulo1%></p>
            <p><input type="checkbox" name="articulos" value="<%=articulo2.getNombre()%>"><%=articulo2%></p>
            <p><input type="checkbox" name="articulos" value="<%=articulo3.getNombre()%>"><%=articulo3%></p>
            <input type="submit" name="boton" value="carrito">
            <input type="submit" name="boton" value="cerrar">
            <input type="reset"  value="Limpiar campos">
        </form>
    </p>
</body>
</html>
