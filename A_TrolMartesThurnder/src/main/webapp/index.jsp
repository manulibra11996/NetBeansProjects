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
        <h2>Lista de empleados</h2>
        <h3>Filtro de departamento</h3>
         <form action="PostIndex" method="GET" id="formulario">
            <p for="text">Nombre del departamento:
            <input type="text" id="nombre" placeholder="dep1" name="nombre" maxlength="45"></p>
            <p>Ordenacion por salario: 
                Ascendente:<input type="radio" id="orden" value="asc">
                Descendente:<input type="radio" id="orden" value="desc"></p>
            <input type="submit" name="action" value="Filtrar">
         </form>
        <a href="PostIndex2">Solo mostrar los departamentos con mas de un empleado</a>
        <%
            List<Empleado> lista = (List<Empleado>) request.getAttribute("lista");

            for (Empleado empleado : lista) {
        %>
        <p><%=empleado.getEmpName()%><a href="PreModificar?idEmpleado=<%=empleado.getIdempleado()%>">Modificar</a>
            <a href="PreEliminar?idEmpleado=<%=empleado.getIdempleado()%>">Eliminar</a></p>
            <%
                }
            %>
        <a href="insertar.jsp">Alta</a>
    </body>
</html>
