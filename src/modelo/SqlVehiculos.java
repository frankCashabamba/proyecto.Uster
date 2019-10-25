package modelo;

import conexionSQL.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frank
 */
public class SqlVehiculos extends conexion{
   
    
    public boolean registrar(vehiculos v) {
         PreparedStatement ps = null;
    Connection con = getConexion();
    ResultSet rs = null;
        /* Creamos un select para verificar si existe la matricuala si ya existe no dejamos que el insert funcione*/
        
        String sqlVerificarM= "Select brand, model, plate, LicenseRequired from vehicles where plate=?";   
        String sql = "INSERT INTO vehicles (brand, model , plate, LicenseRequired) VALUES(?,?,?,?)";

        try {          
            ps= con.prepareStatement(sqlVerificarM);
            ps.setString(1, v.getPlate());
            rs = ps.executeQuery();
                     
             if(rs.next())
            { 
             return false;
            }else             
            ps = con.prepareStatement(sql);           
            ps.setString(1, v.getBrand());
            ps.setString(2, v.getModel());
            ps.setString(3, v.getPlate());
            ps.setString(4, v.getLicenseRequired());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    

    
    public boolean modificar(vehiculos v) 
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE vehicles SET Brand=?, Model=?,Plate=?, LicenseRequired=? WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getBrand());
            ps.setString(2, v.getModel());
            ps.setString(3, v.getPlate());
            ps.setString(4, v.getLicenseRequired());
            ps.setInt(5, v.getId());
            ps.execute();
            System.out.println(ps.execute());
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(vehiculos v)
    {
       PreparedStatement ps = null;
    Connection con = getConexion();
    ResultSet rs = null;

        String sql = "DELETE FROM vehicles WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public List listar()
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        List<vehiculos> datos = new ArrayList<>();
        try {
            
            ps = con.prepareStatement("select id, brand, model, plate, LicenseRequired from vehicles");
            rs = ps.executeQuery();
            while (rs.next()) {
                vehiculos p = new vehiculos();
                p.setId(rs.getInt(1));
                p.setBrand(rs.getString(2));
                p.setModel(rs.getString(3));
                p.setPlate(rs.getString(4));
                p.setLicenseRequired(rs.getString(5));
                datos.add(p);
            }
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return datos;
    }
    
}
