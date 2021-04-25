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
         connectSQL = new ConnectSQL();
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
         connectSQL = new ConnectSQL();
        boolean executeSqlCommand=connectSQL.sqlUpdate("INSERT INTO CHUCVU(IdChucVu,TenChucVu) VALUES ('"+chucVu.getIdChucVu()
                +"','"+chucVu.getTenChucVu()+"')");
        connectSQL.closeConnect();
        return executeSqlCommand;
    }
    public boolean removeData(String idChucVu)
    {
         connectSQL = new ConnectSQL();
        boolean executeSqlCommand = connectSQL.sqlUpdate("DELETE FROM CHUCVU WHERE IdChucVU='"+idChucVu+"' ");
        connectSQL.closeConnect();
        return executeSqlCommand;
    }

    public boolean updateData(ChucVu chucVu)
    {

            connectSQL = new ConnectSQL();

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
