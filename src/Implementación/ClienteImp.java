package Implementación;

import Modelo.ModeloConsultaCliente;
import Interfaces.IConsultaCliente;
import SQL.Conector;
import SQL.QuerysCliente;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ClienteImp implements IConsultaCliente{
    
    Conector conector = new Conector();
    QuerysCliente sql = new QuerysCliente();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public DefaultTableModel modeloConsultaCliente() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[] {"Email","Nit","Nombre","Direccion"});
        conector.conectar();
        
        ps = (PreparedStatement) conector.preparar(sql.getCONSULTA_CLIENTE());
        return modelo;
    }

    @Override
    public DefaultTableModel modeloConsultaCliente(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ModeloConsultaCliente mostrarConsultaCliente(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
