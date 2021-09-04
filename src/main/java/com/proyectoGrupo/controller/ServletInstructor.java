/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyectoGrupo.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.proyectoGrupo.models.domain.Instructor;
import com.proyectoGrupo.models.dao.InstructorDaoImpl;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Hugo Daniel Velasquez Patzan
 * Codigo Tecnico IN5BV 
 * @date 01-sep-2021
 * @time 11:40:52
 */
@WebServlet("/ServletInstructor")

public class ServletInstructor extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String accion = request.getParameter("accion");
        
        if(accion != null) {
            switch(accion) {
                case "listar":
                    
                    listarInstructor(request, response);
                    break;
                case "editar": 
                    break; 
                case "eliminar": 
                    eliminarInstructor(request, response);
                    break;
                    
                    
            }
        }
        
    }
    private void listarInstructor(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Instructor> listaInstructor = new InstructorDaoImpl().listar();
        
        
        HttpSession session = request.getSession();
        session.setAttribute("listaInstructor", listaInstructor);
        response.sendRedirect("instructor/listarInstructor.jsp");
    }
    private void eliminarInstructor(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int idInstructor = Integer.parseInt(request.getParameter("idInstructor"));
        
        Instructor instructor = new Instructor(idInstructor);
        int registrosEliminados = new InstructorDaoImpl().eliminar(instructor);
        listarInstructor(request, response);
    }

}






















