/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

/**
 *
 * @author javie
 */
public class QuerysSucursal {
 private final String CONSULTA_SUCURSAL = "SELECT * FROM sucursal";
  private final String CONSULTA_SUCURSAL_CODIGO = "SELECT * FROM cliente WHERE id_sucursal = ?";
            
    private final String INSERTAR_SUCURSAL = "INSERT INTO sucursal VALUES(?,?,?,?)";
    private final String ELIMINAR_SUCURSAL = "DELETE FROM sucursal WHERE codigo_sucursal = ?";

    public QuerysSucursal() {
    }

    public String getCONSULTA_SUCURSAL() {
        return CONSULTA_SUCURSAL;
    }

    public String getCONSULTA_SUCURSAL_CODIGO() {
        return CONSULTA_SUCURSAL_CODIGO;
    }

    public String getINSERTAR_SUCURSAL() {
        return INSERTAR_SUCURSAL;
    }

    public String getELIMINAR_SUCURSAL() {
        return ELIMINAR_SUCURSAL;
    }
    
    
}
