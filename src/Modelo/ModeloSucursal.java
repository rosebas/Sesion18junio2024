/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vistas.VistaSucursal;

/**
 *
 * @author javie
 */
public class ModeloSucursal {
    public int codigo_sucursal;
    public String departamento;
    public String region;
    public String nombre;
    public VistaSucursal vista;

    
    public ModeloSucursal(){
        
    }
    
    public ModeloSucursal(VistaSucursal vista){
        this.vista = vista;
    }
    public int getCodigo_sucursal() {
        return codigo_sucursal;
    }

    public void setCodigo_sucursal(int codigo_sucursal) {
        this.codigo_sucursal = codigo_sucursal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public VistaSucursal getVista() {
        return vista;
    }

    public void setVista(VistaSucursal VistaSucursal) {
        this.vista = VistaSucursal;
    }

  
    
    
    
    
    
    
    
}
