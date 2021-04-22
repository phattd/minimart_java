package com.minimart.data;

import com.minimart.dto.ChucVu;

import javax.swing.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChucVuDAO {
    private  ConnectSQL connectSQL;

    public ChucVuDAO(){}

    public ArrayList<ChucVu> readData()
    {
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        ArrayList<ChucVu> danhSachChucVu=new ArrayList<>();
        try {
            String query = "SELECT * FROM CHUCVU";
            ResultSet rs = connectSQL.sqlQuery(query);

            if (rs != null)
            {
                while (rs.next())
                {
                    ChucVu chucVu=new ChucVu(rs.getString("IdChucVu"),rs.getString("TenChucVu"));
                    danhSachChucVu.add(chucVu);
                }
            }
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"No found data !!!");
        } finally {
            connectSQL.closeConnect();
        }
        return danhSachChucVu;
    }

    public boolean addData(ChucVu chucVu)
    {
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        boolean executeSqlCommand=connectSQL.sqlUpdate("INSERT INTO CHUCVU(IdChucVu,TenChucVu) VALUES ('"+chucVu.getIdChucVu()
                +"','"+chucVu.getTenChucVu()+"')");
        connectSQL.closeConnect();
        return executeSqlCommand;
    }
    public boolean removeData(String idChucVu)
    {
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        boolean executeSqlCommand = connectSQL.sqlUpdate("DELETE FROM CHUCVU WHERE IdChucVU='"+idChucVu+"' ");
        connectSQL.closeConnect();
        return executeSqlCommand;
    }

    public boolean updateData(ChucVu chucVu)
    {
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        boolean executeSqlCommand = connectSQL.sqlUpdate("UPDATE CHUCVU SET IdChucVu='"+chucVu.getIdChucVu()+"', " +
                "TenChucVu='"+chucVu.getTenChucVu()+"' WHERE IdChucVU='"+chucVu.getIdChucVu()+"';");
        connectSQL.closeConnect();

        return executeSqlCommand;
    }
    public boolean updateData(String idChucVu,String tenChucVu)
    {
        ChucVu chucVu=new ChucVu(idChucVu,tenChucVu);
        return updateData(chucVu);
    }
}
