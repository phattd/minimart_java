package com.minimart.DATA;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.minimart.DTO.NhaCungCap;
import com.minimart.DTO.NhanVien;

public class NhanVienDAO {

    ConnectSQL qlnvConnection;

    public NhanVienDAO() {

    }

    public ArrayList<NhanVien> readData()  {
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        qlnvConnection = new ConnectSQL();
        try {
            String qry = "SELECT * FROM NHANVIEN";
            ResultSet r = qlnvConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idNhanVien = r.getString("IdNhanVien");
                    String ho = r.getString("Ho");
                    String ten = r.getString("Ten");
                    String diaChi = r.getString("DiaChi");
                    Date ngaySinh = r.getDate("NgaySinh");
                    String SoDienThoai = r.getString("SoDienThoai");
                    String password = r.getString("Password");
                    int luong = r.getInt("Luong");
                    String idChucVu = r.getString("IdchucVu");
                    String hinhAnh = r.getString("HinhAnh");
                    dsnv.add(new NhanVien(idNhanVien, ho, ten, diaChi, ngaySinh, SoDienThoai, password, luong, idChucVu, hinhAnh));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng nhân viên");
        } finally {
            qlnvConnection.closeConnect();
        }
        return dsnv;
    }

    public ArrayList<NhanVien> search(String columnName, String value)  {
        qlnvConnection = new ConnectSQL();
        ArrayList<NhanVien> dsnv = new ArrayList<>();

        try {
            String qry = "SELECT * FROM NHANVIEN WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = qlnvConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idNhanVien = r.getString("IdNhanVien");
                    String ho = r.getString("Ho");
                    String ten = r.getString("Ten");
                    String diaChi = r.getString("DiaChi");
                    Date ngaySinh = r.getDate("NgaySinh");
                    String SoDienThoai = r.getString("SoDienThoai");
                    String password = r.getString("Password");
                    int luong = r.getInt("Luong");
                    String idChucVu = r.getString("IdchucVu");
                    String hinhAnh = r.getString("HinhAnh");
                    dsnv.add(new NhanVien(idNhanVien, ho, ten, diaChi, ngaySinh, SoDienThoai, password, luong, idChucVu, hinhAnh));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng nhân viên");
        } finally {
            qlnvConnection.closeConnect();
        }

        return dsnv;
    }

    public boolean addData(NhanVien nv)  {
        qlnvConnection = new ConnectSQL();
        boolean ok = qlnvConnection.sqlUpdate("INSERT INTO NHANVIEN (`IdNhanVien`, 'Ho', `Ten`, 'DiaChi', `NgaySinh`, `SoDienThoai`, `Luong`, 'IdChucVu', 'HinhAnh') VALUES ('"
                + nv.getIdNhanVien() + "', '"
                + nv.getHo() + "', '"
                + nv.getTen() + "', '"
                + nv.getDiaChi() + "', '"
                + nv.getNgaySinh() + "', '"
                + nv.getSoDienThoai() + "', '"
                + nv.getLuong() + "', '"
                + nv.getIdChucVu() + "', '"
                + nv.getHinhAnh() + "');");
        qlnvConnection.closeConnect();
        return ok;
    }
    public boolean removeData(String idNhanVien)  {
        qlnvConnection = new ConnectSQL();
        boolean ok = qlnvConnection.sqlUpdate("DELETE FROM NHANVIEN WHERE IdNhanVien = '" + idNhanVien + "'");
        qlnvConnection.closeConnect();
        return ok;
    }

    public boolean updateData(NhanVien nv)  {
        qlnvConnection = new ConnectSQL();
        boolean ok = qlnvConnection.sqlUpdate("UPDATE NHANVIEN SET "
                + "Ho='" + nv.getHo()
                + "Ten='" + nv.getTen()
                + "',DiaChi='" + nv.getDiaChi()
                + "',NgaySinh='" + nv.getNgaySinh()
                + "',SoDienThoai='" + nv.getSoDienThoai()
                + "',Luong='" + nv.getLuong()
                + "',IdChucVu='" + nv.getIdChucVu()
                + "',HinhAnh='" + nv.getHinhAnh()
                + "' where IdNhanVien='" + nv.getIdNhanVien() + "'");
        qlnvConnection.closeConnect();
        return ok;
    }
    public void close() {
        qlnvConnection.closeConnect();
    }
}