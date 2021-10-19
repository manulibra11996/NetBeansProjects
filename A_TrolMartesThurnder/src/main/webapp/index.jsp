<%-- 
    Document   : index
    Created on : 19 oct. 2021, 13:06:51
    Author     : Manuel
--%>

<%@page import="com.arelance.a_trolmartesthurnder.entity.Empleado"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Hola</h2>
        <%
            List<Empleado> lista = (List<Empleado>) request.getAttribute("lista");

            for (Empleado empleado : lista) {
        %>
        <p><%=empleado.getEmpName()%></p>
        <%
            }
        %>
    </body>
</html>
