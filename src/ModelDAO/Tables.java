/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

/**
 *
 * @author huyparody
 */
public class Tables {
    private int tableId;
    private String tableName;
    private String tableNote;
    private int tableStatus;
    private String time ;

    public Tables() {
    }

    public Tables(int tableId, String tableName, String tableNote, int tableStatus,String time) {
        this.tableId = tableId;
        this.tableName = tableName;
        this.tableNote = tableNote;
        this.tableStatus = tableStatus;
        this.time=time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableNote() {
        return tableNote;
    }

    public void setTableNote(String tableNote) {
        this.tableNote = tableNote;
    }

    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }

}
