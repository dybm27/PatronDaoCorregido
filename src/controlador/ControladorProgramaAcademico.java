//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: ControladorProgramaAcademico.java
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
package controlador;

import acceso_datos.DaoPrograma;
import logica.Programa;
import java.util.ArrayList;

public class ControladorProgramaAcademico {

    private DaoPrograma daoPrograma;
    private Programa programaSeleccionado;
    private ArrayList<Programa> ultimaConsulta;

    public ControladorProgramaAcademico() {
        daoPrograma = new DaoPrograma();
    }

    public String insertarPrograma(String codigo, String nombre, String nivel, String numCreditos) {
        //<editor-fold defaultstate="collapsed" desc="insertarPrograma()">
        if (!nombre.isEmpty() && !codigo.isEmpty() && !nivel.isEmpty() && !numCreditos.isEmpty()) {
            Programa programa = new Programa();
            programa.setNombre(nombre);
            programa.setNivel(nivel);
            try {
                programa.setCodigo(Integer.parseInt(codigo));
                programa.setCreditos(Integer.parseInt(numCreditos));
            } catch (NumberFormatException numberFormatException) {
                return "Valor invalido: "
                        +"\n El codigo debe tener solo numeros"
                        +"\n Para el numero de creditos.  debe tener solo numeros y"
                        + "Éste debe ser un numero entero positivo";
            }
            if (daoPrograma.guardarPrograma(programa) == -1) {
                return "No es posible registrar el Programa Academico:\n"
                        + "(1) Verifique la conexion con la base de datos no tenga problemas.\n"
                        + "(2) O que el Programa Academico no se encuentre ya registrado";
            }
            System.out.println("Se insertó  un  nuevo programa");
            return "OK";
        }
        return "Es necesario ingresar la informacion de todos los campos";
        //</editor-fold>
    }

    public Object[][] consultarProgramas(String codigo, String nombre, String nivel, String creditos) {
        //<editor-fold defaultstate="collapsed" desc="consultarProgramas()">
        if (!creditos.isEmpty()) {
            try {
                Integer.parseInt(creditos);
            } catch (NumberFormatException numberFormatException) {
                return null;
            }
        }

        ultimaConsulta = daoPrograma.consultarProgramas(codigo, nombre, nivel, creditos);
        Object resultado[][] = new Object[ultimaConsulta.size()][4];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = Integer.toString(ultimaConsulta.get(i).getCodigo());
            resultado[i][1] = ultimaConsulta.get(i).getNombre();
            resultado[i][2] = ultimaConsulta.get(i).getNivel();
            resultado[i][3] = Integer.toString(ultimaConsulta.get(i).getCreditos());
        }
        return resultado;
        //</editor-fold>
    }

    public String[] seleccionarPrograma(int seleccionado) {
        //<editor-fold defaultstate="collapsed" desc="seleccionarPrograma()">
        String programa[] = new String[4];
        programaSeleccionado = ultimaConsulta.get(seleccionado);

        programa[0] = Integer.toString(programaSeleccionado.getCodigo());
        programa[1] = programaSeleccionado.getNombre();
        programa[2] = programaSeleccionado.getNivel();
        programa[3] = Integer.toString(programaSeleccionado.getCreditos());

        return programa;
        //</editor-fold>
    }

    public String actualizarPrograma(String nombre, String nivel, String creditos) {
        //<editor-fold defaultstate="collapsed" desc="actualizarPrograma()">
        if (!nombre.isEmpty() && !nivel.isEmpty() && !creditos.isEmpty()) {

            programaSeleccionado.setNombre(nombre);
            programaSeleccionado.setNivel(nivel);
            try {
                programaSeleccionado.setCreditos(Integer.parseInt(creditos));
            } catch (NumberFormatException numberFormatException) {
                return "Valor invalido para el numero de creditos. Éste debe ser un numero entero positivo";
            }
            daoPrograma.modificarPrograma(programaSeleccionado);

            return "OK";
        } else {
            return "Es necesario ingresar la informacion de todos los campos";
        }
        //</editor-fold>
    }

    public void eliminarPrograma() {
        daoPrograma.eliminarPrograma(programaSeleccionado);
    }
}
