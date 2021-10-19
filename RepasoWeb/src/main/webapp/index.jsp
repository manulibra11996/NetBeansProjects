<%-- 
    Document   : index
    Created on : 24 ago. 2021, 9:32:48
    Author     : Manuel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Control de asistencia</h1>
        <form action="./PostRepaso" method="GET">
            <%
              String[] seleccionados = (String[]) request.getParameterValues("nombres");
           
              String[] personas;
           
              String nombre;
           
              String seleccionado;
           
              String mostrar;
               if (application.getAttribute("personas") == null) {
                   personas = new String[]{"anonimo"};
               }else{
                   personas = (String[]) application.getAttribute("personas");
               }
               if (seleccionados != null){
                   for (int i = 0; i < personas.length; i++) {
                       nombre = personas[i];
                       for (int j = 0; j < seleccionados.length; j++) {
                           seleccionado = seleccionados[j];
                           mostrar=nombre.equals(seleccionado)?"checked":"";

                           out.print("<p><input type='checkbox' name='nombre' value='"+nombre +"'"+ mostrar +">"+nombre+"</p>" );

                       }
                   }
                
               }else{
            %>

            <%
                for (String persona : personas) {%>
            <p><input type="checkbox" name="nombre" id="<%=persona%>" value="<%=persona%>"><%=persona%></p> 
                <%  
                        }
                    }
                %>

            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
