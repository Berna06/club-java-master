<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lee los valores del Beans</title>
    </head>
    <body>
        <h1>JSP que lee los valores del BEANS</h1>
        <jsp:useBean id="rectangulo" class="Utilerias.Rectangulo" scope="session" />
        <br/>
        Valor base; <jsp:getProperty name="rectangulo" property="base" />
        <br/>
        Valor ALtura <jsp:getProperty name="rectangulo" property="altura" />
        <br/>
        Valor Area: <jsp:getProperty name="rectangulo" property="area" />
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
