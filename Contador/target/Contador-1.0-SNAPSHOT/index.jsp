<%-- 
    Document   : index
    Created on : 12 jul. 2021, 9:45:52
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
        <%
            Integer contador;
            if (request.getAttribute("contador") == null) {
                contador = 0;
            }else{
                contador = (Integer) request.getAttribute("contador");
            }
        %>
        <p>Contador: <%=contador%> </p>
        <p><a href="Post?contador=<%=contador%>">+1</a></p>
    </body>
</html>
