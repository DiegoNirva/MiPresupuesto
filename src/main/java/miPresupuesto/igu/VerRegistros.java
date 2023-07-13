package miPresupuesto.igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import miPresupuesto.logica.Controladora;
import miPresupuesto.logica.GastoAdicional;
import miPresupuesto.logica.GastoFijo;
import miPresupuesto.logica.Sueldo;

public class VerRegistros extends javax.swing.JFrame {

    Controladora control = null;

    public VerRegistros() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboTraer = new javax.swing.JComboBox<>();
        btnTraerObjeto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegisto = new javax.swing.JTable();
        btnEliminarRegistro = new javax.swing.JButton();
        btnEditarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registros ");

        jLabel2.setText("Seleccione el registro que desea ver:");

        jComboTraer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sueldo", "Gastos Fijos", "Gastos Adicionales" }));
        jComboTraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTraerActionPerformed(evt);
            }
        });

        btnTraerObjeto.setText("Aceptar");
        btnTraerObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraerObjetoActionPerformed(evt);
            }
        });

        TablaRegisto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaRegisto);

        btnEliminarRegistro.setText("Eliminar");
        btnEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroActionPerformed(evt);
            }
        });

        btnEditarRegistro.setText("Editar");
        btnEditarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(btnEditarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboTraer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTraerObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboTraer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraerObjeto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTraerObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraerObjetoActionPerformed
        //asiganmos en una variable para poder hacer la condicion
        String valor = (String) jComboTraer.getSelectedItem();
        switch (valor) {
            case "Sueldo":
                cargarTablaSueldo();
                break;
            case "Gastos Fijos":
                cargarTablaGastFijos();
                break;
            case "Gastos Adicionales":
                cargarTabjaGastAdi();
                break;
            default:
                mostrarMensaje("Debe seleccionar una opcion", "Error", "Error sin registro");
                break;
        }
    }//GEN-LAST:event_btnTraerObjetoActionPerformed

    private void jComboTraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTraerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTraerActionPerformed

    private void btnEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegistroActionPerformed
        //asiganmos en una variable para poder hacer la condicion para determinar que registro de la tabla eliminar
        String valor = (String) jComboTraer.getSelectedItem();

        //comprobamos que la tabla tenga registro
        if (TablaRegisto.getRowCount() > 0) {
            //comprobamos que se selecciono un registro
            if (TablaRegisto.getSelectedRow() != -1) {
                //traemos el id para eliminar el registro
                int registro = Integer.parseInt(String.valueOf(TablaRegisto.getValueAt(TablaRegisto.getSelectedRow(), 3)));
                switch (valor) {
                    case "Sueldo":
                        control.borrarSueldo(registro);
                        break;
                    case "Gastos Fijos":
                        control.borrarGastFijos(registro);
                        break;
                    case "Gastos Adicionales":
                        control.borrarGastAdi(registro);
                        break;
                    default:
                        mostrarMensaje("Debe seleccionar un registro", "Error", "Error sin registro");
                        break;
                }
            } else {
                mostrarMensaje("No se selecciono ningun registro", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("No hay registro para eliminar", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarRegistroActionPerformed

    private void btnEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRegistroActionPerformed
               //asiganmos en una variable para poder hacer la condicion para determinar que registro de la tabla eliminar
        String valor = (String) jComboTraer.getSelectedItem();

        //comprobamos que la tabla tenga registro
        if (TablaRegisto.getRowCount() > 0) {
            //comprobamos que se selecciono un registro
            if (TablaRegisto.getSelectedRow() != -1) {
                //traemos el id para eliminar el registro
                int registro = Integer.parseInt(String.valueOf(TablaRegisto.getValueAt(TablaRegisto.getSelectedRow(), 3)));
                switch (valor) {
                    case "Sueldo":
                        //control.editarSueldo(registro);
                        break;
                    case "Gastos Fijos":
                        //control.editarGastFijos(registro);
                        break;
                    case "Gastos Adicionales":
                        //control.editarGastAdi(registro);
                        break;
                    default:
                        mostrarMensaje("Debe seleccionar un registro", "Error", "Error sin registro");
                        break;
                }
            } else {
                mostrarMensaje("No se selecciono ningun registro", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("No hay registro para eliminar", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEditarRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaRegisto;
    private javax.swing.JButton btnEditarRegistro;
    private javax.swing.JButton btnEliminarRegistro;
    private javax.swing.JButton btnTraerObjeto;
    private javax.swing.JComboBox<String> jComboTraer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    //METODOS GENERALES
    private void cargarTablaSueldo() {
        //definir el modeto de tabla 
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            //que fila y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //editar los nombres de las columnas
        String titulos[] = {"Año", "Mes", "Importe Neto", "Registro"};
        modeloTabla.setColumnIdentifiers(titulos);

        //traer los datos de sueldos
        //para ello manejamos una lista
        List<Sueldo> listaDeSueldos = control.traerSueldos();

        //recorremos la lista y mostramos cada uno de los datos
        //primero verificamos que la lista tenga datos
        if (listaDeSueldos != null) {
            for (Sueldo sueldo : listaDeSueldos) {
                //para que se pueda ver creamos un arrys con los datos
                Object[] objeto = {sueldo.getAnio(), sueldo.getMes(), sueldo.getImporteNeto(), sueldo.getRegistroSuel()};

                modeloTabla.addRow(objeto);

            }

        }
        TablaRegisto.setModel(modeloTabla);
    }

    private void cargarTablaGastFijos() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            //que fila y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //editar los nombres de las columnas
        String titulos[] = {"Concepto", "Mes", "Importe", "Registro"};
        modeloTabla.setColumnIdentifiers(titulos);

        //traer los datos de sueldos
        //para ello manejamos una lista
        List<GastoFijo> listaDeGastFijos = control.traerGastosFijos();

        //recorremos la lista y mostramos cada uno de los datos
        //primero verificamos que la lista tenga datos
        if (listaDeGastFijos != null) {
            for (GastoFijo fijo : listaDeGastFijos) {
                //para que se pueda ver creamos un arrys con los datos
                Object[] objeto = {fijo.getConcepto(), fijo.getMes(), fijo.getImporte(), fijo.getRegistroGasEsc()};

                modeloTabla.addRow(objeto);

            }

        }
        TablaRegisto.setModel(modeloTabla);
    }

    private void cargarTabjaGastAdi() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            //que fila y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //editar los nombres de las columnas
        String titulos[] = {"Concepto", "Mes", "Importe", "Registro"};
        modeloTabla.setColumnIdentifiers(titulos);

        //traer los datos de sueldos
        //para ello manejamos una lista
        List<GastoAdicional> listaDeGastAdi = control.traerGastosAdi();

        //recorremos la lista y mostramos cada uno de los datos
        //primero verificamos que la lista tenga datos
        if (listaDeGastAdi != null) {
            for (GastoAdicional adicion : listaDeGastAdi) {
                //para que se pueda ver creamos un arrys con los datos
                Object[] objeto = {adicion.getConcepto(), adicion.getMes(), adicion.getImporte(), adicion.getRegistroGasAdic()};

                modeloTabla.addRow(objeto);

            }

        }
        TablaRegisto.setModel(modeloTabla);
    }

    //metodo de mensajes
    private void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane opcionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            opcionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

        } else if (tipo.equals("Error")) {
            opcionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = opcionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }
}
