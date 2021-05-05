package com.minimart.BUS;

import com.minimart.DATA.ChiTietHoaDonDAO;
import com.minimart.DTO.ChiTietHoaDon;

import java.util.ArrayList;

public class ChiTietHoaDonBUS {
    private ArrayList<ChiTietHoaDon> danhSachChiTietHoaDon = new ArrayList<>();
    private ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();

    public ChiTietHoaDonBUS() {
        danhSachChiTietHoaDon = chiTietHoaDonDAO.readData();
    }

    public void readData() {
        danhSachChiTietHoaDon = chiTietHoaDonDAO.readData();
    }

    public ArrayList<ChiTietHoaDon> getDanhSachChiTietHoaDon() {
        return this.danhSachChiTietHoaDon;
    }
    //Phần tử 0: Id Hóa Đơn/ Phần tử 1: Id Sản Phẩm
    public ArrayList<String[]> getKeyList()
    {
        ArrayList<String[]> result=new ArrayList<>();

        for (ChiTietHoaDon index : danhSachChiTietHoaDon)
        {
            String[] temp=new String[2];
            temp[0]=index.getIdHoaDon();
            temp[1]=index.getIdSanPham();
            result.add(temp);
        }
        return result;
    }

    public boolean addData(ChiTietHoaDon chiTietHoaDon)
    {
        if(chiTietHoaDonDAO.addData(chiTietHoaDon))
        {
            danhSachChiTietHoaDon.add(chiTietHoaDon);
            return  true;
        }
        else
        {
            return  false;
        }
    }
    public  boolean removeData(String idHoaDon,String idSanPham) {
        if (chiTietHoaDonDAO.removeData(idHoaDon, idSanPham))
        {
            for (int index=0;index<danhSachChiTietHoaDon.size();index++)
            {
                if(danhSachChiTietHoaDon.get(index).getIdHoaDon().equals(idHoaDon) && danhSachChiTietHoaDon.get(index).getIdSanPham().equals(idSanPham))
                {
                    danhSachChiTietHoaDon.remove(index);
                    return  true;
                }
            }
        }
        return  false;
    }
    public boolean removeAll(String idHoaDon)
    {
        if(chiTietHoaDonDAO.removeAllData(idHoaDon))
        {
            for (int index=0;index<danhSachChiTietHoaDon.size();index++)
            {
                if (danhSachChiTietHoaDon.get(index).getIdHoaDon().equals(idHoaDon))
                {
                    danhSachChiTietHoaDon.remove(index);
                }
            }
            return true;
        }
        return  false;
    }
    public boolean updateDada(ChiTietHoaDon chiTietHoaDon)
    {
        if(chiTietHoaDonDAO.updateData(chiTietHoaDon))
        {
            for(int index=0;index<danhSachChiTietHoaDon.size();index++)
            {
                if(danhSachChiTietHoaDon.get(index).getIdHoaDon().equals(chiTietHoaDon.getIdHoaDon()) && danhSachChiTietHoaDon.get(index).getIdSanPham().equals(chiTietHoaDon.getIdSanPham()))
                {
                    danhSachChiTietHoaDon.set(index,chiTietHoaDon);
                }
            }
            return  true;
        }
        return false;
    }
    public  ArrayList<ChiTietHoaDon> searchByIdHoaDon(String idHoaDon)
    {
        ArrayList<ChiTietHoaDon> danhSachChiTietById=new ArrayList<>();
        for (int index=0;index<danhSachChiTietHoaDon.size();index++)
        {
            if(danhSachChiTietHoaDon.get(index).getIdHoaDon().equals(idHoaDon))
            {
                danhSachChiTietById.add(danhSachChiTietHoaDon.get(index));
            }
        }
        return danhSachChiTietById;
    }




}
