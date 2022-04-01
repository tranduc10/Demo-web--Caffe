/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TRI
 */
public class OrderData {

    private static OrderData instance;

    public OrderData() {
    }

    public static OrderData getInstance() {
        if (instance == null) {
            instance = new OrderData();
        }
        return instance;
    }

    public List<Orders> ListOrder(int id) {
        List<Orders> list = new ArrayList<Orders>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `orders` WHERE `invoice_ID` = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Orders orders = new Orders(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
                list.add(orders);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Boolean Insert(int drinkId, int invoiceId, int count,String note) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO `orders`(`drinks_ID`, `count`, `invoice_ID`,`note`) VALUES (?,?,?,?)");
            pstmt.setInt(1, drinkId);
            pstmt.setInt(2, count);
            pstmt.setInt(3, invoiceId);
            pstmt.setString(4, note);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
