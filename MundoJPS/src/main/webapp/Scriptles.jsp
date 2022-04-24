<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>Scriptlets</h1>
        <br>
        <%--Scriptlet para enviar informacion al navegador --%>
        <%
            out.print("Saludos desde un Scriptlet");
        %>
        <%--Scriptlet para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("nombre de la aplicacion" + nombreAplicacion);
        %>
        <br>
        <%--Scriptlet con codigo condicionado--%>
        <%
           if(session != null && session.isNew()){
        %>
        la sesion creada y es nueva
        <%
            } else if(session != null){
        %>   
        la sesion es existente o no nueva
        <% } %>
        <br>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
