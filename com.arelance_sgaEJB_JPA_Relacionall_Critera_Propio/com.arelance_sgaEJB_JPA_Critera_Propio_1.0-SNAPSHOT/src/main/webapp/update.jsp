<%-- 
    Document   : update
    Created on : 14 sept. 2021, 19:35:29
    Author     : salvador
--%>

<%@page import="com.arelance.sgajpa.domain.Persona"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Persona</title>
    </head>
    <body>
        <h1>formulario Persona:</h1>
        <form id="myform" action="PostUpdatePersona">
            <label for="nombre">nombre:</label><input id="nombre" type="text" name="nombre" value="${persona!=null?persona.nombre:''}" onchange="comprobar(this,'${persona.nombre}')">
                <label for="nombre">apellido</label><input id="apellido" type="text" name="apellido" value="${persona!=null?persona.apellido:''}" onchange="comprobar(this,'${persona.apellido}')">
                <label for="nombre">email</label><input id="email" type="text" name="email" value="${persona!=null?persona.email:''}" onchange="comprobar(this,'${persona.email}')">
                <label for="nombre">telefono</label><input id="telefono" type="text" name="telefono" value="${persona!=null?persona.telefono:''}" onchange="comprobar(this,'${persona.telefono}')">
                <label for="nombre">edad</label><input id="edad" type="text" name="edad" value="${persona!=null?persona.edad:''}" onchange="comprobar(this,'${persona.edad}')">
                <input type="submit" id="actualizar" name=action value="actualizar"  disabled="true">
                <input type="submit" id="eliminar" name=action value="eliminar">
                <input type="submit" id="alta" name=action value="alta">
        </form>
        <!-- Formulario afición -->
        <h2>formulario Aficion:</h2>
        <form id="aficionForm" action="PostUpdatePersona">
        <label for="nombre">nombre aficion:</label><input id="nombre_aficion" type="text" name="nombre_aficion" >
        <label for="nombre">descripcion</label><input id="descripcion" type="text" name="descripcion" >
        <input type="submit" id="eliminar_aficion" name=action_aficion value="eliminar_aficion">
        <input type="submit" id="alta_aficion" name=action_aficion value="alta_aficion">
        </form>
                <script>
                    function comprobar(a,b){
                        if(a.value!=b){
                            myform.actualizar.disabled=false;
                        }
                    }
                </script>
    </body>
</html>
