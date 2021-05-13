package com.minimart.DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.DTO.DotKhuyenMai;

public class DotKhuyenMaiDAO {
    ConnectSQL kmConnection;

    public DotKhuyenMaiDAO() {

    }

    public ArrayList<DotKhuyenMai> readData()  {
        kmConnection = new ConnectSQL();
        ArrayList<DotKhuyenMai> dssp = new ArrayList<>();
        try {
            String qry = "SELECT * FROM KHUYENMAI";
            ResultSet r = kmConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idDotKhuyenMai = r.getString("IdDotKhuyenMai");
                    String tenDotKhuyenMai = r.getString("TenDotKhuyenMai");
                    Date ngayBatDau = r.getDate("NgayBatDau");
                    Date ngayKetThuc = r.getDate("NgayKetThuc");
                    dssp.add(new DotKhuyenMai(idDotKhuyenMai, tenDotKhuyenMai, ngayBatDau, ngayKetThuc));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng khuyến mãi");
        } finally {
            kmConnection.closeConnect();
        }
        return dssp;
    }

    public ArrayList<DotKhuyenMai> search(String columnName, String value)  {
        kmConnection = new ConnectSQL();
        ArrayList<DotKhuyenMai> dssp = new ArrayList<>();

        try {
            String qry = "SELECT * FROM KHUYENMAI WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = kmConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idDotKhuyenMai = r.getString("IdDotKhuyenMai");
                    String tenDotKhuyenMai = r.getString("TenDotKhuyenMai");
                    Date ngayBatDau = r.getDate("NgayBatDau");
                    Date ngayKetThuc = r.getDate("NgayKetThuc");
                    dssp.add(new DotKhuyenMai(idDotKhuyenMai, tenDotKhuyenMai, ngayBatDau, ngayKetThuc));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng khuyến mãi");
        } finally {
            kmConnection.closeConnect();
        }

        return dssp;
    }

    public boolean addData(DotKhuyenMai km)  {
        kmConnection = new ConnectSQL();
        boolean ok = kmConnection.sqlUpdate("INSERT INTO KHUYENMAI (`IdDotKhuyenMai`, `TenDotKhuyenMai`, `NgayBatDau`, `NgayKetThuc`) VALUES ('"
                + km.getIdDotKhuyenMai()+ "', '"
                + km.getTenDotKhuyenMai() + "', '"
                + km.getNgayBatDau() + "', '"
                + km.getNgayKetThuc() + "');");
        kmConnection.closeConnect();
        return ok;
    }

    public boolean removeData(String idDotKhuyenMai)  {
        kmConnection = new ConnectSQL();
        boolean ok = kmConnection.sqlUpdate("DELETE FROM KHUYENMAI WHERE IdDotKhuyenMai = '" + idDotKhuyenMai + "'");
        kmConnection.closeConnect();
        return ok;
    }

    public boolean updateData(DotKhuyenMai dotkm)  {
        kmConnection = new ConnectSQL();
        boolean ok = kmConnection.sqlUpdate("UPDATE KKHUYENMAI SET "
                + "TenDotKhuyenMai='" + dotkm.getTenDotKhuyenMai()
                + "', NgayBatDau='" + dotkm.getNgayBatDau()
                + "', NgayKetThuc='" + dotkm.getNgayKetThuc()
                + "' WHERE IdDotKhuyenMai='" + dotkm.getIdDotKhuyenMai() + "'");
        kmConnection.closeConnect();
        return ok;
    }

    public void close() {
        kmConnection.closeConnect();
    }
}