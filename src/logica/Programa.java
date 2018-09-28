//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: Programa.java
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

package logica;

public class Programa {
    private int codigo;
    private int    creditos;
    private String nivel;
    private String nombre;


    public int getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
