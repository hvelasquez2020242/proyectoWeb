/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoGrupo.models.dao;

import com.proyectoGrupo.db.Conexion;
import com.proyectoGrupo.models.domain.Curso;
import com.proyectoGrupo.models.idao.ICursoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A-R
 */
public class CursoDaoImpl implements ICursoDao{
    
    private static final String SQL_SELECT = "SELECT id_curso, ciclo, cupo_maximo, cupo_minimo, descripcion,codigo_carrera, id_horario, id"
            + "_instructor, id_salon FROM curso;";
    private static final String SQL_DELETE = "DELETE FROM curso WHERE curso_id  = ?";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Curso curso = null;
    List<Curso> listaCurso = new ArrayList<>();
    
    public List<Curso> listar() {

        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int cursoId = rs.getInt("id_curso");
                String ciclo = rs.getString("ciclo");
                int cupoMaximo = rs.getInt("cupo_maximo");
                int cupoMinimo = rs.getInt("cupo_minimo");
                String descripcion = rs.getString("descripcion");
                String codigoCarreera = rs.getString("codigo_carrera");
                int horarioId = rs.getInt("id_horario");
                int instructorId = rs.getInt("id_instructor");
                int salonId = rs.getInt("id_salon");
                
               
                curso = new Curso(cursoId, cupoMaximo, cupoMinimo, descripcion, codigoCarreera, horarioId, instructorId, salonId);
                listaCurso.add(curso);

            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);

        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return listaCurso;
    }

    @Override
    public Curso encontrar(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualuzar(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Curso curso) {
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, curso.getIdCurso());
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
