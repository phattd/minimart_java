package com.minimart.data;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.dto.KhuyenMai;

public class KhuyenMaiDAO {
    ConnectSQL kmConnection;

    public KhuyenMaiDAO() {

    }

    public ArrayList<KhuyenMai> readDB()  {
        kmConnection = new ConnectSQL();
        ArrayList<KhuyenMai> dssp = new ArrayList<>();
        try {
            String qry = "SELECT * FROM KHUYENMAI";
            ResultSet r = kmConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idDotKhuyenMai = r.getString("IdDotKhuyenMai");
                    String tenDotKhuyenMai = r.getString("TenDotKhuyenMai");
                    LocalDate ngayBatDau = r.getDate("NgayBatDau").toLocalDate();
                    LocalDate ngayKetThuc = r.getDate("NgayKetThuc").toLocalDate();
                    dssp.add(new KhuyenMai(idDotKhuyenMai, tenDotKhuyenMai, ngayBatDau, ngayKetThuc));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng khuyến mãi");
        } finally {
            kmConnection.closeConnect();
        }
        return dssp;
    }

    public ArrayList<KhuyenMai> search(String columnName, String value)  {
        kmConnection = new ConnectSQL();
        ArrayList<KhuyenMai> dssp = new ArrayList<>();

        try {
            String qry = "SELECT * FROM KHUYENMAI WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = kmConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idDotKhuyenMai = r.getString("IdDotKhuyenMai");
                    String tenDotKhuyenMai = r.getString("TenDotKhuyenMai");
                    LocalDate ngayBatDau = r.getDate("NgayBatDau").toLocalDate();
                    LocalDate ngayKetThuc = r.getDate("NgayKetThuc").toLocalDate();
                    dssp.add(new KhuyenMai(idDotKhuyenMai, tenDotKhuyenMai, ngayBatDau, ngayKetThuc));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng khuyến mãi");
        } finally {
            kmConnection.closeConnect();
        }

        return dssp;
    }

    public boolean add(KhuyenMai km)  {
        kmConnection = new ConnectSQL();
        boolean ok = kmConnection.sqlUpdate("INSERT INTO `khuyenmai` (`IdDotKhuyenMai`, `TenDotKhuyenMai`, `NgayBatDau`, `NgayKetThuc`) VALUES ('"
                + km.getIdDotKhuyenMai()+ "', '"
                + km.getTenDotKhuyenMai() + "', '"
                + km.getNgayBatDau() + "', '"
                + km.getNgayKetThuc() + "');");
        kmConnection.closeConnect();
        return ok;
    }

    public boolean delete(String idDotKhuyenMai)  {
        kmConnection = new ConnectSQL();
        boolean ok = kmConnection.sqlUpdate("DELETE FROM `KHUYENMAI` WHERE `KHUYENMAI`.`IdDotKhuyenMai` = '" + idDotKhuyenMai + "'");
        kmConnection.closeConnect();
        return ok;
    }

    public boolean update(String idDotKhuyenMai, String tenDotKhuyenMai, LocalDate ngayBatDau, LocalDate ngayKetThuc)  {
        kmConnection = new ConnectSQL();
        boolean ok = kmConnection.sqlUpdate("Update KKHUYENMAI Set "
                + "TenDotKhuyenMai='" + tenDotKhuyenMai
                + "', NgayBatDau='" + ngayBatDau
                + "', NgayKetThuc='" + ngayKetThuc
                + "' where IdDotKhuyenMai='" + idDotKhuyenMai + "'");
        kmConnection.closeConnect();
        return ok;
    }
    public  boolean update(KhuyenMai khuyenMai)
    {
        return  update(khuyenMai.getIdDotKhuyenMai(), khuyenMai.getTenDotKhuyenMai(), khuyenMai.getNgayBatDau(),khuyenMai.getNgayKetThuc());
    }

    public void close() {
        kmConnection.closeConnect();
    }
}
