/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout;

import java.awt.CardLayout;

/**
 *
 * @author maldi
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /** Creates new form PilihGambarComboBox */
    public PilihGambarComboBox() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboboxPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihCB = new javax.swing.JComboBox<>();
        cardgambarPanel = new javax.swing.JPanel();
        dmc5LB = new javax.swing.JLabel();
        revillageLB = new javax.swing.JLabel();
        re4LB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pilih Gambar");
        comboboxPanel.add(jLabel1);

        pilihCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DMC5", "RE VILLAGE", "RE 4" }));
        pilihCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihCBActionPerformed(evt);
            }
        });
        comboboxPanel.add(pilihCB);

        getContentPane().add(comboboxPanel, java.awt.BorderLayout.PAGE_START);

        cardgambarPanel.setLayout(new java.awt.CardLayout());

        dmc5LB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/dmc5.png"))); // NOI18N
        cardgambarPanel.add(dmc5LB, "0");

        revillageLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/revillage.png"))); // NOI18N
        cardgambarPanel.add(revillageLB, "1");

        re4LB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/re4.png"))); // NOI18N
        cardgambarPanel.add(re4LB, "2");

        getContentPane().add(cardgambarPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihCBActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (cardgambarPanel.getLayout());
        cl.show(cardgambarPanel, String.valueOf(pilihCB.getSelectedIndex()));
    }//GEN-LAST:event_pilihCBActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardgambarPanel;
    private javax.swing.JPanel comboboxPanel;
    private javax.swing.JLabel dmc5LB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> pilihCB;
    private javax.swing.JLabel re4LB;
    private javax.swing.JLabel revillageLB;
    // End of variables declaration//GEN-END:variables

}
