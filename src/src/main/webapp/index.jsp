<%-- 
    Document   : index
    Created on : 1/09/2021, 10:57:31 PM
    Author     : IVAN PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabajo Grupal- Inicio</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- boostrap CSS -->
        <link rel="stylesheet" href="./assets/css/bootstrap.css">
    </head>
    <body>
       <h1>Alumnos:</h1>
        <a href="${pageContext.request.contextPath}/ServletAlumno?accion=listar">Listar Alumnos</a>
    </body>
</html>
