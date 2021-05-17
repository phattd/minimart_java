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

    public ArrayList<KhachHang> readData()  {
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

    public boolean addData(KhachHang kh)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("INSERT INTO KHACHHANG (`IdKhachHang`, `TenKhachHang`, `HoKhachHang`, `BacTichLuy`, `DiemTichLuy`) VALUES ('"
                + kh.getIdKhachHang() + "', '"
                + kh.getTenKhachHang() + "', '"
                + kh.getHoKhachHang() + "','"
                + kh.getBacTichLuyByString() + "','"
                + kh.getDiemTichLuy() + "');");
        qlkhConnection.closeConnect();
        return ok;
    }

    public boolean removeData(String idKhachHang)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("DELETE FROM KHACHHANG WHERE IdKhachHang = '" + idKhachHang + "'");
        qlkhConnection.closeConnect();
        return ok;
    }

    public boolean updateData(KhachHang kh)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("UPDATE KHACHHANG SET "
                + "TenKhachHang='" + kh.getTenKhachHang()
                + "', HoKhachHang='" + kh.getHoKhachHang()
                + "', BacTichLuy='" + kh.getBacTichLuyByString()
                + "', DiemTichLuy='" + kh.getDiemTichLuy()
                + "' WHERE IdKhachHang='" + kh.getIdKhachHang() + "'");
        qlkhConnection.closeConnect();
        return ok;
    }

    public boolean updateDiemTichLuy(String idKhachHang, int diemTichLuy)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("UPDATE KHACHHANG SET "
                + "DiemTichLuy='" + diemTichLuy
                + "' WHERE IdKhachHang='" + idKhachHang + "'");
        qlkhConnection.closeConnect();
        return ok;
    }
    public boolean updateBacTichLuy(String idKhachHang, String bacTichLuy)  {
        qlkhConnection = new ConnectSQL();
        boolean ok = qlkhConnection.sqlUpdate("UPDATE KHACHHANG SET "
                + "BacTichLuy='" + bacTichLuy
                + "' WHERE IdKhachHang='" + idKhachHang + "'");
        qlkhConnection.closeConnect();
        return ok;
    }

    public void close() {
        qlkhConnection.closeConnect();
    }
}