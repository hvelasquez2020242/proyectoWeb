package com.proyectoGrupo.models.dao;

import com.proyectoGrupo.db.Conexion;
import com.proyectoGrupo.models.domain.Salon;
import com.proyectoGrupo.models.idao.ISalonDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.proyectoGrupo.controller.ServletSalon;
/**
 * --add-modules javafx.controls,javafx.fxml
 *
 * @author Denil José Parada Cabrera
 * @date 19/08/2021
 * @time 05:30:48 PM
 * @codigoTecnico: IN5BV
 */
public class SalonDaoImpl implements ISalonDao {

    private static final String SQL_SELLECT = "select salon_id, capacidad,descripcion,nombre_salon from Salon;";
    private static final String SQL_DELETE = "delete from Salon where salon_id = ?";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Salon salon = null;
    List<Salon> ListaSalon = new ArrayList<>();

    @Override
    public List<Salon> listar() {
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_SELLECT);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int idSalon = rs.getInt("salon_id");
                int capacidad = rs.getInt("capacidad");
                String descripcion = rs.getString("descripcion");
                String nombre_salon = rs.getString("nombre_salon");

                salon = new Salon(idSalon, capacidad, descripcion, nombre_salon);
                ListaSalon.add(salon);
                
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("ecepcion de tipo sql");

        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return ListaSalon;
    }

    @Override
    public Salon encontrar(Salon salon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Salon salon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Salon salon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Salon salon) {
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, salon.getIdSalon());
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(conn);

        }
        return rows;
    }

   
}
