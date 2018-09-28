//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: FachadaBD.java
//
// FECHA:12/03/30
//
// AUTORES:
// Gustavo Adolfo Rodriguez    0932979-3743
// gustalibreros@hotmail.com
//
// José Antonio Nobile Rendón  0747102-2711
// jose.nobile@gmail.com
//
// Roberto Ceballos            0441812-3743
// robertrock2000@gmail.com
//
// ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION
// UNIVERSIDAD DEL VALLE
//*********************************************************
package acceso_datos;

//~--- JDK imports ------------------------------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;


public class FachadaBD {

    private Connection conexion;
    private static String url, usuario, password, host, port, database;

    public FachadaBD() {
        host= "localhost";
        port= "5432";
        database= "gadolforl";
        url = "jdbc:postgresql://"+host+":"+port+"/"+database;
        usuario = "postgres";
        password = "dybm1997";
    }
   
    public Connection conectar() {
        //<editor-fold defaultstate="collapsed" desc="conectar()">
        try {
            
            // Se carga el driver
            Class.forName("org.postgresql.Driver");
            
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver.");
        }
        
        try {
            
            // Crear el objeto de conexion a la base de datos
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion Abierta");
            
            return conexion;
            
            // Crear objeto Statement para realizar queries a la base de datos
        } catch (Exception e) {
            System.out.println("No se pudo abrir la bd.");
            
            return null;
        }
        //</editor-fold>
    }
    
    public void cerrarConexion(Connection c) {
        //<editor-fold defaultstate="collapsed" desc="cerrarConexion">
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("No se pudo cerrar.");
        }
        //</editor-fold>
    }

    public static void setDatabase(String database) {
        FachadaBD.database = database;
    }

    public static void setHost(String host) {
        FachadaBD.host = host;
    }

    public static void setPassword(String password) {
        FachadaBD.password = password;
    }

    public static void setPort(String port) {
        FachadaBD.port = port;
    }

    public static void setUsuario(String usuario) {
        FachadaBD.usuario = usuario;
    }

    public static void updateUrl() {
        FachadaBD.url = "jdbc:postgresql://"+host+":"+port+"/"+database;
    }
   
}
