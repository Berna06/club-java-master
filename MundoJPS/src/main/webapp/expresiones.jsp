<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con expresiones</title>
    </head>
    <body>
        <h1>JPS con Expresiones!</h1>
        Concatenacion: <%="Saludos" + "  "  + "JSP" %>
        <br>
        Operacion Matematica <%= 2 * 3 /2 %>
        <br><!-- comment -->
        Session id: <%= session.getId()%>
        <br><!-- comment -->
        <br><!-- comment -->
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
