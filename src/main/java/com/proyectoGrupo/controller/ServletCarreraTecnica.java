/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoGrupo.controller;

import com.proyectoGrupo.models.dao.ProyectoGrupoDaoImpl;
import com.proyectoGrupo.models.domain.CarreraTecnica;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import com.proyectoGrupo.models.dao.CarreraTecnicaDaoImpl;
import java.util.List;
import java.io.IOException;

/**
 *
 * @author César Luis
 */
@WebServlet("/ServletCarreraTecnica")
public class ServletCarreraTecnica extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
        String accion = request.getParameter("accion");

        
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarCarreraTecnica(request, response);
                    break;
                case "editar":
                    //--
                    break;
                case "eliminar":
                    eliminarCarreraTecnica(request, response);
                    break;
            }
        }
    }

    private void eliminarCarreraTecnica(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String codigoCarrera = request.getParameter("codigo_carrera");

        CarreraTecnica carreraTecnica = new CarreraTecnica(codigoCarrera);

 
        int registrosEliminados = new CarreraTecnicaDaoImpl().eliminar(carreraTecnica);


        listarCarreraTecnica(request, response);
    }


    private void listarCarreraTecnica(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<CarreraTecnica> listaCarrerasTecnicas = new CarreraTecnicaDaoImpl().listar();

        //Enviamos esa lista que va ir como atributo
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoCarrerasTecnicas", listaCarrerasTecnicas);
    
        response.sendRedirect("carreras_tecnicas/listarCarrerasTecnicas.jsp");
    }

   
}
