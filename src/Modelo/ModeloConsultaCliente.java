package Modelo;
import Vistas.VistaConsultaACliente;

public class ModeloConsultaCliente {
    public String email;
    public String nombres;
    public String apellidos;
    public String direccion;
    public String nit;  
    public VistaConsultaACliente vista;

    public ModeloConsultaCliente() {
    }

    public ModeloConsultaCliente(VistaConsultaACliente vista) {
        this.vista = vista;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public VistaConsultaACliente getVista() {
        return vista;
    }

    public void setVista(VistaConsultaACliente vista) {
        this.vista = vista;
    }
    
    
}
