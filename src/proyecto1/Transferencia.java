/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Luisda
 */
public class Transferencia extends javax.swing.JFrame {
    
    static DateTimeFormatter fecha1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static String[][] ParaComboBox3() {
        int contador = 0;
        for (int i = 1; i < MenuPrincipal.ListaDeCuentas.length; i++) {
            if (MenuPrincipal.ListaDeCuentas[i] == null) {
                break;
            }
            contador++;
        }
        String[][] TextoEnCombo = new String[2][contador];
        for (int i = 1; i < contador + 1; i++) {
            TextoEnCombo[0][i - 1] = "ID: " + MenuPrincipal.ListaDeCuentas[i].IDcuenta + " | Dueño: " + MenuPrincipal.ListaDeCuentas[i].Dueno.Nombre + " " + MenuPrincipal.ListaDeCuentas[i].Dueno.Apellido;
            TextoEnCombo[1][i - 1] = String.valueOf(MenuPrincipal.ListaDeCuentas[i].IDcuenta);

        }
        return TextoEnCombo;
    }

    /**
     * Creates new form Transferencia
     */
    public Transferencia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CuentaComboOrigen = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CuentaComboDestino = new javax.swing.JComboBox<>();
        BotonAceptar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        CampoMonto2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transferencia Monetaria");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Transferencia Monetaria");

        CuentaComboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(ParaComboBox3()[0]));
        CuentaComboOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaComboOrigenActionPerformed(evt);
            }
        });

        jLabel2.setText("Elija la cuenta de origen...");

        jLabel3.setText("Elija la cuenta de destino...");

        CuentaComboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(ParaComboBox3()[0]));

        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        CampoMonto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMonto2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Monto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotonAceptar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CuentaComboOrigen, 0, 274, Short.MAX_VALUE)
                                    .addComponent(CuentaComboDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CuentaComboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CuentaComboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAceptar)
                    .addComponent(BotonCancelar))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampoMonto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMonto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMonto2ActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        // TODO add your handling code here:
        if (MenuPrincipal.ListaDeCuentas[CuentaComboOrigen.getSelectedIndex() + 1] == MenuPrincipal.ListaDeCuentas[CuentaComboDestino.getSelectedIndex() + 1]) {
            JOptionPane.showMessageDialog(null, "La cuenta de origen y de destino son las mismas.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (Integer.valueOf(CampoMonto2.getText()) < 0 || Integer.valueOf(CampoMonto2.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "El monto ingresado no es correcto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (Integer.valueOf(CampoMonto2.getText()) > MenuPrincipal.ListaDeCuentas[CuentaComboOrigen.getSelectedIndex() + 1].Saldo) {
            JOptionPane.showMessageDialog(null, "La cuenta de origen no posee suficientes fondos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            MenuPrincipal.ListaDeCuentas[CuentaComboOrigen.getSelectedIndex() + 1].Saldo = MenuPrincipal.ListaDeCuentas[CuentaComboOrigen.getSelectedIndex() + 1].Saldo - Integer.valueOf(CampoMonto2.getText());
            MenuPrincipal.ListaDeCuentas[CuentaComboDestino.getSelectedIndex() + 1].Saldo = MenuPrincipal.ListaDeCuentas[CuentaComboDestino.getSelectedIndex() + 1].Saldo + Integer.valueOf(CampoMonto2.getText());
            JOptionPane.showMessageDialog(null, "Transferencia realizada con éxito.", "Info", JOptionPane.INFORMATION_MESSAGE);
            dispose();

            MenuPrincipal.ListaDeCuentas[CuentaComboOrigen.getSelectedIndex() + 1].SaldoCuenta();
            MenuPrincipal.ListaDeCuentas[CuentaComboDestino.getSelectedIndex() + 1].SaldoCuenta();
            for (int i = 0; i < 25; i++) {
                if (MenuPrincipal.Historial[CuentaComboOrigen.getSelectedIndex() + 1][0][i] == null) {

                    MenuPrincipal.Historial[CuentaComboOrigen.getSelectedIndex() + 1][0][i] = String.valueOf(MenuPrincipal.IDHistorial);
                    MenuPrincipal.Historial[CuentaComboOrigen.getSelectedIndex() + 1][1][i] = fecha1.format(LocalDateTime.now());
                    MenuPrincipal.Historial[CuentaComboOrigen.getSelectedIndex() + 1][2][i] = "Transferencia";
                    MenuPrincipal.Historial[CuentaComboOrigen.getSelectedIndex() + 1][3][i] = CampoMonto2.getText();
                    MenuPrincipal.Historial[CuentaComboOrigen.getSelectedIndex() + 1][4][i] = "0";
                    MenuPrincipal.Historial[CuentaComboOrigen.getSelectedIndex() + 1][5][i] = String.valueOf(MenuPrincipal.ListaDeCuentas[CuentaComboOrigen.getSelectedIndex() + 1].Saldo);

                    break;
                }
            }

            for (int i = 0; i < 25; i++) {
                if (MenuPrincipal.Historial[CuentaComboDestino.getSelectedIndex() + 1][0][i] == null) {

                    MenuPrincipal.Historial[CuentaComboDestino.getSelectedIndex() + 1][0][i] = String.valueOf(MenuPrincipal.IDHistorial);
                    MenuPrincipal.IDHistorial++;
                    MenuPrincipal.Historial[CuentaComboDestino.getSelectedIndex() + 1][1][i] = fecha1.format(LocalDateTime.now());
                    MenuPrincipal.Historial[CuentaComboDestino.getSelectedIndex() + 1][2][i] = "Transferencia";
                    MenuPrincipal.Historial[CuentaComboDestino.getSelectedIndex() + 1][3][i] = "0";
                    MenuPrincipal.Historial[CuentaComboDestino.getSelectedIndex() + 1][4][i] = CampoMonto2.getText();
                    MenuPrincipal.Historial[CuentaComboDestino.getSelectedIndex() + 1][5][i] = String.valueOf(MenuPrincipal.ListaDeCuentas[CuentaComboDestino.getSelectedIndex() + 1].Saldo);

                    break;
                }
            }

        }


    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void CuentaComboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaComboOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuentaComboOrigenActionPerformed

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
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JTextField CampoMonto2;
    private javax.swing.JComboBox<String> CuentaComboDestino;
    private javax.swing.JComboBox<String> CuentaComboOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
