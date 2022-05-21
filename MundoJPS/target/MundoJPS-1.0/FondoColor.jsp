
<!DOCTYPE html>
<%
    String fondo = request.getParameter("color de fondo");
    if (fondo == null || fondo.trim().equals("")) {
        fondo = "white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cambio de color</title>
    </head>
    <body bgcolor="<%=fondo%>" >
        <h1>Cambio de color desde un Sriptlet</h1>
        <br>
        Colo de fondo aplicado:<%=fondo%>
        <br>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
