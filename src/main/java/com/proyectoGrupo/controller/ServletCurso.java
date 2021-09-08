/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoGrupo.controller;

import com.proyectoGrupo.models.dao.CursoDaoImpl;
import com.proyectoGrupo.models.domain.Curso;
import java.io.IOException;
import java.util.List;
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
}