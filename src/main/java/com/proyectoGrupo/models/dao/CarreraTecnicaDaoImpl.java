package com.proyectoGrupo.models.dao;

import com.proyectoGrupo.db.Conexion;
import com.proyectoGrupo.models.domain.CarreraTecnica;
import com.proyectoGrupo.models.idao.ICarreraTecnicaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo Daniel Velasquez Patzan Codigo Tecnico IN5BV
 * @date 27-ago-2021
 * @time 16:55:04
 */
public class CarreraTecnicaDaoImpl implements ICarreraTecnicaDao {

 
    private static final String SQL_SELECT = "SELECT codigo_carrera, nombres FROM Carrera_tecnica;";
    private static final String SQL_DELETE = "DELETE FROM Carrera_tecnica where codigo_carrera = ?";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    CarreraTecnica carreraTecnica = null;
   
    List<CarreraTecnica> listaCarreraTecnica = new ArrayList<>();


    @Override
    public List<CarreraTecnica> listar() {
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String codigoCarrera = rs.getString("codigo_carrera");
                String nombre = rs.getString("nombres");

                carreraTecnica = new CarreraTecnica(codigoCarrera, nombre);
                listaCarreraTecnica.add(carreraTecnica);
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
        return listaCarreraTecnica;
    }

    @Override
    public CarreraTecnica encontrar(CarreraTecnica carreraTecnica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(CarreraTecnica carreraTecnica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(CarreraTecnica carreraTecnica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(CarreraTecnica carreraTecnica) {
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_DELETE);
            pstmt.setString(1, carreraTecnica.getCodigoCarrera());
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