package Interfaces;
import Modelo.ModeloConsultaCliente;
import javax.swing.table.DefaultTableModel;

public interface IConsultaCliente {
    public DefaultTableModel modeloConsultaCliente();
    public DefaultTableModel modeloConsultaCliente(String email);
    public ModeloConsultaCliente mostrarConsultaCliente(String email);
}
