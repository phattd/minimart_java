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
            ResultSet rs = pqConnection.sqlQuery(qry);
            if(rs != null){
                while(rs.next()){
                    PhanQuyen pq = new PhanQuyen();
                    pq.setIdQuyen(rs.getString("IdQuyen"));
                    pq.setTenQuyen(rs.getString("TenQuyen"));
                    dsq.add(pq);
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
            ResultSet rs = pqConnection.sqlQuery(qry);
            if(rs != null){
                while(rs.next()){
                    PhanQuyen pq = new PhanQuyen();
                    pq.setIdQuyen(rs.getString("IdQuyen"));
                    pq.setTenQuyen(rs.getString("TenQuyen"));
                    dsq.add(pq);
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
        System.out.println("FAdsfadfafasfasfasfas");
        pqConnection = new ConnectSQL();
        boolean ok = pqConnection.sqlUpdate("INSERT INTO PHANQUYEN (`IdQuyen`,`TenQuyen`) VALUES ('"
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
                + "TenQuyen='" + pq.getTenQuyen()
                + "' WHERE IdQuyen='" + pq.getIdQuyen() + "';");
        pqConnection.closeConnect();
        return ok;
    }

    public void close() {
        pqConnection.closeConnect();
    }
}