/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import ModelDAO.TablesData;
import ModelDAO.Tables;
import java.util.List;

/**
 *
 * @author DUCTV
 */
public class ThongTinBan extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public ThongTinBan() {
        initComponents();
        setStatus();
    }

    private void setStatus() {
        List<Tables> listTable = TablesData.getInstance().LoadListTables();
        for (int i = 0; i < listTable.size(); i++) {
            Tables tables = listTable.get(i);
            if (tables.getTableName().equals("Bàn 1")) {
                if (tables.getTableStatus()==0) {
                    Ban1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban1.setEnabled(false);
            }
                if (tables.getTableName().equals("Bàn 2")) {
                if (tables.getTableStatus()==0) {
                    Ban2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban2.setEnabled(false);
            }
                  if (tables.getTableName().equals("Bàn 3")) {
                if (tables.getTableStatus()==0) {
                    Ban3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban3.setEnabled(false);
            }
                  if (tables.getTableName().equals("Bàn 4")) {
                if (tables.getTableStatus()==0) {
                    Ban4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban4.setEnabled(false);
            }
                     if (tables.getTableName().equals("Bàn 5")) {
                if (tables.getTableStatus()==0) {
                    Ban5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban5.setEnabled(false);
            }
                       if (tables.getTableName().equals("Bàn 6")) {
                if (tables.getTableStatus()==0) {
                    Ban6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban6.setEnabled(false);
            }
                         if (tables.getTableName().equals("Bàn 7")) {
                if (tables.getTableStatus()==0) {
                    Ban7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban7.setEnabled(false);
            }
                          if (tables.getTableName().equals("Bàn 8")) {
                if (tables.getTableStatus()==0) {
                    Ban8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban8.setEnabled(false);
            }
                            if (tables.getTableName().equals("Bàn 9")) {
                if (tables.getTableStatus()==0) {
                    Ban9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban9.setEnabled(false);
            }
                               if (tables.getTableName().equals("Bàn 10")) {
                if (tables.getTableStatus()==0) {
                    Ban10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban10.setEnabled(false);
            }
                                if (tables.getTableName().equals("Bàn 11")) {
                if (tables.getTableStatus()==0) {
                    Ban11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban11.setEnabled(false);
            }
                                  if (tables.getTableName().equals("Bàn 12")) {
                if (tables.getTableStatus()==0) {
                    Ban12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png")));
                } else if(tables.getTableStatus()==1){
                    Ban12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table1-60.png")));
                }
                else Ban12.setEnabled(false);
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

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Ban1 = new javax.swing.JButton();
        Ban2 = new javax.swing.JButton();
        Ban3 = new javax.swing.JButton();
        Ban4 = new javax.swing.JButton();
        Ban5 = new javax.swing.JButton();
        Ban6 = new javax.swing.JButton();
        Ban7 = new javax.swing.JButton();
        Ban8 = new javax.swing.JButton();
        Ban9 = new javax.swing.JButton();
        Ban10 = new javax.swing.JButton();
        Ban11 = new javax.swing.JButton();
        Ban12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table-60 (1).png"))); // NOI18N
        jLabel1.setText("   Quản lí bàn ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 32, 300, 70));

        Ban1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban1.setText(" 1");
        Ban1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban1ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 157, -1, -1));

        Ban2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban2.setText("2");
        Ban2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban2ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 157, 113, -1));

        Ban3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban3.setText("3");
        Ban3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban3ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 157, 117, -1));

        Ban4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban4.setText(" 4");
        Ban4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban4ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban4, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 157, 113, -1));

        Ban5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban5.setText("5");
        Ban5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban5ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 269, 109, -1));

        Ban6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban6.setText(" 6");
        Ban6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban6ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban6, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 269, 113, -1));

        Ban7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban7.setText("7");
        Ban7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban7ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban7, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 269, 117, -1));

        Ban8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban8.setText("8");
        Ban8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban8ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban8, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 269, 113, -1));

        Ban9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban9.setText(" 9");
        Ban9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban9ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban9, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 382, -1, -1));

        Ban10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban10.setText("10");
        Ban10.setToolTipText("");
        Ban10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban10ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban10, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 382, 115, -1));

        Ban11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban11.setText(" 11");
        Ban11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban11ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban11, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 382, 119, -1));

        Ban12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ban12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-tablefree-60.png"))); // NOI18N
        Ban12.setText("12");
        Ban12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban12ActionPerformed(evt);
            }
        });
        getContentPane().add(Ban12, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 382, 115, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/Go Back_50px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 11, 100, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table-40 (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 47, 60, 43));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/icons8-table-40.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 47, 49, 43));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Đã đặt");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 96, 41, 35));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Chưa đặt");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 96, 58, 35));

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 475));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 475));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/Icon/Anhnen.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       public static int idTable;
    private void Ban1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban1ActionPerformed

        String nameSave = "Bàn 1";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban1ActionPerformed

    private void Ban2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban2ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 2";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban2ActionPerformed

    private void Ban3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban3ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 3";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban3ActionPerformed

    private void Ban4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban4ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 4";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban4ActionPerformed

    private void Ban5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban5ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 5";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban5ActionPerformed

    private void Ban6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban6ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 6";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban6ActionPerformed

    private void Ban7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban7ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 7";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban7ActionPerformed

    private void Ban8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban8ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 8";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban8ActionPerformed

    private void Ban9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban9ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Ban9ActionPerformed

    private void Ban10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban10ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 10";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban10ActionPerformed

    private void Ban11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban11ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 11";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban11ActionPerformed

    private void Ban12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban12ActionPerformed
        // TODO add your handling code here:
        String nameSave = "Bàn 12";
        idTable = getId(nameSave);
        QuanLyThucDon qlo = new QuanLyThucDon();
        qlo.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ban12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private int getId(String nameSave) {
        List<Tables> listTable = TablesData.getInstance().LoadListTables();
        int id = -1;
        for (int i = 0; i < listTable.size(); i++) {
            Tables tables = listTable.get(i);
            if (tables.getTableName().equals(nameSave)) {
                id = tables.getTableId();               
                break;
            }
        }
        return id;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ban1;
    private javax.swing.JButton Ban10;
    private javax.swing.JButton Ban11;
    private javax.swing.JButton Ban12;
    private javax.swing.JButton Ban2;
    private javax.swing.JButton Ban3;
    private javax.swing.JButton Ban4;
    private javax.swing.JButton Ban5;
    private javax.swing.JButton Ban6;
    private javax.swing.JButton Ban7;
    private javax.swing.JButton Ban8;
    private javax.swing.JButton Ban9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
