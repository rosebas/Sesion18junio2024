package Controlador;
import Modelo.ModeloEstadoCompra;
import Implementación.EstadoCompraImp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorEstadoCompra implements ActionListener, WindowListener, MouseListener{

    ModeloEstadoCompra modelo;
    EstadoCompraImp implementacion = new EstadoCompraImp();

    public ControladorEstadoCompra(ModeloEstadoCompra modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(modelo.getVista().btnBuscarEstado.getActionCommand())){
            if(modelo.getVista().txtBuscarCodigo.equals("")){
                modelo.getVista().tblEstadoCompra.setModel(implementacion.modeloEstadoCompra());
            }else{
                modelo.getVista().tblEstadoCompra.setModel(implementacion.modeloEstadoCompra(Integer.parseInt(modelo.getVista().txtBuscarCodigo.getText())));
                mostrarCliente();
            }
        }
            
    }
    
    public void mostrarCliente(){
        ModeloEstadoCompra model = implementacion.mostrarEstadoCompra(Integer.parseInt(modelo.getVista().txtBuscarCodigo.getText()));
        modelo.getVista().txtCodigoEstado.setText(String.valueOf(model.getIdEstado()));
        modelo.getVista().txtEstadoEstado.setText(model.getEstado());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
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
