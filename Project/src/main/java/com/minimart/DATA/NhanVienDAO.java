package com.minimart.DATA;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.minimart.DTO.NhaCungCap;
import com.minimart.DTO.NhanVien;
import com.minimart.Handing.HandingBUS;

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
                   NhanVien nv = new NhanVien();
                   nv.setIdNhanVien(r.getString("IdNhanVien"));
                   nv.setHo(r.getString("Ho"));
                   nv.setTen(r.getString("Ten"));
                   nv.setDiaChi(r.getString("DiaChi"));
                   nv.setNgaySinh(r.getTimestamp("Ngaysinh"));
                   nv.setSoDienThoai(r.getString("SoDienThoai"));
                   nv.setPassword(r.getString("Password"));
                   nv.setLuong(r.getInt("Luong"));
                   nv.setIdChucVu(r.getString("IdChucVu"));
                   nv.setHinhAnh(r.getString("HinhAnh"));
                   dsnv.add(nv);
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
                    NhanVien nv = new NhanVien();
                    nv.setIdNhanVien(r.getString("IdNhanVien"));
                    nv.setHo(r.getString("Ho"));
                    nv.setTen(r.getString("Ten"));
                    nv.setDiaChi(r.getString("DiaChi"));
                    nv.setNgaySinh(r.getTimestamp("Ngaysinh"));
                    nv.setSoDienThoai(r.getString("SoDienThoai"));
                    nv.setPassword(r.getString("Password"));
                    nv.setLuong(r.getInt("Luong"));
                    nv.setIdChucVu(r.getString("IdChucVu"));
                    nv.setHinhAnh(r.getString("HinhAnh"));
                    dsnv.add(nv);
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
        HandingBUS handingBUS = new HandingBUS();
        boolean ok = qlnvConnection.sqlUpdate("INSERT INTO NHANVIEN (`IdNhanVien`, `Ho`, `Ten`, `DiaChi`, `NgaySinh`, `SoDienThoai`,`Password`, `Luong`, `IdChucVu`, `HinhAnh`) VALUES ('"
                + nv.getIdNhanVien() + "', '"
                + nv.getHo() + "', '"
                + nv.getTen() + "', '"
                + nv.getDiaChi() + "', '"
                + handingBUS.standardDate(new Date(nv.getNgaySinh().getTime())) + "', '"
                + nv.getSoDienThoai() + "', '"
                + nv.getPassword() + "', '"
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
        HandingBUS handingBUS = new HandingBUS();
        boolean ok = qlnvConnection.sqlUpdate("UPDATE NHANVIEN SET "
                + "Ho='" + nv.getHo()
                + "',Ten='" + nv.getTen()
                + "',DiaChi='" + nv.getDiaChi()
                + "',NgaySinh='" + handingBUS.standardDate(new Date(nv.getNgaySinh().getTime()))
                + "',SoDienThoai='" + nv.getSoDienThoai()
                + "',Password='" + nv.getPassword()
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