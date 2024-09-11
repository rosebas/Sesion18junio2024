
package Modelo;

import Vistas.VistaGarantia;

/**
 *
 * @author WOMBAT
 */
public class ModeloGarantia {
    public String tipoGarantia;
    public String descripcionGarantia;
    public String duracionGarantia;
    public VistaGarantia vista;

    public ModeloGarantia() {
    }

    public String getTipoGarantia() {
        return tipoGarantia;
    }

    public void setTipoGarantia(String tipoGarantia) {
        this.tipoGarantia = tipoGarantia;
    }

    public String getDescripcionGarantia() {
        return descripcionGarantia;
    }

    public void setDescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = descripcionGarantia;
    }

    public String getDuracionGarantia() {
        return duracionGarantia;
    }

    public void setDuracionGarantia(String duracionGarantia) {
        this.duracionGarantia = duracionGarantia;
    }

    public VistaGarantia getVista() {
        return vista;
    }

    public void setVista(VistaGarantia vista) {
        this.vista = vista;
    }

   
    
}
