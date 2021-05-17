package com.minimart.DATA;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.DTO.DotKhuyenMai;
import com.minimart.Handing.HandingBUS;

public class DotKhuyenMaiDAO {
    ConnectSQL kmConnection;

    public DotKhuyenMaiDAO() {

    }

    public ArrayList<DotKhuyenMai> readData()  {
        kmConnection = new ConnectSQL();
        ArrayList<DotKhuyenMai> dssp = new ArrayList<>();
        try {
            String qry = "SELECT * FROM DOTKHUYENMAI";
            ResultSet r = kmConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idDotKhuyenMai = r.getString("IdDotKhuyenMai");
                    String tenDotKhuyenMai = r.getString("TenDotKhuyenMai");
                    Timestamp ngayBatDau = r.getTimestamp("NgayBatDau");
                    Timestamp ngayKetThuc = r.getTimestamp("NgayKetThuc");
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
            String qry = "SELECT * FROM DOTKHUYENMAI WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = kmConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idDotKhuyenMai = r.getString("IdDotKhuyenMai");
                    String tenDotKhuyenMai = r.getString("TenDotKhuyenMai");
                    Timestamp ngayBatDau = r.getTimestamp("NgayBatDau");
                    Timestamp ngayKetThuc = r.getTimestamp("NgayKetThuc");
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

    public boolean addData(DotKhuyenMai dotKhuyenMai)  {
        kmConnection = new ConnectSQL();
        HandingBUS handingBUS = new HandingBUS();
        boolean ok = kmConnection.sqlUpdate("INSERT INTO DOTKHUYENMAI (`IdDotKhuyenMai`, `TenDotKhuyenMai`, `NgayBatDau`, `NgayKetThuc`) VALUES ('"
                + dotKhuyenMai.getIdDotKhuyenMai()+ "', '"
                + dotKhuyenMai.getTenDotKhuyenMai() + "', '"
                + handingBUS.standardDate(new Date(dotKhuyenMai.getNgayBatDau().getTime())) + "', '"
                + handingBUS.standardDate(new Date(dotKhuyenMai.getNgayKetThuc().getTime())) + "');");
        kmConnection.closeConnect();
        return ok;
    }

    public boolean removeData(String idDotKhuyenMai)  {
        kmConnection = new ConnectSQL();
        boolean ok = kmConnection.sqlUpdate("DELETE FROM DOTKHUYENMAI WHERE IdDotKhuyenMai = '" + idDotKhuyenMai + "'");
        kmConnection.closeConnect();
        return ok;
    }

    public boolean updateData(DotKhuyenMai dotKM)  {
        kmConnection = new ConnectSQL();
        HandingBUS handingBUS = new HandingBUS();
        boolean ok = kmConnection.sqlUpdate("UPTimestamp DOTKHUYENMAI SET "
                + "TenDotKhuyenMai='" + dotKM.getTenDotKhuyenMai()
                + "', NgayBatDau='" + handingBUS.standardDate(new Date(dotKM.getNgayBatDau().getTime()))
                + "', NgayKetThuc='" + handingBUS.standardDate(new Date(dotKM.getNgayKetThuc().getTime()))
                + "' WHERE IdDotKhuyenMai='" + dotKM.getIdDotKhuyenMai() + "'");
        kmConnection.closeConnect();
        return ok;
    }

    public void close() {
        kmConnection.closeConnect();
    }
}