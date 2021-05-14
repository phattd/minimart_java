package com.minimart.DATA;

import com.minimart.DTO.ChiTietPhieuNhap;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChiTietPhieuNhapDAO {
    private ConnectSQL connectSQL;

    public ArrayList<ChiTietPhieuNhap> readData()
    {

        connectSQL = new ConnectSQL();

        ArrayList<ChiTietPhieuNhap> danhSachChiTietPhieuNhap=new ArrayList<>();

        try
        {
            String queryCommad="SELECT * FROM CHITIETPHIEUNHAP";
            ResultSet rs=connectSQL.sqlQuery(queryCommad);
            if(rs!=null)
            {
                while (rs.next())
                {
                    ChiTietPhieuNhap chiTietPhieuNhap=new ChiTietPhieuNhap(rs.getString("IdPhieuNhap"),
                            rs.getString("IdSanPham"),
                            rs.getInt("SoLuong"),
                            rs.getInt("DonGia"),
                            rs.getInt("ThanhTien"));
                    danhSachChiTietPhieuNhap.add(chiTietPhieuNhap);

                }
            }
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }finally {
            connectSQL.closeConnect();
        }
        return danhSachChiTietPhieuNhap;

    }
    public boolean addData(ChiTietPhieuNhap chiTietPhieuNhap)
    {

        connectSQL = new ConnectSQL();

        boolean executeSQL = connectSQL.sqlUpdate("INSERT INTO CHITIETPHIEUNHAP(`IdPhieuNhap`,`IdSanPham`,`SoLuong`,`DonGia`,`ThanhTien`)" +
                " VALUES ('"+chiTietPhieuNhap.getIdPhieuNhap()+"','"
                + chiTietPhieuNhap.getIdSanPham() + "','"
                + chiTietPhieuNhap.getSoLuong() + "','"
                + chiTietPhieuNhap.getDonGia() + "','"
                + chiTietPhieuNhap.getThanhTien() + "');");
        connectSQL.closeConnect();
        return executeSQL;
    }
    public boolean removeData(String idPhieuNhap,String idSanPham)
    {

        connectSQL = new ConnectSQL();

        boolean executeCommandSQL=connectSQL.sqlUpdate("DELETE FROM CHITIETPHIEUNHAP WHERE IdPhieuNhap='"
                +idPhieuNhap+"' AND IdSanPham='"+idSanPham+"';");
        connectSQL.closeConnect();
        return executeCommandSQL;

    }
    public boolean removeAllData(String idPhieuNhap)
    {

        connectSQL = new ConnectSQL();

        boolean executeSQLCommad=connectSQL.sqlUpdate("DELETE FROM CHITIETPHIEUNHAP WHERE IdPhieuNhap='"+idPhieuNhap+"';");
        connectSQL.closeConnect();
        return executeSQLCommad;
    }
    public boolean updateData(ChiTietPhieuNhap chiTietPhieuNhap)
    {

        connectSQL = new ConnectSQL();

        boolean executeSQLCommand=connectSQL.sqlUpdate("UPDATE CHITIETPHIEUNHAP SET " +
                " SoLuong='" + chiTietPhieuNhap.getSoLuong() +
                "', DonGia='" + chiTietPhieuNhap.getDonGia() +
                "', ThanhTien='" + chiTietPhieuNhap.getThanhTien() + "'" +
                " WHERE IdPhieuNhap='" + chiTietPhieuNhap.getIdPhieuNhap() +
                "' AND IdSanPham='"+ chiTietPhieuNhap.getIdSanPham() + "';");
        connectSQL.closeConnect();
        return executeSQLCommand;
    }
}