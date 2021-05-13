package com.minimart.DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.minimart.DTO.PhanQuyen;

public class PhanQuyenDAO {

    ConnectSQL pqConnection;

    public PhanQuyenDAO() {

    }

    public ArrayList<PhanQuyen> readData()  {
        pqConnection = new ConnectSQL();
        ArrayList<PhanQuyen> dsq = new ArrayList<>();
        try {
            String qry = "SELECT * FROM PHANQUYEN";
            ResultSet r = pqConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idQuyen = r.getString("IdQuyen");
                    String tenQuyen = r.getString("TenQuyen");

                    dsq.add(new PhanQuyen(idQuyen, tenQuyen));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng phân quyền");
        } finally {
            pqConnection.closeConnect();
        }
        return dsq;
    }

    public ArrayList<PhanQuyen> search(String columnName, String value)  {
        pqConnection = new ConnectSQL();
        ArrayList<PhanQuyen> dsq = new ArrayList<>();

        try {
            String qry = "SELECT * FROM PHANQUYEN WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = pqConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String idQuyen = r.getString("IdQuyen");
                    String tenQuyen = r.getString("TenQuyenuyen");

                    dsq.add(new PhanQuyen(idQuyen, tenQuyen));
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng phân quyền");
        } finally {
            pqConnection.closeConnect();
        }

        return dsq;
    }

    public boolean addData(PhanQuyen q)  {
        pqConnection = new ConnectSQL();
        boolean ok = pqConnection.sqlUpdate("INSERT INTO PHANQUYEN (`IdQuyen`, `TenQuyenuyen`) VALUES ('"
                + q.getIdQuyen()+ "', '"
                + q.getTenQuyen()+ "');");
        pqConnection.closeConnect();
        return ok;
    }

    public boolean removeData(String idQuyen)  {
        pqConnection = new ConnectSQL();
        boolean ok = pqConnection.sqlUpdate("DELETE FROM PHANQUYEN WHERE IdQuyen = '" + idQuyen + "'");
        pqConnection.closeConnect();
        return ok;
    }

    public boolean updateData(PhanQuyen pq)  {
        pqConnection = new ConnectSQL();
        boolean ok = pqConnection.sqlUpdate("UPDATE PHANQUYEN SET "
                + "TenQuyenuyen='" + pq.getTenQuyen()
                + "' WHERE IdQuyen='" + pq.getIdQuyen() + "';");
        pqConnection.closeConnect();
        return ok;
    }

    public void close() {
        pqConnection.closeConnect();
    }
}