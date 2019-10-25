/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexionSQL.*;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author Frank
 */
public class SqlAlCoches extends conexion{
    
    
    
    
    
    public boolean registrarRerva(alquiler v) throws SQLException
    {
    PreparedStatement ps = null;
    Connection con = getConexion();
    ResultSet rs = null;
     String sqlVerificaLienci = "SELECT * from vehicles as v inner JOIN drivers as d on v.LicenseRequired"
             + " = d.License where v.LicenseRequired =? AND d.License=?";
     String sqlIT="INSERT INTO trips (idVehicle, idDrivers, date) VALUES(?,?,?)";
                 
     
          try {          
            ps= con.prepareStatement(sqlVerificaLienci);            
            ps.setString(1, v.getLicenciaPerosna());
            ps.setString(2, v.getLiceniacocche());
            rs = ps.executeQuery();
             System.out.println(rs);               
                if(rs.next())
            {                 
            ps = con.prepareStatement(sqlIT);  
            ps.setInt(1, v.getIdcoche());
            ps.setInt(2, v.getIdconductor());
            ps.setString(3, v.getFechaReserva());           
            ps.execute();              
            return true;
            }                
           
            return false;
            
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
    
    
    
}
