
package Interfaces;

import Modelo.ModeloGarantia;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WOMBAT
 */
public interface IGarantia {
    public boolean insertarTipoGarantia (ModeloGarantia modelo);
    public boolean actualizarTipoGarantia (ModeloGarantia modelo);
    public boolean eliminarTipoGarantia (ModeloGarantia modelo);
    
    public DefaultTableModel modeloGarantia();
    public DefaultTableModel modeloGarantia(String tipoGarantia);
    public ModeloGarantia mostrarGaranta(String tipoGarantia);
    
    
    
}
