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
                        <h1 class="text-center">Control Salon</h1>
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
                                <h4>Listado de Salones</h4>
                            </div>
                        </div>

                        <table class="table table-striped  ">
                            <thead class="table-dark">
                                <tr>
                                    <th>#</th>
                                    <th>Nombre del salon</th>
                                    <th>descripcion</th>
                                    <th>capacidad</th>
                                    <th></th> 
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="salon" items="${listadoSalones}">
                                    <tr>
                                        <td>${salon.idSalon}</td>
                                        <td>${salon.nombre_salon}</td>
                                        <td>${salon.descripcion}</td>
                                        <td>${salon.capacidad}</td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/ServletSalon?accion=eliminar&idSalon=${salon.idSalon}" class="link-info">Eliminar</a>

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
