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

        <title>CARRERAS TÉCNICAS</title>
    </head>
    <body>

        <!--Cabecera (header y nav) -->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecera.jsp"/>
        <!--Cabecera (header y nav) -->

        <header id="main-header" class="py-2 bg-primary text-white text-center">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            Carreras Tecnicas
                        </h1>
                    </div>
                </div>
            </div>
        </header> 


        <section id="estudiantes">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12 col-md-9">

                        <div class="card">
                            <div class="card-header">
                                <h4>Listado de estudiantes</h4>
                            </div>
                        </div>

                        <!--Creando la tabla-->
                        <!--Encabezado-->
                        <table class="table table-striped">
                            <thead class="table-dark">
                                <tr>
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
                                            <a href="${pageContext.request.contextPath}/ServletCarreraTecnica?accion=eliminar&codigo_carrera=${carreraTecnica.codigoCarrera}">Eliminar</a>
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