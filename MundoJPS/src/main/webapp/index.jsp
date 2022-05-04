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
        <title>Mundo JSP'S</title>
    </head>
    <body>
        <h1>Introduccion al mundo JPS</h1>
    <u1>
        <li> <% out.print("hola mundo CON SCRIP");%> </li>
        <li>${"hOLAMUNDO con exprecion de lenguaje"} </li>
        <li> <%= "Hola mundo con expresiones"%> </li>
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


    <h1>Scriptlests</h1>
    <br><!-- comment -->
    <br>
    <a href="Scriptles.jsp">Link Para el ejemplo de Scriptlets</a>
    <br>
    <br>
    <form action="FondoColor.jsp">
        Propociona el color de fondo (ej. red . blue. green, yellow, white, etc)
        <input type="text" name="color de fondo">
        <br>
        <input type="submit" value="Terminar y Enviar">
    </form>


    <%-- Agrgamos una declaracion --%>
    <%!
        //declaramos una variable con un metodo get
        private String usuario = "Bernardo";

        public String getUsuario() {
            return this.usuario;
        }
        //declaramos un contador de visitas
        private int contadorVisitas = 1;
    %>
    <h1>Uso de declaraciones</h1>
    <br>
    Valor del usuario por medio del atributo: <%= this.usuario%>
    <br>
    Valor del usuario por medio del metodo: <%=this.getUsuario()%>
    <br>
    Valor de Visitas por el atributo: <%= this.contadorVisitas++%>
    <br>


    <h1>Documentacion</h1>
    <a href="documentacion.jspx">Link Para el ejemplo de documentacion</a>


    <h1>Generacion de reporte excel directivas</h1>
    <br/>
    <a href="Reporte.jsp">Link al reprote de excel</a>


    <h1>Inclusion estatica</h1> 
    <br/>
    <u1>
        <li> <%@include file="paginas/noticias.html" %></li>
        <li> <%@include file="paginas/notis.jsp" %></li>
    </u1>


    <h1>Inclusion dinamica</h1>
    <br/>
    <jsp:include page="paginas/recursos.jsp" />
    <br/><!-- comment -->
    <jsp:include page="WEB-INF/privado.jsp" >
        <jsp:param name="colorFondo" value="grey"/>
    </jsp:include>

    
    <h1>Uso de JavaBeans</h1>
    <a href="setl.jsp">Modificar valores de Java Benas</a>
    <br/>
    <a href="get.jsp">Leer valores del rectangulo</a>
    <br/>
    <br/>
    
    
    <h1>Manejo de EL Expression Language</h1>
    <br/>
    <a href="Variables.jsp?usuario=juan">Objetos implicitos con EL</a>
    
    
    <h1></h1>
</body>
</html>
