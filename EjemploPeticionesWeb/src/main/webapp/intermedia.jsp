<%-- 
    Document   : intermedia
    Created on : 8 jul. 2021, 9:34:01
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
        <a href="final.jsp">click</a>
    </body>
</html>
