//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: DaoPrograma.java
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

import logica.Programa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoPrograma {

    private FachadaBD fachada;

    public DaoPrograma() {
        fachada = new FachadaBD();
    }

    public int guardarPrograma(Programa p) {
        //<editor-fold defaultstate="collapsed" desc="guardarPrograma()">
        String sql_guardar;
        int numFilas = 0;

        sql_guardar = "INSERT INTO programa VALUES ('" + p.getCodigo() + "', '" + p.getNombre() + "', '" + p.getNivel()
                + "', " + p.getCreditos() + ")";

        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();

            return numFilas;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return -1;
        //</editor-fold>
    }

    public Programa consultarPrograma(String codigo) {
        //<editor-fold defaultstate="collapsed" desc="consultarPrograma()">
        Programa programa = new Programa();
        String sql_select;

        sql_select = "SELECT codigo, nombre,nivel, num_creditos FROM  programa WHERE codigo='" + codigo + "'";

        try {
            Connection conn = fachada.conectar();
            System.out.println("CONSULTA: " + sql_select);
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {
                programa.setCodigo(tabla.getInt(1));
                programa.setNombre(tabla.getString(2));
                programa.setNivel(tabla.getString(3));
                programa.setCreditos(tabla.getInt(4));
            }

            conn.close();

            return programa;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }

        return null;
        //</editor-fold>
    }

    public ArrayList<Programa> consultarProgramas(String codigo, String nombre, String nivel, String numCreditos) {
        //<editor-fold defaultstate="collapsed" desc="consultarProgramas">
        ArrayList<Programa> programasConsulta = new ArrayList<Programa>();

        String sql_select = "SELECT * FROM programa     ";
        if (!codigo.isEmpty() || !nombre.isEmpty() || !nivel.isEmpty() || !numCreditos.isEmpty()) {
            sql_select += "WHERE ";
        }
        if (!codigo.isEmpty()) {
            sql_select += "codigo = '" + codigo + "' AND ";
        }
        if (!nombre.isEmpty()) {
            sql_select += "nombre LIKE '%" + nombre + "%' AND ";
        }
        if (!nivel.isEmpty()) {
            sql_select += "nivel LIKE '%" + nivel + "%' AND ";
        }
        if (!numCreditos.isEmpty()) {
            sql_select += "num_creditos = " + numCreditos + " AND ";
        }

        sql_select = sql_select.substring(0, sql_select.length() - 5);
        System.out.println("Consulta: " + sql_select);

        try {
            Connection conn = fachada.conectar();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            int counter = 0;
            while (tabla.next()) {
                programasConsulta.add(new Programa());
                programasConsulta.get(counter).setCodigo(tabla.getInt(1));
                programasConsulta.get(counter).setNombre(tabla.getString(2));
                programasConsulta.get(counter).setNivel(tabla.getString(3));
                programasConsulta.get(counter).setCreditos(tabla.getInt(4));
                counter++;
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
        return programasConsulta;
        //</editor-fold>
    }

    public void modificarPrograma(Programa programa) {
        //<editor-fold defaultstate="collapsed" desc="modificarPrograma">
        try {
            String sql_modificar = "UPDATE programa";
            sql_modificar += " set nombre = '" + programa.getNombre() + "',";
            sql_modificar += " nivel = '" + programa.getNivel() + "',";
            sql_modificar += " num_creditos = '" + programa.getCreditos() + "'";
            sql_modificar += " WHERE codigo = '" + programa.getCodigo() + "'";

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

    public void eliminarPrograma(Programa Programa) {
        //<editor-fold defaultstate="collapsed" desc="elimiarPrograma">
        try {
            String sql_eliminar = "DELETE FROM programa";
            sql_eliminar += " WHERE codigo = '" + Programa.getCodigo() + "'";
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
