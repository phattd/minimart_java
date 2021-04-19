package com.minimart.business;

import com.minimart.data.ChiTietHoaDonDAO;
import com.minimart.dto.ChiTietHoaDon;

import java.util.ArrayList;

public class ChiTietHoaDonBUS {
    private ArrayList<ChiTietHoaDon>  danhSachChiTietHoaDon= new ArrayList<>();
    private ChiTietHoaDonDAO chiTietHoaDonDAO=new ChiTietHoaDonDAO();
    public ChiTietHoaDonBUS()
    {
        danhSachChiTietHoaDon=chiTietHoaDonDAO.readData();
    }

    public void readData()
    {
        danhSachChiTietHoaDon=chiTietHoaDonDAO.readData();
    }
    public ChiTietHoaDon getChiTietHoaDonbyIdHoaDon(String idHoaDon)
    {
        for(ChiTietHoaDon element : danhSachChiTietHoaDon)
        {

        }
    }


}
