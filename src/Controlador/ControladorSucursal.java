/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Implementación.SucursalImp;
import Modelo.ModeloSucursal;

/**
 *
 * @author javie
 */
public class ControladorSucursal {
     ModeloSucursal sucursal;
    SucursalImp implementacion = new SucursalImp();

    public ControladorSucursal(ModeloSucursal sucursal) {
        this.sucursal = sucursal;
    }
