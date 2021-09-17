<%-- 
    Document   : Curso
    Created on : 3/09/2021, 01:12:55 PM
    Author     : A-R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<fmt:setLocale value="es_GT"/>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content = "width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../assets/css/style.css">
        <link rel="stylesheet" href="../assets/css/bootstrap.css">
        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>


        <title>Lisitado Cursos</title>
    </head>
    <body>
       <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp"/>
       
        <header id= "main-header" class="py-2 bg-info text-white">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1 class="text-center">
                            Control Cursos
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <section id="acciones" class="py-4 mb-4">
            <div class="conteiner">
                <div class="row">
                    <div class="col-12">
                        <a class="btn btn-outline-info" data-bs-toggle="modal" data-bs-target="#agregar_curso_Modal">
                            <i class="fas fa-folder-plus"></i>  Agregar
                        </a>
                    </div>
                </div>
            </div>
            <!-- Modal -->
            <div class="modal fade" id="" taagregar_curso_Modalbindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header text-white bg-dark">
                            <h5 class="modal-title" id="exampleModalLabel">Agregar Nuevo Registro</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletCurso">
                            <div class="modal-body bg-dark text-dark">
                                <div class="form-floating mb-3">
                                    <input type="text" id="ciclo" name="ciclo" class="form-control" placeholder="Ciclo">
                                    <label for="ciclo" class="form-label">Ciclo</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input type="text" id="cupo_maximo" name="cupo_maximo" class="form-control" placeholder="cupoMaximo">
                                    <label for="cupo_maximo" class="form-label">Cupo Maximo</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input type="cupo_minimo" id="cupo_minimo" name="cupo_minimo" class="form-control" placeholder="Cupo Minimo ">
                                    <label for="cupo_minimo" class="form-label">Cupo Minimo </label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input type="descipcion" id="descipcion" name="descipcion" class="form-control" placeholder="Descipcion">
                                    <label for="descipcion" class="form-label">Descipcion</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input type="codigo_carrera" id="codigo_carrera" name="codigo_carrera" class="form-control" step="any" placeholder="Codigo Carrera">
                                    <label for="codigo_carrera" class="form-label">Codigo Carrera</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input type="horario_id" id="horario_id" name="horario_id" class="form-control" placeholder="Horario">
                                    <label for="horario_id" class="form-label">Horario</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input type="instructor_id" id="instructor_id" name="instructor_id" class="form-control" placeholder="Instructor">
                                    <label for="instructor_id" class="form-label">Instructor</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input type="salon_id" id="telefono" name="salon_id" class="form-control" placeholder="Salon">
                                    <label for="salon_id" class="form-label">Salon</label>
                                </div>
                                <input type="hidden" name="accion" value="insertar">
                            </div>
                            <div class="modal-footer bg-dark">
                                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Cancelar</button>
                                <button type="submit" class="btn btn-primary">Guardar</button>
                            </div>

                        </form>

                    </div>
                </div>
            </div>

        </section>

        <section id="cursos">
            <div class="container">
                <div class="row">
                    <div class="col-9">
                        <table class="table table-striped  ">
                            <thead class="table-dark">
                                <tr>
                                    <th> <i class="fas fa-book-open"></i> #</th>
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
                                        <td><i class="fas fa-copy"></i> ${curso.idCurso}</td>
                                        <td>${curso.ciclo}
                                        <td>${curso.cupoMaximo}</td>
                                        <td>${curso.cupoMinimo}</td>
                                        <td>${curso.descripcion}</td>
                                        <td>${curso.codigoCarrera}</td>
                                        <td>${curso.idInstructor}</td>
                                        <td>${curso.idSalon}</td>
                                        <td>${curso.idHorario}</td>
                                        <td> 
                                            <a href="${pageContext.request.contextPath}/ServletCurso?accion=eliminar&idCurso=${curso.idCurso}" class="link-info">eliminar</a>
                                        </td>

                                        <td>
                                            <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletInstructor?accion=editar&idInstructor=${instructor.idInstructor}">
                                                <i class="fas fa-user-edit"></i> Editar
                                            </a>
                                        </td> 

                                        <td>
                                            <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletSalon?accion=editar&idSalon=${salon.idSalon}">
                                                <i class="fas fa-user-edit"></i> Editar
                                            </a>
                                        </td> 

                                        <td>
                                            <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletHoratio?accion=editar&idHorario=${horario.idHorario}">
                                                <i class="fas fa-user-edit"></i> Editar
                                            </a>
                                        </td> 

                                        <td>
                                            <a class="btn btn-outline-danger" href="${pageContext.request.contextPath}/ServletCurso?accion=eliminar&idCurso=${curso.idCurso}">
                                                <i class="fas fa-trash-alt"></i> Eliminar
                                            </a>
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