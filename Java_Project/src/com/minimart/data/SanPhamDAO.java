package com.minimart.data;

import com.minimart.dto.SanPham;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SanPhamDAO {

    ConnectSQL sanPhamConnection;

    public SanPhamDAO() {

    }

    public ArrayList<SanPham> readDB() throws IOException {
        sanPhamConnection = new ConnectSQL();
        ArrayList<SanPham> dssp = new ArrayList<>();
        try {
            String qry = "SELECT * FROM SANPHAM";
            ResultSet r = sanPhamConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idSanPham = r.getString("IdSanPham");
                    String idLoaiSanPham = r.getString("IdLoaiSanPham");
                    String tenSanPham = r.getString("TenSanPham");
                    int donGia = r.getInt("DonGia");
                    int soLuong = r.getInt("SoLuong");
                    String hinhAnh = r.getString("HinhAnh");
                    dssp.add(new SanPham(idSanPham, idLoaiSanPham, tenSanPham, donGia, soLuong, hinhAnh));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng sản phẩm");
        } finally {
            sanPhamConnection.closeConnect();
        }
        return dssp;
    }

    public ArrayList<SanPham> search(String columnName, String value) throws IOException {
        sanPhamConnection = new ConnectSQL();
        ArrayList<SanPham> dssp = new ArrayList<>();

        try {
            String qry = "SELECT * FROM SANPHAM WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = sanPhamConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idSanPham = r.getString("IdSanPham");
                    String idLoaiSanPham = r.getString("IdLoaiSanPham");
                    String tenSanPham = r.getString("TenSanPham");
                    int donGia = r.getInt("DonGia");
                    int soLuong = r.getInt("SoLuong");
                    String hinhAnh  = r.getString("HinhAnh");
                    dssp.add(new SanPham(idSanPham, idLoaiSanPham, tenSanPham, donGia, soLuong, hinhAnh));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng sản phẩm");
        } finally {
            sanPhamConnection.closeConnect();
        }

        return dssp;
    }

    public boolean add(SanPham sp) throws IOException {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("INSERT INTO `SANPHAM` (`IdSanPham`, `IdLoaiSanPham`, `TenSanPham`, `DonGia`, `SoLuong`, `HinhAnh`) VALUES ('"
                + sp.getIdSanPham() + "', '"
                + sp.getIdLoaiSanPham() + "', '"
                + sp.getTenSanPham() + "', '"
                + sp.getDonGia() + "', '"
                + sp.getSoLuong() + "', '"
                + sp.getHinhAnh() + "');");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public boolean delete(String idSanPham) throws IOException {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("DELETE FROM `SANPHAM` WHERE `SANPHAM`.`IdSanPham` = '" + idSanPham + "'");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public boolean update(String idSanPham, String idLoaiSanPham, String tenSanPham, float donGia, int soLuong, String hinhAnh) throws IOException {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("Update SanPham Set "
                + "IdLoaiSanPham='" + idLoaiSanPham
                + "',TenSanPham='" + tenSanPham
                + "',DonGia='" + donGia
                + "',SoLuong='" + soLuong
                + "',HinhAnh='" + hinhAnh
                + "' where IdSanPham='" + idSanPham + "'");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public boolean updatesoLuong(String idSanPham, int soLuong) throws IOException {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("Update SanPham Set "
                + "SoLuong='" + soLuong
                + "' where IdSanPham='" + idSanPham + "'");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public void close() {
        sanPhamConnection.closeConnect();
    }
}
