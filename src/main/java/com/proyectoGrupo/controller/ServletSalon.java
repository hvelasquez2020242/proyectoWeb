package com.proyectoGrupo.controller;

import com.proyectoGrupo.db.Conexion;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.util.List;
import com.proyectoGrupo.models.dao.SalonDaoImpl;
import com.proyectoGrupo.models.domain.Salon;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * --add-modules javafx.controls,javafx.fxml
 *
 * @author Denil José Parada Cabrera
 * @date 25/08/2021
 * @time 11:40:37 PM
 * @codigoTecnico: IN5BV
 */
@WebServlet("/ServletSalon")
public class ServletSalon extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {

            switch (accion) {

                case "listar":
                    listarSalones(request, response);
                    break;
                case "editar":
                    //..
                    break;
                case "eliminar":
                    EliminarSalones(request, response);
                    break;
            }

        }
    }

    private void listarSalones(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Salon> listaSalon = new SalonDaoImpl().listar();

        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoSalones", listaSalon);
        response.sendRedirect("salon/listarSalon.jsp");

    }
    
    private void EliminarSalones(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idSalon = Integer.parseInt(request.getParameter("idSalon"));

        Salon salon = new Salon(idSalon);

        int registrosEliminados = new SalonDaoImpl().eliminar(salon);
        System.out.println("cantidad de registros eliminados: " + registrosEliminados);
        listarSalones(request, response);

    }

    

}
