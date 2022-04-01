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
public class TablesData {

    private static TablesData instance;

    public TablesData() {
    }

    public static TablesData getInstance() {
        if (instance == null) {
            instance = new TablesData();
        }
        return instance;
    }

    public static void setInstance(TablesData instance) {
        TablesData.instance = instance;
    }

    public List<Tables> LoadListTables() {
        List<Tables> listTable = new ArrayList<Tables>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `tables`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Tables tables = new Tables(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),rs.getString(5));
                listTable.add(tables);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablesData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTable;
    }
}
