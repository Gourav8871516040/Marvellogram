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
public class AP extends javax.swing.JFrame {

    /**
     * Creates new form AP
     */
    public AP() {
        initComponents();
        this.setVisible(true);
        JOptionPane.showMessageDialog(entr,"Press 'E'  to  Enter.");
        srs.setEnabled(false);
        rqtm.setEnabled(false);
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
        firstn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        totaln = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        diffb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rqn = new javax.swing.JTextField();
        entr = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        srs = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        rqtm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bakpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Number Of Series");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 250, 40);

        firstn.setBackground(new java.awt.Color(0, 0, 0));
        firstn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        firstn.setForeground(new java.awt.Color(255, 255, 255));
        firstn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstnKeyPressed(evt);
            }
        });
        jPanel1.add(firstn);
        firstn.setBounds(30, 70, 210, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Total Numbers in Series");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 20, 270, 40);

        totaln.setBackground(new java.awt.Color(0, 0, 0));
        totaln.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        totaln.setForeground(new java.awt.Color(255, 255, 255));
        totaln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalnActionPerformed(evt);
            }
        });
        totaln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalnKeyPressed(evt);
            }
        });
        jPanel1.add(totaln);
        totaln.setBounds(340, 70, 220, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Difference Between Numbers");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 120, 310, 40);

        diffb.setBackground(new java.awt.Color(0, 0, 0));
        diffb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        diffb.setForeground(new java.awt.Color(255, 255, 255));
        diffb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                diffbKeyPressed(evt);
            }
        });
        jPanel1.add(diffb);
        diffb.setBounds(20, 170, 190, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("    Required Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 120, 230, 40);

        rqn.setBackground(new java.awt.Color(0, 0, 0));
        rqn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rqn.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(rqn);
        rqn.setBounds(370, 170, 200, 30);

        entr.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        entr.setText("E");
        entr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrMouseClicked(evt);
            }
        });
        jPanel1.add(entr);
        entr.setBounds(290, 280, 20, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("   Series :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 400, 110, 40);

        srs.setBackground(new java.awt.Color(0, 0, 0));
        srs.setColumns(20);
        srs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        srs.setForeground(new java.awt.Color(255, 255, 255));
        srs.setRows(5);
        jScrollPane1.setViewportView(srs);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 440, 570, 60);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Required Term :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 514, 190, 40);

        rqtm.setBackground(new java.awt.Color(51, 51, 51));
        rqtm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rqtm.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(rqtm);
        rqtm.setBounds(260, 520, 190, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 520, 100, 30);

        bakpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marvellogram/ap.jpg"))); // NOI18N
        jPanel1.add(bakpic);
        bakpic.setBounds(0, 0, 590, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void totalnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalnActionPerformed

    private void entrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrMouseClicked
        // TODO add your handling code here:
        	int i,a,b,c,d,e,f;

                                        //a=firstn  b=totln    c= diffb    d= rqn
 String s = firstn.getText();
 a = Integer.parseInt(s);
 String se = totaln.getText();
 b=Integer.parseInt(se);
 String es = diffb.getText();
 c = Integer.parseInt(es);
 String ss = rqn.getText();
 d = Integer.parseInt(ss);
e=a+(b-1)*c;
srs.setEnabled(true);
for(i=a;i<=e;i=i+c)
{
if(i!=e)
    srs.setText(srs.getText()+Integer.toString(i)+" + ");
 //printf("%d + ",i);
else
   srs.setText(srs.getText()+Integer.toString(i)+"");
 
    //printf("%d\n",i);
}
f=a+(d-1)*c;
rqtm.setEnabled(true);
rqtm.setText(Integer.toString(f));

    }//GEN-LAST:event_entrMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstnKeyPressed
        // TODO add your handling code here:
         int key = evt.getKeyCode();
        if(key == 10)
        {
            totaln.requestFocus();
        }
    }//GEN-LAST:event_firstnKeyPressed

    private void totalnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalnKeyPressed
        // TODO add your handling code here:
         int key = evt.getKeyCode();
        if(key == 10)
        {
            diffb.requestFocus();
        }
    }//GEN-LAST:event_totalnKeyPressed

    private void diffbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diffbKeyPressed
        // TODO add your handling code here:
         int key = evt.getKeyCode();
        if(key == 10)
        {
            rqn.requestFocus();
        }
    }//GEN-LAST:event_diffbKeyPressed

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
            java.util.logging.Logger.getLogger(AP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakpic;
    private javax.swing.JTextField diffb;
    private javax.swing.JLabel entr;
    private javax.swing.JTextField firstn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rqn;
    private javax.swing.JTextField rqtm;
    private javax.swing.JTextArea srs;
    private javax.swing.JTextField totaln;
    // End of variables declaration//GEN-END:variables
}
