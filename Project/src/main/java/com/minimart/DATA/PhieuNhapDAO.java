package com.minimart.DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import com.minimart.DTO.PhieuNhap;
import com.minimart.Handing.HandingBUS;

public class PhieuNhapDAO {

    ConnectSQL connection;

    public PhieuNhapDAO() {
    }

    public ArrayList readData()  {
        connection = new ConnectSQL();
        ArrayList<PhieuNhap> dspn = new ArrayList<>();
        try {
            String qry = "SELECT * FROM PHIEUNHAP";
            ResultSet rs = connection.sqlQuery(qry);
            if (rs != null) {

                while (rs.next()) {
                    PhieuNhap pn = new PhieuNhap();
                    pn.setIdPhieuNhap(rs.getString("IdPhieuNhap"));
                    pn.setIdNhaCungCap(rs.getString("IdNhaCungCap"));
                    pn.setIdNhanVien(rs.getString("IdNhanVien"));
                    pn.setNgayNhap(rs.getTimestamp("NgayNhap"));
                    pn.setTongTien(rs.getInt("TongTien"));
                    dspn.add(pn);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Khong tim thay du lieu !!");
        } finally {
            connection.closeConnect();
        }
        return dspn;
    }

    public boolean addData(PhieuNhap pn)  {
        connection = new ConnectSQL();
        HandingBUS handingBUS = new HandingBUS();
        boolean ok = connection.sqlUpdate("INSERT INTO PHIEUNHAP (`IdPhieuNhap`, `IdNhaCungCap`, `IdNhanVien`, `NgayNhap`, `TongTien`) VALUES ('"
                + pn.getIdPhieuNhap() + "','"
                + pn.getIdNhaCungCap() + "','"
                + pn.getIdNhanVien() + "','"
                + handingBUS.standardDate(new Date(pn.getNgayNhap().getTime())) + "','"
                + pn.getTongTien() + "');");
        connection.closeConnect();
        return ok;
    }

    public boolean removeData(String idPhieuNhap)  {
        connection = new ConnectSQL();
        if (!connection.sqlUpdate("DELETE FROM PHIEUNHAP WHERE IdPhieuNhap='" + idPhieuNhap + "';")) {
            JOptionPane.showMessageDialog(null, "Vui long xoa het chi tiet cua phiếu nhập truoc !!!");
            connection.closeConnect();
            return false;
        }
        connection.closeConnect();
        return false;
    }

    public boolean updateData(PhieuNhap pn)  {
        connection = new ConnectSQL();
        HandingBUS handingBUS = new HandingBUS();
        boolean ok = connection.sqlUpdate("UPDATE PHIEUNHAP SET "
                + "IdNhaCungCap='" + pn.getIdNhaCungCap()
                + "', IdNhanVien='" + pn.getIdNhanVien()
                + "', NgayNhap='" + handingBUS.standardDate(new Date(pn.getNgayNhap().getTime()))
                + "', TongTien='" + pn.getTongTien()
                + "' WHERE IdPhieuNhap='" + pn.getIdPhieuNhap() + "';");
        connection.closeConnect();
        return ok;
    }

    public boolean updateTongTien(String _idPhieuNhap, float _tongTien)  {
        connection = new ConnectSQL();
        boolean ok = connection.sqlUpdate("UPDATE PHIEUNHAP SET TongTien='" + _tongTien + "' WHERE IdPhieuNhap='" + _idPhieuNhap + "';");
        connection.closeConnect();
        return ok;
    }
}