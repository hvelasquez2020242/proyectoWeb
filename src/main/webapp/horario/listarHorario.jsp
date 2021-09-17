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
        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>

        <title>Listado de horario</title>
    </head>
    <body>
        <header id="main-header" class="py-2 bg-light pt-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1 class="text-center">Horario</h1>
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
                            <i class="fas fa-cog"> </i> Control horario  <i class="fas fa-cog"> </i>
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
                            <i class="fas fa-plus"></i> Agregar horario
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
                                <h4> <i class="fas fa-chalkboard-teacher"></i> Listado de horario <i class="fas fa-chalkboard-teacher"></i> </h4>
                            </div>
                        </div>

                        <table class="table table-striped "> 
                            <thead class="table-primary">
                               
                                    <tr>
                                       <th>#</th>
                                        <th>horario final</th>
                                        <th>horario inicio</th>        
                                        <th></th>
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
                                            <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletHorario?accion=editar&idHorario=${horario.idHorario}">
                                                <i class="fas fa-user-edit"></i> Editar
                                            </a>
                                        </td> 
                                            <td>
                                            <a class="btn btn-outline-danger" href="${pageContext.request.contextPath}/ServletHorario?accion=eliminar&idHorario=${horario.idHorario}">
                                                <i class="fas fa-trash-alt"></i> Eliminar
                                            </a>
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
