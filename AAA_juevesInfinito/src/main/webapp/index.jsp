<%-- 
    Document   : index
    Created on : 7 oct. 2021, 12:27:27
    Author     : Manuel
--%>

<%@page import="com.arelance.aaa_juevesinfinito.domains.Dept"%>
<%@page import="com.arelance.aaa_juevesinfinito.domains.Emp"%>
<%@page import="com.arelance.aaa_juevesinfinito.domains.Tarea"%>
<%@page import="java.util.List"%>
<%@page import="com.arelance.aaa_juevesinfinito.domains.Proyecto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Proyecto> proyectos = (List<Proyecto>) request.getAttribute("proyectos");
            for (Proyecto proyecto : proyectos) {
        %>
        <p><%= proyecto.getNombre()%></p>
        <%}
            List<Tarea> tareas = (List<Tarea>) request.getAttribute("tareas");
            for (Tarea tarea : tareas) {
        %>
        <p><%= tarea.getDescripcion()%></p>
        <%}
            List<Emp> emps = (List<Emp>) request.getAttribute("emps");
            for (Emp emp : emps) {
        %>
        <p><%= emp.getNombre()%></p>
        <%}%>
    </body>
</html>
