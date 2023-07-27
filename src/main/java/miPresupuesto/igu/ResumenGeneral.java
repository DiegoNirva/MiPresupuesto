package miPresupuesto.igu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.List;
import miPresupuesto.logica.Controladora;
import miPresupuesto.logica.Sueldo;
import miPresupuesto.logica.GastoFijo;
import miPresupuesto.logica.GastoAdicional;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class ResumenGeneral extends javax.swing.JFrame {

    Controladora control = null;

    public ResumenGeneral() {
        control = new Controladora();
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JlabelTotalSueldo = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        JlabelTotalGasFijos = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        JlabelTotalGasAdic = new java.awt.Label();
        jPanelGrafico = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JlabelAhorro = new java.awt.Label();
        BntMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESUMEN GENERAL ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Total Ingreso Mensual: ");

        JlabelTotalSueldo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JlabelTotalSueldo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Total Gastos Fijos: ");

        JlabelTotalGasFijos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Total Gastos Adicionales: ");

        JlabelTotalGasAdic.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jPanelGrafico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanelGraficoLayout = new javax.swing.GroupLayout(jPanelGrafico);
        jPanelGrafico.setLayout(jPanelGraficoLayout);
        jPanelGraficoLayout.setHorizontalGroup(
            jPanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelGraficoLayout.setVerticalGroup(
            jPanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Para Ahorro:");

        JlabelAhorro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        BntMenuPrincipal.setText("Menu Principal");
        BntMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JlabelAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JlabelTotalGasAdic, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelTotalSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelTotalGasFijos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(175, 175, 175))
            .addComponent(jPanelGrafico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(BntMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlabelTotalSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelTotalGasFijos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelTotalGasAdic, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BntMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarGrafico();
    }//GEN-LAST:event_formWindowOpened

    private void BntMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntMenuPrincipalActionPerformed
        Principal vista = new Principal();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        dispose();
    }//GEN-LAST:event_BntMenuPrincipalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntMenuPrincipal;
    private java.awt.Label JlabelAhorro;
    private java.awt.Label JlabelTotalGasAdic;
    private java.awt.Label JlabelTotalGasFijos;
    private java.awt.Label JlabelTotalSueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelGrafico;
    // End of variables declaration//GEN-END:variables

    private void cargarGrafico() {

        //usamos decimalFormat para trabajar con 3 decimales
        DecimalFormat df = new DecimalFormat("#.###");

        //traemos el ultimo sueldo ingresado
        List<Sueldo> listaSueldo = control.traerSueldos();
        double importeNeto = 0, ahorro = 0;
        if (!listaSueldo.isEmpty()) {
            Sueldo ultimo = listaSueldo.get(listaSueldo.size() - 1);
            importeNeto = (double) ultimo.getImporteNeto();

            ahorro = importeNeto * 0.20;
            JlabelAhorro.setText("$" + String.valueOf(df.format(ahorro)));
            JlabelTotalSueldo.setText("$" + String.valueOf(df.format(importeNeto)));
        }
        //traemos y sumamos todos los gastos fijos
        List<GastoFijo> listaGasFijo = control.traerGastosFijos();
        double totalFijo = 0;
        for (GastoFijo sumar : listaGasFijo) {
            totalFijo = (double) (totalFijo + sumar.getImporte());
        }
        JlabelTotalGasFijos.setText("$" + String.valueOf(df.format(totalFijo)));

        //traemos y sumamos todos los gastos adicionales
        List<GastoAdicional> listaGasAdi = control.traerGastosAdi();
        double totalAdi = 0;
        for (GastoAdicional sumar : listaGasAdi) {
            totalAdi = (double) (totalAdi + sumar.getImporte());
        }
        JlabelTotalGasAdic.setText("$" + String.valueOf(df.format(totalAdi)));

        //creamos la grafica
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Gastos Fijos", totalFijo);
        datos.setValue("Gastos Adicionales", totalAdi);
        datos.setValue("Para Ahorrar", ahorro);

        //metodo de grafico circular con los parametos correspondientes
        JFreeChart graficoCircular = ChartFactory.createPieChart(
                "Presupuesto Segun Ingresos", //nombre del grafico
                datos, //datos del grafico
                true, //nombre de categorias
                true, //herramientas
                false //generacion de url
        );

        //asignamos al panel
        ChartPanel panel = new ChartPanel(graficoCircular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(500, 300));
        panel.setAlignmentX(CENTER_ALIGNMENT);
        panel.setAlignmentY(CENTER_ALIGNMENT);

        jPanelGrafico.setLayout(new BorderLayout());
        jPanelGrafico.add(panel, BorderLayout.NORTH);

        pack();
        repaint();
    }
}
