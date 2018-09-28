//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: JPanelEstudiante.java
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

import controlador.ControladorEstudiante;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JPanelEstudiante extends javax.swing.JPanel {

    private ControladorEstudiante controladorEstudiante;

    public JPanelEstudiante() {
        this.controladorEstudiante = new ControladorEstudiante();
        initComponents();
        jTabbedPane1.setEnabledAt(2, false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelRegistroE = new javax.swing.JPanel();
        jLabelRegistar = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLSexo = new javax.swing.JLabel();
        jLPrograma = new javax.swing.JLabel();
        jTFCodigoRE = new javax.swing.JTextField();
        jTFNombreRE = new javax.swing.JTextField();
        jCBSexoRE = new javax.swing.JComboBox();
        jCBProgramaRE = new javax.swing.JComboBox();
        jButtonLimpiarRE = new javax.swing.JButton();
        jButtonRegistarE = new javax.swing.JButton();
        jLNombre2 = new javax.swing.JLabel();
        jTFEdadRE = new javax.swing.JTextField();
        jPanelConsultaE = new javax.swing.JPanel();
        jLabelRegistar1 = new javax.swing.JLabel();
        jLCodigo1 = new javax.swing.JLabel();
        jLNombre1 = new javax.swing.JLabel();
        jLSexo1 = new javax.swing.JLabel();
        jLPrograma1 = new javax.swing.JLabel();
        jTFCodigoCE = new javax.swing.JTextField();
        jTFNombreCE = new javax.swing.JTextField();
        jCBSexoCE = new javax.swing.JComboBox();
        jCBProgramaCE = new javax.swing.JComboBox();
        jButtonLimpiarCE = new javax.swing.JButton();
        jButtonConsultarE = new javax.swing.JButton();
        jButtonEditarCE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();
        jLabelNotaEditar = new javax.swing.JLabel();
        jLNombre4 = new javax.swing.JLabel();
        jTFEdadCE = new javax.swing.JTextField();
        jPanelEditarE = new javax.swing.JPanel();
        jLabelRegistar3 = new javax.swing.JLabel();
        jLCodigo3 = new javax.swing.JLabel();
        jLNombre3 = new javax.swing.JLabel();
        jLSexo3 = new javax.swing.JLabel();
        jLPrograma3 = new javax.swing.JLabel();
        jTFCodigoAE = new javax.swing.JTextField();
        jTFNombreAE = new javax.swing.JTextField();
        jCBSexoAE = new javax.swing.JComboBox();
        jCBProgramaAE = new javax.swing.JComboBox();
        jButtonLimpiarAE = new javax.swing.JButton();
        jButtonEliminarE = new javax.swing.JButton();
        jButtonActualizarE = new javax.swing.JButton();
        jLNombre5 = new javax.swing.JLabel();
        jTFEdadAE = new javax.swing.JTextField();

        setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Gestion Estudiante");
        add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 10, 580, 40);

        jPanelRegistroE.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Estudiante");
        jPanelRegistroE.add(jLabelRegistar);
        jLabelRegistar.setBounds(0, 10, 580, 40);

        jLCodigo.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo.setText("Codigo");
        jPanelRegistroE.add(jLCodigo);
        jLCodigo.setBounds(50, 70, 200, 30);

        jLNombre.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre.setText("Edad");
        jPanelRegistroE.add(jLNombre);
        jLNombre.setBounds(50, 150, 200, 30);

        jLSexo.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLSexo.setText("Sexo");
        jPanelRegistroE.add(jLSexo);
        jLSexo.setBounds(50, 200, 200, 30);

        jLPrograma.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma.setText("Codigo Programa");
        jPanelRegistroE.add(jLPrograma);
        jLPrograma.setBounds(50, 240, 200, 30);
        jPanelRegistroE.add(jTFCodigoRE);
        jTFCodigoRE.setBounds(260, 70, 250, 30);
        jPanelRegistroE.add(jTFNombreRE);
        jTFNombreRE.setBounds(260, 110, 250, 30);

        jCBSexoRE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Masculino", "Femenino" }));
        jPanelRegistroE.add(jCBSexoRE);
        jCBSexoRE.setBounds(260, 200, 250, 30);

        jCBProgramaRE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBProgramaRE.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBProgramaREPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanelRegistroE.add(jCBProgramaRE);
        jCBProgramaRE.setBounds(260, 240, 250, 30);

        jButtonLimpiarRE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarRE.setText("LIMPIAR");
        jButtonLimpiarRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarREActionPerformed(evt);
            }
        });
        jPanelRegistroE.add(jButtonLimpiarRE);
        jButtonLimpiarRE.setBounds(290, 290, 100, 35);

        jButtonRegistarE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonRegistarE.setText("REGISTAR");
        jButtonRegistarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarEActionPerformed(evt);
            }
        });
        jPanelRegistroE.add(jButtonRegistarE);
        jButtonRegistarE.setBounds(170, 290, 100, 35);

        jLNombre2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre2.setText("Nombre");
        jPanelRegistroE.add(jLNombre2);
        jLNombre2.setBounds(50, 110, 200, 30);
        jPanelRegistroE.add(jTFEdadRE);
        jTFEdadRE.setBounds(260, 150, 250, 30);

        jTabbedPane1.addTab("Registar", jPanelRegistroE);

        jPanelConsultaE.setLayout(null);

        jLabelRegistar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar1.setText("Consulta Estudiantes");
        jPanelConsultaE.add(jLabelRegistar1);
        jLabelRegistar1.setBounds(0, 10, 580, 40);

        jLCodigo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo1.setText("Codigo");
        jPanelConsultaE.add(jLCodigo1);
        jLCodigo1.setBounds(20, 70, 180, 30);

        jLNombre1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre1.setText("Edad");
        jPanelConsultaE.add(jLNombre1);
        jLNombre1.setBounds(20, 150, 180, 30);

        jLSexo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLSexo1.setText("Sexo");
        jPanelConsultaE.add(jLSexo1);
        jLSexo1.setBounds(20, 190, 180, 30);

        jLPrograma1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma1.setText("Codigo Programa");
        jPanelConsultaE.add(jLPrograma1);
        jLPrograma1.setBounds(20, 230, 180, 30);
        jPanelConsultaE.add(jTFCodigoCE);
        jTFCodigoCE.setBounds(200, 70, 200, 30);
        jPanelConsultaE.add(jTFNombreCE);
        jTFNombreCE.setBounds(200, 110, 200, 30);

        jCBSexoCE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Masculino", "Femenino" }));
        jPanelConsultaE.add(jCBSexoCE);
        jCBSexoCE.setBounds(200, 190, 200, 30);

        jCBProgramaCE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBProgramaCE.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBProgramaCEPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanelConsultaE.add(jCBProgramaCE);
        jCBProgramaCE.setBounds(200, 230, 200, 30);

        jButtonLimpiarCE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarCE.setText("LIMPIAR");
        jButtonLimpiarCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCEActionPerformed(evt);
            }
        });
        jPanelConsultaE.add(jButtonLimpiarCE);
        jButtonLimpiarCE.setBounds(420, 180, 140, 35);

        jButtonConsultarE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonConsultarE.setText("CONSULTAR");
        jButtonConsultarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarEActionPerformed(evt);
            }
        });
        jPanelConsultaE.add(jButtonConsultarE);
        jButtonConsultarE.setBounds(420, 100, 140, 35);

        jButtonEditarCE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEditarCE.setText("EDITAR*");
        jButtonEditarCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarCEActionPerformed(evt);
            }
        });
        jPanelConsultaE.add(jButtonEditarCE);
        jButtonEditarCE.setBounds(420, 140, 140, 35);

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Edad", "Sexo", "Cod_Programa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResultados);

        jPanelConsultaE.add(jScrollPane1);
        jScrollPane1.setBounds(30, 280, 540, 140);

        jLabelNotaEditar.setText("* Debe seleccionar solamente una fila dentro de la tabla");
        jPanelConsultaE.add(jLabelNotaEditar);
        jLabelNotaEditar.setBounds(20, 420, 540, 14);

        jLNombre4.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre4.setText("Nombre");
        jPanelConsultaE.add(jLNombre4);
        jLNombre4.setBounds(20, 110, 180, 30);
        jPanelConsultaE.add(jTFEdadCE);
        jTFEdadCE.setBounds(200, 150, 200, 30);

        jTabbedPane1.addTab("Consultar", jPanelConsultaE);

        jPanelEditarE.setLayout(null);

        jLabelRegistar3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar3.setText("Edicion Estudiante");
        jPanelEditarE.add(jLabelRegistar3);
        jLabelRegistar3.setBounds(0, 10, 580, 40);

        jLCodigo3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo3.setText("Codigo");
        jPanelEditarE.add(jLCodigo3);
        jLCodigo3.setBounds(50, 70, 200, 30);

        jLNombre3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre3.setText("Edad");
        jPanelEditarE.add(jLNombre3);
        jLNombre3.setBounds(50, 150, 200, 30);

        jLSexo3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLSexo3.setText("Sexo");
        jPanelEditarE.add(jLSexo3);
        jLSexo3.setBounds(50, 190, 200, 30);

        jLPrograma3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma3.setText("Codigo Programa");
        jPanelEditarE.add(jLPrograma3);
        jLPrograma3.setBounds(50, 230, 200, 30);

        jTFCodigoAE.setEnabled(false);
        jPanelEditarE.add(jTFCodigoAE);
        jTFCodigoAE.setBounds(260, 70, 250, 30);
        jPanelEditarE.add(jTFNombreAE);
        jTFNombreAE.setBounds(260, 110, 250, 30);

        jCBSexoAE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Masculino", "Femenino" }));
        jPanelEditarE.add(jCBSexoAE);
        jCBSexoAE.setBounds(260, 190, 250, 30);

        jCBProgramaAE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBProgramaAE.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBProgramaAEPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanelEditarE.add(jCBProgramaAE);
        jCBProgramaAE.setBounds(260, 230, 250, 30);

        jButtonLimpiarAE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarAE.setText("LIMPIAR");
        jButtonLimpiarAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarAEActionPerformed(evt);
            }
        });
        jPanelEditarE.add(jButtonLimpiarAE);
        jButtonLimpiarAE.setBounds(340, 290, 130, 35);

        jButtonEliminarE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEliminarE.setText("ELIMINAR");
        jButtonEliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarEActionPerformed(evt);
            }
        });
        jPanelEditarE.add(jButtonEliminarE);
        jButtonEliminarE.setBounds(200, 290, 130, 35);

        jButtonActualizarE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonActualizarE.setText("ACTUALIZAR");
        jButtonActualizarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarEActionPerformed(evt);
            }
        });
        jPanelEditarE.add(jButtonActualizarE);
        jButtonActualizarE.setBounds(60, 290, 130, 35);

        jLNombre5.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNombre5.setText("Nombre");
        jPanelEditarE.add(jLNombre5);
        jLNombre5.setBounds(50, 110, 200, 30);
        jPanelEditarE.add(jTFEdadAE);
        jTFEdadAE.setBounds(260, 150, 250, 30);

        jTabbedPane1.addTab("Editar", jPanelEditarE);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 580, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarEActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonConsultarActionPerformed()">
        evt.getActionCommand();
        Object programas[][] = controladorEstudiante.consultarEstudiantes(jTFCodigoCE.getText(),
                jTFNombreCE.getText(),
                jTFEdadCE.getText(),
                jCBSexoCE.getSelectedItem().toString(),
                jCBProgramaCE.getSelectedItem().toString());

        TableModel myModel = new javax.swing.table.DefaultTableModel(
                programas,
                new String[]{
                    "Codigo", "Nombre", "Edad", "Sexo", "Cod_Programa"
                }) {

            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));
        //</editor-fold>
    }//GEN-LAST:event_jButtonConsultarEActionPerformed

    private void jButtonLimpiarCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCEActionPerformed
        evt.getActionCommand();
        limpiarCamposConsulta();
   }//GEN-LAST:event_jButtonLimpiarCEActionPerformed

    private void jButtonRegistarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarEActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonRegistarActionPerformed()">
        evt.getActionCommand();
        String registro;
        registro = controladorEstudiante.insertarEstudiante(jTFCodigoRE.getText(),
                jTFNombreRE.getText(),
                jTFEdadRE.getText(),
                jCBSexoRE.getSelectedItem().toString(),
                jCBProgramaRE.getSelectedItem().toString());

        if ("OK".equals(registro)) {
            limpiarCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(this, registro);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonRegistarEActionPerformed

    private void jButtonLimpiarREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarREActionPerformed
        evt.getActionCommand();
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarREActionPerformed

    private void jButtonLimpiarAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarAEActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonLimpiarEActionPerformed()">
        evt.getActionCommand();
        jTFNombreAE.setText("");
        jCBSexoAE.setSelectedIndex(0);
        jCBProgramaAE.setSelectedIndex(0);
        //</editor-fold>
    }//GEN-LAST:event_jButtonLimpiarAEActionPerformed

    private void jButtonEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarEActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEliminarActionPerformed()">
        evt.getActionCommand();
        controladorEstudiante.eliminarEstudiante();
        limpiarCamposConsulta();
        jButtonConsultarE.doClick();
        jTabbedPane1.setSelectedIndex(1);
        //</editor-fold>
    }//GEN-LAST:event_jButtonEliminarEActionPerformed

    private void jButtonActualizarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarEActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonActualizarActionPerformed()">
        evt.getActionCommand();
        String actualizacion;
        actualizacion = controladorEstudiante.actualizarEstudiante(jTFNombreAE.getText(),
                jTFEdadAE.getText(),
                jCBSexoAE.getSelectedItem().toString(),
                jCBProgramaAE.getSelectedItem().toString());

        if ("OK".equals(actualizacion)) {
            jTFCodigoCE.setText(jTFCodigoAE.getText());
            jButtonConsultarE.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposEdicion();
        } else {
            JOptionPane.showMessageDialog(this, actualizacion);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonActualizarEActionPerformed

    private void jButtonEditarCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarCEActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEditarActionPerformed()">
        evt.getActionCommand();
        int seleccionado = jTableResultados.getSelectedRow();
        if (seleccionado >= 0) {
            String programa[] = controladorEstudiante.seleccionarEstudiante(seleccionado);

            jTFCodigoAE.setText(programa[0]);
            jTFNombreAE.setText(programa[1]);
            jTFEdadAE.setText(programa[2]);

            if (programa[3].equals("M")) {
                jCBSexoAE.setSelectedIndex(1);
            } else {
                jCBSexoAE.setSelectedIndex(2);
            }

            jCBProgramaAE.setModel(
                    new javax.swing.DefaultComboBoxModel(
                            controladorEstudiante.cargarProgramas()));
            jCBProgramaAE.setSelectedItem(programa[4]);
            System.out.println("programaAcademico: " + programa[4]);
            jTabbedPane1.setSelectedIndex(2);
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonEditarCEActionPerformed

    private void jCBProgramaREPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBProgramaREPopupMenuWillBecomeVisible
        //<editor-fold defaultstate="collapsed" desc="jCBProgramaPopupMenuWillBecomeVisible()">
        evt.hashCode();
        jCBProgramaRE.setModel(
                new javax.swing.DefaultComboBoxModel(
                        controladorEstudiante.cargarProgramas()));
        //</editor-fold>
    }//GEN-LAST:event_jCBProgramaREPopupMenuWillBecomeVisible

    private void jCBProgramaCEPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBProgramaCEPopupMenuWillBecomeVisible
        //<editor-fold defaultstate="collapsed" desc="jCBPrograma1PopupMenuWillBecomeVisible()">
        evt.hashCode();
        jCBProgramaCE.setModel(
                new javax.swing.DefaultComboBoxModel(
                        controladorEstudiante.cargarProgramas()));
        //</editor-fold>
    }//GEN-LAST:event_jCBProgramaCEPopupMenuWillBecomeVisible

    private void jCBProgramaAEPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBProgramaAEPopupMenuWillBecomeVisible
        //<editor-fold defaultstate="collapsed" desc="jCBPrograma3PopupMenuWillBecomeVisible()">
        evt.hashCode();
        jCBProgramaCE.setModel(
                new javax.swing.DefaultComboBoxModel(
                        controladorEstudiante.cargarProgramas()));
        //</editor-fold>
    }//GEN-LAST:event_jCBProgramaAEPopupMenuWillBecomeVisible

    private void limpiarCamposRegistro() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposRegistro()">
        jTFCodigoRE.setText("");
        jTFNombreRE.setText("");
        jTFEdadRE.setText("");
        jCBSexoRE.setSelectedIndex(0);
        jCBProgramaRE.setSelectedIndex(0);
        //</editor-fold>
    }

    private void limpiarCamposEdicion() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposEdicion()">
        jTFCodigoAE.setText("");
        jTFNombreAE.setText("");
        jTFEdadAE.setText("");
        jCBSexoAE.setSelectedIndex(0);
        jCBProgramaAE.setSelectedIndex(0);
        //</editor-fold>
    }

    private void limpiarCamposConsulta() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposConsulta()">
        jTFCodigoCE.setText("");
        jTFNombreCE.setText("");
        jTFEdadCE.setText("");
        jCBSexoCE.setSelectedIndex(0);
        jCBProgramaCE.setSelectedIndex(0);

        TableModel myModel = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Codigo", "Nombre", "Sexo", "Programa"
                });

        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));
        //</editor-fold>
    }
	
	 // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarE;
    private javax.swing.JButton jButtonConsultarE;
    private javax.swing.JButton jButtonEditarCE;
    private javax.swing.JButton jButtonEliminarE;
    private javax.swing.JButton jButtonLimpiarAE;
    private javax.swing.JButton jButtonLimpiarCE;
    private javax.swing.JButton jButtonLimpiarRE;
    private javax.swing.JButton jButtonRegistarE;
    private javax.swing.JComboBox jCBProgramaAE;
    private javax.swing.JComboBox jCBProgramaCE;
    private javax.swing.JComboBox jCBProgramaRE;
    private javax.swing.JComboBox jCBSexoAE;
    private javax.swing.JComboBox jCBSexoCE;
    private javax.swing.JComboBox jCBSexoRE;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLCodigo3;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLNombre2;
    private javax.swing.JLabel jLNombre3;
    private javax.swing.JLabel jLNombre4;
    private javax.swing.JLabel jLNombre5;
    private javax.swing.JLabel jLPrograma;
    private javax.swing.JLabel jLPrograma1;
    private javax.swing.JLabel jLPrograma3;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLSexo1;
    private javax.swing.JLabel jLSexo3;
    private javax.swing.JLabel jLabelNotaEditar;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelRegistar1;
    private javax.swing.JLabel jLabelRegistar3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelConsultaE;
    private javax.swing.JPanel jPanelEditarE;
    private javax.swing.JPanel jPanelRegistroE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigoAE;
    private javax.swing.JTextField jTFCodigoCE;
    private javax.swing.JTextField jTFCodigoRE;
    private javax.swing.JTextField jTFEdadAE;
    private javax.swing.JTextField jTFEdadCE;
    private javax.swing.JTextField jTFEdadRE;
    private javax.swing.JTextField jTFNombreAE;
    private javax.swing.JTextField jTFNombreCE;
    private javax.swing.JTextField jTFNombreRE;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables
}
