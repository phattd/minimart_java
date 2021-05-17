package com.minimart.DATA;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.DTO.HoaDon;
import com.minimart.Handing.HandingBUS;

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
                    hd.setNgayLapHoaDon((rs.getTimestamp("NgayLapHoaDon")));
                    hd.setTongTienKhuyenMai(rs.getInt("TongTienKhuyenMai"));
                    hd.setTongTien(rs.getInt("TongTien"));
                    hd.setTienKhachDua(rs.getInt("TienKhachDua"));
                    hd.setTienConLai(rs.getInt("TienConLai"));
                    hd.setTienThua(rs.getInt("TienThua"));
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
        HandingBUS handingBUS = new HandingBUS();
        boolean success = connection.sqlUpdate("INSERT INTO HOADON(`IdHoaDon`,`IdNhanVien`,`IdKhachHang`,`NgayLapHoaDon`,`TongTienKhuyenMai`,`TongTien`,`TienKhachDua`,`TienConLai`,`TienThua`) VALUES ('"
                + hd.getIdHoaDon() + "','"
                + hd.getIdNhanVien() + "','"
                + hd.getIdKhachHang() + "','"
                + handingBUS.standardDate(new Date(hd.getNgayLapHoaDon().getTime()))+ "','"
                + hd.getTongTienKhuyenMai() + "','"
                + hd.getTongTien() + "','"
                + hd.getTienKhachDua() + "','"
                + hd.getTienConLai() + "','"
                + hd.getTienThua() + "');");
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
        HandingBUS handingBUS = new HandingBUS();
        boolean success = connection.sqlUpdate("UPDATE HOADON SET "
                + "IdNhanVien='" + hd.getIdNhanVien()
                + "', IdKhachHang='" + hd.getIdKhachHang()
                + "', NgayLapHoaDon='" + handingBUS.standardDate(new Date(hd.getNgayLapHoaDon().getTime()))
                + "', TongTienKhuyenMai='" + hd.getTongTienKhuyenMai()
                + "', TongTien='" + hd.getTongTien()
                + "', TienKhachDua='" + hd.getTienKhachDua()
                + "', TienConLai='" + hd.getTienConLai()
                + "', TienThua='" + hd.getTienThua()
                + "' WHERE IdHoaDon='" + hd.getIdHoaDon() + "';");
        connection.closeConnect();
        return success;
    }
}