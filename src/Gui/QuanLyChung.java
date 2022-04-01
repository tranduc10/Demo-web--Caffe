/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import ModelDAO.AccountData;
import javax.swing.JOptionPane;

/**
 *
 * @author huyparody
 */
public class QuanLyChung extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyChung
     */
//    Account account = new Account();
    public QuanLyChung() {
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

        btnDrinks = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jbtpassword = new javax.swing.JButton();
        jbtacout = new javax.swing.JButton();
        KhachDat = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý chung");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDrinks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDrinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-coffee-to-go-50.png"))); // NOI18N
        btnDrinks.setText("Thực đơn");
        btnDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinksActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 87, 202, 130));

        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/Statistics_50px.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        getContentPane().add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 206, 130));

        jbtpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-password-50.png"))); // NOI18N
        jbtpassword.setText("Đổi mật khẩu");
        jbtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jbtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 210, 130));

        jbtacout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtacout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-account-50.png"))); // NOI18N
        jbtacout.setText("Thêm tài khoản");
        jbtacout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtacoutActionPerformed(evt);
            }
        });
        getContentPane().add(jbtacout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 130));

        KhachDat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        KhachDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table-60 (1).png"))); // NOI18N
        KhachDat.setText("Khách đặt trước");
        KhachDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhachDatActionPerformed(evt);
            }
        });
        getContentPane().add(KhachDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 87, -1, 130));

        btnOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-order-50.png"))); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 210, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/Account_50px.png"))); // NOI18N
        jLabel1.setText("Quản Lý Cà Phê");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 31, 550, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/rsz_1pexels-burst-373888.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        jMenu4.setForeground(new java.awt.Color(51, 51, 255));
        jMenu4.setText("Tài khoản");

        jMenuItem3.setText("Đăng xuất");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
            // TODO add your handling code here:
            QuanLyDangNhap mdn = new QuanLyDangNhap();
            mdn.setVisible(true);
            dispose();
        }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        ThongTinBan qltk = new ThongTinBan();
        qltk.setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed

        QuanLyThongKe qltk = new QuanLyThongKe();
        qltk.setVisible(true);
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinksActionPerformed
        // TODO add your handling code here:
        QuanLyDoUong qld = new QuanLyDoUong();
        qld.setVisible(true);
    }//GEN-LAST:event_btnDrinksActionPerformed

    private void jbtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtpasswordActionPerformed
        // TODO add your handling code here:
        DoiMatKhau dmk = new DoiMatKhau();
        dmk.setVisible(true);
    }//GEN-LAST:event_jbtpasswordActionPerformed

    private void jbtacoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtacoutActionPerformed
        // TODO add your handling code here:
        if (!AccountData.getInstance().GetAccount().getUsername().equals("admin")) {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập chức năng này!");
            return;
        }

        Themtaikhoan ttk = new Themtaikhoan();
        ttk.setVisible(true);
    }//GEN-LAST:event_jbtacoutActionPerformed

    private void KhachDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhachDatActionPerformed
         KhachDatTruoc dmk = new KhachDatTruoc();
           dmk.setLocationRelativeTo(null);
            dmk.setVisible(true);
    }//GEN-LAST:event_KhachDatActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyChung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KhachDat;
    private javax.swing.JButton btnDrinks;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtacout;
    private javax.swing.JButton jbtpassword;
    // End of variables declaration//GEN-END:variables
}
