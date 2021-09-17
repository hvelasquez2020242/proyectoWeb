/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoGrupo.controller;

import com.proyectoGrupo.models.dao.CursoDaoImpl;
import com.proyectoGrupo.models.domain.Curso;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author A-R
 */

@WebServlet("/ServletCurso")
public class ServletCurso extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarCurso(request, response);
                    break;
                case "eliminar":
                    eliminarCurso(request, response);
                    break;
            }
        }
    }
    
    private void listarCurso(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Curso> listaCurso = new CursoDaoImpl().listar();

        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoCurso", listaCurso);
        response.sendRedirect("Curso/Curso.jsp");
    }
    
    private void eliminarCurso(HttpServletRequest resquest, HttpServletResponse response) throws IOException {
        int idCurso = Integer.parseInt(resquest.getParameter("idcurso"));
        Curso cursos = new Curso(idCurso);
        
        int registroEliminados = new CursoDaoImpl().eliminar(cursos);
        System.out.println("Cantidad de registros eliminados" + registroEliminados);
        listarCurso(resquest, response);
    }
    
    private void insertarCurso(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        System.out.println("\nInsertar");
        
        String curso_id = request.getParameter("curso_id");
        String ciclo = request.getParameter("ciclo");
        String cupoMaximo = request.getParameter("cupo_maximo");
        String cupoMinimo = request.getParameter("cupo_minimo");
        String descripcion = request.getParameter("descipcion");
        String codigoCarreera = request.getParameter("codigo_carrera");
        String idHorario = request.getParameter("horario_id");
        String idInstructor = request.getParameter("instructor_id");
        String idSalon = request.getParameter("salon_id");
        
        Curso cursos = new Curso(0, 0, 0, 0, descripcion, codigoCarreera, 0, 0, 0);
        System.out.println(cursos);
        int registrosIngresados = new CursoDaoImpl().insertar(cursos);
        System.out.println("registors insertados" + registrosIngresados);
        listarCurso(request, response);
    }

    private void editarCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

        Curso curso = new CursoDaoImpl().encontrar(new Curso(idCurso));
        request.setAttribute("curso", curso);
        request.getRequestDispatcher("curso/editar_curso.jsp").forward(request, response);

    }
}