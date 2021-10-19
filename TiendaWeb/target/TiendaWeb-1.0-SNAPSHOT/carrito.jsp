<%-- 
    Document   : carrito
    Created on : 10 jul. 2021, 18:34:24
    Author     : manulibra
--%>

<%@page import="java.util.Set"%>
<%@page import="com.arelance.tiendaweb.beans.Articulos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Usuario
            <%
                String nick = request.getParameter("nick");
                out.print(nick);
            %> vas a comprar estos articulos:</p>
            <%
                Set<Articulos> articulosc = (Set<Articulos>) request.getSession().getAttribute("articulosc");
                for (Articulos articulos : articulosc) {
                        out.print(articulos);
                    }
            %>
    </body>
</html>
