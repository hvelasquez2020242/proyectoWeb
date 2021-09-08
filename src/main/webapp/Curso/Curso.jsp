<%-- 
    Document   : Curso
    Created on : 3/09/2021, 01:12:55 PM
    Author     : A-R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

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
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            Control Cursos
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <section id="cursos">
            <div class="container">
                <div class="row">
                    <div class="col-9">
                        <table class="table table-striped">
                            <thead class="table-dark">
                                <tr>
                                    <th>#</th>
                                    <th>Ciclo</th>
                                    <th>Cupo Maximo</th>
                                    <th>Cupo Minimo</th>
                                    <th>Descripcion</th>
                                    <th>Codigo de Carrera</th>
                                    <th>instructor</th>
                                    <th>salon</th>
                                    <th>horario</th>
                                    <th> </th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="curso" items="${listadoCurso}">
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
                                        <td> 
                                            <a href="${pageContext.request.contextPath}/ServletCurso?accion=eliminar&idCurso=${curso.idCurso}">eliminar</a>
                                        </td>
                                    </tr>

                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>

        </section>


        <script src="../assets/js/jquery-3.6.0.js"></script>
        <script src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>