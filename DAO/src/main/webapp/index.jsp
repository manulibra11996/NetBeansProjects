<%-- 
    Document   : index
    Created on : 26 ago. 2021, 13:27:17
    Author     : Manuel
--%>



<%@page import="com.arelance.jdbc.dao.articulo.service.ArticuloDAOServ"%>
<%@page import="com.arelance.jdbc.beans.Usuario"%>
<%@page import="com.arelance.jdbc.dao.usuario.impl.UsuarioDAOImpl"%>
<%@page import="com.arelance.jdbc.beans.Articulo"%>
<%@page import="com.arelance.jdbc.dao.articulo.impl.ArticuloDAOImpl"%>
<%@page import="com.arelance.jdbc.dao.articulo.IArticuloDao"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="./login.jsp">Iniciar sesion</a>
        <a href="./registro.jsp">Registrarse</a>
        <h1>Lista de articulos</h1>
        <%  
            IArticuloDao implementacionArticulo = new ArticuloDAOServ(); 
            List<Articulo> listaArticulo = implementacionArticulo.obtener();
            for (Articulo articulo : listaArticulo) {
                out.println("<li>"+articulo.getNombre()+"</li>");
            }
            out.println("----------------------------------------------------");
            UsuarioDAOImpl implementacionUsuario = new UsuarioDAOImpl(); 
            List<Usuario> listaUsuario = implementacionUsuario.obtener();
            for (Usuario usuario : listaUsuario) {
                out.println("<li>"+usuario.getNick()+"</li>");
            }

            
        %>
    </body>
</html>
