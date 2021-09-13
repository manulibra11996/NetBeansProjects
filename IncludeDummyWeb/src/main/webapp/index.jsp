<%-- 
    Document   : index
    Created on : 12 jul. 2021, 19:41:31
    Author     : Mefisto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo include</title>
    </head>
    <body bgcolor="#FDF5E6">
        <h1>NOTICIAS DEL DÍA</h1>
        <h2>Ultima Hora: </h2>
        <jsp:include page="file.jsp">
            <jsp:param name="firstname" value= "<%=request.getParameter("firstname")%>"/>
            <jsp:param name="middlename" value="Pratap" />
            <jsp:param name="lastname" value="Singh" />
        </jsp:include>
    </body>
</html>
