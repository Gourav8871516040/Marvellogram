package marvellogram;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Login extends javax.swing.JFrame {
Connection con=null;
Statement smt=null;

    public Login() {
        initComponents();
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fnam = new javax.swing.JTextField();
        lnam = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Login");

        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name :-");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 140, 180, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name  :-");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 200, 180, 40);

        fnam.setBackground(new java.awt.Color(0, 255, 51));
        fnam.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        fnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnamActionPerformed(evt);
            }
        });
        fnam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnamKeyPressed(evt);
            }
        });
        jPanel2.add(fnam);
        fnam.setBounds(210, 150, 230, 30);

        lnam.setBackground(new java.awt.Color(0, 255, 51));
        lnam.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnamActionPerformed(evt);
            }
        });
        lnam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnamKeyPressed(evt);
            }
        });
        jPanel2.add(lnam);
        lnam.setBounds(210, 210, 230, 30);

        enter.setBackground(new java.awt.Color(0, 255, 51));
        enter.setFont(new java.awt.Font("Imprint MT Shadow", 3, 18)); // NOI18N
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        jPanel2.add(enter);
        enter.setBounds(210, 290, 90, 30);

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setFont(new java.awt.Font("Imprint MT Shadow", 3, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(330, 290, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marvellogram/5a51a2e3d32624becb169f483a82890b.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 80, 470, 330);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        jLabel2.setFont(new java.awt.Font("Cabin Sketch", 3, 34)); // NOI18N
        jLabel2.setText(" Welcome To Marvellogram");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 80);

        jButton2.setText("jButton2");
        jPanel2.add(jButton2);
        jButton2.setBounds(250, 360, 73, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnamActionPerformed

        
    }//GEN-LAST:event_fnamActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed

        if(fnam.getText().isEmpty()&&lnam.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "  Name is Empty.");
       
        }else if(fnam.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "  First Name is Empty.");
        }else if(lnam.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "  Last Name is Empty.");       
        }
        else
        {
              
        this.setVisible(false);
         String a = fnam.getText();
         String b = lnam.getText();
        new Home(a,b).setVisible(true); 
     
        }
       
    }//GEN-LAST:event_enterActionPerformed

    private void lnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnamActionPerformed
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_lnamActionPerformed

    private void fnamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnamKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if(key == 10)
        {
            lnam.requestFocus();
        }
        
    }//GEN-LAST:event_fnamKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
       /* Code to be commented 
       try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root1799@");
           smt=con.createStatement();
           // insert into faculty values('f101','fname');
           smt.executeUpdate("insert into faculty values('"+"f101"+"','"+"fname"+"');");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
       */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lnamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnamKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_lnamKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enter;
    private javax.swing.JTextField fnam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lnam;
    // End of variables declaration//GEN-END:variables

   
}
