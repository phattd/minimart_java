package com.minimart.business;

import com.minimart.data.HoaDonDAO;
import com.minimart.dto.ChiTietKhuyenMai;
import com.minimart.dto.HoaDon;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;

public class HoaDonBUS {
    private ArrayList<HoaDon> danhSachHoaDon=new ArrayList<>();
    private HoaDonDAO hoaDonDAO=new HoaDonDAO();

    public HoaDonBUS()
    {
        try {
            danhSachHoaDon= hoaDonDAO.readData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readData()
    {
        try {
            danhSachHoaDon= hoaDonDAO.readData();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        for(int index=0;index<danhSachHoaDon.size();index++ )
        {
            if(danhSachHoaDon.get(index).getIdHoaDon().equals(idHoaDon))
                return danhSachHoaDon.get(index);
        }
        return  null;
    }
    public boolean addData(HoaDon hoaDon)
    {
        try {
            if(hoaDonDAO.addData(hoaDon))
            {
                danhSachHoaDon.add(hoaDon);
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public  boolean removeData(String idHoaDon)
    {
        try {
            if(hoaDonDAO.removeData(idHoaDon))
            {
                for(int index=0;index<danhSachHoaDon.size();index++)
                {
                    if(danhSachHoaDon.get(index).getIdHoaDon().equals(idHoaDon))
                    {
                        danhSachHoaDon.remove(danhSachHoaDon.get(index));
                        return true;
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateData(HoaDon hoaDon)
    {
        try {
            if(hoaDonDAO.updateData(hoaDon))
            {
                for(int index=0;index<danhSachHoaDon.size();index++)
                {
                    if(danhSachHoaDon.get(index).getIdHoaDon().equals(hoaDon.getIdHoaDon()))
                    {
                        danhSachHoaDon.set(index,hoaDon);
                        return true;
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<HoaDon> searchByidHoaDon(String idHoaDon)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for (int index=0;index<danhSachHoaDon.size();index++)
        {
            HoaDon temp =danhSachHoaDon.get(index);
            if (temp.getIdHoaDon().toLowerCase().contains(idHoaDon.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<HoaDon> searchByidHoaDon(String idHoaDon,ArrayList<HoaDon> input)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            HoaDon temp =input.get(index);
            if (temp.getIdHoaDon().toLowerCase().contains(idHoaDon.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<HoaDon> searchByidNhanVien(String idNhanVien)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for (int index=0;index<danhSachHoaDon.size();index++)
        {
            HoaDon temp =danhSachHoaDon.get(index);
            if (temp.getIdNhanVien().toLowerCase().contains(idNhanVien.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<HoaDon> searchByidNhanVien(String idNhanVien,ArrayList<HoaDon> input)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            HoaDon temp =input.get(index);
            if (temp.getIdNhanVien().toLowerCase().contains(idNhanVien.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<HoaDon> searchByidKhachHang(String idKhachHang)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for (int index=0;index<danhSachHoaDon.size();index++)
        {
            HoaDon temp =danhSachHoaDon.get(index);
            if (temp.getIdKhachHang().toLowerCase().contains(idKhachHang.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<HoaDon> searchByidKhachHang(String idKhachHang,ArrayList<HoaDon> input)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            HoaDon temp =input.get(index);
            if (temp.getIdKhachHang().toLowerCase().contains(idKhachHang.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<HoaDon> searchByTongTien(int startValue, int endValue)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for(int index=0;index<danhSachHoaDon.size();index++)
        {
            HoaDon temp=danhSachHoaDon.get(index);
            if (temp.getTongTien()>=startValue && temp.getTongTien()<=endValue)
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<HoaDon> searchByTongTien(int startValue, int endValue,ArrayList<HoaDon> input)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for(int index=0;index<input.size();index++)
        {
            HoaDon temp=input.get(index);
            if (temp.getTongTien()>=startValue && temp.getTongTien()<=endValue)
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<HoaDon> searchByNgayLapHoaDon(LocalDate startValue, LocalDate endValue)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for(int index=0;index<danhSachHoaDon.size();index++)
        {
            HoaDon temp=danhSachHoaDon.get(index);
            LocalDate timeTemp=temp.getNgayLapHoaDon();
            if ( (timeTemp.isEqual(startValue) || timeTemp.isAfter(startValue)) &&
                    (timeTemp.isEqual(endValue) || timeTemp.isBefore(endValue)) )
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<HoaDon> searchByTongTien(LocalDate startValue, LocalDate endValue,ArrayList<HoaDon> input)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for(int index=0;index<input.size();index++)
        {
            HoaDon temp=input.get(index);
            LocalDate timeTemp=temp.getNgayLapHoaDon();
            if ((timeTemp.isEqual(startValue) || timeTemp.isAfter(startValue)) &&
                    (timeTemp.isEqual(endValue) || timeTemp.isBefore(endValue)))
            {
                result.add(temp);
            }
        }
        return result;
    }




}
