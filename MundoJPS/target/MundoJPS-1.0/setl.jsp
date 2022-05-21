<%@page import="java.beans.Beans"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificador</title>
    </head>
    <body>
        <h1>JSP que modifica a un JAVABEAN</h1>
        <jsp:useBean id="rectangulo" class="Utilerias.Rectangulo" scope="session" />
        Modificamos los atributos:
        <br/>
        <br/>
        <%
            int baseValor = 5;
            int alturaValor = 10;
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" />
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>" />
        <br/>
        Nuevo valor de Base:<%=baseValor%>
        <br/>
        Nuevo valor Altura;<%=alturaValor%>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>

    </body>
</html>
