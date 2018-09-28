//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: DaoEstudiante.java
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

import logica.Estudiante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoEstudiante {

    private FachadaBD fachada;

    public DaoEstudiante() {
        fachada = new FachadaBD();
    }

    public int guardarEstudiante(Estudiante estudiante) {
        //<editor-fold defaultstate="collapsed" desc="guardarEstudiante()">
        String sql_guardar;
        int numFilas = 0;

        sql_guardar = "INSERT INTO estudiante VALUES ('"
                + estudiante.getCodigo() + "', '"
                + estudiante.getNombre() + "', '"
                + estudiante.getEdad() + "', '"
                + estudiante.getSexo() + "', "
                + estudiante.getPrograma().getCodigo() + ")";

        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: " + sql_guardar);
            numFilas = sentencia.executeUpdate(sql_guardar);
            return numFilas;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }

        return -1;
        //</editor-fold>
    }

    public ArrayList<Estudiante> consultarEstudiantes(String codigo, String nombre, String edad, String sexo, String programa) {
        //<editor-fold defaultstate="collapsed" desc="consultarEstudiantes()">
        ArrayList<Estudiante> estudiantesConsulta = new ArrayList<Estudiante>();

        String sql_select = "SELECT * FROM estudiante     ";
        if (!codigo.isEmpty() || !nombre.isEmpty() || !edad.isEmpty() || !" ".equals(sexo) || !" ".equals(programa)) {
            sql_select += "WHERE ";
        }
        if (!codigo.isEmpty()) {
            sql_select += "codigo = '" + codigo + "' AND ";
        }
        if (!nombre.isEmpty()) {
            sql_select += "nombre LIKE '%" + nombre + "%' AND ";
        }
        if (!edad.isEmpty()) {
            sql_select += "edad  '%" + edad + "%' AND ";
        }
        if (!" ".equals(sexo)) {
            sql_select += "sexo = '" + sexo + "' AND ";
        }
        if (!" ".equals(programa)) {
            sql_select += "codigo_programa = '" + programa + "' AND ";
        }

        sql_select = sql_select.substring(0, sql_select.length() - 5);

        try {
            Connection conn = fachada.conectar();
            System.out.println("SQL Consulta: " + sql_select);
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            int counter = 0;
            while (tabla.next()) {
                estudiantesConsulta.add(new Estudiante());
                estudiantesConsulta.get(counter).setCodigo(tabla.getInt(1));
                estudiantesConsulta.get(counter).setNombre(tabla.getString(2));
                estudiantesConsulta.get(counter).setEdad(tabla.getInt(3));
                estudiantesConsulta.get(counter).setSexo(tabla.getString(4).toCharArray()[0]);
                estudiantesConsulta.get(counter).setPrograma(new DaoPrograma().consultarPrograma(tabla.getString(5)));
                counter++;
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
        return estudiantesConsulta;
        //</editor-fold>
    }

    public void modificarEstudiante(Estudiante estudiante) {
        //<editor-fold defaultstate="collapsed" desc="modificarEstudiante()">
        try {
            String sql_modificar = "UPDATE estudiante";
            sql_modificar += " set nombre = '" + estudiante.getNombre() + "',";
            sql_modificar += " edad = '" + estudiante.getEdad()+ "',";
            sql_modificar += " sexo = '" + estudiante.getSexo() + "',";
            sql_modificar += " codigo_programa = '" + estudiante.getPrograma().getCodigo() + "'";
            sql_modificar += " WHERE codigo = '" + estudiante.getCodigo() + "'";

            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: " + sql_modificar);
            sentencia.executeUpdate(sql_modificar);
            conn.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
        //</editor-fold>
    }

    public void eliminarEstudiante(Estudiante Estudiante) {
        //<editor-fold defaultstate="collapsed" desc="eliminarEstudiante()">
        try {
            String sql_eliminar = "DELETE FROM estudiante";
            sql_eliminar += " WHERE codigo = '" + Estudiante.getCodigo() + "'";

            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: " + sql_eliminar);
            sentencia.executeUpdate(sql_eliminar);

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
        //</editor-fold>
    }
}
