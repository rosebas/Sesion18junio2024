package SQL;

public class QuerysCliente {
    private final String CONSULTA_CLIENTE = "SELECT * FROM cliente";
    private final String CONSULTA_CLIENTE_CODIGO = "SELECT * FROM cliente WHERE email LIKE CONCAT('%', ?, '%')";

    public String getCONSULTA_CLIENTE() {
        return CONSULTA_CLIENTE;
    }

    public String getCONSULTA_CLIENTE_CODIGO() {
        return CONSULTA_CLIENTE_CODIGO;
    }
    
    
}
