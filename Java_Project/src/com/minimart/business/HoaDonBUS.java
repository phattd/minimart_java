package com.minimart.business;

import com.minimart.data.HoaDonDAO;
import com.minimart.dto.HoaDon;

import java.sql.Timestamp;
import java.util.ArrayList;

public class HoaDonBUS {
    private ArrayList<HoaDon> danhSachHoaDon=new ArrayList<>();
    private HoaDonDAO hoaDonDAO=new HoaDonDAO();

    public HoaDonBUS()
    {
        danhSachHoaDon= hoaDonDAO.readData();
    }

    public void readData()
    {
        danhSachHoaDon= hoaDonDAO.readData();
    }
    public ArrayList<HoaDon> getDanhSachHoaDon()
    {
        return this.danhSachHoaDon;
    }

    public String createIdHoaDon(String IdNhanVien, String IdKhachHang, Timestamp thoiGianLapHoaDon)
    {
        String rawIdHoaDon=IdNhanVien+IdKhachHang+thoiGianLapHoaDon.getTime();
        return rawIdHoaDon.hashCode()+"";
    }
    public HoaDon getHoaDonById(String idHoaDon){
        for(HoaDon hoaDon : danhSachHoaDon )
        {
            if(hoaDon.getIdHoaDon().equals(idHoaDon))
                return hoaDon;
        }
        return  null;
    }
    public boolean addData(HoaDon hoaDon)
    {
        if(hoaDonDAO.addData(hoaDon))
        {
            danhSachHoaDon.add(hoaDon);
            return true;
        }
        return false;
    }
    public  boolean removeData(String idHoaDon)
    {
        if(hoaDonDAO.removeData(idHoaDon))
        {
            for(HoaDon element : danhSachHoaDon)
            {
                if(element.getIdHoaDon().equals(idHoaDon))
                {
                    danhSachHoaDon.remove(element);
                    return true;
                }
            }

        }
        return false;
    }
    public boolean updateData(HoaDon hoaDon)
    {
        if(hoaDonDAO.updateData(hoaDon))
        {
            for(HoaDon element : danhSachHoaDon)
            {
                if(element.getIdHoaDon().equals(hoaDon.getIdHoaDon()))
                {
                    element=hoaDon;
                    return true;
                }
            }

        }
        return false;
    }

}
