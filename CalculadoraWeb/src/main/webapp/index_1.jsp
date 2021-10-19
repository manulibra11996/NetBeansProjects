<%-- 
    Document   : index.jsp
    Created on : 8 jul. 2021, 9:55:15
    Author     : Manuel
--%>
<%!
/*public double sumar(double op1, double op2){
    return op1+op2;
}
public double restar(double op1, double op2){
    return op1-op2;
}
public double multiplicar(double op1, double op2){
    return op1*op2;
}
public double dividir(double op1, double op2){
    return op1/op2;
}*/
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        /*String op1 = request.getParameter("op1");
        String value1 = op1 != null ? op1:"";
        String op2 = request.getParameter("op2");
        String value2 = op2!= null? op2:"";*/ 
        %>
        <h1>Calculadora</h1>
        <form action="./PostCalculadora" method="GET">
            <label>op1:</label><input type="text" name="op1"  
                                      placeholder="0" value="<%=request.getParameter("op1")%>"/>
            <label>op2:</label><input type="text" name="op2" 
                                      placeholder="0" value="<%=request.getParameter("op2")%>"/>
            <input type="submit" name="operacion" value="sumar"/>
            <input type="submit" name="operacion" value="restar"/>
            <input type="submit" name="operacion" value="multiplicar">
            <input type="submit" name="operacion" value="dividir">
        </form>

        <% if(request.getParameter("op1") != null && request.getParameter("op2") != null){
        out.print("<label>Resultado:</label>");
        out.print("<input type='text' name='resultado'"); 
        out.print("value=" + request.getAttribute("valor"));
        }%>

    </body>
</html>
