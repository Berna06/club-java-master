<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y variables Implicitas</title>
    </head>
    <body>
        <h1> EL y variables implicitas!</h1>
    <u1>
        <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
        <li>Navegador del cliente: ${header["User-Agent"]}</li>
        <li>id de la sesion ${cookie.JSESSIONID.value}</li>
        <li>Web Server; ${pageContext.servletContext.serverInfo}</li>
        <li>Valor Parametro: ${param.usuario}</li>
    </u1>
    <br/>
    <br/>
    <a href="index.jsp">Regreso al inicio</a>
    </body>
</html>
