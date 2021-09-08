<%-- 
    Document   : listarAlumno
    Created on : 2/09/2021, 01:19:34 AM
    Author     : IVAN PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- boostrap CSS -->
        <link rel="stylesheet" href="../assets/css/bootstrap.css">
        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>

        <title>Listado de Alumnos</title>
    </head>
    <body>
        <header id="main-header" class="py-2 bg-light pt-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1 class="text-center">Control Alumno</h1>
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp"/>

        <header id="main-header" class="py-2 bg-light pt-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            <i class="fas fa-cog"> </i> Control Alumno <i class="fas fa-cog"> </i>
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <section id="acciones" class="py-4 mb-4" >
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-3">
                        <a class="btn btn-outline-info"><i class="fas fa-plus"></i> Agregar Alumno</a>
                    </div>
                </div>
            </div>
        </section>


        <section id="estudiantes" class="mb-5 mt-5">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12 col-md-12">


                        <div class="card">
                            <div class="card-header">
                                <h4><i class="fas fa-user-graduate"></i> Listado de Alumnos <i class="fas fa-user-graduate"></i></h4>
                            </div>
                        </div>

                        <table class="table table-striped  ">
                            <thead class="table-dark">
                                <tr>
                                    <th><i class="fas fa-book-open"></i> #</th>
                                    <th>Nombre Completo</th>
                                    <th><i class="fas fa-at"></i> Email</th>
                                    <th></th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="alumno" items="${listadoAlumno}">
                                    <tr>                          
                                        <td><i class="fas fa-user-alt"></i> ${alumno.carne}</td>
                                        <td>${alumno.apellidos} ${alumno.nombres}</td>
                                        <td>${alumno.email}</td>

                                        <td>
                                            <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletEstudiante?accion=editar&idEstudiante=${estudiante.idEstudiante}">
                                                <i class="fas fa-user-edit"></i> Editar
                                            </a>
                                        </td> 

                                        <td>                        
                                            <a class="btn btn-outline-danger" href="${pageContext.request.contextPath}/ServletAlumno?accion=eliminar&carne=${alumno.carne}">
                                                <i class="fas fa-trash-alt"></i>Eliminar</a>
                                        </td> 

                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>    
                    </div>


                </div>
            </div>
        </div>
    </section>


    <script src="../assets/js/jquery-3.6.0.js"></script> 
    <script src="../assets/js/bootstrap.bundle.js"></script>
</body>
</html>
