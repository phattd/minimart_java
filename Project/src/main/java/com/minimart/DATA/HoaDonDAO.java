package com.minimart.DATA;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.DTO.HoaDon;

public class HoaDonDAO {

    ConnectSQL connection;

    public HoaDonDAO() {
    }

    public ArrayList readData() {
        connection = new ConnectSQL();
        ArrayList<HoaDon> dshd = new ArrayList<>();
        try {
            String qry = "SELECT * FROM HOADON";
            ResultSet rs = connection.sqlQuery(qry);
            if (rs != null) {
                while (rs.next()) {
                    HoaDon hd = new HoaDon();
                    hd.setIdHoaDon(rs.getString("IdHoaDon"));
                    hd.setIdNhanVien(rs.getString("IdNhanVien"));
                    hd.setIdKhachHang(rs.getString("IdKhachHang"));
                    hd.setNgayLapHoaDon(rs.getDate("NgayLapHoaDon"));
                    hd.setTongTienKhuyenMai(rs.getInt("TongTienKhuyenMai"));
                    hd.setTongTien(rs.getInt("TongTien"));
                    hd.setTienKhachDua(rs.getInt("TienKhachDua"));
                    hd.setTienConLai(rs.getInt("TienConLai"));
                    dshd.add(hd);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không đọc được dữ liệu bảng hóa đơn !!");
        } finally {
            connection.closeConnect();
        }
        return dshd;
    }

    public boolean addData(HoaDon hd)  {
        connection = new ConnectSQL();
        boolean success = connection.sqlUpdate("INSERT INTO HOADOON('IdHoaDon','IdNhanVien','IdKhachHang','NgayLapHoaDon','TongTienKhuyenMai','TongTien','TienKhachDua','TienConLai') VALUES ('"
                + hd.getIdHoaDon() + "','"
                + hd.getIdNhanVien() + "','"
                + hd.getIdKhachHang() + "','"
                + hd.getNgayLapHoaDon()+ "','"
                + hd.getTongTienKhuyenMai() + "','"
                + hd.getTongTien() + "','"
                + hd.getTienKhachDua() + "','"
                + hd.getTienConLai() + "');");
        connection.closeConnect();
        return success;
    }

    public boolean removeData(String IdHoaDon)  {
        connection = new ConnectSQL();
        if (!connection.sqlUpdate("DELETE FROM HOADON WHERE IdHoaDon='" + IdHoaDon + "';")) {
            JOptionPane.showMessageDialog(null, "Vui long xoa het chi tiet cua hoa don truoc !!!");
            connection.closeConnect();
            return false;
        }
        connection.closeConnect();
        return true;
    }

    public boolean updateData(HoaDon hd)  {
        connection = new ConnectSQL();
        boolean success = connection.sqlUpdate("UPDATE HOADON SET "
                + "IdNhanVien='" + hd.getIdNhanVien()
                + "', IdKhachHang='" + hd.getIdKhachHang()
                + "', NgayLapHoaDon='" + hd.getNgayLapHoaDon()
                + "', TongTienKhuyenMai='" + hd.getTongTienKhuyenMai()
                + "', TongTien='" + hd.getTongTien()
                + "', TienKhachDua='" + hd.getTienKhachDua()
                + "', TienConLai='" + hd.getTienConLai()
                + "' WHERE IdHoaDon='" + hd.getIdHoaDon() + "';");
        connection.closeConnect();
        return success;
    }
}