<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="../assets/css/bootstrap.css">  
        <title>Listado de horario</title>
    </head>
    <body>
        <header id="main-header" class="py-2 bg-info text-white">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            Control horario
                        </h1>
                    </div>
                </div>
            </div>
            <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp"/>
            <section id="estudiantes">
                <div class="container">
                    <div class="row">
                        <div class="col-9">
                            <table class="table table-striped">

                                <thead class="table-dark">

                                    <tr>
                                        <th>#</th>
                                        <th>horario final</th>
                                        <th>horario inicio</th>
                                                
                                        <th></th>
                                    </tr>



                                </thead>
                                <tbody>
                                    <c:forEach var="horario" items="${listadoHorario}">
                                        <tr>
                                            <td>${horario.idHorario}</td>
                                            <td>${horario.horario_final} ${instructor.apellidos}</td>
                                            <td>${horario.horario_inicio}</td>
                                            <td>
                                                <a href="${pageContext.request.contextPath}/ServletHorario?accion=eliminar&idHorario=${horario.idHorario}">Eliminar</a>

                                            </td>

                                        </tr>
                                    </c:forEach>

                                </tbody>

                            </table>
                        </div>
                       
                    </div>
                </div>
            </section>
        </header>

        <script src="../assets/js/jquery-3.6.0.js"></script>
        <script src="../assets/js/bootstrap.bundle.js"></script>

    </body>
</html>
