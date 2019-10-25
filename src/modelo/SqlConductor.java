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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frank
 */
public class SqlConductor extends conexion {
   
    
    
    public boolean registrarConductore(conductores cond)
    {
        
        PreparedStatement ps = null;
    Connection con = getConexion();
    ResultSet rs = null;
     String sql = "INSERT INTO drivers(name, surname, license) VALUES(?,?,?)";

        try { 
            ps = con.prepareStatement(sql);           
            ps.setString(1, cond.getName());
            ps.setString(2, cond.getSurname());
            ps.setString(3, cond.getLicense());
          
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
    
          public boolean modificar(conductores cond) 
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE drivers SET name=?, surname=?,license=? WHERE iddrivers=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cond.getName());
            ps.setString(2, cond.getSurname());
            ps.setString(3, cond.getLicense());
            ps.setInt(4, cond.getId());
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
    
    
        public List listar() {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        List<conductores> datos = new ArrayList<>();
        try {
            
            ps = con.prepareStatement("select Iddrivers, name, surname, License from drivers");
            rs = ps.executeQuery();
            while (rs.next()) {
                conductores p = new conductores();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setSurname(rs.getString(3));
                p.setLicense(rs.getString(4));
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
    
  
    
       public boolean eliminar(conductores cond)
    {
       PreparedStatement ps = null;
    Connection con = getConexion();
    ResultSet rs = null;

        String sql = "DELETE FROM drivers WHERE iddrivers=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cond.getId());
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
    
}
