<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo JSTL CRE</title>
    </head>
    <body>
        <h1>JSTL CORE!</h1>
        <br/>
        <br/>
        Significa lo siguiente:(JSP Standard Tag Library)
        <br>
        <!<!-- Manipulacion de variables -->
        <!<!-- definimos la variable -->
        <c:set var="nombre" value="Ernesto" />
        <!<!-- desplegamos la variable -->
        Variable nombre: <c:out value="${nombre}"/>
        <br>
        <br>
        Variable con codigo html:
        <c:out value="<h4>hola</h4>"  escapeXml="false"/>
        <br/>
        <br/>
        <!<!-- Codigo condicionado con uso de if -->
        <c:set var="bandera" value="true"/>
        <c:if test="${bandea}" >
            La bandera es verdadera
        </c:if>
        <br/>
        <!<!-- codigo condicionado con switch -->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    Opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br/>
                    Opcion 2 seleccionada
                </c:when>
                <c:otherwise>
                    <br/>
                    opcion propocionada diferente a lo desconocido: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <!<!--iteracion de un arreglo -->
        <%
            String nombres[] = {"Caludie", "Pedro", "Juan"};
            request.setAttribute("nombres", nombres);
        %>
        <br/>
        <br/>
        Lista de nombres:
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>Nombre: ${persona}</li>
            </c:forEach>
        </ul>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
