package com.minimart.DATA;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.minimart.DTO.NhaCungCap;

public class NhaCungCapDAO {

    ConnectSQL qlnccConnection;

    //    public QuanLyNhaCungCapDAO(){
//        nhaCungCapDB.logIn("root","");
//    }
    public ArrayList<NhaCungCap> readData()  {
        ArrayList<NhaCungCap> dsncc = new ArrayList<>();
        qlnccConnection = new ConnectSQL();
        try {
            String qry = "SELECT * FROM NHACUNGCAP";
            ResultSet r = qlnccConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idNhaCungCap = r.getString(1);
                    String tenNhaCungCap = r.getString(2);
                    String soDienThoaiNCC = r.getString(3);
                    String diaChiNCC = r.getString(4);

                    dsncc.add(new NhaCungCap(idNhaCungCap, tenNhaCungCap, soDienThoaiNCC, diaChiNCC));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không thấy data cần tìm trong ResultSet");
        } finally {
            qlnccConnection.closeConnect();
        }
        return dsncc;
    }

    public ArrayList<NhaCungCap> search(String columnName, String value)  {
        qlnccConnection = new ConnectSQL();
        ArrayList<NhaCungCap> dsncc = new ArrayList<>();

        try {
            String qry = "SELECT * FROM SANPHAM WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = qlnccConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idNhaCungCapncc = r.getString(1);
                    String tenNhaCungCapncc = r.getString(2);
                    String soDienThoaiNCC = r.getString(3);
                    String diaChiNCC = r.getString(4);
                    dsncc.add(new NhaCungCap(idNhaCungCapncc, tenNhaCungCapncc, soDienThoaiNCC, diaChiNCC));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng sản phẩm");
        } finally {
            qlnccConnection.closeConnect();
        }

        return dsncc;
    }

    public boolean addData(NhaCungCap ncc)  {
        qlnccConnection = new ConnectSQL();
        boolean ok = qlnccConnection.sqlUpdate("INSERT INTO NHACUNGCAP (`IdNhaCungCapNCC`, `TenNhaCungCapNCC`, `SoDienThoaiNCC`,`DiaChiNCC`) VALUES ('"
                + ncc.getIdNhaCungCap() + "', '"
                + ncc.getTenNhaCungCap() + "', '"
                + ncc.getSoDienThoaiNCC() + "','"
                + ncc.getDiaChiNCC() + "');");
        qlnccConnection.closeConnect();
        return ok;
    }

    public boolean removeData(String idNhaCungCapncc)  {
        qlnccConnection = new ConnectSQL();
        boolean ok = qlnccConnection.sqlUpdate("DELETE FROM NHACUNGCAP WHERE IdNhaCungCapNCC = '" + idNhaCungCapncc + "'");
        qlnccConnection.closeConnect();
        return ok;
    }

    public boolean updateData(NhaCungCap ncc)  {
        qlnccConnection = new ConnectSQL();
        boolean ok = qlnccConnection.sqlUpdate("UPDATE NHACUNGCAP SET "
                + "TenNhaCungCapNCC='" + ncc.getTenNhaCungCap()
                + "',SoDienThoaiNCC='" + ncc.getSoDienThoaiNCC()
                + "',DiaChiNCC='" + ncc.getDiaChiNCC()
                + "' WHERE IdNhaCungCapNCC='" + ncc.getIdNhaCungCap() + "'");
        qlnccConnection.closeConnect();
        return ok;
    }

    public void close() {
        qlnccConnection.closeConnect();
    }

}