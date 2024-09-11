package Modelo;
import Vistas.VistaEstadoCompra;

public class ModeloEstadoCompra {
    public int idEstado;
    public String estado;
    public VistaEstadoCompra vista;

    public ModeloEstadoCompra() {
    }
    
    public ModeloEstadoCompra(VistaEstadoCompra vista){
        this.vista = vista;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public VistaEstadoCompra getVista() {
        return vista;
    }

    public void setVista(VistaEstadoCompra vista) {
        this.vista = vista;
    }
        
}
