

package marvellogram;



public class DecToBin extends javax.swing.JFrame {

   
    
    int dec,temp,i,j=1,binary=0;
    public DecToBin()
    {
        initComponents();
        rslt.setText("Result");
        rslt.setEnabled(false);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rslt = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bakpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lemon", 3, 26)); // NOI18N
        jLabel1.setText("No. in Binary");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 90, 240, 40);

        jLabel2.setFont(new java.awt.Font("Lemon", 3, 28)); // NOI18N
        jLabel2.setText("Decimal No. ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 20, 230, 40);

        rslt.setBackground(new java.awt.Color(255, 204, 102));
        rslt.setFont(new java.awt.Font("Lemon", 1, 20)); // NOI18N
        jPanel1.add(rslt);
        rslt.setBounds(430, 90, 140, 40);

        num.setBackground(new java.awt.Color(255, 204, 102));
        num.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        num.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numMouseClicked(evt);
            }
        });
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numKeyPressed(evt);
            }
        });
        jPanel1.add(num);
        num.setBounds(430, 20, 140, 40);

        jLabel3.setFont(new java.awt.Font("Lemon", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 450, 90, 40);

        jLabel4.setFont(new java.awt.Font("Lemon", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Home");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 444, 120, 40);

        jLabel5.setFont(new java.awt.Font("Lemon", 1, 30)); // NOI18N
        jLabel5.setText("Enter");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 150, 120, 40);

        bakpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marvellogram/cn2.jpg"))); // NOI18N
        jPanel1.add(bakpic);
        bakpic.setBounds(0, 0, 590, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        	
 
String s= num.getText();
 dec = Integer.parseInt(s);
temp=dec;
while(temp!=0)
{
i=temp%2;
binary=binary+(i*j);
temp=temp/2;
j=j*10;

}
rslt.setEnabled(true);
rslt.setText("");
rslt.setText(Integer.toString(binary));
 binary=0;
 j=1;
 i=0;
    }//GEN-LAST:event_jLabel5MouseClicked

    private void numMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numMouseClicked
        // TODO add your handling code here:
        num.setText("");
         rslt.setText("Result");
        rslt.setEnabled(false);
    }//GEN-LAST:event_numMouseClicked

    private void numKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_numKeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Converter().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    
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
            java.util.logging.Logger.getLogger(DecToBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DecToBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DecToBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DecToBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DecToBin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakpic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField num;
    private javax.swing.JTextField rslt;
    // End of variables declaration//GEN-END:variables
}
