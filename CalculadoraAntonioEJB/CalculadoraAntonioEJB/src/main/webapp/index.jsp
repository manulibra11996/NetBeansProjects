<%-- 
    Document   : index.jsp
    Created on : 15 nov 2021, 18:25:54
    Author     : salvador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ControllerServlet">
            <label for="num">número</label><input  type="text" id="num" name="num">
            <input type="submit" value="sumar"/>
        </form>
        
        <label>Resultado:</label> <p>${calculadoraTest.calculadoraBeanLocal.number}</p>
       
        
    </body>
</html>
