<%-- 
    Document   : index.jsp
    Created on : 8 jul. 2021, 9:55:15
    Author     : Manuel
--%>
<%!
public double sumar(double op1, double op2){
    return op1+op2;
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form>
            <label>op1:</label><input type="text" name="op1">
            <label>op2:</label><input type="text" name="op2">
            <input type="submit" value="sumar">
        </form>

        <% if(request.getParameter("op1") != null && request.getParameter("op2") != null){
                
        %>

        <label>Resultado:</label><input type="text" name="resultado" value="
                                        <%=sumar(Double.parseDouble(request.getParameter("op1")), Double.parseDouble(request.getParameter("op2")))%>">
        <%}%>

    </body>
</html>
