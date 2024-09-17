package Controlador;
import Modelo.ModeloEstadoCompra;
import Implementación.EstadoCompraImp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

public class ControladorEstadoCompra implements ActionListener, WindowListener, MouseListener{

    ModeloEstadoCompra modelo;
    EstadoCompraImp implementacion = new EstadoCompraImp();

    public ControladorEstadoCompra(ModeloEstadoCompra modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(modelo.getVista().btnBuscarEstado.getActionCommand())){
            if(modelo.getVista().txtBuscarCodigo.getText().equals("")){
                modelo.getVista().tblEstadoCompra.setModel(implementacion.modeloEstadoCompra());
            }else{
                modelo.getVista().tblEstadoCompra.setModel(implementacion.modeloEstadoCompra(Integer.parseInt(modelo.getVista().txtBuscarCodigo.getText())));
                mostrarCliente();
            }
        } else if(e.getActionCommand().equals(modelo.getVista().btnGuardarEstado.getActionCommand())){
            boolean resultado;
            ModeloEstadoCompra modelo = new ModeloEstadoCompra();
            modelo.setIdEstado(Integer.parseInt(this.modelo.getVista().txtCodigoEstado.getText()));
            modelo.setEstado(this.modelo.getVista().txtEstadoEstado.getText());
            resultado = implementacion.insertarEstadoCompra(modelo);
            if(!resultado){
                System.out.println("Inserción exitosa");
                limpiar();
                modelo.getVista().tblEstadoCompra.setModel(implementacion.modeloEstadoCompra());
            }else{
                System.out.println("Inserción falló");
            }
            
        } else if(e.getActionCommand().equals(modelo.getVista().btnBorrarEstado.getActionCommand())){
            boolean resultado;
            if(modelo.getVista().txtCodigoEstado.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Error", "Datos no válidos", 1);
            }else{
                resultado = implementacion.eliminarEstadoCompra(modelo.getVista().txtCodigoEstado.getText());
                if(!resultado){
                    System.out.println("Eliminación exitosa");
                    limpiar();
                    modelo.getVista().tblEstadoCompra.setModel(implementacion.modeloEstadoCompra());
                }else{
                    System.out.println("Problemas al eliminar");
                }
            }
            
        } else if(e.getActionCommand().equals(modelo.getVista().btnActualizarEstado.getActionCommand())){
            boolean resultado;
            if(modelo.getVista().txtCodigoEstado.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Error", "Datos no válidos", 1);
            }else{
                ModeloEstadoCompra modelo = new ModeloEstadoCompra();
                modelo.setIdEstado(Integer.parseInt(this.modelo.getVista().txtCodigoEstado.getText()));
                modelo.setEstado(this.modelo.getVista().txtEstadoEstado.getText());
                resultado = implementacion.actualizarEstadoCompra(modelo);
                if(!resultado){
                    System.out.println("Actualización exitosa");
                    limpiar();
                    modelo.getVista().tblEstadoCompra.setModel(implementacion.modeloEstadoCompra());
                }else{
                    System.out.println("Actualización fallida");
                }
            }
        } else if(e.getActionCommand().equals(modelo.getVista().btnCancelarBusquedaEstado.getActionCommand())){
            limpiar();
            modelo.getVista().tblEstadoCompra.setModel(implementacion.modeloEstadoCompra());
        } else if(e.getActionCommand().equals(modelo.getVista().btnLimpiarCamposEstado.getActionCommand())){
            limpiar();
        }
            
    }
    
    public void mostrarCliente(){
        ModeloEstadoCompra model = implementacion.mostrarEstadoCompra(Integer.parseInt(modelo.getVista().txtBuscarCodigo.getText()));
        modelo.getVista().txtCodigoEstado.setText(String.valueOf(model.getIdEstado()));
        modelo.getVista().txtEstadoEstado.setText(model.getEstado());
    }
    
    public void limpiar(){
        modelo.getVista().txtBuscarCodigo.setText("");
        modelo.getVista().txtEstadoEstado.setText("");
        modelo.getVista().txtCodigoEstado.setText("");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVista().tblEstadoCompra)){
            modelo.getVista().txtBuscarCodigo.setText(String.valueOf(modelo.getVista().tblEstadoCompra.getValueAt(modelo.getVista().tblEstadoCompra.getSelectedRow(), 0)));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if(e.getComponent().equals(modelo.getVista())){
            modelo.getVista().tblEstadoCompra.setModel(implementacion.modeloEstadoCompra());
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
