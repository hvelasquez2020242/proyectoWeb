/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoGrupo.models.dao;

import com.proyectoGrupo.models.domain.Alumno;
import com.proyectoGrupo.models.idao.IAlumnoDao;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.proyectoGrupo.db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author IVAN PC
 */
public class AlumnoDaoImpl implements IAlumnoDao {
    private static final String SQL__SELECT = "SELECT carne, apellidos, nombres, email FROM alumno";
    private static final String SQL_DELETE = "DELETE FROM alumno WHERE carne = ? ";
    
        Connection conn = null;
        PreparedStatement  pstmt = null;
        ResultSet rs = null;
        Alumno alumno = null;
        List<Alumno> listaAlumnos = new ArrayList<>();

    @Override
    public List<Alumno> listar() {
        try{
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL__SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                String carne = rs.getString("carne");
                String apellidos = rs.getString("apellidos");
                String nombres = rs.getString("nombres");
                String email = rs.getString("email");
                
                alumno = new Alumno(carne,apellidos,nombres,email);
                listaAlumnos.add(alumno);
            
                
            }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return listaAlumnos;
    }

    @Override
    public Alumno encontrar(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Alumno alumno) {
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_DELETE);
            
            pstmt.setString(1, alumno.getCarne());
            
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
