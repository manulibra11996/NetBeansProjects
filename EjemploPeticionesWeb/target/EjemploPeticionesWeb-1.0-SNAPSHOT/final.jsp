<%-- 
    Document   : final
    Created on : 8 jul. 2021, 9:34:16
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
            out.print(request.getAttribute("test"));
        %>
    </body>
</html>
