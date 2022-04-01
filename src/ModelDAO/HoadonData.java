/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Gui.QuanLyDoUong;
import Utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anhquan
 */
public class HoadonData {
       
    private static HoadonData instance;
    
    public HoadonData() {
    }
    
    public static HoadonData getInstance() {
        if (instance == null) {
            instance = new HoadonData();
        }
        return instance;
    }
      public static void Insert(Menu menu,int i ) {
         Connection con;
          Statement stmt;

        con = DBUtility.openConnection();
        try {
            stmt = con.createStatement();
            int k  = stmt.executeUpdate("INSERT INTO hoadon(id,name, price,count,totalprice) VALUES (" +i+",'"+menu.getDrinkName() + "'," + menu.getPrice() + ","+menu.getCount()+","+menu.getTotalPrice()+ ")");
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoUong.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
