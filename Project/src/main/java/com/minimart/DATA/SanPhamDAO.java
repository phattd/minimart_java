package com.minimart.DATA;

import com.minimart.DTO.SanPham;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SanPhamDAO {

    ConnectSQL sanPhamConnection;

    public SanPhamDAO() {

    }

    public ArrayList<SanPham> readData() {
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
                    String donViTinh = r.getString("DonViTinh");
                    int soLuong = r.getInt("SoLuong");
                    String hinhAnh = r.getString("HinhAnh");
                    dssp.add(new SanPham(idSanPham, idLoaiSanPham, tenSanPham, donGia, donViTinh, soLuong, hinhAnh));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng sản phẩm");
        } finally {
            sanPhamConnection.closeConnect();
        }
        return dssp;
    }

    public ArrayList<SanPham> search(String columnName, String value)  {
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

    public boolean addData(SanPham sp)  {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("INSERT INTO SANPHAM (`IdSanPham`, `IdLoaiSanPham`, `TenSanPham`, `DonGia`, `DonViTinh`, `SoLuong`, `HinhAnh`) VALUES ('"
                + sp.getIdSanPham() + "', '"
                + sp.getIdLoaiSanPham() + "', '"
                + sp.getTenSanPham() + "', '"
                + sp.getDonGia() + "', '"
                + sp.getDonViTinh() + "', '"
                + sp.getSoLuong() + "', '"
                + sp.getHinhAnh() + "');");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public boolean removeData(String idSanPham)  {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("DELETE FROM SANPHAM WHERE IdSanPham = '" + idSanPham + "'");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public boolean updateData(SanPham sp)  {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("UPDATE SAPHAM SET "
                + "IdLoaiSanPham='" + sp.getIdLoaiSanPham()
                + "',TenSanPham='" + sp.getTenSanPham()
                + "',DonGia='" + sp.getDonGia()
                + "',DonViTinh='" + sp.getDonViTinh()
                + "',SoLuong='" + sp.getSoLuong()
                + "',HinhAnh='" + sp.getHinhAnh()
                + "' where IdSanPham='" + sp.getIdSanPham() + "'");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public boolean updatesoLuong(String idSanPham, int soLuong)  {
        sanPhamConnection = new ConnectSQL();
        boolean ok = sanPhamConnection.sqlUpdate("UPDATE SANPHAM SET "
                + "SoLuong='" + soLuong
                + "' where IdSanPham='" + idSanPham + "'");
        sanPhamConnection.closeConnect();
        return ok;
    }

    public void close() {
        sanPhamConnection.closeConnect();
    }
}