package SQL;

public class QuerysEstadoCompra {
    private final String INSERTAR_ESTADO_COMPRA = "INSERT INTO estado_compra(codigo, nombre)"
            + "VALUES (?,?)";
    private final String ACTUALIZAR_ESTADO_COMPRA = "UPDATE estado_compra SET(?,?) WHERE codigo = ?";
    private final String BORRAR_ESTADO_COMPRA = "DELETE FROM estado_compra WHERE codigo = ?";
    private final String CONSULTAR_ESTADOS_COMPRAS = "SELECT * FROM estado_compra";
    private final String CONSULTAR_ESTADO_COMPRA = "SELECT codigo, descripcion FROM estado_compra WHERE"
            + "codigo = ?";
  
    public String getINSERTAR_ESTADO_COMPRA() {
        return INSERTAR_ESTADO_COMPRA;
    }

    public String getACTUALIZAR_ESTADO_COMPRA() {
        return ACTUALIZAR_ESTADO_COMPRA;
    }

    public String getBORRAR_ESTADO_COMPRA() {
        return BORRAR_ESTADO_COMPRA;
    }

    public String getCONSULTAR_ESTADOS_COMPRAS() {
        return CONSULTAR_ESTADOS_COMPRAS;
    }

    public String getCONSULTAR_ESTADO_COMPRA() {
        return CONSULTAR_ESTADO_COMPRA;
    }
    
}
