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
import com.proyectoGrupo.models.domain.Alumno;
import java.io.IOException;

<<<<<<< HEAD
=======

>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
/**
 *
 * @author IVAN PC
 */
@WebServlet("/ServletAlumno")
<<<<<<< HEAD
public class ServletAlumno extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");

        List<Alumno> listaAlumno;
        listaAlumno = new AlumnoDaoImpl().listar();

        for (Alumno alumno : listaAlumno) {
            System.out.println(alumno);
        }

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarAlumno(request, response);
                    break;
                case "editar":
                    editarAlumno(request, response);
=======
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
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
                    break;
                case "eliminar":
                    eliminarAlumno(request, response);
                    break;
            }
        }
    }
<<<<<<< HEAD

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");

        String accion = request.getParameter("accion");

        System.out.println("accion: " + accion);

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    insertarAlumno(request, response);
                    break;
                case "actualizar":
                    actualizarAlumno(request, response);
                    break;
            }
        }
    }

    private void insertarAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String carne = request.getParameter("carne");
        String apellido = request.getParameter("apellido");
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        Alumno alumno = new Alumno(carne, apellido, nombre, email);
        System.out.println(alumno);
        int registrosIngresados = new AlumnoDaoImpl().insertar(alumno);
        System.out.println("Registros insertado:" + registrosIngresados);
        listarAlumno(request, response);
    }

    private void eliminarAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String carne = request.getParameter("carne");
        Alumno alumno = new Alumno(carne);
        int registrosEliminados = new AlumnoDaoImpl().eliminar(alumno);

        System.out.println();
        listarAlumno(request, response);

    }

    private void listarAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Alumno> listaAlumnos = new AlumnoDaoImpl().listar();

        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoAlumno", listaAlumnos);

        response.sendRedirect("alumno/listarAlumno.jsp");

    }

    private void editarAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String carne = request.getParameter("carne");
        Alumno alumno = new AlumnoDaoImpl().encontrar(new Alumno(carne));
        System.out.println();
        System.out.println(alumno);
        request.setAttribute("alumno", alumno);
        request.getRequestDispatcher("alumno/editar-alumno.jsp").forward(request, response);

    }

    private void actualizarAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String carne = request.getParameter("carne");
        String apellido = request.getParameter("apellidos");
        String nombre = request.getParameter("nombres");
        String email = request.getParameter("email");
        Alumno alumno = new Alumno(carne, apellido, nombre, email);
        System.out.println(alumno);
        int registrosIngresados = new AlumnoDaoImpl().actualizar(alumno);
        System.out.println("Registros insertado:" + registrosIngresados);
        listarAlumno(request, response);

    }
=======
    
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
    
   
    
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
}
