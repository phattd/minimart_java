package com.minimart.data;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.dto.NhanVien;

public class NhanVienDAO {

    ConnectSQL qlnvConnection;

    public NhanVienDAO() {

    }

    public ArrayList<NhanVien> readDB() throws IOException {
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
                    LocalDate ngaySinh = r.getDate("NgaySinh").toLocalDate();
                    String sdt = r.getString("SDT");
                    String password = r.getString("Password");
                    int luong = r.getInt("Luong");
                    String idChucVu = r.getString("IdchucVu");
                    String hinhAnh = r.getString("HinhAnh");
                    dsnv.add(new NhanVien(idNhanVien, ho, ten, diaChi, ngaySinh, sdt, password, luong, idChucVu, hinhAnh));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng nhân viên");
        } finally {
            qlnvConnection.closeConnect();
        }
        return dsnv;
    }

    public ArrayList<NhanVien> search(String columnName, String value) throws IOException {
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
                    LocalDate ngaySinh = r.getDate("NgaySinh").toLocalDate();
                    String sdt = r.getString("SDT");
                    String password = r.getString("Password");
                    int luong = r.getInt("Luong");
                    String idChucVu = r.getString("IdchucVu");
                    String hinhAnh = r.getString("HinhAnh");
                    dsnv.add(new NhanVien(idNhanVien, ho, ten, diaChi, ngaySinh, sdt, password, luong, idChucVu, hinhAnh));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng nhân viên");
        } finally {
            qlnvConnection.closeConnect();
        }

        return dsnv;
    }

    public boolean add(NhanVien nv) throws IOException {
        qlnvConnection = new ConnectSQL();
        boolean ok = qlnvConnection.sqlUpdate("INSERT INTO `NHANVIEN` (`IdNhanVien`, 'Ho', `Ten`, 'DiaChi', `NgaySinh`, `SDT`, `Luong`, 'IdChucVu', 'HinhAnh') VALUES ('"
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
    public boolean delete(String idNhanVien) throws IOException {
        qlnvConnection = new ConnectSQL();
        boolean ok = qlnvConnection.sqlUpdate("DELETE FROM `NHANVIEN` WHERE `NHANVIEN`.`IdNhanVien` = '" + idNhanVien + "'");
        qlnvConnection.closeConnect();
        return ok;
    }

    public boolean update(String idNhanVien, String ho, String ten, String diaChi, LocalDate ngaySinh, String SDT, int luong, String idChucVu, String hinhAnh) throws IOException {
        qlnvConnection = new ConnectSQL();
        boolean ok = qlnvConnection.sqlUpdate("Update NhanVien Set "
                + "Ho='" + ho
                + "Ten='" + ten
                + "',DiaChi='" + diaChi
                + "',NgaySinh='" + ngaySinh
                + "',SDT='" + SDT
                + "',Luong='" + luong
                + "',IdChucVu='" + idChucVu
                + "',HinhAnh='" + hinhAnh
                + "' where IdNhanVien='" + idNhanVien + "'");
        qlnvConnection.closeConnect();
        return ok;
    }
    

    public void close() {
        qlnvConnection.closeConnect();
    }
}