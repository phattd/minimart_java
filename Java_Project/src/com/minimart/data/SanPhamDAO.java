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
            String qry = "SELECT * FROM sanpham";
            ResultSet r = sanPhamConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idSanPham = r.getString("idSanPham");
                    String idLoaiSanPham = r.getString("idLoaiSanPham");
                    String tenSanPham = r.getString("tenSanPham");
                    int donGia = r.getInt("donGia");
                    int soLuong = r.getInt("soLuong");
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
            String qry = "SELECT * FROM sanpham WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = sanPhamConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idSanPham = r.getString("idSanPham");
                    String idLoaiSanPham = r.getString("idLoaiSanPham");
                    String tenSanPham = r.getString("tenSanPham");
                    int donGia = r.getInt("donGia");
                    int soLuong = r.getInt("soLuong");
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
        boolean ok = sanPhamConnection.sqlUpdate("INSERT INTO `sanpham` (`idSanPham`, `idLoaiSanPham`, `tenSanPham`, `donGia`, `soLuong`, `HinhAnh`) VALUES ('"
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
        boolean ok = sanPhamConnection.sqlUpdate("DELETE FROM `sanpham` WHERE `sanpham`.`idSanPham` = '" + idSanPham + "'");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public boolean update(String idSanPham, String idLoaiSanPham, String tenSanPham, float donGia, int soLuong, String hinhAnh) throws IOException {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("Update SanPham Set "
                + "idLoaiSanPham='" + idLoaiSanPham
                + "',tenSanPham='" + tenSanPham
                + "',donGia='" + donGia
                + "',soLuong='" + soLuong
                + "',HinhAnh='" + hinhAnh
                + "' where idSanPham='" + idSanPham + "'");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public boolean updatesoLuong(String idSanPham, int soLuong) throws IOException {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("Update SanPham Set "
                + "soLuong='" + soLuong
                + "' where idSanPham='" + idSanPham + "'");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public void close() {
        sanPhamConnection.closeConnect();
    }
}
