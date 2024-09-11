package Interfaces;
import Modelo.ModeloEstadoCompra;
import javax.swing.table.DefaultTableModel;

public interface IEstadoCompra {
    public boolean insertarEstadoCompra(ModeloEstadoCompra modelo);
    public boolean eliminarEstadoCompra(String  codigoEstado);
    public boolean actualizarEstadoCompra(ModeloEstadoCompra modelo);
    public DefaultTableModel modeloEstadoCompra();
    public DefaultTableModel modeloEstadoCompra(int idEstado);
    public ModeloEstadoCompra mostrarEstadoCompra(int idEstado);
}
