<%-- 
    Document   : index
    Created on : 25 ago. 2021, 13:46:41
    Author     : Manuel
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("jdbc/Sakila");
            Connection conn = ds.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM actor LIMIT 20");
            while(rs.next()){
                out.println("<li>"+rs.getString("first_name")+"</li>");
            }
            conn.close();
            out.print(conn.toString());
        %>
    </body>
</html>
