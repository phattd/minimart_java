package com.minimart.DATA;

import java.sql.ResultSet;
import java.util.ArrayList;
import com.minimart.DTO.KhuyenMai;

import javax.swing.*;

public class KhuyenMaiDAO {
    private  ConnectSQL connectSQL;

    public KhuyenMaiDAO()
    {

    }
    public ArrayList<KhuyenMai> readData()
    {
        connectSQL=new ConnectSQL();
        ArrayList<KhuyenMai> danhSachKhuyenMai=new ArrayList<>();

        try {
            String query="SELECT * FROM KHUYENMAI";
            ResultSet rs = connectSQL.sqlQuery(query);
            if (rs!=null)
            {
                while (rs.next())
                {
                    KhuyenMai khuyenMai=new KhuyenMai(rs.getString("IdKhuyenMai"), rs.getString("IdDotKhuyenMai"), rs.getString("MoTaKhuyenMai") );
                    danhSachKhuyenMai.add(khuyenMai);
                }
            }
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No found data !!!");
        } finally {
            connectSQL.closeConnect();
        }
        return danhSachKhuyenMai;
    }
    public boolean addData(KhuyenMai khuyenMai)
    {
        connectSQL=new ConnectSQL();
        boolean commandSQL=connectSQL.sqlUpdate("INSERT INTO KHUYENMAI(IdKhuyenMai,IdDotKhuyenMai,MoTaKhuyenMai) VALUES ('"
                + khuyenMai.getIdKhuyenMai()+"','"
                + khuyenMai.getIdDotKhuyenMai()+"','"
                + khuyenMai.getMoTaKhuyenMai()+"');");
        return commandSQL;
    }
    public boolean removeData(String idKhuyenMai)
    {
        connectSQL=new ConnectSQL();
        boolean commandSQL=connectSQL.sqlUpdate("DELETE FROM KHUYENMAI WHERE IdKhuyenMai='"+idKhuyenMai+"';");
        return commandSQL;
    }
    public boolean removeAllData(String idDotKhuyenMai)
    {
        connectSQL=new ConnectSQL();
        boolean commandSQL=connectSQL.sqlUpdate("DELETE FROM KHUYENMAI WHERE IdKhuyenMai='"
                +idDotKhuyenMai+"';");
        return commandSQL;
    }
    public boolean updateData(KhuyenMai khuyenMai)
    {
        connectSQL=new ConnectSQL();
        boolean commandSQL=connectSQL.sqlUpdate("UPDATE KHUYENMAI SET " +
                "IdKhuyenMai='"+khuyenMai.getIdKhuyenMai() +"',"
                + "IdDotKhuyenMai='"+khuyenMai.getIdDotKhuyenMai()+"', "
                + "MoTaKhuyenMai='"+khuyenMai.getMoTaKhuyenMai()+"' WHERE" +
                "IdKhuyenMai='"+khuyenMai.getIdKhuyenMai()+"' ");
        return commandSQL;
    }
}
