/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoGrupo.controller;

import com.proyectoGrupo.models.dao.InstructorDaoImpl;
import com.proyectoGrupo.models.dao.AsignacionAlumnoDaoImpl;
import com.proyectoGrupo.models.domain.AsignacionAlumno;
import com.proyectoGrupo.models.domain.Instructor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jefer
 */

@WebServlet("/ServletAsignacionAlumno")

public class ServletAsignacionAlumno extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String accion = request.getParameter("accion");
        
        if(accion != null) {
            switch(accion) {
                case "listar":
                    
                    listarAsignacionAlumno(request, response);
                    break;
                case "editar": 
                    break; 
                case "eliminar": 
                    eliminarAsignacionAlumno(request, response);
                    break;
                    
                    
            }
        }
        
    }
    private void listarAsignacionAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<AsignacionAlumno> listaAsignacion = new AsignacionAlumnoDaoImpl().listar();
        
        
        HttpSession session = request.getSession();
        session.setAttribute("listarAsignacionAlumno", listaAsignacion);
        response.sendRedirect("aignacionAlumno/listarAsignacionAlumno.jsp");
    }
    private void eliminarAsignacionAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException{
<<<<<<< HEAD
        int idAsignacion = Integer.parseInt(request.getParameter("asignacion_id"));
        
        AsignacionAlumno asignacionalumno = new AsignacionAlumno(idAsignacion);
        int registrosEliminados = new AsignacionAlumnoDaoImpl().eliminar(asignacionalumno);
=======
        int idAsignacion = Integer.parseInt(request.getParameter("idAsignacion"));
        
        AsignacionAlumno asignacionalumno = new AsignacionAlumno(idAsignacion);
        
        int registrosEliminados = new AsignacionAlumnoDaoImpl().eliminar(asignacionalumno);
        System.out.println("cantidad de registros eliminados: " + registrosEliminados);
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
        listarAsignacionAlumno(request, response);
    }
    
}
