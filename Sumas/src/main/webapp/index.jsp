<%-- 
    Document   : index
    Created on : 12 jul. 2021, 13:00:19
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
         <form action="./Post" method="GET">
            <label>op1:</label><input type="text" name="op1" placeholder="0"/>
            <label>op2:</label><input type="text" name="op2" placeholder="0"/>
            <input type="submit" value="sumar"/>
        </form>
        
            <% 
                if(request.getParameter("op1") != null && request.getParameter("op2") != null){
                    List<Double> mostrar = (List<Double>) request.getAttribute("mostrar");
                    out.print("<p> Los resultados son: ");
                    for (Double double1 : mostrar) {
                        out.print(double1 + ", ");
                    }
                    out.print("</p>");
                }
            %>
    </body>
</html>
