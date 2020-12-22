

package marvellogram;


public class Check extends javax.swing.JFrame {

    
    
    public Check() {
        initComponents();
        reslt.setEnabled(false);
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        reslt = new javax.swing.JTextField();
        evnodd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PERFECT = new javax.swing.JButton();
        ARMSTRONG = new javax.swing.JButton();
        PALINNDROM = new javax.swing.JButton();
        HOME = new javax.swing.JButton();
        bakpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(425, 660));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Permanent Marker", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Number :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 180, 30);

        num.setBackground(new java.awt.Color(0, 0, 0));
        num.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        num.setForeground(new java.awt.Color(255, 255, 255));
        num.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numMouseClicked(evt);
            }
        });
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num);
        num.setBounds(230, 60, 190, 30);

        jLabel2.setFont(new java.awt.Font("Permanent Marker", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Result :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 120, 170, 30);

        reslt.setBackground(new java.awt.Color(0, 0, 0));
        reslt.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        reslt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(reslt);
        reslt.setBounds(200, 130, 280, 30);

        evnodd.setBackground(new java.awt.Color(0, 0, 0));
        evnodd.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        evnodd.setForeground(new java.awt.Color(255, 255, 255));
        evnodd.setText("EVEN/ODD");
        evnodd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evnoddActionPerformed(evt);
            }
        });
        jPanel1.add(evnodd);
        evnodd.setBounds(20, 210, 160, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("PRIME NO.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(333, 213, 160, 30);

        PERFECT.setBackground(new java.awt.Color(0, 0, 0));
        PERFECT.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        PERFECT.setForeground(new java.awt.Color(255, 255, 255));
        PERFECT.setText("PERFECT NO.");
        PERFECT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PERFECTActionPerformed(evt);
            }
        });
        jPanel1.add(PERFECT);
        PERFECT.setBounds(20, 313, 160, 30);

        ARMSTRONG.setBackground(new java.awt.Color(0, 0, 0));
        ARMSTRONG.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        ARMSTRONG.setForeground(new java.awt.Color(255, 255, 255));
        ARMSTRONG.setText("ARMSTRONG NO.");
        ARMSTRONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARMSTRONGActionPerformed(evt);
            }
        });
        jPanel1.add(ARMSTRONG);
        ARMSTRONG.setBounds(180, 260, 180, 30);

        PALINNDROM.setBackground(new java.awt.Color(0, 0, 0));
        PALINNDROM.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        PALINNDROM.setForeground(new java.awt.Color(255, 255, 255));
        PALINNDROM.setText("PALINDROM NO.");
        PALINNDROM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PALINNDROMActionPerformed(evt);
            }
        });
        jPanel1.add(PALINNDROM);
        PALINNDROM.setBounds(330, 320, 170, 30);

        HOME.setBackground(new java.awt.Color(0, 0, 0));
        HOME.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 255, 255));
        HOME.setText("HOME");
        HOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEActionPerformed(evt);
            }
        });
        jPanel1.add(HOME);
        HOME.setBounds(370, 563, 110, 40);

        bakpic.setForeground(new java.awt.Color(255, 255, 255));
        bakpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marvellogram/chek.jpg"))); // NOI18N
        jPanel1.add(bakpic);
        bakpic.setBounds(0, 0, 510, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    private void evnoddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evnoddActionPerformed
        // TODO add your handling code here:
        String s = num.getText();
        int d = Integer.parseInt(s);
        reslt.setEnabled(true);
        if(d%2==0)
            reslt.setText("Number  is  Even.");
        else
            reslt.setText("Number  is  Odd.");
        
    }//GEN-LAST:event_evnoddActionPerformed

    private void numMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numMouseClicked
        // TODO add your handling code here:
        num.setText("");
        reslt.setText("");
        reslt.setEnabled(false);
    }//GEN-LAST:event_numMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i,c=1;
        String s = num.getText();
        int d = Integer.parseInt(s);
        reslt.setEnabled(true);
        for(i=2;i<d;i++)
        {
            if(d%i==0)
                c=0;
        }
        if(c==1)
        reslt.setText("Number  is  Prime  Number.");
        else
            reslt.setText("Number  is  not  Prime  Number.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ARMSTRONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARMSTRONGActionPerformed
        // TODO add your handling code here:
        
	 int r,n,count=0,m,i,sum=0,o;
	 String s= num.getText();
         n= Integer.parseInt(s);
	      
	      o=n;
	      while(n!=0)
	      {
	      n/=10;
	      count++;
	      }
	      n=o;
	      while(n!=0)
	      {
	      m=1;
	      r=n%10;
	      n/=10;
	      for(i=1;i<=count;i++)
	      m=m*r;
	      sum+=m;
	       }
              reslt.setEnabled(true);
	      if(sum==o)
	       reslt.setText("Number  is  Armstrong  Number.");
	      
	      else
	       reslt.setText("Number  is  not  Armstrong.");
	      
    }//GEN-LAST:event_ARMSTRONGActionPerformed

    private void PERFECTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERFECTActionPerformed
        // TODO add your handling code here:
         int a,p=1,add=0;
	String s = num.getText();
         a = Integer.parseInt(s);
	      
	      while(p<a)
	       {
	      if(a%p==0)
	      add=add+p;
	       p++;
		}
              reslt.setEnabled(true);
	      if(add==a)
	        reslt.setText("Number  is  Perfect  Number");
              
	      else
	        reslt.setText("Number  is  not  Perfect Number.");
    }//GEN-LAST:event_PERFECTActionPerformed

    private void PALINNDROMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PALINNDROMActionPerformed
        // TODO add your handling code here:
        int  q,t=0,k,z;
            String s = num.getText();
            z = Integer.parseInt(s);
	      q=z;
	      while(q!=0)
	       {
	      k=q%10;
	      q=q/10;
	      t=t*10+k;
	       }
              reslt.setEnabled(true);
	      if(t==z)
	      reslt.setText("Number  is  Palindrom  Number.");
	      
	      else
	      reslt.setText("Number  is not Palindrom  Number.");
	      
    }//GEN-LAST:event_PALINNDROMActionPerformed

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
        
    }//GEN-LAST:event_HOMEActionPerformed

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
            java.util.logging.Logger.getLogger(Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ARMSTRONG;
    private javax.swing.JButton HOME;
    private javax.swing.JButton PALINNDROM;
    private javax.swing.JButton PERFECT;
    private javax.swing.JLabel bakpic;
    private javax.swing.JButton evnodd;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField num;
    private javax.swing.JTextField reslt;
    // End of variables declaration//GEN-END:variables
}
