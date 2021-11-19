<%-- 
    Document   : index
    Created on : 06-oct-2021, 10:13:57
    Author     : usuario
--%>

<%@page import="com.arelance.institutomunicipaldeportesalfa.domain.Actividad"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    
</head>
<body>

    <%@include file="./jsf/headernav.jspf"%>
   
     <h2 class="text-center">Actividades disponibles</h2>

     <div class ="container">
            <table class="table">

                <thead class = "table">
                    <tr class = "table-info">
                        <th>Nombre Actividad</th>
                        <th>Lugar</th>
                        <th>Precio</th>
                        <th>Descripcion</th>
                        <th>Hora Inicio</th>
                        <th>Hora Finalizacion</th>
                        <th>Días actividad</th>
                        
                    </tr>
                </thead>


                <%
                    List<Actividad> lista = (List<Actividad>) request.getAttribute("lista");

                    for (Actividad actividad : lista) {
                %>
                <tr>
                    <td class = "table-success"><%=actividad.getNombreActividad()%></td>
                    <td class = "table-success"><%=actividad.getLugar()%></td>
                    <td class = "table-success"><%=actividad.getPrecio()%> €</td>
                    <td class ="table-success"><%=actividad.getDescripcion()%></td>
                    <td class ="table-success"><%=actividad.getFechaComienzo()%></td>
                    <td class ="table-success"><%=actividad.getFechaFinalizacion()%></td>
                    <td class ="table-success"><%=actividad.getDiasActividad()%></td>
                   
                    
                    <%
                        }
                    %>
            </table>
        </div>
    <%@include file="./jsf/footer.jspf"%>
</body>
</html>
