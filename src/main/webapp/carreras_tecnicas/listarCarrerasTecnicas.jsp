<%-- 
    Document   : listarCarrerasTecnicas
    Created on : Sep 2, 2021, 12:33:39 PM
    Author     : César Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Para iterar los registros de la tablas y poder mostrarlos en la pagina-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../assets/css/style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!--Bostsrap-->
        <link rel="stylesheet" href="../assets/css/bootstrap.css">
        <!--Bostsrap-->

        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>

        <title>Carreras Técnicas</title>
    </head>
    <body>     

        <header id="main-header" class="py-2 bg-light pt-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1 class="text-center">Carrera tecnica</h1>
                    </div>
                </div>
            </div>
        </header>
        <!--Cabecera (header y nav) -->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecera.jsp"/>
        <!--Cabecera (header y nav) -->
        
        <header id="main-header" class="py-2 bg-light pt-4">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            <i class="fas fa-cog"> </i> Control carreras tecnicas  <i class="fas fa-cog"> </i>
                        </h1>
                    </div>
                </div>
            </div>
        </header>
        
        <!-- Agregar Estudiantes -->
        <section id="acciones" class="py-4 mb-4" >
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-3">
                        <a class="btn btn-outline-info">
                            <i class="fas fa-plus"></i> Agregar Carreras Técnicas
                        </a>
                    </div>
                </div>
            </div>
        </section>

        <section id="estudiantes">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12 col-md-12">

                        <div class="card">
                            <div class="card-header">
                                <h4> <i class="fas fa-school"></i> Listado Carreras Técnicas <i class="fas fa-school"></i> </h4>
                            </div>
                        </div>

                        <!--Creando la tabla-->
                        <!--Encabezado-->
                        <table class="table table-striped">
                            <thead class="table-primary">
                                <tr>
                                    <th> <i class="fas fa-book-open"></i> #</th>
                                    <th>Código de Carrera</th>
                                    <th>Nombre de Carrera</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <!--Cuerpo-->
                            <tbody>
                                <!--Implementamos un ciclo for "jstl" que me permite recorrer todo ese arreglo-->
                                <c:forEach var="carreraTecnica" items="${listadoCarrerasTecnicas}">
                                    <tr>
                                        <td>${carreraTecnica.codigoCarrera}</td>
                                        <td>${carreraTecnica.nombre}</td>
                                        
                                        <td>
                                            <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletCarreraTecnica?accion=editar&codigo_carrera=${carreraTecnica.codigoCarrera}">
                                            <i class="fas fa-user-edit"></i> Editar
                                            </a>
                                        </td>
                                        
                                        <td>
                                            <a class="btn btn-outline-danger" href="${pageContext.request.contextPath}/ServletCarreraTecnica?accion=eliminar&codigo_carrera=${carreraTecnica.codigoCarrera}">
                                            <i class="fas fa-trash-alt"></i> Eliminar
                                            </a>
                                        </td>
                                        
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table><!--Finalización de la tablas-->                      
                    </div>
                </div>
            </div>
        </section>

        <!--Pie de pagina (footer) -->

        <!--Pie de pagina (footer) -->

        <!--javaScrip-->
        <script src="../assets/js/jquery-3.6.0.js"></script>
        <script src="../assets/js/bootstrap.bundle.js"></script>
        <!--BjavaScrip-->

    </body>
</html>