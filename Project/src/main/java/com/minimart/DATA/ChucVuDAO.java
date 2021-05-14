package com.minimart.DATA;

import com.minimart.DTO.ChucVu;

import javax.swing.*;
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
                    ChucVu chucVu=new ChucVu(rs.getString("IdChucVu"),
                            rs.getString("TenChucVu"));
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
        boolean executeSqlCommand=connectSQL.sqlUpdate("INSERT INTO CHUCVU(`IdChucVu`,`TenChucVu`) " +
                "VALUES ('"+chucVu.getIdChucVu() +
                "','" + chucVu.getTenChucVu()+"')");
        connectSQL.closeConnect();
        return executeSqlCommand;
    }
    public boolean removeData(String idChucVu)
    {
        connectSQL = new ConnectSQL();
        boolean executeSqlCommand = connectSQL.sqlUpdate("DELETE FROM CHUCVU WHERE IdChucVu='"+idChucVu+"';");
        connectSQL.closeConnect();
        return executeSqlCommand;
    }

    public boolean updateData(ChucVu chucVu)
    {

        connectSQL = new ConnectSQL();

        boolean executeSqlCommand = connectSQL.sqlUpdate("UPDATE CHUCVU SET " +
                "TenChucVu='" + chucVu.getTenChucVu() + "' " +
                "WHERE IdChucVu='"+ chucVu.getIdChucVu() + "';");
        connectSQL.closeConnect();

        return executeSqlCommand;
    }
}