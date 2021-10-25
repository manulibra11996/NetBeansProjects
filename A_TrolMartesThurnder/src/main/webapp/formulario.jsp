<%-- 
    Document   : eliminar
    Created on : 19 oct. 2021, 19:56:23
    Author     : manul
--%>


<%@page import="com.arelance.a_trolmartesthurnder.facade.EmpleadoFacadeLocal"%>
<%@page import="com.arelance.a_trolmartesthurnder.entity.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
       <%
            
            String tipo = request.getParameter("tipo");
            String valueNombre = "";
            String valueApellido = "";
            String valueSalario = "";
            String valueDep = "";
            String titulo = "";

            switch (tipo) {
                case "Alta":
                    valueNombre = " placeholder=\"Manuel\" required";
                    valueApellido = " placeholder=\"Gonzales\" required";
                    valueSalario = " placeholder=\"20\" required";
                    valueDep = " placeholder=\"Dep1\" required";
                    titulo = "Alta de un empleado";
                    break;
                case "Modificar":
                    valueNombre = " required";
                    valueApellido = " required";
                    valueSalario = " required";
                    valueDep = " required";
                    titulo = "Modificacion de un empleado";
                    break;
                case "Eliminar":
                    valueNombre = " readonly";
                    valueApellido = " readonly";
                    valueSalario = " readonly";
                    valueDep = " readonly";
                    titulo = "¿Estas seguro que quieres eliminar este empleado?";
                    break;
            }
        %>
        <h2><%=titulo%></h2>
        <form action="PostFormulario" method="GET" id="formulario">
            <input type="text" id="tipo" name="tipo" hidden="hidden" value="<%=tipo%>">
                <%
                    if (!tipo.equals("Alta")) {%>
            <input type="text" id="id" name="id" hidden="hidden" value="${datos.getIdempleado()}">
            <%}%>
            <p for="text">Nombre:
                <input type="text" id="nombre"  name="nombre" maxlength="45" class="form-control mt-3"  value="${datos.getEmpName()}" <%=valueNombre%>></p>
            <p for="text">Apellido:
                <input type="text" id="apellido" name="apellido" maxlength="45" class="form-control mt-3" value="${datos.getEmpLastName()}" <%=valueApellido%>></p>
            <p for="text">Salario:
                <input type="number" id="salario" name="salario"  pattern="[0-9]" class="form-control mt-3" value="${datos.getEmpSalary()}" <%=valueSalario%>></p>
            <p for="departamento">Departamento:
                <input type="departamento" id="departamento"  name="departamento"  class="form-control mt-3" value="${datos.getEmpDep()}" <%=valueDep%>></p>
                <%
                    if (tipo.equals("Eliminar")) {%>
            <input type="submit" name="action" value="Si" class="btn btn-primary">
            <a href="PreIndex" type="button" class="btn btn-primary">No</a>
            <%    }else{
            %>
            <input type="submit" name="action" value="<%=tipo%>" class="btn btn-primary">
            <input type="reset" name="action" value="Limpiar"  class="btn btn-primary">
            <%}%>
            <a href="PreIndex" type="button" class="btn btn-primary">Volver</a>
        </form>
    
</html>
