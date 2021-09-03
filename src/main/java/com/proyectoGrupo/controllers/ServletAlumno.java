/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoGrupo.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.util.List;
import com.proyectoGrupo.models.dao.AlumnoDaoImpl;
import com.proyectoGrupo.models.domain.Alumno;
import java.io.IOException;


/**
 *
 * @author IVAN PC
 */
@WebServlet("/ServletAlumno")
public class ServletAlumno extends HttpServlet{
    
    
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String accion = request.getParameter("accion");
        
        if(accion != null){
            switch(accion){
                case "listar":
                    listarAlumno(request,response);
                    break;
                case "editar":
                    //...
                    break;
                case "eliminar":
                    eliminarAlumno(request, response);
                    break;
            }
        }
    }
    
     private void eliminarAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String carne = request.getParameter("carne");
        Alumno alumno = new Alumno(carne);
        int registrosEliminados = new AlumnoDaoImpl().eliminar(alumno);
        
        
        
        
        System.out.println();
        listarAlumno(request, response);
        
    }
    
    private void listarAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Alumno> listaAlumnos = new AlumnoDaoImpl().listar();
        
        HttpSession sesion= request.getSession();
        sesion.setAttribute("listadoAlumno", listaAlumnos);
        
        response.sendRedirect("alumno/listarAlumno.jsp");
        
    }
    
   
    
}
