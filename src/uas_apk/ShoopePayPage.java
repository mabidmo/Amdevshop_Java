/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_apk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author MabidPC
 */
public class ShoopePayPage extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String user, pass;
    int Page = 0;
    /**
     * Creates new form ShoopePayPage
     */
    public ShoopePayPage(String u, String p, int BackPage) {
        try {
            initComponents();
            con = DBconnection.connectionDB();
            user = u;
            Page = BackPage;
            pass = p;
            String sql = "SELECT * FROM login WHERE username = ? AND password = ?; ";
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs = pst.executeQuery();

            if (rs.next()) {
                String nama = rs.getString("nama");
                //JOptionPane.showMessageDialog(null, "berhasil " + nama);
                NameUser.setText(nama);

            } else {
                JOptionPane.showMessageDialog(null, "error");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        } finally {
            try{
                rs.close();
                pst.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Done = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NameUser = new javax.swing.JLabel();
        btn_Exit = new javax.swing.JLabel();
        btn_Home = new javax.swing.JLabel();
        btn_Back = new javax.swing.JLabel();
        Backg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Done.setText("DONE");
        btn_Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoneActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Done, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 110, 50));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Hello ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 50, 20));

        NameUser.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        NameUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NameUser.setText("____ ");
        getContentPane().add(NameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 300, 20));

        btn_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ExitMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, 30, 30));

        btn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HomeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, 30, 30));

        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 30, 30));

        Backg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas_apk/gambar/ShopeePayPage.png"))); // NOI18N
        getContentPane().add(Backg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_ExitMouseClicked

    private void btn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_HomeMouseClicked

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        // TODO add your handling code here:
        new PembayaranPage(user, pass, 0).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_BackMouseClicked

    private void btn_DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoneActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "THANKS FOR ORDER");
        
        
        new HomePage(user, pass).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_DoneActionPerformed

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
            java.util.logging.Logger.getLogger(ShoopePayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoopePayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoopePayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoopePayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShoopePayPage().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backg;
    private javax.swing.JLabel NameUser;
    private javax.swing.JLabel btn_Back;
    private javax.swing.JButton btn_Done;
    private javax.swing.JLabel btn_Exit;
    private javax.swing.JLabel btn_Home;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
