<%-- 
    Document   : editar_curso
    Created on : 16/09/2021, 06:21:33 PM
    Author     : A-R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="./assets/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Cabin:ital@1&family=Comfortaa:wght@700&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>

        <!--Bootstrap CSS -->
        <link rel="stylesheet" href="./assets/css/bootstrap.css">

        <title>Editar Curso</title>

    </head>
    <body id="body_Kinal">

        <!-- Cabecera -->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecera.jsp"/>

        <header id="main-header" class="py-2 bg-info text-white text-center">
            <div class="conteiner">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <h1>
                            <i class="fas fa-user-edit"></i>  Editar Curso
                        </h1>
                    </div>
                </div>
            </div>
        </header>
        <section id="actions" class="py-4 mb-4 bg-dark">
            <div class="conteiner">
                <div class="row">
                    <div class="col-md-3">
                        <a href="${pageContext.request.contextPath}/ServletCurso?accion=listar" class="btn btn-outline-info"><i class="fas fa-reply"></i>     Regresar a Curso</a>
                    </div>
                </div>
            </div>
        </section>
        <main>
            <div class="conteiner">
                <div class="row">
                    <div class="col-12">
                        <div class="card bg-dark">
                            <div class="card-body">
                                <form method="POST" action="${pageContext.request.contextPath}/ServletCurso">
                                    <div class="form-floating mb-3">
                                        <input type="text" id="ciclo" name="ciclo" class="form-control" placeholder="Ciclo" value="${curso.ciclo}">
                                        <label for="ciclo" class="form-label">Ciclo</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="text" id="cupo_maximo" name="cupo_maximo" class="form-control" placeholder="Cupo Maximo" value="${curso.cupoMaximo}">
                                        <label for="cupo_maximo" class="form-label">Cupo Maximo</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="cupo_minimo" id="cupo_minimo" name="cupo_minimo" class="form-control" placeholder="Cupo Minimo" value="${curso.cupoMinimo}">
                                        <label for="cupo_minimo" class="form-label">Cupo Minimo </label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="descipcion" id="descipcion" name="descipcion" class="form-control" placeholder="Descipcion" value="${curso.descipcion}">
                                        <label for="descipcion" class="form-label">Descipcion</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="codigo_carrera" id="codigo_carrera" name="codigo_carrera" class="form-control" step="any" placeholder="Codigo Carrera" value="${curso.codigoCarrera}">
                                        <label for="codigo_carrera" class="form-label">Codigo Carrera</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="horario_id" id="horario_id" name="horario_id" class="form-control" step="any" placeholder="Horario" value="${curso.idHorario}">
                                        <label for="horario_id" class="form-label"> Horario</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="instructor_id" id="instructor_id" name="instructor_id" class="form-control" step="any" placeholder=" Instructor" value="${curso.idInstructor}">
                                        <label for="instructor_id" class="form-label"> Instructor</label>
                                    </div>  
                                    <div class="form-floating mb-3">
                                        <input type="salon_id" id="salon_id" name="salon_id" class="form-control" step="any" placeholder=" Salon" value="${curso.isSalon}">
                                        <label for="salon_id" class="form-label"> Salon</label>
                                    </div>
                                    <input type="hidden" name="accion" value="actualizar">
                                    <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Cancelar</button>
                                    <button type="submit" class="btn btn-primary">Guardar</button>

                                    <input type="hidden" name="idCurso" value="${curso.idCurso}">
                                    <input type="hidden" name="accion" value="actualizar">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>


        <!-- Pie de Pagina -->
        <jsp:include page="/WEB-INF/paginas/comunes/pie_de_pagina.jsp"/>

        <script src="../assets/js/jquery-3.6.0.js"></script>
        <script src="../assets/js/bootstrap.bundle.js"></script>

    </body>
</html>
