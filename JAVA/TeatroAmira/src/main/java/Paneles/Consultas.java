/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paneles;

import clases.*;
import javax.swing.table.DefaultTableModel;
import main.PanelPrincipal;

/**
 *
 * @author Luis
 */
public class Consultas extends javax.swing.JFrame {

    /**
     * Creates new form Consultas
     */
    public Consultas() {
        initComponents();
        for(int i = 0; i < PanelPrincipal.obras.size(); i++) {
            
            boxObras.addItem(String.valueOf(PanelPrincipal.obras.get(i).getNombre()));
            
        }
        
        String columna[] = {"Nombre", "Genero", "DuraciónMin", "Precio", "MaxBoletos", "Recaudo"};
        String matriz[][] = new String[PanelPrincipal.obras.size()][6];
        tableObras.setModel(new DefaultTableModel(matriz,columna));
        
        String columna2[] = {"NumeroSala", "Asientos Disponibles", "Obra Asignada"};
        String matriz2[][] = new String[PanelPrincipal.salas.size()][3];
        tableSalas.setModel(new DefaultTableModel(matriz2,columna2));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelObras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxObras = new javax.swing.JComboBox<>();
        btnConsultarObra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableObras = new javax.swing.JTable();
        btnConsultarObras = new javax.swing.JButton();
        panelSalas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSalas = new javax.swing.JTable();
        btnInformacionSalas = new javax.swing.JButton();

        panelObras.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta Obras");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de la Obra: ");

        boxObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxObrasActionPerformed(evt);
            }
        });

        btnConsultarObra.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultarObra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnConsultarObra.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarObra.setText("Consultar Información");
        btnConsultarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarObraActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Información Completa de las obras");

        tableObras.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tableObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableObras);

        btnConsultarObras.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultarObras.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnConsultarObras.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarObras.setText("Consultar Información");
        btnConsultarObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarObrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelObrasLayout = new javax.swing.GroupLayout(panelObras);
        panelObras.setLayout(panelObrasLayout);
        panelObrasLayout.setHorizontalGroup(
            panelObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObrasLayout.createSequentialGroup()
                .addGroup(panelObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelObrasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelObrasLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelObrasLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addGroup(panelObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(panelObrasLayout.createSequentialGroup()
                                                .addComponent(boxObras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnConsultarObra))))))))
                    .addGroup(panelObrasLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btnConsultarObras)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelObrasLayout.setVerticalGroup(
            panelObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObrasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxObras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarObra))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarObras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Obras", panelObras);

        panelSalas.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Información de las Salas");

        tableSalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableSalas);

        btnInformacionSalas.setText("Consultar Información de las Salas");
        btnInformacionSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionSalasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSalasLayout = new javax.swing.GroupLayout(panelSalas);
        panelSalas.setLayout(panelSalasLayout);
        panelSalasLayout.setHorizontalGroup(
            panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalasLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(panelSalasLayout.createSequentialGroup()
                .addGroup(panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalasLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4))
                    .addGroup(panelSalasLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnInformacionSalas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSalasLayout.setVerticalGroup(
            panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInformacionSalas)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Salas", panelSalas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxObrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxObrasActionPerformed

    private void btnConsultarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarObraActionPerformed
        
        String nombreObra = boxObras.getSelectedItem().toString();
        
        Obra objeto = new Obra();
        
        objeto.ConsultaObra(PanelPrincipal.obras, nombreObra);        
        
    }//GEN-LAST:event_btnConsultarObraActionPerformed

    private void btnConsultarObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarObrasActionPerformed
        // TODO add your handling code here:
        Obra objeto = new Obra();
        
        objeto.ConsultarObras(PanelPrincipal.obras, tableObras);
    }//GEN-LAST:event_btnConsultarObrasActionPerformed

    private void btnInformacionSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionSalasActionPerformed
        
        Sala objeto = new Sala();
        
        objeto.ConsultarSalas(PanelPrincipal.salas, tableSalas);
        
    }//GEN-LAST:event_btnInformacionSalasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxObras;
    private javax.swing.JButton btnConsultarObra;
    private javax.swing.JButton btnConsultarObras;
    private javax.swing.JButton btnInformacionSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelObras;
    private javax.swing.JPanel panelSalas;
    private javax.swing.JTable tableObras;
    private javax.swing.JTable tableSalas;
    // End of variables declaration//GEN-END:variables
}
