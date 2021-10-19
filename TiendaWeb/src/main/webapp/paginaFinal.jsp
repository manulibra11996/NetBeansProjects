<%-- 
    Document   : paginaFinal
    Created on : 9 jul. 2021, 12:58:56
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
        <p>Bienvenido 
            <%
                String nick = request.getParameter("nick");
                out.print(nick);
            %>
        </p>
    </body>
</html>
