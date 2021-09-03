<%-- 
    Document   : index
<<<<<<< HEAD
    Created on : 01-sep-2021, 11:38:24
    Author     : Hugo Daniel Velasquez Patzan
=======
    Created on : 1/09/2021, 10:57:31 PM
    Author     : IVAN PC
>>>>>>> cc3ac25e090acec462cbb0fc14283259921bb458
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<<<<<<< HEAD
        <title>Inicio</title>
        <link rel="stylesheet" href="./assets/css/bootstrap.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <h1>Control Academico</h1>

        <jsp:include page="WEB-INF/paginas/comunes/cabecera.jsp"/>
        <a href="${pageContext.request.contextPath}/ServletInstructor?accion=listar"">Listar Instructor</a>
        <br>
        <a href="${pageContext.request.contextPath}/ServletSalon?accion=listar"">Listar Salon</a>
        
        
        
        <script src="./assets/js/jquery-3.6.0.js"></script>
        <script src="./assets/js/bootstrap.bundle.js"></script>
=======
        <title>Trabajo Grupal- Inicio</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- boostrap CSS -->
        <link rel="stylesheet" href="./assets/css/bootstrap.css">
    </head>
    <body>
       <h1>Alumnos:</h1>
        <a href="${pageContext.request.contextPath}/ServletAlumno?accion=listar">Listar Alumnos</a>
>>>>>>> cc3ac25e090acec462cbb0fc14283259921bb458
    </body>
</html>
