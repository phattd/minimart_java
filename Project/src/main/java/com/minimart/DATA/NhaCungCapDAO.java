package com.minimart.DATA;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import com.minimart.DTO.ChiTietKhuyenMai;
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
            ResultSet rs=qlnccConnection.sqlQuery(qry);
            if(rs!=null)
            {
                while (rs.next())
                {
                    NhaCungCap nhaCungCap=new NhaCungCap(
                            rs.getString("IdNhaCungCap"),
                            rs.getString("TenNhaCungCap"),
                            rs.getString("SoDienThoaiNCC"),
                            rs.getString("DiaChiNCC"));
                    dsncc.add(nhaCungCap);
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
            ResultSet rs=qlnccConnection.sqlQuery(qry);
            if(rs!=null)
            {
                while (rs.next())
                {
                    NhaCungCap nhaCungCap=new NhaCungCap(
                            rs.getString("IdNhaCungCap"),
                            rs.getString("TenNhaCungCap"),
                            rs.getString("SoDienThoaiNCC"),
                            rs.getString("DiaChiNCC"));
                    dsncc.add(nhaCungCap);
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
        boolean ok = qlnccConnection.sqlUpdate("INSERT INTO NHACUNGCAP (`IdNhaCungCap`, `TenNhaCungCap`, `SoDienThoaiNCC`,`DiaChiNCC`) VALUES ('"
                + ncc.getIdNhaCungCap() + "', '"
                + ncc.getTenNhaCungCap() + "', '"
                + ncc.getSoDienThoaiNCC() + "','"
                + ncc.getDiaChiNCC() + "');");
        qlnccConnection.closeConnect();
        return ok;
    }

    public boolean removeData(String idNhaCungCap)  {
        qlnccConnection = new ConnectSQL();
        boolean ok = qlnccConnection.sqlUpdate("DELETE FROM NHACUNGCAP WHERE IdNhaCungCap = '" + idNhaCungCap + "'");
        qlnccConnection.closeConnect();
        return ok;
    }

    public boolean updateData(NhaCungCap ncc)  {
        qlnccConnection = new ConnectSQL();
        boolean ok = qlnccConnection.sqlUpdate("UPDATE NHACUNGCAP SET "
                + "TenNhaCungCap='" + ncc.getTenNhaCungCap()
                + "',SoDienThoaiNCC='" + ncc.getSoDienThoaiNCC()
                + "',DiaChiNCC='" + ncc.getDiaChiNCC()
                + "' WHERE IdNhaCungCap='" + ncc.getIdNhaCungCap() + "'");
        qlnccConnection.closeConnect();
        return ok;
    }

    public void close() {
        qlnccConnection.closeConnect();
    }

}