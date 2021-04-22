package com.minimart.data;

import com.minimart.dto.ChiTietKhuyenMai;

import javax.swing.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChiTietKhuyenMaiDAO {
    private ConnectSQL connectSQL;
    public ArrayList<ChiTietKhuyenMai> readData()
    {
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        ArrayList<ChiTietKhuyenMai> danhSachChiTietKhuyenMai=new ArrayList<>();
        try
        {
            String query="SELECT * FROM CHITIETKHUYENMAI";
            ResultSet rs=connectSQL.sqlQuery(query);
            if(rs!=null)
            {
                while (rs.next())
                {
                    ChiTietKhuyenMai chiTietKhuyenMai=new ChiTietKhuyenMai(rs.getString("IdKhuyenMai"),
                            rs.getString("TenKhuyenMai"),
                           rs.getString("IdDotKhuyenMai"),
                            rs.getByte("PhanTramKhuyenMai"),
                            rs.getString("NoiDungKhuyenMai"),
                            rs.getString("IdSanPham"));
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
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        String query="INSERT INTO CHITIETKHUYENMAI(IdKhuyenMai,TenKhuyenMai,IdDotKhuyenMai,PhanTramKhuyenMai,NoiDungKhuyenMai,IdSanPham) " +
                "VALUES ('"+chiTietKhuyenMai.getIdKhuyenMai()+
                "','" + chiTietKhuyenMai.getTenKhuyenMai()+"','" + chiTietKhuyenMai.getIdDotKhuyenMai()+ "'," +
                chiTietKhuyenMai.getPhanTramKhuyenMai()+",'"+chiTietKhuyenMai.getNoiDungKhuyenMai()+"','"+chiTietKhuyenMai.getIdSanPham()+"');";
        boolean executeCommandSQL = connectSQL.sqlUpdate(query);
        connectSQL.closeConnect();
        return executeCommandSQL;

    }
    public boolean removeData(String idKhuyenMai){
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        boolean executeCommandSQL=connectSQL.sqlUpdate("DELETE FROM CHITIETKHUYENMAI WHERE IdKhuyenMai='"+idKhuyenMai+"';");
        connectSQL.closeConnect();
        return  executeCommandSQL;
    }
    public boolean updateData(ChiTietKhuyenMai chiTietKhuyenMai)
    {
        try {
            connectSQL = new ConnectSQL();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        boolean executeCommandSQL=connectSQL.sqlUpdate("UPDATE CHITIETKHUYENMAI SET IdKhuyenMai='"+chiTietKhuyenMai.getIdKhuyenMai()+"',TenKhuyenMai='"
                +chiTietKhuyenMai.getTenKhuyenMai()+"',IdDotKhuyenMai='"+chiTietKhuyenMai.getIdDotKhuyenMai()+"',PhanTramKhuyenMai="
                        +chiTietKhuyenMai.getPhanTramKhuyenMai()+",NoiDungKhuyenMai='"+chiTietKhuyenMai.getNoiDungKhuyenMai()+"',IdSanPham='"
                        +chiTietKhuyenMai.getIdSanPham()+"' " +
                "WHERE IdKhuyenMai='"+chiTietKhuyenMai.getIdKhuyenMai()+"';");
        connectSQL.closeConnect();
        return executeCommandSQL;
    }
    public boolean updateData(String idKhuyenMai,String tenKhuyenMai,String idDotKhuyenMai,byte phanTramKhuyenMai,String noiDungKhuyenMai,String idSanPham)
    {
        ChiTietKhuyenMai chiTietKhuyenMai=new ChiTietKhuyenMai(idKhuyenMai, tenKhuyenMai, idDotKhuyenMai, phanTramKhuyenMai, noiDungKhuyenMai, idSanPham);
        return updateData(chiTietKhuyenMai);
    }
}
