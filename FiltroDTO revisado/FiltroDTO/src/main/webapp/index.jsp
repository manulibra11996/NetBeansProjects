<%-- 
    Document   : index
    Created on : 22-sep-2021, 9:44:29
    Author     : Admin
--%>

<%@page import="com.arelance.filtrodto.dtos.filters.Fiter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //request.getAttribute("filter");
  Object aux= request.getAttribute("filter");
  if(aux!=null){
      Fiter fx=(Fiter)aux;
      fx.execute();
      out.print(fx.getSqlSentecnce());
  }
            %>
        <h1>Hello World!</h1>
        <form action="MainServlet" method="GET">
            <label for="nombre">Nombre: </label><input type="text" name="nombre" id="nombre">
            <label for="minimo">Edad minima: </label><input type="text" name="minimo" id="minimo">
            <input type="submit" name="Enviar">
        </form>
    </body>
</html>
