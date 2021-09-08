/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoGrupo.models.dao;

import com.proyectoGrupo.db.Conexion;
import com.proyectoGrupo.models.domain.AsignacionAlumno;
import com.proyectoGrupo.models.domain.Instructor;
import com.proyectoGrupo.models.idao.IAsignacionAlumnoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author jefer
 */
public class AsignacionAlumnoDaoImpl implements IAsignacionAlumnoDao {

    private static final String SQL_SELECT = "SELECT asignacion_id, fecha_asignacion, carne, curso_id FROM Asignacion_alumno;";
    private static final String SQL_DELETE = "DELETE FROM Asignacion_alumno WHERE asignacion_id = ?";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    AsignacionAlumno asignacionAlumno = null;
    List<AsignacionAlumno> listaAsignacionAlumno = new ArrayList<>();

    @Override
    public List<AsignacionAlumno> listar() {

        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int asignacion_id = rs.getInt("asignacion_id");
                Timestamp fechaAsignacion = rs.getTimestamp("fecha_asignacion");
                String carne = rs.getString("carne");
                int idCurso = rs.getInt("curso_id");

              asignacionAlumno = new AsignacionAlumno(asignacion_id, fechaAsignacion, carne, idCurso);
                listaAsignacionAlumno.add(asignacionAlumno);
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
        return listaAsignacionAlumno;
    }

  


    @Override
    public AsignacionAlumno encontrar(AsignacionAlumno asignacionAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(AsignacionAlumno asignacionAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(AsignacionAlumno asignacionAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(AsignacionAlumno asignacionAlumno) {
    int rows = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, asignacionAlumno.getIdAsignacion());
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(conn);

        }
        return rows;
    }

    
}
