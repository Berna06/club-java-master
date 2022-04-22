<%-- 
    Document   : index
    Created on : 21 abr. 2022, 16:13:08
    Author     : bernardo
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Mundo JPS'S</title>
    </head>
    <body>
        <h1>Introduccion al mundo JPS</h1>
    <u1>
        <li> <% out.print("hola mundo CON SCRIP"); %> </li>
        <li>${"hOLAMUNDO con exprecion de lenguaje"} </li>
        <li> <%= "Hola mundo con expresiones" %> </li>
        <li> <c:out value="hola mundo desde los jps" /> </li>
    </u1>\
    
    
    <h1>Ejemplo expresiones JPS</h1>
    <br>
    <a href="expresiones.jps">Link al JPS de expresiones</a>
    </br>
    <h4>Formulario HTML</h4>
    <form name="formulario" action="formulario.jsp">
        Usuario: <input type="text" name="usuario">
        <br>
        Password: <input type="password" name="password">
        <br>
        <input type="submit" value="enviar">
     </form>
    </body>
</html>
