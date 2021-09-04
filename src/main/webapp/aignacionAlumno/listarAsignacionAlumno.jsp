<%-- 
    Document   : estudiante
    Created on : 26/08/2021, 12:42:19 AM
    Author     : Denil José Parada Cabrera 
--%>

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

        <title>Listado de Salones</title>
    </head>
    <body>
        <header id="main-header" class="py-2 bg-light pt-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1 class="text-center">Control AsignacionAlumno</h1>
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp"/>

        <section id="estudiantes">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12 col-md-12">


                        <div class="card">
                            <div class="card-header">
                                <h4>Listado de AsignacionAlumno</h4>
                            </div>
                        </div>

                        <table class="table table-striped  ">
                            <thead class="table-dark">
                                <tr>
                                    <th>#</th>
                                    <th>Fecha asignacion</th>
                                    <th>carne</th>
                                    <th>id curso</th>
                                    <th></th>
                                    
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
                                            <a href="${pageContext.request.contextPath}/ServletAsignacionAlumno?accion=eliminar&asignacion_id=${asignacionAlumno.idAsignacion}" class="link-info">Eliminar</a>

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
