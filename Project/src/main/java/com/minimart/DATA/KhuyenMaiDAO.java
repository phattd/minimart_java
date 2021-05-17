package com.minimart.DATA;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.DTO.KhuyenMai;
import com.minimart.Handing.HandingBUS;

public class KhuyenMaiDAO {
    ConnectSQL kmConnection;

    public KhuyenMaiDAO() {

    }

    public ArrayList<KhuyenMai> readData()  {
        kmConnection = new ConnectSQL();
        ArrayList<KhuyenMai> dssp = new ArrayList<>();
        try {
            String qry = "SELECT * FROM DOTKHUYENMAI";
            ResultSet r = kmConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idDotKhuyenMai = r.getString("IdDotKhuyenMai");
                    String tenDotKhuyenMai = r.getString("TenDotKhuyenMai");
                    Timestamp ngayBatDau = r.getTimestamp("NgayBatDau");
                    Timestamp ngayKetThuc = r.getTimestamp("NgayKetThuc");
                    String moTa=r.getString("MoTa");
                    dssp.add(new KhuyenMai(idDotKhuyenMai, tenDotKhuyenMai, ngayBatDau, ngayKetThuc,moTa));
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
            String qry = "SELECT * FROM DOTKHUYENMAI WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = kmConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idDotKhuyenMai = r.getString("IdDotKhuyenMai");
                    String tenDotKhuyenMai = r.getString("TenDotKhuyenMai");
                    Timestamp ngayBatDau = r.getTimestamp("NgayBatDau");
                    Timestamp ngayKetThuc = r.getTimestamp("NgayKetThuc");
                    String moTa=r.getString("MoTa");
                    dssp.add(new KhuyenMai(idDotKhuyenMai, tenDotKhuyenMai, ngayBatDau, ngayKetThuc,moTa));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng khuyến mãi");
        } finally {
            kmConnection.closeConnect();
        }

        return dssp;
    }

    public boolean addData(KhuyenMai khuyenMai)  {
        kmConnection = new ConnectSQL();
        HandingBUS handingBUS = new HandingBUS();
        boolean ok = kmConnection.sqlUpdate("INSERT INTO DOTKHUYENMAI (`IdDotKhuyenMai`, `TenDotKhuyenMai`, `NgayBatDau`, `NgayKetThuc`, `MoTa`) VALUES ('"
                + khuyenMai.getIdKhuyenMai()+ "', '"
                + khuyenMai.getTenKhuyenMai() + "', '"
                + handingBUS.standardDate(new Date(khuyenMai.getNgayBatDau().getTime())) + "', '"
                + handingBUS.standardDate(new Date(khuyenMai.getNgayKetThuc().getTime())) + "', '"
                +khuyenMai.getMoTa()+"');");
        kmConnection.closeConnect();
        return ok;
    }

    public boolean removeData(String idDotKhuyenMai)  {
        kmConnection = new ConnectSQL();
        boolean ok = kmConnection.sqlUpdate("DELETE FROM DOTKHUYENMAI WHERE IdDotKhuyenMai = '" + idDotKhuyenMai + "'");
        kmConnection.closeConnect();
        return ok;
    }

    public boolean updateData(KhuyenMai dotKM)  {
        kmConnection = new ConnectSQL();
        HandingBUS handingBUS = new HandingBUS();
        boolean ok = kmConnection.sqlUpdate("UPTimestamp DOTKHUYENMAI SET "
                + "TenDotKhuyenMai='" + dotKM.getTenKhuyenMai()
                + "', NgayBatDau='" + handingBUS.standardDate(new Date(dotKM.getNgayBatDau().getTime()))
                + "', NgayKetThuc='" + handingBUS.standardDate(new Date(dotKM.getNgayKetThuc().getTime()))
                + "', MoTa='"+ dotKM.getMoTa()
                + "' WHERE IdDotKhuyenMai='" + dotKM.getIdKhuyenMai() + "'");
        kmConnection.closeConnect();
        return ok;
    }

    public void close() {
        kmConnection.closeConnect();
    }
}