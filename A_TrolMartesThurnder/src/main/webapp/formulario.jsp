<%-- 
    Document   : eliminar
    Created on : 19 oct. 2021, 19:56:23
    Author     : manul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%
            String tipo = request.getParameter("tipo");
            String valueNombre;
            String valueApellido;
            String valueSalario;
            String valueDep;
            String valueId;
            String titulo;
            switch (tipo) {
                case "Alta":
                    valueNombre = " placeholder=\"Manuel\" required";
                    valueApellido = " placeholder=\"Gonzales\" required";
                    valueSalario = " placeholder=\"20\" required";
                    valueDep = " placeholder=\"Dep1\" required";
                    valueId = "";
                    titulo = "Alta de un empleado";
                    break;
                case "Modificar":
                    valueNombre = " value=\"datos.getEmpName()\" required";
                    valueApellido = " value=\"datos.getEmpLastName()\" required";
                    valueSalario = " value=\"datos.getEmpSalary()\" required";
                    valueDep = " value=\"datos.getEmpDep()\" required";
                    valueId = " value=\"datos.getIdempleado()\"";
                    titulo = "Modificacion de un empleado";
                    break;
                case "Eliminar":
                    valueNombre = " value=\"datos.getEmpName()\" readonly";
                    valueApellido = " value=\"datos.getEmpLastName()\" readonly";
                    valueSalario = " value=\"datos.getEmpSalary()\" readonly";
                    valueDep = " value=\"datos.getEmpDep()\" readonly";
                    valueId = " value=\"datos.getIdempleado()\"";
                    titulo = "¿Estas seguro que quieres eliminar este empleado?";
                    break;
            }
        %>
        <h2>${titulo}</h2>
        <form action="PostFormulario" method="GET" id="formulario">
            <input type="text" id="id" name="id" hidden="hidden" ${valueId}>
            <p for="text">Nombre:
                <input type="text" id="nombre" maxlength="45" class="form-control mt-3" ${valueNombre}></p>
            <p for="text">Apellido:
                <input type="text" id="apellido" maxlength="45" class="form-control mt-3" ${valueApellido}></p>
            <p for="text">Salario:
                <input type="number" id="salario"  pattern="[0-9]" class="form-control mt-3" ${valueSalario}></p>
            <p for="departamento">Departamento:
                <input type="departamento" id="departamento" class="form-control mt-3" ${valueDep}></p>
                <%
                    if (tipo == "Eliminar") {%>
            <input type="submit" name="action" value="Si" class="btn btn-primary">
            <a href="PreIndex" type="button" class="btn btn-primary">No</a>
            <%    }else{
            %>
            <input type="submit" name="action" value="${tipo}" class="btn btn-primary">
            <input type="reset" name="action" value="Limpiar"  class="btn btn-primary">
            <%}%>
            <a href="PreIndex" type="button" class="btn btn-primary">Volver</a>
        </form>
    </body>
</html>
