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
                           rs.getString("TenKhuyenMai"),
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

            connectSQL = new ConnectSQL();

        String query="INSERT INTO CHITIETKHUYENMAI(IdKhuyenMai,TenKhuyenMai,PhanTramKhuyenMai,NoiDungKhuyenMai,IdSanPham) " +
                "VALUES ('"+chiTietKhuyenMai.getIdKhuyenMai()+
                "','" + chiTietKhuyenMai.getTenKhuyenMai()+"'," +
                chiTietKhuyenMai.getPhanTramKhuyenMai()+",'"+chiTietKhuyenMai.getNoiDungKhuyenMai()+"','"+chiTietKhuyenMai.getIdSanPham()+"');";
        boolean executeCommandSQL = connectSQL.sqlUpdate(query);
        connectSQL.closeConnect();
        return executeCommandSQL;

    }
    public boolean removeData(String idKhuyenMai,String idSanPham){

            connectSQL = new ConnectSQL();

        boolean executeCommandSQL=connectSQL.sqlUpdate("DELETE FROM CHITIETKHUYENMAI WHERE IdKhuyenMai='"+idKhuyenMai+"', IdSanPham='"+idSanPham+"';");
        connectSQL.closeConnect();
        return  executeCommandSQL;
    }
    public boolean updateData(ChiTietKhuyenMai chiTietKhuyenMai)
    {

            connectSQL = new ConnectSQL();

        boolean executeCommandSQL=connectSQL.sqlUpdate("UPDATE CHITIETKHUYENMAI SET IdKhuyenMai='"+chiTietKhuyenMai.getIdKhuyenMai()+"',TenKhuyenMai='"
                +chiTietKhuyenMai.getTenKhuyenMai()+"',PhanTramKhuyenMai="
                        +chiTietKhuyenMai.getPhanTramKhuyenMai()+",NoiDungKhuyenMai='"+chiTietKhuyenMai.getNoiDungKhuyenMai()+"',IdSanPham='"
                        +chiTietKhuyenMai.getIdSanPham()+"' " +
                "WHERE IdKhuyenMai='"+chiTietKhuyenMai.getIdKhuyenMai()+"' AND IdSanPham='"+chiTietKhuyenMai.getIdSanPham()+"';");
        connectSQL.closeConnect();
        return executeCommandSQL;
    }
    public boolean updateData(String idKhuyenMai,String tenKhuyenMai,byte phanTramKhuyenMai,String noiDungKhuyenMai,String idSanPham)
    {
        ChiTietKhuyenMai chiTietKhuyenMai=new ChiTietKhuyenMai(idKhuyenMai, tenKhuyenMai, phanTramKhuyenMai, noiDungKhuyenMai, idSanPham);
        return updateData(chiTietKhuyenMai);
    }
}