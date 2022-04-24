<%@page import="Utilerias.Converciones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<% 
    String Archivo = "reporte.xls";
    response.setHeader("Content-Disposition", "attachment;filename=" + Archivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr> 
            <tr>
                <td>1. Fundomentos de java</td>
                <td>aprendi la sintaxis de java</td>
                <td><%= Converciones.format(new Date()) %></td>
            </tr>
            <tr>
                <td>2. Programacion de java</td>
                <td>Puse a prueba los conceptos de la programacion de java orientada a objetos</td>
                <td><%= Converciones.format(new Date()) %></td>
            </tr>
             <tr>
                <td>3. MSQL con java</td>
                <td>conoci en concepto y para que sirve el servidor de msql</td>
                <td><%= Converciones.format(new Date()) %></td>
            </tr>
             <tr>
                <td>4. SERVLETS</td>
                <td>Reconocere como se crean las paginas web desde servidores</td>
                <td><%= Converciones.format(new Date()) %></td>
            </tr>
             <tr>
                <td>5.  JSP's</td>
                <td>Actualmente estoy con los sonocimentos de los jsp y  sus funciones</td>
                <td><%= Converciones.format(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>
