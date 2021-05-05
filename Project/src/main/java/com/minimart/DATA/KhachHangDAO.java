package com.minimart.DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.DTO.KhachHang;

public class KhachHangDAO {

    ConnectSQL qlkhConnection;

    public KhachHangDAO() {

    }

    public ArrayList<KhachHang> readDB()  {
        qlkhConnection = new ConnectSQL();
        ArrayList<KhachHang> dskh = new ArrayList<>();
        try {
            String qry = "SELECT * FROM KHACHHANG";
            ResultSet r = qlkhConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idKhachHang = r.getString("IdKhachHang");
                    String tenKhachHang = r.getString("TenKhachHang");
                    String hoKhachHang = r.getString("HoKhachHang");
                    String bacTichLuy = r.getString("BacTichLuy");
                    int diemTichLuy = r.getInt("DiemTichLuy");
                    dskh.add(new KhachHang(idKhachHang, tenKhachHang, hoKhachHang, bacTichLuy, diemTichLuy));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng khách hàng");
        } finally {
            qlkhConnection.closeConnect();
        }
        return dskh;
    }

    public ArrayList<KhachHang> search(String columnName, String value)  {
        qlkhConnection = new ConnectSQL();
        ArrayList<KhachHang> dskh = new ArrayList<>();

        try {
            String qry = "SELECT * FROM KHACHHANG WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = qlkhConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idKhachHang = r.getString("IdKhachHang");
                    String tenKhachHang = r.getString("TenKhachHang");
                    String hoKhachHang = r.getString("HoKhachHang");
                    String bacTichLuy = r.getString("BacTichLuy");
                    int diemTichLuy = r.getInt("DiemTichLuy");
                    dskh.add(new KhachHang(idKhachHang, tenKhachHang, hoKhachHang, bacTichLuy, diemTichLuy));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng khách hàng");
        } finally {
            qlkhConnection.closeConnect();
        }

        return dskh;
    }

    public boolean add(KhachHang kh)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("INSERT INTO `KHACHHANG` (`IdKhachHang`, `TenKhachHang`, `HoKhachHang`, `BacTichLuy`, `DiemTichLuy`) VALUES ('"
                + kh.getIdKhachHang() + "', '"
                + kh.getTenKhachHang() + "', '"
                + kh.getHoKhachHang() + "','"
                + kh.getBacTichLuyByString() + "','"
                + kh.getDiemTichLuy() + "');");
        qlkhConnection.closeConnect();
        return ok;
    }

    public boolean delete(String idKhachHang)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("DELETE FROM `KHACHHANG` WHERE `KHACHHANG`.`IdKhachHang` = '" + idKhachHang + "'");
        qlkhConnection.closeConnect();
        return ok;
    }

    public boolean update(String idKhachHang, String tenKhachHang, String hoKhachHang, String bacTichLuy, int diemTichLuy)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("Update KHACHHANG Set "
                + "TenKhachHang='" + tenKhachHang
                + "', HoKhachHang='" + hoKhachHang
                + "', BacTichLuy='" + bacTichLuy
                + "', DiemTichLuy='" + diemTichLuy
                + "' where IdKhachHang='" + idKhachHang + "'");
        qlkhConnection.closeConnect();
        return ok;
    }
    public boolean update(KhachHang khachHang)  {
        return update(khachHang.getIdKhachHang(), khachHang.getTenKhachHang(), khachHang.getHoKhachHang(), khachHang.getBacTichLuyByString(), khachHang.getDiemTichLuy());
    }

    public boolean updateDiemTichLuy(String idKhachHang, int diemTichLuy)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("Update KHACHHANG Set "
                + "DiemTichLuy='" + diemTichLuy
                + "' where IdKhachHang='" + idKhachHang + "'");
        qlkhConnection.closeConnect();
        return ok;
    }
    public boolean updateBacTichLuy(String idKhachHang, String bacTichLuy)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("Update KHACHHANG Set "
                + "BacTichLuy='" + bacTichLuy
                + "' where IdKhachHang='" + idKhachHang + "'");
        qlkhConnection.closeConnect();
        return ok;
    }

    public void close() {
        qlkhConnection.closeConnect();
    }
}