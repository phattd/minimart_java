package com.minimart.DATA;

import com.minimart.DTO.ChiTietKhuyenMai;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChiTietKhuyenMaiDAO {
    private ConnectSQL connectSQL;
    public ArrayList<ChiTietKhuyenMai> readData()
    {

        connectSQL = new ConnectSQL();

        ArrayList<ChiTietKhuyenMai> danhSachChiTietKhuyenMai=new ArrayList<>();
        try
        {
            String query="SELECT * FROM CHITIETKHUYENMAI";
            ResultSet rs=connectSQL.sqlQuery(query);
            if(rs!=null)
            {
                while (rs.next())
                {
                    ChiTietKhuyenMai chiTietKhuyenMai=new ChiTietKhuyenMai(
                            rs.getString("IdKhuyenMai"),
                            rs.getString("IdSanPham"),
                            rs.getByte("PhanTramKhuyenMai"),
                            rs.getInt("DieuKienSL"),
                            rs.getString("DieuKienKH"));
                    danhSachChiTietKhuyenMai.add(chiTietKhuyenMai);
                }
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }finally {
            connectSQL.closeConnect();
        }
        return danhSachChiTietKhuyenMai;
    }
    public boolean addData(ChiTietKhuyenMai chiTietKhuyenMai)
    {

        connectSQL = new ConnectSQL();

        String query="INSERT INTO CHITIETKHUYENMAI(`IdKhuyenMai`,`IdSanPham`,`NoiDungKhuyenMai`,`DieuKienSL`,`DieuKienKH`) " +
                "VALUES ('"+chiTietKhuyenMai.getIdKhuyenMai()+
                "'," + chiTietKhuyenMai.getIdSanPham() +
                ",'" + chiTietKhuyenMai.getPhanTramKhuyenMai() +
                ",'" + chiTietKhuyenMai.getDieuKienSL() +
                "','" + chiTietKhuyenMai.getDieuKienKH() + "');";
        boolean executeCommandSQL = connectSQL.sqlUpdate(query);
        connectSQL.closeConnect();
        return executeCommandSQL;

    }
    public boolean removeData(String idKhuyenMai,String idSanPham){

        connectSQL = new ConnectSQL();

        boolean executeCommandSQL=connectSQL.sqlUpdate("DELETE FROM CHITIETKHUYENMAI WHERE IdKhuyenMai='"+idKhuyenMai+"' AND IdSanPham='"+idSanPham+"';");
        connectSQL.closeConnect();
        return  executeCommandSQL;
    }
    public boolean removeAllData(String idKhuyenMai) {

        connectSQL = new ConnectSQL();

        boolean query = connectSQL.sqlUpdate("DELETE FROM CHITIETKHUYENMAI WHERE IdKhuyenMai='" + idKhuyenMai + "';");
        connectSQL.closeConnect();
        return query;
    }
    public boolean updateData(ChiTietKhuyenMai chiTietKhuyenMai)
    {

        connectSQL = new ConnectSQL();

        boolean executeCommandSQL=connectSQL.sqlUpdate("UPDATE CHITIETKHUYENMAI SET " +
                "PhanTramKhuyenMai=" + chiTietKhuyenMai.getPhanTramKhuyenMai() +
                ",DieuKienSL=" + chiTietKhuyenMai.getDieuKienSL() +
                ",NoiDungKhuyenMai='" + chiTietKhuyenMai.getDieuKienKH() + "' " +
                "WHERE IdKhuyenMai='" + chiTietKhuyenMai.getIdKhuyenMai() +
                "'AND IdSanPham='" + chiTietKhuyenMai.getIdSanPham() + "';");
        connectSQL.closeConnect();
        return executeCommandSQL;
    }
}