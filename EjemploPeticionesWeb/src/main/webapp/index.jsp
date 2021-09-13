<%-- 
    Document   : index
    Created on : 8 jul. 2021, 9:33:48
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <h1>Soy index</h1>
        <%
            request.setAttribute("test", "esta es la prueba de vida");
            out.print(request.getAttribute("test"));
            request.getRequestDispatcher("intermedio.jsp").forward(request, response);
        %>
    </body>
</html>
