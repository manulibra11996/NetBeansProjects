<%-- 
    Document   : index
    Created on : 26 ago. 2021, 13:27:17
    Author     : Manuel
--%>



<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.arelance.jdbc.beans.Articulo"%>
<%@page import="com.arelance.jdbc.dao.articulo.IArticuloDao"%>
<%@page import="com.arelance.jdbc.dao.articulo.service.ArticuloDAOServ"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <%if(request.getSession().getAttribute("nick") == null){  
        %>
        <%@include file="./login.jspf" %>
        <%}%>

        <%  
            IArticuloDao implementacionArticulo = new ArticuloDAOServ(); 
            List<Articulo> listaArticulo = implementacionArticulo.obtener();
            
            if(request.getSession().getAttribute("nick") == null){%>
        <h1>Lista de articulos</h1>
        <table>
            <%for (Articulo articulo : listaArticulo) {%>
            <tr> 
                <td><%=articulo.getNombre()%></td>
            </tr> 
            <%}%>
        </table>
        <%  
            }else{%>
        <form action='./PostIndex' method='GET'>
            <input name='boton' type='submit' value='OutLogin'>
            <h1>Lista de articulos</h1>
            <table>
                <tr>
                    <th></th>
                    <th>Nombre</th>
                    <th>Precio</th>
                </tr>
                <%for (Articulo articulo : listaArticulo) {%>
                <tr>
                    <td><input type='checkbox' name='articulo' id='<%=articulo.getIdArticulo()%>' value='<%=articulo.getIdArticulo()%>'></td>
                    <td><%=articulo.getNombre()%></td>
                    <td><%=articulo.getPrecio()%> &#8364</td>
                </tr> 
                <%}%>
            </table>
            <input type='submit' name='boton' value='Anadircarrito'>
            <input type='submit' name='boton' value='Vercarrito'>
            <input type='submit' name='boton' value='Comprar'>
            <input type='reset'  value='Limpiar campos'>
        </form><br />
        <%}%>
    </body>
</html>
