/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangky;

import KetNoiSQL.KetNoi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author Minh Huan
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    
    
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel_LoginFrame.setVisible(true);
        jPanel_Loading.setVisible(false);
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
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_Loading = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel_LoginFrame = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_Login = new javax.swing.JButton();
        jLabel_Sigin = new javax.swing.JLabel();
        Jlabel_Main_Note = new javax.swing.JLabel();
        jLabel_Note_MSV = new javax.swing.JLabel();
        Jlabel_Note_MK = new javax.swing.JLabel();
        jPasswordField_Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("????NG NH???P");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dangky/images/icons8_login_48px.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jPanel_Loading.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DangNhap/Loading_2.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel_LoadingLayout = new javax.swing.GroupLayout(jPanel_Loading);
        jPanel_Loading.setLayout(jPanel_LoadingLayout);
        jPanel_LoadingLayout.setHorizontalGroup(
            jPanel_LoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoadingLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel_LoadingLayout.setVerticalGroup(
            jPanel_LoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoadingLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("M?? sinh vi??n");

        jTextField_ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_IDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_IDFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("M???t kh???u");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Qu??n m???t kh???u ?");

        jButton_Login.setBackground(new java.awt.Color(51, 102, 255));
        jButton_Login.setFont(new java.awt.Font("Roboto Black", 1, 13)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Login.setText("????NG NH???P");
        jButton_Login.setBorder(null);
        jButton_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseExited(evt);
            }
        });

        jLabel_Sigin.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel_Sigin.setText("????ng k??");
        jLabel_Sigin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Sigin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SiginMouseClicked(evt);
            }
        });

        Jlabel_Main_Note.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        Jlabel_Main_Note.setForeground(new java.awt.Color(204, 0, 0));

        jLabel_Note_MSV.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel_Note_MSV.setForeground(new java.awt.Color(204, 0, 0));

        Jlabel_Note_MK.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Jlabel_Note_MK.setForeground(new java.awt.Color(204, 0, 0));

        jPasswordField_Pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_PassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_PassFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel_LoginFrameLayout = new javax.swing.GroupLayout(jPanel_LoginFrame);
        jPanel_LoginFrame.setLayout(jPanel_LoginFrameLayout);
        jPanel_LoginFrameLayout.setHorizontalGroup(
            jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginFrameLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginFrameLayout.createSequentialGroup()
                        .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Sigin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(Jlabel_Main_Note, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_LoginFrameLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_LoginFrameLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Note_MSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_LoginFrameLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Jlabel_Note_MK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ID)
                                    .addComponent(jPasswordField_Pass))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel_LoginFrameLayout.setVerticalGroup(
            jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginFrameLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_Note_MSV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Jlabel_Note_MK, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlabel_Main_Note, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_LoginFrameLayout.createSequentialGroup()
                        .addComponent(jLabel_Sigin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel_Loading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel_LoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel_Loading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel_LoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseClicked
        // TODO add your handling code here:
        
        String id = jTextField_ID.getText();
        String pass = jPasswordField_Pass.getText();
        boolean checkLogin = true;
        if("".equals(id)) {
            jLabel_Note_MSV.setText("(*)");
            checkLogin = false;
        }
        if("".equals(pass)) {
            Jlabel_Note_MK.setText("(*)");
            checkLogin = false;
        }
        
        
        
        
        
        
        if(checkLogin) {
            
            jPanel_LoginFrame.setVisible(false);
            jPanel_Loading.setVisible(true);
            
            
            
            
            
            System.out.println("id" + id + "pass: "+ pass);
            Connection ketNoi = (Connection) KetNoi.ConnectSQL();
            String sql = "select * from sinhvien where MASV = ?";
            try {
               PreparedStatement ps = ketNoi.prepareStatement(sql);
               ps.setString(1, id);
               ResultSet rs = ps.executeQuery();
               if(rs.next() ){
                   //khong tim thay msv
                   //co ma sv
                   String maTK = rs.getString("MATK");
                   System.out.println("matk: "+ maTK);
                   if(maTK == null) {
                        Jlabel_Main_Note.setText("*MSV ch??a ????ng k?? t??i kho???n");
                   }
                   else {
                        String sql2 = "select * from TAIKHOAN where MATK = ? and MATKHAU = ?";
                        PreparedStatement ps1 = ketNoi.prepareStatement(sql2);
                        ps1.setString(1, maTK);
                        ps1.setString(2, pass);
                        ResultSet rs2 = ps1.executeQuery();
                        if(rs2.next()){
                            new MainFrame(id).setVisible(true);
                            this.setVisible(false);
                        }
                        else {
                            Jlabel_Main_Note.setText("*Sai m???t kh???u");
                        }
                          
                   }
                   
               }
               else {
                   Jlabel_Main_Note.setText("*Sai MSV ho???c m???t kh???u");
                   return;
               }
            } catch (Exception e) {
                System.out.println("error...");
                e.getStackTrace();
            }
            
            
            
            
        }
        
        
        
    }//GEN-LAST:event_jButton_LoginMouseClicked

    private void jTextField_IDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_IDFocusGained
        // TODO add your handling code here:
        
        Jlabel_Main_Note.setText("");
        jTextField_ID.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_jTextField_IDFocusGained

    private void jButton_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseEntered
        // TODO add your handling code here:
        jButton_Login.setBackground(Color.BLUE);
    }//GEN-LAST:event_jButton_LoginMouseEntered

    private void jButton_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseExited
        // TODO add your handling code here:
        jButton_Login.setBackground(new Color(51,102,225));
    }//GEN-LAST:event_jButton_LoginMouseExited

    private void jTextField_IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_IDFocusLost
        // TODO add your handling code here:
        String id = jTextField_ID.getText();
        System.out.println("id: " +id);
        if("".equals(id)){
            jTextField_ID.setBackground(new Color(252, 170, 154));
        }
    }//GEN-LAST:event_jTextField_IDFocusLost

    private void jPasswordField_PassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PassFocusGained
        // TODO add your handling code here:
        Jlabel_Main_Note.setText("");
        jPasswordField_Pass.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPasswordField_PassFocusGained

    private void jPasswordField_PassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PassFocusLost
        // TODO add your handling code here:
        String id = jTextField_ID.getText();
        System.out.println("id: " +id);
        if("".equals(id)){
            jPasswordField_Pass.setBackground(new Color(252, 170, 154));
        }
    }//GEN-LAST:event_jPasswordField_PassFocusLost

    private void jLabel_SiginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SiginMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new SiginFrame().setVisible(true);
    }//GEN-LAST:event_jLabel_SiginMouseClicked

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_Main_Note;
    private javax.swing.JLabel Jlabel_Note_MK;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Note_MSV;
    private javax.swing.JLabel jLabel_Sigin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Loading;
    private javax.swing.JPanel jPanel_LoginFrame;
    private javax.swing.JPasswordField jPasswordField_Pass;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables
}
