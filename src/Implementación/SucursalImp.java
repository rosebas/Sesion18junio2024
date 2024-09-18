/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementación;
import Interfaces.ISucursal;
import Modelo.ModeloSucursal;
import SQL.Conector;
import SQL.QuerysSucursal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javie
 */
public class SucursalImp implements ISucursal{
    
    
    Conector conector = new Conector();
    QuerysSucursal sql = new QuerysSucursal();
    PreparedStatement ps;
    ResultSet rs;
    public ModeloSucursal mostrarCliente(int codigo_cliente){
        ModeloSucursal modelo = new ModeloSucursal();
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_SUCURSAL());
            ps.setInt(1, codigo_cliente);
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo.setCodigo_sucursal(Integer.parseInt(rs.getString(1)));
                modelo.setNombre(rs.getString(4));
                modelo.setDepartamento(rs.getString(2));
                modelo.setRegion(rs.getString(3));
              
            }
            conector.desconectar();
        } catch (SQLException ex) {
            conector.mensaje(ex.getMessage(), "Error", 0);
            conector.desconectar();
        }
        return modelo;
    }
  
    public DefaultTableModel modeloSucursal() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Codigo sucursal", "departamento", "region", "nombre"});
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_SUCURSAL());
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("id_sucursal"),
                    rs.getString("departamento"),
                    rs.getString("region"),
                    rs.getString("nombre")});
            }
            conector.desconectar();
        } catch (SQLException ex) {
            conector.mensaje(ex.getMessage(), "Error", 0);
            conector.desconectar();
        }
        return modelo;
    }
        
    public DefaultTableModel modeloSucursal(int codigo_cliente) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Codigo", "Nombre", "Ciudad", "Pais"});
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_SUCURSAL_CODIGO());
            ps.setInt(1, codigo_cliente);
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("id_sucursal"),
                    rs.getString("departamento"),
                    rs.getString("region"),
                    rs.getString("nombre")});
            }
            
            conector.desconectar();
        } catch (SQLException ex) {
            conector.mensaje(ex.getMessage(), "Error", 0);
            conector.desconectar();
        }
        return modelo;
    }

    @Override
    public boolean insertarCliente(ModeloSucursal modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarSucursal(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
