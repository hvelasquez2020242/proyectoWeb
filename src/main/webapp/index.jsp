<%-- 
    Document   : index
    Created on : 03-sep-2021, 15:00:10
    Author     : Hugo Daniel Velasquez Patzan
--%>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Menu</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
                        </li>
                        
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Entidades
                            </a>
                            <ul class="dropdown-menu navbar-light" style="background-color: #e3f2fd;" aria-labelledby="navbarDropdownMenuLink">
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletInstructor?accion=listar"">Listar Instructor</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletSalon?accion=listar"">Listar Salon</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletCurso?accion=listar"">Listar Curso</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletCarreraTecnica?accion=listar"">Listar Carrera tecnica</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletAsignacionAlumno?accion=listar"">Listar Asignacion alumno</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ServletAlumno?accion=listar"">Listar alumno</a></li>

                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>