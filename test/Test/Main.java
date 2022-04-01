/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Gui.QuanLyDangNhap;
import java.awt.EventQueue;

public class Main {

   public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run()    {
                QuanLyDangNhap menuDangNhap = new QuanLyDangNhap();
                menuDangNhap.setVisible(true);
            }
        });
    }
}