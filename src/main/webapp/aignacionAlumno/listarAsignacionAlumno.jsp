<<<<<<< HEAD
=======
<%-- 
    Document   : estudiante
    Created on : 26/08/2021, 12:42:19 AM
    Author     : Denil José Parada Cabrera 
--%>

>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--<link rel="stylesheet" type="text/css" href="../assets/css/style.css">
         Bootstrap CSS --> 
        <link rel="stylesheet" href="../assets/css/bootstrap.css">
<<<<<<< HEAD
        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>

        <title>Listado de asignacion alumno</title>
=======

        <title>Listado de Salones</title>
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
    </head>
    <body>
        <header id="main-header" class="py-2 bg-light pt-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
<<<<<<< HEAD
                        <h1 class="text-center">Asignacion alumno</h1>
=======
                        <h1 class="text-center">Control AsignacionAlumno</h1>
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp"/>

<<<<<<< HEAD
        <header id="main-header" class="py-2 bg-light pt-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            <i class="fas fa-cog"> </i> Control asignacion alumno  <i class="fas fa-cog"> </i>
                        </h1>
                    </div>
                </div>
            </div>
        </header>


        <section id="acciones" class="py-4 mb-4" >
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-3">
                        <a class="btn btn-outline-info">
                            <i class="fas fa-plus"></i> Agregar
                        </a>
                    </div>
                </div>
            </div>
        </section>

        <section id="estudiantes" class="mb-5 mt-5">
=======
        <section id="estudiantes">
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
            <div class="container">
                <div class="row">
                    <div class="col-xs-12 col-md-12">


                        <div class="card">
                            <div class="card-header">
<<<<<<< HEAD
                                <h4> <i class="fas fa-chalkboard-teacher"></i> Listado de asignacion alumno <i class="fas fa-chalkboard-teacher"></i> </h4>
                            </div>
                        </div>

                        <table class="table table-striped "> 
                            <thead class="table-primary">
                               
                                    <tr>
                                    <th> <i class="fas fa-book-open"></i> #</th>
=======
                                <h4>Listado de AsignacionAlumno</h4>
                            </div>
                        </div>

                        <table class="table table-striped  ">
                            <thead class="table-dark">
                                <tr>
                                    <th>#</th>
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
                                    <th>Fecha asignacion</th>
                                    <th>carne</th>
                                    <th>id curso</th>
                                    <th></th>
<<<<<<< HEAD
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                   <c:forEach var="asigancionAlumno" items="${listarAsignacionAlumno}">
                                    <tr>
                                        <td> <i class="fas fa-book-reader"></i> ${asigancionAlumno.idAsignacion}</td>
                                        <td>${asigancionAlumno.fechaAsignacion}</td>
                                        <td>${asigancionAlumno.carne}</td>
                                        <td>${asigancionAlumno.idCurso}</td>

                                        <td>
                                            <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletAsignacionAlumno?accion=editar&idAsignacion=${asigancionAlumno.idAsignacion}">
                                                <i class="fas fa-user-edit"></i> Editar
                                            </a>
                                        </td> 

                                              <td>
                                            <a class="btn btn-outline-danger" href="${pageContext.request.contextPath}/ServletAsignacionAlumno?accion=eliminar&idAsignacion=${asignacionAlumno.idAsignacion}">
                                            <i class="fas fa-trash-alt"></i> Eliminar
                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>

                                </tbody>
=======
                                    
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="asigancionAlumno" items="${listarAsignacionAlumno}">
                                    <tr>
                                        <td>${asigancionAlumno.idAsignacion}</td>
                                        <td>${asigancionAlumno.fechaAsignacion}</td>
                                        <td>${asigancionAlumno.carne}</td>
                                        <td>${asigancionAlumno.idCurso}</td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/ServletAsignacionAlumno?accion=eliminar&idAsignacion=${asigancionAlumno.idAsignacion}" class="link-info">Eliminar</a>

                                        </td> 
                                    </tr>
                                </c:forEach>
                            </tbody>
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
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
