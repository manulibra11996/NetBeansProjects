<%-- 
    Document   : index.jsp
    Created on : 1 oct. 2021, 10:09:35
    Author     : Manuel
--%>

<%@page import="com.arelance.arquitecturajavawed.DTO.LibroPersonaDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de libros con personas</h1>
        <%
            List<LibroPersonaDTO> lista = (List<LibroPersonaDTO>) request.getAttribute("lista");

            for (LibroPersonaDTO lpdto : lista) {
        %>
        <li>
            <p><%=lpdto.getTitulo()%></p>
            <p><%=lpdto.getPaginas()%></p>
            <p><%=lpdto.getApellidos()%></p>
        </li>
        <%
            }
        %>
</body>
</html>
