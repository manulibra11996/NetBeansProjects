<%-- 
    Document   : informe
    Created on : 30 ago. 2021, 18:58:42
    Author     : manulibra
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.arelance.jdbc.beans.Carrito"%>
<%@page import="com.arelance.jdbc.dao.carrito.ICarritoDao"%>
<%@page import="com.arelance.jdbc.dao.carrito.service.CarritoDAOServ"%>
<%@page import="com.arelance.jdbc.beans.Usuario"%>
<%@page import="com.arelance.jdbc.dao.usuario.IUsuarioDao"%>
<%@page import="com.arelance.jdbc.dao.usuario.service.UsuarioDAOServ"%>
<%@page import="com.arelance.jdbc.beans.Articulo"%>
<%@page import="com.arelance.jdbc.dao.articulo.IArticuloDao"%>
<%@page import="com.arelance.jdbc.dao.articulo.service.ArticuloDAOServ"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            IArticuloDao implementacionArticulo = new ArticuloDAOServ(); 
            List<Articulo> listaArticulo = implementacionArticulo.obtener();
            IUsuarioDao implementacionUsuario = new UsuarioDAOServ(); 
            List<Usuario> listaUsuario = implementacionUsuario.obtener();
            ICarritoDao implementacionCarrito = new CarritoDAOServ(); 
            List<Carrito> listaCarrito = implementacionCarrito.obtener();

            double total = 0;
            int cantidad =0;
            String idUsuario = "";
            String idArticulo = "";
            for (Usuario usuario : listaUsuario) {
                if (usuario.getNick().equals(request.getSession().getAttribute("nick"))){%>
        <h1>Carrito de <%=usuario.getNick()%></h1>
        <% 
            idUsuario = usuario.getId_usuario().toString();
        }
    }
    if(listaCarrito.size() != 0){    
        %>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Precio</th>
                <th>Cantidad</th>
                <th></th>
            </tr>
            <%
            for (Articulo articulo : listaArticulo){
                cantidad = 0;
                for (Carrito carrito: listaCarrito) {
                    if (articulo.getIdArticulo() == carrito.getIdArticulo()) {
                        cantidad ++;
                    }     
                }
                idArticulo = articulo.getIdArticulo().toString();
                if(cantidad != 0){%>
            <tr>
                <td><%=articulo.getNombre()%></td> 
                <td><%=articulo.getDescripcion()%></td> 
                <td><%=articulo.getPrecio()%> &#8364 </td>
                <td><%=cantidad%></td>
                <td><a href="http://localhost:8080/JDBC/Controler?boton=Eliminararticulos&idUsuario=<%=idUsuario%>&idArticulo=<%=idArticulo%>">Eliminar <%=cantidad%> articulos</a></td>
            </tr>
            <%
                    total=total+(articulo.getPrecio()*cantidad);
                }  
            }
            %>
        </table>
        <p>Precio total: <%=total%> &#8364</p>
        <a href="http://localhost:8080/JDBC/Controler?boton=VaciarCarrito&idUsuario=<%=idUsuario%>">Vaciado de carrito</a>
        <%}else{%>
        <p>El carrito esta vacio</p>
        <%}%>
        <br />
        <br />
        <a href="http://localhost:8080/JDBC/index.jsp">Volver a la tienda</a>
    </body>
</html>
