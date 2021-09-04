/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyectoGrupo.models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.proyectoGrupo.models.domain.Instructor;
import java.sql.SQLException;
import com.proyectoGrupo.models.idao.IInstrucorDao;
import com.proyectoGrupo.db.Conexion;

/**
 *
 * @author Hugo Daniel Velasquez Patzan
 * Codigo Tecnico IN5BV 
 * @date 01-sep-2021
 * @time 12:35:38
 */
public class InstructorDaoImpl implements IInstrucorDao{

        private static final String SQL_SELECT = "SELECT instructor_id, apellidos, nombres, direccion, telefono FROM instructor;";
    private static final String SQL_DELETE = "DELETE FROM instructor WHERE instructor_id = ?";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Instructor instructor = null;
    List<Instructor> listaInstructor = new ArrayList<>();
    
    @Override
    public List<Instructor> listar() {

        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int idInstructor = rs.getInt("instructor_id");
                String apellidos = rs.getString("apellidos");
                String nombres = rs.getString("nombres");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");

       instructor = new Instructor(idInstructor, apellidos, nombres, direccion, telefono);
       listaInstructor.add(instructor);
            }

        } catch (SQLException e) {

            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
            return listaInstructor;
    }

    @Override
    public Instructor encontrar(Instructor instructor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Instructor instructor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Instructor instructor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Instructor instructor) {
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_DELETE);
             pstmt.setInt(1, instructor.getIdInstructor());
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(pstmt);
            Conexion.close(conn);
            
        }
        return rows;
    }
}
