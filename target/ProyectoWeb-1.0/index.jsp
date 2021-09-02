<%-- 
    Document   : index
    Created on : 01-sep-2021, 11:38:24
    Author     : Hugo Daniel Velasquez Patzan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <h1>Control Academico</h1>
        <a href="${pageContext.request.contextPath}/ServletInstructor?accion=listar"">Listar Instructor</a>
        <br>
        <a href="${pageContext.request.contextPath}/ServletSalon?accion=listar">Listar Salon</a>
    </body>
</html>
