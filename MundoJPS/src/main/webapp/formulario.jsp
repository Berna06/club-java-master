<%-- 
    Document   : formulario
    Created on : 21 abr. 2022, 18:39:48
    Author     : bernardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proceso del fomrulario terminado</title>
    </head>
    <body>
        <h1>Resultado del formulario realizado</h1>
        Usuario: <%=request.getParameter("usuario")%>
        <br><!-- comment -->
        Paasword: <%= request.getParameter("password")%>
        <br><!-- comment -->
        <br>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
