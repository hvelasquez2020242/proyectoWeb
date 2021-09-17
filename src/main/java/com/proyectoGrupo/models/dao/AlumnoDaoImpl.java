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

<<<<<<< HEAD
=======


>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
/**
 *
 * @author IVAN PC
 */
public class AlumnoDaoImpl implements IAlumnoDao {
<<<<<<< HEAD

    private static final String SQL__SELECT = "SELECT carne, apellidos, nombres, email FROM alumno";
    private static final String SQL_DELETE = "DELETE FROM alumno WHERE carne = ?;";
    private static final String SQL_INSERT = "INSERT INTO alumno(carne, apellidos, nombres, email) values(?,?,?,?)";
    private static final String SQL_SELECT_BY_ID = "SELECT apellidos, nombres, email FROM alumno WHERE carne = ?";
    private static final String SQL_UPDATE = "UPDATE alumno SET carne =?, apellidos = ?, nombres = ?, email = ? WHERE carne = ?";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Alumno alumno = null;
    List<Alumno> listaAlumnos = new ArrayList<>();

    @Override
    public List<Alumno> listar() {
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL__SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
=======
    private static final String SQL__SELECT = "SELECT carne, apellidos, nombres, email FROM alumno";
    private static final String SQL_DELETE = "DELETE FROM alumno WHERE carne = ?;";
    
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
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
                String carne = rs.getString("carne");
                String apellidos = rs.getString("apellidos");
                String nombres = rs.getString("nombres");
                String email = rs.getString("email");
<<<<<<< HEAD

                alumno = new Alumno(carne, apellidos, nombres, email);
                listaAlumnos.add(alumno);                                
            }
            
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
=======
                
                alumno = new Alumno(carne,apellidos,nombres,email);
                listaAlumnos.add(alumno);
            
                
            }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return listaAlumnos;
    }

    @Override
    public Alumno encontrar(Alumno alumno) {
<<<<<<< HEAD
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setString(1, alumno.getCarne());
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String apellido = rs.getString("apellidos");
                String nombre = rs.getString("nombres");
                String email = rs.getString("email");

                alumno.setApellidos(apellido);
                alumno.setNombres(nombre);
                alumno.setEmail(email);
                listaAlumnos.add(alumno);

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
        return alumno;
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
    }

    @Override
    public int insertar(Alumno alumno) {
<<<<<<< HEAD
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_INSERT);
            pstmt.setString(1, alumno.getCarne());
            pstmt.setString(2, alumno.getApellidos());
            pstmt.setString(3, alumno.getNombres());
            pstmt.setString(4, alumno.getEmail());
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return rows;
    }
    

    @Override
    public int actualizar(Alumno alumno) {
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_UPDATE);
            
            pstmt.setString(1, alumno.getCarne());
            pstmt.setString(2, alumno.getApellidos());
            pstmt.setString(3, alumno.getNombres());
            pstmt.setString(4, alumno.getEmail());           
            pstmt.setString(5, alumno.getCarne());
            
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return rows;
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
    }

    @Override
    public int eliminar(Alumno alumno) {
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_DELETE);
<<<<<<< HEAD

            pstmt.setString(1, alumno.getCarne());

            System.out.println(pstmt.toString());

=======
            
            pstmt.setString(1, alumno.getCarne());
            
            System.out.println(pstmt.toString());
            
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return rows;
    }
<<<<<<< HEAD
=======
    
    
>>>>>>> 9eed5baec61fb3f49bc713ce52a862bde80a984e
}
