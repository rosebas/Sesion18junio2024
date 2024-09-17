/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Implementación.SucursalImp;
import Modelo.ModeloSucursal;
import java.awt.event.ActionEvent;

/**
 *
 * @author javie
 */
public class ControladorSucursal {
     public ControladorSucursal(ModeloSucursal sucursal) {
        
}
     
      ModeloSucursal modelo;
    SucursalImp implementacion = new SucursalImp();
    public void actionPerformed(ActionEvent e){
         if (e.getActionCommand().equals(modelo.getVistaSucursal().btnBuscar.getActionCommand())) {
            if (modelo.getVistaSucursal().txtCodigo.getText().equals("")) {
               modelo.getVistaSucursal().tblDatos.setModel(implementacion.modeloSucursal());
            } else {
            modelo.getVistaSucursal().tblDatos.setModel(implementacion.modeloSucursal(Integer.parseInt(modelo.getVistaSucursal().txtCodigo.getText())));
                mostrarSucursal();
            }
    }

         
    }
     public void mostrarSucursal() {
       ModeloSucursal model = implementacion.mostrarCliente(Integer.parseInt(modelo.getVistaSucursal().txtCodigo.getText()));
        modelo.getVistaSucursal().txtCodigoSucursal.setText(String.valueOf(model.getCodigo_sucursal()));
        modelo.getVistaSucursal().txtDepartamento.setText(model.getDepartamento());
        modelo.getVistaSucursal().txtRegion.setText(model.getRegion());
        modelo.getVistaSucursal().txtNombre.setText(model.getNombre());
       
       
    }
    }
