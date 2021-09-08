/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyectoGrupo.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.util.List;
import com.proyectoGrupo.models.dao.AlumnoDaoImpl;
import com.proyectoGrupo.models.dao.HorarioDaoImpl;
import com.proyectoGrupo.models.domain.Alumno;
import com.proyectoGrupo.models.domain.Horario;
import java.io.IOException;


import com.proyectoGrupo.models.idao.IHorarioDao;
/**
 *
 * @author Hugo Daniel Velasquez Patzan
 * Codigo Tecnico IN5BV 
 * @date 03-sep-2021
 * @time 21:10:01
 */
@WebServlet("/ServletHorario")
public class ServletHorario extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String accion = request.getParameter("accion");
        
        if(accion != null){
            switch(accion){
                case "listar":
                    listarHorario(request,response);
                    break;
                case "editar":
                    //...
                    break;
                case "eliminar":
                    eliminarHorario(request, response);
                    break;
            }
        }
    }
    
     private void eliminarHorario(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int idHorario = Integer.parseInt(request.getParameter("idHorario"));
         Horario horario = new Horario(idHorario);
        int registrosEliminados = new HorarioDaoImpl().eliminar(horario);
        
        
        
        
        System.out.println();
        listarHorario(request, response);
        
    }
    
    private void listarHorario(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Horario> listaHorario = new HorarioDaoImpl().listar();
        
        HttpSession sesion= request.getSession();
        sesion.setAttribute("listadoHorario", listaHorario);
        
        response.sendRedirect("horario/listarHorario.jsp");
        
    }
}
