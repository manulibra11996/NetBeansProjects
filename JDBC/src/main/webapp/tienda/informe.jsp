<%-- 
    Document   : informe
    Created on : 30 ago. 2021, 18:58:42
    Author     : manulibra
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.arelance.jdbc.beans.Factura"%>
<%@page import="com.arelance.jdbc.dao.factura.IFacturaDao"%>
<%@page import="com.arelance.jdbc.dao.factura.service.FacturaDAOServ"%>
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
            IFacturaDao implementacionFactura = new FacturaDAOServ(); 
            List<Factura> listaFactura = implementacionFactura.obtener();
                        
            double total = 0;
            int cantidad = 0;
            int idUsuario = 0;
        %>
        <h1>Informe de venta</h1>
        <%
            for (Usuario usuario : listaUsuario) {
                if (usuario.getNick().equals(request.getSession().getAttribute("nick"))){%>
                    <h2>Comprador <%=usuario.getNick()%></h2>
                <%
                    idUsuario = usuario.getId_usuario();
                }
            } 
            if (listaFactura.size() != 0) {
        %>
                <h3>Productos vendidos</h3>
                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Precio</th>
                        <th>Cantidad</th>
                    </tr>
                 <%
                    for (Articulo articulo : listaArticulo){
                        cantidad = 0;
                        for (Factura factura :  listaFactura) {
                            if (articulo.getIdArticulo() == factura.getId_articulo()) {
                                cantidad ++;
                            }     
                        }
                        if(cantidad != 0){%>
                        <tr>
                            <td><%=articulo.getNombre()%></td>
                            <td><%=articulo.getDescripcion()%></td>
                            <td><%=articulo.getPrecio()%> &#8364</td>
                            <td><%=cantidad%></td>
                        </tr>
                    <%
                            total=total+(articulo.getPrecio()*cantidad);
                        }  
                    }
                    %>
                </table>    
                    <p>Precio total: <%=total%> &#8364</p>
                    <%implementacionFactura.eliminar(new Factura(idUsuario));
            }else{%>
                <p>No as comprado nada vuelve la tienda</p>
            <%}%>
            <a href="http://localhost:8080/JDBC/index.jsp">Volver a la tienda</a>
    </body>
</html>
