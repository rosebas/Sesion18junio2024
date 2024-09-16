package Implementación;

import Modelo.ModeloEstadoCompra;
import Interfaces.IEstadoCompra;
import SQL.Conector;
import SQL.QuerysEstadoCompra;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstadoCompraImp implements IEstadoCompra {

    Conector conector = new Conector();
    QuerysEstadoCompra sql = new QuerysEstadoCompra();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insertarEstadoCompra(ModeloEstadoCompra modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getINSERTAR_ESTADO_COMPRA());

        try {
            ps.setInt(1, modelo.getIdEstado());
            ps.setString(2, modelo.getEstado());
            return ps.execute();
        } catch (SQLException ex) {
            conector.mensaje("Error en la insersción", "Error", 1);
            return resultado;
        }
    }

    @Override
    public boolean eliminarEstadoCompra(String codigoEstado) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getBORRAR_ESTADO_COMPRA());

        try {
            ps.setInt(1, Integer.parseInt(codigoEstado));
            return ps.execute();
        } catch (SQLException ex) {
            conector.mensaje("Error al eliminar", "Error", 1);
            return resultado;
        }
    }

    @Override
    public boolean actualizarEstadoCompra(ModeloEstadoCompra modelo) {
        boolean resultado = true;
        conector.conectar();

        return false;
    }

    @Override
    public DefaultTableModel modeloEstadoCompra() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Codigo", "estado"});
        conector.conectar();

        try {
            ps = conector.preparar(sql.getCONSULTAR_ESTADOS_COMPRAS());
            rs = ps.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("id_estado"),
                    rs.getString("estado")
                });
            }
            conector.desconectar();

        } catch (SQLException ex) {
            conector.mensaje(ex.getMessage(), "Error", 1);
            conector.desconectar();
        }
        return modelo;
    }

    @Override
    public DefaultTableModel modeloEstadoCompra(int idEstado) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Codigo", "Descripcion"});
        conector.conectar();

        try {
            ps = conector.preparar(sql.getCONSULTAR_ESTADOS_COMPRAS());
            ps.setInt(1, idEstado);
            rs = ps.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("id_estado"),
                    rs.getString("estado")
                });
            }
            conector.desconectar();

        } catch (SQLException ex) {
            conector.mensaje("trono aqui", "error", 1);
            conector.mensaje(ex.getMessage(), "Error", 1);
            conector.desconectar();
        }
        return modelo;
    }

    @Override
    public ModeloEstadoCompra mostrarEstadoCompra(int idEstado) {
        ModeloEstadoCompra modelo = new ModeloEstadoCompra();
        conector.conectar();

        try {
            ps = conector.preparar(sql.getCONSULTAR_ESTADO_COMPRA());
            ps.setInt(1, idEstado);
            rs = ps.executeQuery();
            
            while(rs.next()){
                modelo.setIdEstado(Integer.parseInt(rs.getString(1)));
                modelo.setEstado(rs.getString(2));
            }
            conector.desconectar();
            
        } catch (SQLException ex) {
            conector.mensaje(ex.getMessage(), "Error", 1);
            conector.desconectar();
        }
        return modelo;
    }

}
