package com.minimart.data;

import com.minimart.dto.DanhMucQuyen;

import javax.swing.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DanhMucQuyenDAO {
    private ConnectSQL connectSQL;

    public DanhMucQuyenDAO() {
    }

    public ArrayList<DanhMucQuyen> readData() {
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        ArrayList<DanhMucQuyen> danhSachDanhMucQuyen = new ArrayList<>();

        try {
            String query = "SELECT * FROM DANHMUCQUYEN";
            ResultSet rs = connectSQL.sqlQuery(query);
            if (rs != null) {
                while (rs.next()) {
                    DanhMucQuyen danhMucQuyen = new DanhMucQuyen(rs.getString("IdChucVu"), rs.getString("IdQuyen"));
                    danhSachDanhMucQuyen.add(danhMucQuyen);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            connectSQL.closeConnect();
        }
        return danhSachDanhMucQuyen;
    }


    public boolean addData(DanhMucQuyen danhMucQuyen) {
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        String query = "INSERT INTO DANHMUCQUYEN(IdChucVu,IdQuyen) " +
                "VALUES ('" + danhMucQuyen.getIdChucVu() + "','" + danhMucQuyen.getIdQuyen() + "');";
        boolean executeCommandSQL = connectSQL.sqlUpdate(query);
        connectSQL.closeConnect();
        return executeCommandSQL;
    }
    public boolean removeData(DanhMucQuyen danhMucQuyen)
    {
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        boolean executeCommandSQL=connectSQL.sqlUpdate("DELETE FROM DANHMUCQUYEN WHERE IdChucVu='"+danhMucQuyen.getIdChucVu()+"' AND IdQuyen='"+danhMucQuyen.getIdQuyen()+"';");
        connectSQL.closeConnect();
        return  executeCommandSQL;

    }

}

