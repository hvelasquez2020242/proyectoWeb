<%-- 
    Document   : Curso
    Created on : 3/09/2021, 01:12:55 PM
    Author     : A-R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<<<<<<< HEAD
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--<link rel="stylesheet" type="text/css" href="../assets/css/style.css">
         Bootstrap CSS --> 
        <link rel="stylesheet" href="../assets/css/bootstrap.css">
        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>

        <title>Listado de curso</title>
    </head>
    <body>
        <header id="main-header" class="py-2 bg-light pt-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1 class="text-center">Curso</h1>
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp"/>

        <header id="main-header" class="py-2 bg-light pt-4">
=======

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content = "width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../assets/css/style.css">
        <link rel="stylesheet" href="../assets/css/bootstrap.css">

        <title>Lisitado Cursos</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/paginas/comunes/cabecera.jsp"/>

        <header id= "main-header" class="py-2 bg-info text-white">
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
<<<<<<< HEAD
                            <i class="fas fa-cog"> </i> Control curso  <i class="fas fa-cog"> </i>
=======
                            Control Cursos
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
                        </h1>
                    </div>
                </div>
            </div>
        </header>

<<<<<<< HEAD

        <section id="acciones" class="py-4 mb-4" >
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-3">
                        <a class="btn btn-outline-info">
                            <i class="fas fa-plus"></i> Agregar curso
                        </a>
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
                                <h4> <i class="fas fa-chalkboard-teacher"></i> Listado de curso <i class="fas fa-chalkboard-teacher"></i> </h4>
                            </div>
                        </div>

                        <table class="table table-striped "> 
                            <thead class="table-primary">
                               
                                     <tr>
                                    <th> <i class="fas fa-book-open"></i> #</th>
=======
        <section id="cursos">
            <div class="container">
                <div class="row">
                    <div class="col-9">
                        <table class="table table-striped">
                            <thead class="table-dark">
                                <tr>
                                    <th>#</th>
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
                                    <th>Ciclo</th>
                                    <th>Cupo Maximo</th>
                                    <th>Cupo Minimo</th>
                                    <th>Descripcion</th>
                                    <th>Codigo de Carrera</th>
                                    <th>instructor</th>
                                    <th>salon</th>
                                    <th>horario</th>
                                    <th> </th>
<<<<<<< HEAD
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                     <c:forEach var="curso" items="${listadoCurso}">
=======
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="curso" items="${listadoCurso}">
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
                                    <tr>
                                        <td>${curso.idCurso}</td>
                                        <td>${curso.ciclo}
                                        <td>${curso.cupoMaximo}</td>
                                        <td>${curso.cupoMinimo}</td>
                                        <td>${curso.descripcion}</td>
                                        <td>${curso.codigoCarrera}</td>
                                        <td>${curso.idInstructor}</td>
                                        <td>${curso.idSalon}</td>
                                        <td>${curso.idHorario}</td>
<<<<<<< HEAD
                                         <td>
                                            <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletCurso?accion=editar&idCurso=${curso.idCurso}">
                                                <i class="fas fa-user-edit"></i> Editar
                                            </a>
                                        </td> 
                                            <td>
                                            <a class="btn btn-outline-danger" href="${pageContext.request.contextPath}/ServletCurso?accion=eliminar&idCurso=${curso.idCurso}">
                                                <i class="fas fa-trash-alt"></i> Eliminar
                                            </a>
                                        </td> 
                                        
=======
                                        <td> 
                                            <a href="${pageContext.request.contextPath}/ServletCurso?accion=eliminar&idCurso=${curso.idCurso}">eliminar</a>
                                        </td>
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
                                    </tr>

                                </c:forEach>

<<<<<<< HEAD
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






=======
                            </tbody>
                        </table>
                    </div>
                </div>

        </section>


        <script src="../assets/js/jquery-3.6.0.js"></script>
        <script src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
