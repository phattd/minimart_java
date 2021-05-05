package com.minimart.DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.DTO.PhieuNhap;

public class PhieuNhapDAO {

    ConnectSQL connection;

    public PhieuNhapDAO() {
    }

    public ArrayList readDB()  {
        connection = new ConnectSQL();
        ArrayList<PhieuNhap> dspn = new ArrayList<>();
        try {
            String qry = "SELECT * FROM PHIEUNHAP";
            ResultSet rs = connection.sqlQuery(qry);
            if (rs != null) {

                while (rs.next()) {
                    PhieuNhap pn = new PhieuNhap();

                    pn.setIdPhieuNhap(rs.getString(1));
                    pn.setIdNhaCungCap(rs.getString(2));
                    pn.setIdNhanVien(rs.getString(3));
                    pn.setNgayNhap(rs.getDate(4));
                    pn.setTongTien(rs.getInt(5));
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

    public boolean add(PhieuNhap pn)  {
        connection = new ConnectSQL();
        boolean ok = connection.sqlUpdate("INSERT INTO PHIEUNHAP(IdPhieuNhap,IdNhaCungCap,IdNhanVien,NgayNhap,TongTien) VALUES ('"
                + pn.getIdPhieuNhap() + "','"
                + pn.getIdNhaCungCap() + "','"
                + pn.getIdNhanVien() + "','"
                + pn.getNgayNhap() + "','"
                + pn.getTongTien() + "');");
        connection.closeConnect();
        return ok;
    }

    public boolean delete(String idPhieuNhap)  {
        connection = new ConnectSQL();
        if (!connection.sqlUpdate("DELETE FROM PHIEUNHAP WHERE IdPhieuNhap='" + idPhieuNhap + "';")) {
            JOptionPane.showMessageDialog(null, "Vui long xoa het chi tiet cua phiếu nhập truoc !!!");
            connection.closeConnect();
            return false;
        }
        connection.closeConnect();
        return false;
    }

    public boolean update(PhieuNhap pn)  {
        connection = new ConnectSQL();
        boolean ok = connection.sqlUpdate("UPDATE PHIEUNHAP SET "
                + "IdNhaCungCap='" + pn.getIdNhaCungCap()
                + "', IdNhanVien='" + pn.getIdNhanVien()
                + "', NgayNhap='" + pn.getNgayNhap()
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

    public boolean update(String idPhieuNhap, String idNhaCungCap, String idNhanVien, Date ngayNhap, int tongTien)  {
        PhieuNhap pn = new PhieuNhap();
        pn.setIdPhieuNhap(idPhieuNhap);
        pn.setIdNhaCungCap(idNhaCungCap);
        pn.setIdNhanVien(idNhanVien);
        pn.setNgayNhap(ngayNhap);
        pn.setTongTien(tongTien);
        return update(pn);
    }
}