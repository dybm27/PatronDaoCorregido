//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: ControladorEstudiante.java
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

import acceso_datos.DaoEstudiante;
import acceso_datos.DaoPrograma;
import logica.Estudiante;
import logica.Programa;
import java.util.ArrayList;

public class ControladorEstudiante {

    private DaoEstudiante daoEstudiante;
    private Estudiante estudianteSeleccionado;
    private ArrayList<Estudiante> ultimaConsulta;

    public ControladorEstudiante() {
        daoEstudiante = new DaoEstudiante();
    }

    public String insertarEstudiante(String codigo, String nombre,String edad, String sexo, String programa) {
        //<editor-fold defaultstate="collapsed" desc="insertarEstudiante()">
        if (!nombre.isEmpty() && !codigo.isEmpty() && !edad.isEmpty() && !" ".equals(sexo) && !" ".equals(programa)) {
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre(nombre);
            estudiante.setSexo(sexo.toCharArray()[0]);
            estudiante.setPrograma(new DaoPrograma().consultarPrograma(programa.split(" -")[0]));
            try {
                estudiante.setEdad(Integer.parseInt(edad));
                estudiante.setCodigo(Integer.parseInt(codigo));
            } catch (NumberFormatException numberFormatException) {
                return "Valor invalido: "
                        + "\n El codigo debe tener solo numeros"
                        + "\n Para la Edad. debe tener solo numeros y "
                        + "esta debe ser un numero entero positivo";
            }
            if (daoEstudiante.guardarEstudiante(estudiante) == -1) {
                return "No es posible registrar el Estudiante:\n"
                        + "(1) Verifique la conexion con la base de datos no tenga problemas.\n"
                        + "(2) O que el Estudiante no se encuentre ya registrado";
            }
            System.out.println("Se insertó un nuevo Estudiante");
            return "OK";
        } 
        return "Es necesario ingresar la informacion de todos los campos";
        //</editor-fold>
    }

    public String[] cargarProgramas() {
        //<editor-fold defaultstate="collapsed" desc="cargarProgramas()">
        ArrayList<Programa> programas = new DaoPrograma().consultarProgramas("", "", "", "");
        String[] programasRegistrados = new String[programas.size() + 1];

        programasRegistrados[0] = " ";
        for (int i = 0; i < programas.size(); i++) {
            programasRegistrados[i + 1] = programas.get(i).getCodigo() + " - " + programas.get(i).getNombre();
        }
        return programasRegistrados;
        //</editor-fold>
    }

    public Object[][] consultarEstudiantes(String codigo, String nombre,String edad, String sexo, String programa) {
        //<editor-fold defaultstate="collapsed" desc="consultarEstudiantes()">
        ultimaConsulta = daoEstudiante.consultarEstudiantes(codigo, nombre,edad, sexo, programa.split(" -")[0]);
        Object resultado[][] = new Object[ultimaConsulta.size()][5];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = ultimaConsulta.get(i).getCodigo();
            resultado[i][1] = ultimaConsulta.get(i).getNombre();
            resultado[i][2] = ultimaConsulta.get(i).getEdad();
            resultado[i][3] = (ultimaConsulta.get(i).getSexo() == 'M') ? "Masculino" : "Femenino";
            resultado[i][4] = (ultimaConsulta.get(i).getPrograma().getCodigo());
        }
        return resultado;
        //</editor-fold>
    }

    public String[] seleccionarEstudiante(int seleccionado) {
        //<editor-fold defaultstate="collapsed" desc="seleccionarEstudiante()">
        String estudiante[] = new String[5];
        estudianteSeleccionado = ultimaConsulta.get(seleccionado);

        estudiante[0] = Integer.toString(estudianteSeleccionado.getCodigo());
        estudiante[1] = estudianteSeleccionado.getNombre();
        estudiante[2] = Integer.toString(estudianteSeleccionado.getEdad());
        estudiante[3] = Character.toString(estudianteSeleccionado.getSexo());
        estudiante[4] = estudianteSeleccionado.getPrograma().getCodigo()
                + " - " + estudianteSeleccionado.getPrograma().getNombre();

        return estudiante;
        //</editor-fold>
    }

    public String actualizarEstudiante(String nombre,String edad, String sexo, String programa) {
        //<editor-fold defaultstate="collapsed" desc="actualizarEstudiante">
        if (!nombre.isEmpty() && !edad.isEmpty() && !" ".equals(sexo) && !" ".equals(programa)) {

            estudianteSeleccionado.setNombre(nombre);
            estudianteSeleccionado.setEdad(Integer.parseInt(edad));
            estudianteSeleccionado.setSexo(sexo.toCharArray()[0]);
            estudianteSeleccionado.setPrograma(new DaoPrograma().consultarPrograma(programa.split(" -")[0]));
            daoEstudiante.modificarEstudiante(estudianteSeleccionado);

            return "OK";
        } else {
            return "Es necesario ingresar la informacion de todos los campos";
        }
        //</editor-fold>
    }

    public void eliminarEstudiante() {
        daoEstudiante.eliminarEstudiante(estudianteSeleccionado);
    }
}
