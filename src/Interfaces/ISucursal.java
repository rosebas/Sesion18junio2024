/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.ModeloSucursal;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author javie
 */
public interface ISucursal {
     public boolean insertarCliente(ModeloSucursal modelo);
     public boolean eliminarSucursal(String codigo);
      public DefaultTableModel modeloSucursal();
      public DefaultTableModel modeloSucursal(int codigo_cliente);
       public ModeloSucursal mostrarCliente(int codigo_cliente);
}
