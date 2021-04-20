package com.minimart.data;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.dto.LoaiSanPham;
public class LoaiSanPhamDAO {

    ConnectSQL qllspConnection;

    public LoaiSanPhamDAO() {

    }

    public ArrayList<LoaiSanPham> readDB() throws IOException {
        qllspConnection = new ConnectSQL();
        ArrayList<LoaiSanPham> dslsp = new ArrayList<>();
        try {
            String qry = "SELECT * FROM LOAISANPHAM";
            ResultSet r = qllspConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idSanPham = r.getString(1);
                    String tenSanPham = r.getString(2);

                    dslsp.add(new LoaiSanPham(idSanPham, tenSanPham));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng loại sản phẩm");
        } finally {
            qllspConnection.closeConnect();
        }
        return dslsp;
    }

    public ArrayList<LoaiSanPham> search(String columnName, String value) throws IOException {
        qllspConnection = new ConnectSQL();
        ArrayList<LoaiSanPham> dslsp = new ArrayList<>();

        try {
            String qry = "SELECT * FROM LOAISANPHAM WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = qllspConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idSanPham = r.getString(1);
                    String tenSanPham = r.getString(2);

                    dslsp.add(new LoaiSanPham(idSanPham, tenSanPham));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng loại sản phẩm");
        } finally {
            qllspConnection.closeConnect();
        }

        return dslsp;
    }

    public boolean add(LoaiSanPham lsp) throws IOException {
        qllspConnection = new ConnectSQL();
        boolean ok = qllspConnection.sqlUpdate("INSERT INTO `LOAISANPHAM` (`IdSanPham`, `TenSanPham`) VALUES ('"
                + lsp.getIdLoaiSanPham() + "', '" + lsp.getTenSanPham() + "', '" + "');");
        qllspConnection.closeConnect();
        return ok;
    }

    public boolean delete(String idSanPham) throws IOException {
        qllspConnection = new ConnectSQL();
        boolean ok = qllspConnection.sqlUpdate("DELETE FROM `LOAISANPHAM` WHERE `LOAISANPHAM`.`IdSanPham` = '" + idSanPham + "'");
        qllspConnection.closeConnect();
        return ok;
    }

    public boolean update(String idSanPham, String tenSanPham, String Mota) throws IOException {
        qllspConnection = new ConnectSQL();
        boolean ok = qllspConnection.sqlUpdate("Update LOAISANPHAM Set TenSanPham='" + tenSanPham + "' where IdSanPham='" + idSanPham + "'");
        qllspConnection.closeConnect();
        return ok;
    }

    public void close() {
        qllspConnection.closeConnect();
    }
}
