package com.minimart.DATA;

import com.minimart.DTO.ChiTietHoaDon;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChiTietHoaDonDAO {
    private ConnectSQL connectSQL;
    public ChiTietHoaDonDAO()
    {

    }

    public ArrayList<ChiTietHoaDon> readData() {

        connectSQL = new ConnectSQL();

        ArrayList<ChiTietHoaDon> danhSachChiTietHoaDon = new ArrayList<>();
        try {
            String query = "SELECT * FROM CHITIETHOADON";
            ResultSet rs = connectSQL.sqlQuery(query);
            if (rs != null) {
                while (rs.next()) {
                    ChiTietHoaDon hoaDon = new ChiTietHoaDon(rs.getString("IdHoaDon"),
                            rs.getString("IdSanPham"),
                            rs.getInt("SoLuong"),
                            rs.getInt("DonGia"),
                            rs.getString("IdKhuyenMai"),
                            rs.getInt("ThanhTien"),
                            rs.getInt("TienKhuyenMai"));
                    danhSachChiTietHoaDon.add(hoaDon);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No found data !!!");
        } finally {
            connectSQL.closeConnect();
        }
        return danhSachChiTietHoaDon;
    }

    public boolean addData(ChiTietHoaDon hoaDon) {

        connectSQL = new ConnectSQL();

        boolean query = connectSQL.sqlUpdate("INSERT INTO CHITIETHOADON(`IdHoaDon`,`IdSanPham`,`SoLuong`,`DonGia`,`IdKhuyenMai`,`ThanhTien`,`TienKhuyenMai`) VALUES ('"
                + hoaDon.getIdHoaDon() + "','"
                + hoaDon.getIdSanPham() + "',"
                + hoaDon.getSoLuong() + ","
                + hoaDon.getDonGia() + ",'"
                + hoaDon.getIdKhuyenMai() + "',"
                + hoaDon.getThanhTien() + ","
                + hoaDon.getTienKhuyenMai() + ");");
        connectSQL.closeConnect();
        return query;
    }

    public boolean removeData(String idHoaDon, String idSanPham) {

        connectSQL = new ConnectSQL();

        boolean query = connectSQL.sqlUpdate("DELETE FROM CHITIETHOADON WHERE "
                + "IdHoaDon='" + idHoaDon
                + "' AND IdSanPham='" + idSanPham + "';");
        connectSQL.closeConnect();
        return query;
    }

    public boolean removeAllData(String idHoaDon) {

        connectSQL = new ConnectSQL();

        boolean query = connectSQL.sqlUpdate("DELETE FROM CHITIETHOADON WHERE IdHoaDon='" + idHoaDon + "';");
        connectSQL.closeConnect();
        return query;
    }

    public boolean updateData(ChiTietHoaDon chiTietHoaDon) {

        connectSQL = new ConnectSQL();

        boolean query = connectSQL.sqlUpdate("UPDATE CHITIETHOADON SET "
                + "SoLuong='" + chiTietHoaDon.getSoLuong()
                + "', DonGia='" + chiTietHoaDon.getDonGia()
                + "', IdKhuyenMai='" + chiTietHoaDon.getIdKhuyenMai()
                + "', ThanhTien='" + chiTietHoaDon.getThanhTien()
                + "', TienKhuyenMai='" + chiTietHoaDon.getTienKhuyenMai()
                + "' WHERE IdHoaDon='" + chiTietHoaDon.getIdHoaDon() + "' AND IdSanPham='" + chiTietHoaDon.getIdSanPham() + "';");
        connectSQL.closeConnect();
        return query;
    }

}