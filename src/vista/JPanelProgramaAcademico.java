//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: JPanelProgramaAcademico.java
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
package vista;

import controlador.ControladorProgramaAcademico;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JPanelProgramaAcademico extends javax.swing.JPanel {

    private ControladorProgramaAcademico controladorPrograma;

    public JPanelProgramaAcademico() {

        controladorPrograma = new ControladorProgramaAcademico();
        initComponents();
        jTabbedPane1.setEnabledAt(2, false);
    }
 // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarP;
    private javax.swing.JButton jButtonConsultarP;
    private javax.swing.JButton jButtonEditarCP;
    private javax.swing.JButton jButtonEliminarP;
    private javax.swing.JButton jButtonLimpiarAP;
    private javax.swing.JButton jButtonLimpiarCP;
    private javax.swing.JButton jButtonLimpiarRP;
    private javax.swing.JButton jButtonRegistarP;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLCodigo3;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLNivel1;
    private javax.swing.JLabel jLNivel3;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLNombre3;
    private javax.swing.JLabel jLNumCreditos;
    private javax.swing.JLabel jLNumCreditos1;
    private javax.swing.JLabel jLNumCreditos3;
    private javax.swing.JLabel jLabelNotaEditar;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelRegistar1;
    private javax.swing.JLabel jLabelRegistar3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelConsultaP;
    private javax.swing.JPanel jPanelEditarP;
    private javax.swing.JPanel jPanelRegistroP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigoAP;
    private javax.swing.JTextField jTFCodigoCP;
    private javax.swing.JTextField jTFCodigoRP;
    private javax.swing.JTextField jTFNivelAP;
    private javax.swing.JTextField jTFNivelCP;
    private javax.swing.JTextField jTFNivelRP;
    private javax.swing.JTextField jTFNombreAP;
    private javax.swing.JTextField jTFNombreCP;
    private javax.swing.JTextField jTFNombreRP;
    private javax.swing.JTextField jTFNumCreditosAP;
    private javax.swing.JTextField jTFNumCreditosCP;
    private javax.swing.JTextField jTFNumCreditosRP;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelRegistroP = new javax.swing.JPanel();
        jLabelRegistar = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLNivel = new javax.swing.JLabel();
        jLNumCreditos = new javax.swing.JLabel();
        jTFCodigoRP = new javax.swing.JTextField();
        jTFNombreRP = new javax.swing.JTextField();
        jTFNivelRP = new javax.swing.JTextField();
        jTFNumCreditosRP = new javax.swing.JTextField();
        jButtonLimpiarRP = new javax.swing.JButton();
        jButtonRegistarP = new javax.swing.JButton();
        jPanelConsultaP = new javax.swing.JPanel();
        jLabelRegistar1 = new javax.swing.JLabel();
        jLCodigo1 = new javax.swing.JLabel();
        jLNombre1 = new javax.swing.JLabel();
        jLNivel1 = new javax.swing.JLabel();
        jLNumCreditos1 = new javax.swing.JLabel();
        jTFCodigoCP = new javax.swing.JTextField();
        jTFNombreCP = new javax.swing.JTextField();
        jTFNivelCP = new javax.swing.JTextField();
        jTFNumCreditosCP = new javax.swing.JTextField();
        jButtonLimpiarCP = new javax.swing.JButton();
        jButtonConsultarP = new javax.swing.JButton();
        jButtonEditarCP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();
        jLabelNotaEditar = new javax.swing.JLabel();
        jPanelEditarP = new javax.swing.JPanel();
        jLabelRegistar3 = new javax.swing.JLabel();
        jLCodigo3 = new javax.swing.JLabel();
        jLNombre3 = new javax.swing.JLabel();
        jLNivel3 = new javax.swing.JLabel();
        jLNumCreditos3 = new javax.swing.JLabel();
        jTFCodigoAP = new javax.swing.JTextField();
        jTFNombreAP = new javax.swing.JTextField();
        jTFNivelAP = new javax.swing.JTextField();
        jTFNumCreditosAP = new javax.swing.JTextField();
        jButtonLimpiarAP = new javax.swing.JButton();
        jButtonEliminarP = new javax.swing.JButton();
        jButtonActualizarP = new javax.swing.JButton();

        setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Gestion Programa Academico");
        add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 10, 580, 40);

        jPanelRegistroP.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Programa Academico");
        jPanelRegistroP.add(jLabelRegistar);
        jLabelRegistar.setBounds(0, 10, 580, 40);

        jLCodigo.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo.setText("Codigo");
        jPanelRegistroP.add(jLCodigo);
        jLCodigo.setBounds(50, 70, 200, 30);

        jLNombre.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre.setText("Nombre");
        jPanelRegistroP.add(jLNombre);
        jLNombre.setBounds(50, 110, 200, 30);

        jLNivel.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNivel.setText("Nivel");
        jPanelRegistroP.add(jLNivel);
        jLNivel.setBounds(50, 150, 200, 30);

        jLNumCreditos.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos.setText("Numero de Creditos");
        jPanelRegistroP.add(jLNumCreditos);
        jLNumCreditos.setBounds(50, 190, 200, 30);
        jPanelRegistroP.add(jTFCodigoRP);
        jTFCodigoRP.setBounds(260, 70, 250, 30);
        jPanelRegistroP.add(jTFNombreRP);
        jTFNombreRP.setBounds(260, 110, 250, 30);
        jPanelRegistroP.add(jTFNivelRP);
        jTFNivelRP.setBounds(260, 150, 250, 30);
        jPanelRegistroP.add(jTFNumCreditosRP);
        jTFNumCreditosRP.setBounds(260, 190, 250, 30);

        jButtonLimpiarRP.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarRP.setText("LIMPIAR");
        jButtonLimpiarRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarRPActionPerformed(evt);
            }
        });
        jPanelRegistroP.add(jButtonLimpiarRP);
        jButtonLimpiarRP.setBounds(290, 240, 100, 35);

        jButtonRegistarP.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonRegistarP.setText("REGISTAR");
        jButtonRegistarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarPActionPerformed(evt);
            }
        });
        jPanelRegistroP.add(jButtonRegistarP);
        jButtonRegistarP.setBounds(170, 240, 100, 35);

        jTabbedPane1.addTab("Registar", jPanelRegistroP);

        jPanelConsultaP.setLayout(null);

        jLabelRegistar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar1.setText("Consulta Programas Academicos");
        jPanelConsultaP.add(jLabelRegistar1);
        jLabelRegistar1.setBounds(0, 10, 580, 40);

        jLCodigo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo1.setText("Codigo");
        jPanelConsultaP.add(jLCodigo1);
        jLCodigo1.setBounds(20, 70, 180, 30);

        jLNombre1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre1.setText("Nombre");
        jPanelConsultaP.add(jLNombre1);
        jLNombre1.setBounds(20, 110, 180, 30);

        jLNivel1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNivel1.setText("Nivel");
        jPanelConsultaP.add(jLNivel1);
        jLNivel1.setBounds(20, 150, 180, 30);

        jLNumCreditos1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos1.setText("Numero de Creditos");
        jPanelConsultaP.add(jLNumCreditos1);
        jLNumCreditos1.setBounds(20, 190, 180, 30);
        jPanelConsultaP.add(jTFCodigoCP);
        jTFCodigoCP.setBounds(200, 70, 200, 30);
        jPanelConsultaP.add(jTFNombreCP);
        jTFNombreCP.setBounds(200, 110, 200, 30);
        jPanelConsultaP.add(jTFNivelCP);
        jTFNivelCP.setBounds(200, 150, 200, 30);
        jPanelConsultaP.add(jTFNumCreditosCP);
        jTFNumCreditosCP.setBounds(200, 190, 200, 30);

        jButtonLimpiarCP.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarCP.setText("LIMPIAR");
        jButtonLimpiarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCPActionPerformed(evt);
            }
        });
        jPanelConsultaP.add(jButtonLimpiarCP);
        jButtonLimpiarCP.setBounds(420, 180, 140, 35);

        jButtonConsultarP.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonConsultarP.setText("CONSULTAR");
        jButtonConsultarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarPActionPerformed(evt);
            }
        });
        jPanelConsultaP.add(jButtonConsultarP);
        jButtonConsultarP.setBounds(420, 100, 140, 35);

        jButtonEditarCP.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEditarCP.setText("EDITAR*");
        jButtonEditarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarCPActionPerformed(evt);
            }
        });
        jPanelConsultaP.add(jButtonEditarCP);
        jButtonEditarCP.setBounds(420, 140, 140, 35);

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Nivel", "Numero Creditos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResultados);

        jPanelConsultaP.add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 540, 140);

        jLabelNotaEditar.setText("* Debe seleccionar solamente una fila dentro de la tabla");
        jPanelConsultaP.add(jLabelNotaEditar);
        jLabelNotaEditar.setBounds(20, 392, 540, 14);

        jTabbedPane1.addTab("Consultar", jPanelConsultaP);

        jPanelEditarP.setLayout(null);

        jLabelRegistar3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar3.setText("Edicion Programa Academico");
        jPanelEditarP.add(jLabelRegistar3);
        jLabelRegistar3.setBounds(0, 10, 580, 40);

        jLCodigo3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo3.setText("Codigo");
        jPanelEditarP.add(jLCodigo3);
        jLCodigo3.setBounds(50, 70, 200, 30);

        jLNombre3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre3.setText("Nombre");
        jPanelEditarP.add(jLNombre3);
        jLNombre3.setBounds(50, 110, 200, 30);

        jLNivel3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNivel3.setText("Nivel");
        jPanelEditarP.add(jLNivel3);
        jLNivel3.setBounds(50, 150, 200, 30);

        jLNumCreditos3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumCreditos3.setText("Numero de Creditos");
        jPanelEditarP.add(jLNumCreditos3);
        jLNumCreditos3.setBounds(50, 190, 200, 30);

        jTFCodigoAP.setEnabled(false);
        jPanelEditarP.add(jTFCodigoAP);
        jTFCodigoAP.setBounds(260, 70, 250, 30);
        jPanelEditarP.add(jTFNombreAP);
        jTFNombreAP.setBounds(260, 110, 250, 30);
        jPanelEditarP.add(jTFNivelAP);
        jTFNivelAP.setBounds(260, 150, 250, 30);
        jPanelEditarP.add(jTFNumCreditosAP);
        jTFNumCreditosAP.setBounds(260, 190, 250, 30);

        jButtonLimpiarAP.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarAP.setText("LIMPIAR");
        jButtonLimpiarAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarAPActionPerformed(evt);
            }
        });
        jPanelEditarP.add(jButtonLimpiarAP);
        jButtonLimpiarAP.setBounds(340, 250, 130, 35);

        jButtonEliminarP.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEliminarP.setText("ELIMINAR");
        jButtonEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPActionPerformed(evt);
            }
        });
        jPanelEditarP.add(jButtonEliminarP);
        jButtonEliminarP.setBounds(200, 250, 130, 35);

        jButtonActualizarP.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonActualizarP.setText("ACTUALIZAR");
        jButtonActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarPActionPerformed(evt);
            }
        });
        jPanelEditarP.add(jButtonActualizarP);
        jButtonActualizarP.setBounds(60, 250, 130, 35);

        jTabbedPane1.addTab("Editar", jPanelEditarP);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 580, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarPActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonConsultarActionPerformed()">
        evt.getActionCommand();
        Object programas[][] = controladorPrograma.consultarProgramas(
                jTFCodigoCP.getText(),
                jTFNombreCP.getText(),
                jTFNivelCP.getText(),
                jTFNumCreditosCP.getText());

        TableModel myModel = new javax.swing.table.DefaultTableModel(
                programas,
                new String[]{
                    "Codigo", "Nombre", "Nivel", "Numero Creditos"
                }) {

            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));
        //</editor-fold>
    }//GEN-LAST:event_jButtonConsultarPActionPerformed

    private void jButtonLimpiarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCPActionPerformed
        evt.getActionCommand();
        limpiarCamposConsulta();
   }//GEN-LAST:event_jButtonLimpiarCPActionPerformed

    private void jButtonRegistarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarPActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonRegistarActionPerformed()">
        evt.getActionCommand();
        String registro;
        registro = controladorPrograma.insertarPrograma(
                jTFCodigoRP.getText(),
                jTFNombreRP.getText(),
                jTFNivelRP.getText(),
                jTFNumCreditosRP.getText());

        if ("OK".equals(registro)) {
//            jTFCodigo1.setText(jTFCodigo.getText());
//            jButtonConsultar.doClick();
//            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(this, registro);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonRegistarPActionPerformed

    private void jButtonLimpiarRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRPActionPerformed
        evt.getActionCommand();
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarRPActionPerformed

    private void jButtonLimpiarAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarAPActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonLimpiarEActionPerformed()">
        evt.getActionCommand();
        jTFNombreAP.setText("");
        jTFNivelAP.setText("");
        jTFNumCreditosAP.setText("");
        //</editor-fold>
    }//GEN-LAST:event_jButtonLimpiarAPActionPerformed

    private void jButtonEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEliminarActionPerformed()">
        evt.getActionCommand();
        controladorPrograma.eliminarPrograma();
        limpiarCamposConsulta();
        jButtonConsultarP.doClick();
        jTabbedPane1.setSelectedIndex(1);
        //</editor-fold>
    }//GEN-LAST:event_jButtonEliminarPActionPerformed

    private void jButtonActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarPActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonActualizarActionPerformed()">
        evt.getActionCommand();
        String actualizacion;
        actualizacion = controladorPrograma.actualizarPrograma(
                jTFNombreAP.getText(),
                jTFNivelAP.getText(),
                jTFNumCreditosAP.getText());

        if ("OK".equals(actualizacion)) {
            jTFCodigoCP.setText(jTFCodigoAP.getText());
            jButtonConsultarP.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposEdicion();
        } else {
            JOptionPane.showMessageDialog(this, actualizacion);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonActualizarPActionPerformed

    private void jButtonEditarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarCPActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEditarActionPerformed()">
        evt.getActionCommand();
        int seleccionado = jTableResultados.getSelectedRow();
        if (seleccionado >= 0) {
            String programa[] = controladorPrograma.seleccionarPrograma(seleccionado);
            jTabbedPane1.setSelectedIndex(2);
            jTFCodigoAP.setText(programa[0]);
            jTFNombreAP.setText(programa[1]);
            jTFNivelAP.setText(programa[2]);
            jTFNumCreditosAP.setText(programa[3]);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonEditarCPActionPerformed

    public void limpiarCamposRegistro() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposRegistro()">
        jTFCodigoRP.setText("");
        jTFNombreRP.setText("");
        jTFNivelRP.setText("");
        jTFNumCreditosRP.setText("");
        //</editor-fold>
    }

    public void limpiarCamposEdicion() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposEdicion()">
        jTFCodigoAP.setText("");
        jTFNombreAP.setText("");
        jTFNivelAP.setText("");
        jTFNumCreditosAP.setText("");
        //</editor-fold>
    }

    public void limpiarCamposConsulta() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposConsulta()">
        jTFCodigoCP.setText("");
        jTFNombreCP.setText("");
        jTFNivelCP.setText("");
        jTFNumCreditosCP.setText("");

        TableModel myModel = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Codigo", "Nombre", "Nivel", "Numero Creditos"
                });

        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));
        //</editor-fold>
    }
}
