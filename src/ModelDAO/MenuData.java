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
public class MenuData {

    private static MenuData instance;

    public MenuData() {
    }

    public static MenuData getInstance() {
        if (instance == null) {
            instance = new MenuData();
        }
        return instance;
    }

    public static void setInstance(MenuData instance) {
        MenuData.instance = instance;
    }

    public List<Menu> GetListMenuByTableId(int id) {
        List<Menu> list = new ArrayList<Menu>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT `drinks`.`name`, `orders`.`count`, `drinks`.`price`,`orders`.`note`, `orders`.`count`*`drinks`.`price` AS totalPrice FROM `orders`, `invoice`, `drinks` WHERE `orders`.`invoice_ID` = `invoice`.`ID` AND `orders`.`drinks_ID` = `drinks`.`ID` AND `invoice`.`status` = 0 AND `invoice`.`tables_id` = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Menu menu = new Menu(rs.getString(1), rs.getInt(2), rs.getInt(3),rs.getString(4), rs.getInt(5));
                list.add(menu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
