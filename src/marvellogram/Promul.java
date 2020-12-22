/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvellogram;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Promul extends javax.swing.JFrame {

    /**
     * Creates new form Promul
     */
    private double pro;
    public Promul() {
        initComponents();
         pronum.setText("Enter All Numbers");
         pronum.setEnabled(false);
        prorslt.setText("Product Of All Numbers");
        prorslt.setEnabled(false);
        pro = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pronum = new javax.swing.JTextField();
        prorslt = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        back = new javax.swing.JButton();
        backpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Number :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 70, 150, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 153));
        jButton1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 200, 100, 30);

        pronum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pronumMouseClicked(evt);
            }
        });
        pronum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pronumActionPerformed(evt);
            }
        });
        jPanel1.add(pronum);
        pronum.setBounds(250, 70, 180, 30);
        jPanel1.add(prorslt);
        prorslt.setBounds(250, 200, 180, 30);

        home.setBackground(new java.awt.Color(255, 0, 153));
        home.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(30, 320, 110, 30);

        back.setBackground(new java.awt.Color(0, 102, 153));
        back.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(350, 320, 100, 30);

        backpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marvellogram/sqrpic.jpg"))); // NOI18N
        jPanel1.add(backpic);
        backpic.setBounds(0, 0, 570, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new calcuframe().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
       
        new calcuframe().setVisible(false);
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        prorslt.setEnabled(true);
        prorslt.setText(Double.toString(pro));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pronumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pronumActionPerformed
        // TODO add your handling code here:
        String s = pronum.getText();
        double d = Double.parseDouble(s);
        pro = pro * d;
        pronum.setText("");
    }//GEN-LAST:event_pronumActionPerformed

    private void pronumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pronumMouseClicked
        // TODO add your handling code here:
        pronum.setEnabled(true);
                JOptionPane.showMessageDialog(prorslt, "Press  'Enter'  After  Each  Number.");

        pronum.setText("");
        pro =1;
    }//GEN-LAST:event_pronumMouseClicked

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
            java.util.logging.Logger.getLogger(Promul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel backpic;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pronum;
    private javax.swing.JTextField prorslt;
    // End of variables declaration//GEN-END:variables
}
