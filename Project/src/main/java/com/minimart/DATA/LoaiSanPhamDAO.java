package com.minimart.DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.minimart.DTO.ChiTietKhuyenMai;
import com.minimart.DTO.LoaiSanPham;
public class LoaiSanPhamDAO {

    ConnectSQL qllspConnection;

    public LoaiSanPhamDAO() {

    }

    public ArrayList<LoaiSanPham> readData()  {
        qllspConnection = new ConnectSQL();
        ArrayList<LoaiSanPham> dslsp = new ArrayList<>();
        try {
            String qry = "SELECT * FROM LOAISANPHAM";
            ResultSet rs = qllspConnection.sqlQuery(qry);
            if (rs != null) {
                while (rs.next()) {
                    LoaiSanPham loaiSanPham = new LoaiSanPham(
                            rs.getString("IdLoaiSanPham"),
                            rs.getString("TenLoaiSanPham"));
                    dslsp.add(loaiSanPham);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng loại sản phẩm");
        } finally {
            qllspConnection.closeConnect();
        }
        return dslsp;
    }

    public ArrayList<LoaiSanPham> search(String columnName, String value)  {
        qllspConnection = new ConnectSQL();
        ArrayList<LoaiSanPham> dslsp = new ArrayList<>();

        try {
            String qry = "SELECT * FROM LOAISANPHAM WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet rs = qllspConnection.sqlQuery(qry);
            if (rs != null) {
                while (rs.next()) {
                    LoaiSanPham loaiSanPham = new LoaiSanPham(
                            rs.getString("IdLoaiSanPham"),
                            rs.getString("TenLoaiSanPham"));
                    dslsp.add(loaiSanPham);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng loại sản phẩm");
        } finally {
            qllspConnection.closeConnect();
        }

        return dslsp;
    }

    public boolean addData(LoaiSanPham lsp)  {
        qllspConnection = new ConnectSQL();
        boolean ok = qllspConnection.sqlUpdate("INSERT INTO LOAISANPHAM (`IdLoaiSanPham`, `TenLoaiSanPham`) VALUES ('"
                + lsp.getIdLoaiSanPham() + "','" + lsp.getTenLoaiSanPham() + "');");
        qllspConnection.closeConnect();
        return ok;
    }

    public boolean removeData(String idLoaiSanPham)  {
        qllspConnection = new ConnectSQL();
        boolean ok = qllspConnection.sqlUpdate("DELETE FROM LOAISANPHAM WHERE IdLoaiSanPham = '" + idLoaiSanPham + "'");
        qllspConnection.closeConnect();
        return ok;
    }

    public boolean updateData(LoaiSanPham lsp)  {
        qllspConnection = new ConnectSQL();
        boolean ok = qllspConnection.sqlUpdate("UPDATE LOAISANPHAM SET" +
                " TenLoaiSanPham='" + lsp.getTenLoaiSanPham() +
                "' WHERE IdLoaiSanPham='" + lsp.getIdLoaiSanPham() + "'");
        qllspConnection.closeConnect();
        return ok;
    }

    public void close() {
        qllspConnection.closeConnect();
    }
}