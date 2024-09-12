package SQL;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conector {
    
    private static final String CLASE  = "com.mysql.jdbc.Driver";
    private final String HOST = "sql.freedb.tech";
    private final String USUARIO = "freedb_Momosteco_1";
    private final String CLAVE = "d6QKhUVceR$M!dN";
    private final String BASEDATOS = "freedb_POWERTECH_DB";
    private final String URL;
    
    private Connection link;
    private PreparedStatement ps;
    
    public Conector(){
        this.URL = "jdbc:mysql://" + this.HOST + "/" +this.BASEDATOS;
    }
    
    public void conectar(){
        try {
            Class.forName(CLASE).getDeclaredConstructor().newInstance();
            this.link = DriverManager.getConnection(this.URL, this.USUARIO, this.CLAVE);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void desconectar(){
        try {
            this.link.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public PreparedStatement preparar(String sql){
        try {
            ps = link.prepareStatement(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ps;
    }
    
    public void mensaje(String mensaje, String titulo, int tipoMensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
    }
}
