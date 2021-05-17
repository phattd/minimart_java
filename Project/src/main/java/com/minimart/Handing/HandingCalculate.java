package com.minimart.Handing;

import com.minimart.BUS.ChiTietKhuyenMaiBUS;
import com.minimart.DTO.ChiTietHoaDon;
import com.minimart.DTO.ChiTietKhuyenMai;
import com.minimart.DTO.ChiTietPhieuNhap;

import java.util.ArrayList;

public class HandingCalculate {
    public static int tienKhuyenMaiOfCTHD(int donGia,String idKhuyenMai)
    {
        int result=donGia;
        ChiTietKhuyenMaiBUS chiTietKhuyenMai=new ChiTietKhuyenMaiBUS();
        ChiTietKhuyenMai temp= chiTietKhuyenMai.getByChiTietKhuyenMai(idKhuyenMai);
        if (temp != null)
        {
            float phanTramKhuyenMai= temp.getPhanTramKhuyenMai()*1.0F/100.0F;
            result= (int) (donGia-(donGia*phanTramKhuyenMai));
        }
        return result;
    }
    public static int tongTienOfHD(ArrayList<ChiTietHoaDon> hoaDonArrayList)
    {
        int result=0;
        for (ChiTietHoaDon index : hoaDonArrayList)
        {
            result+=index.getThanhTien();
        }
        return result;
    }
    public static int tongTienKhuyenMaiOfHD(ArrayList<ChiTietHoaDon> hoaDonArrayList)
    {
        int result=0;
        for (ChiTietHoaDon index : hoaDonArrayList)
        {
            result+=index.getTienKhuyenMai();
        }
        return result;
    }
    public static int tongTienOfPN(ArrayList<ChiTietPhieuNhap> phieuNhaps)
    {
        int result=0;
        for (ChiTietPhieuNhap index : phieuNhaps)
        {
            result+=index.getThanhTien()
        }
        return result;
    }


}
