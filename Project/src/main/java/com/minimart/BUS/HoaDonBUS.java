package com.minimart.BUS;

import com.minimart.DATA.HoaDonDAO;
import com.minimart.DTO.HoaDon;
import com.minimart.Handing.HandingBUS;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
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
    public ArrayList<String> getKeyList()
    {
        ArrayList<String> result=new ArrayList<>();

        for (HoaDon index : danhSachHoaDon)
        {
            result.add(index.getIdHoaDon());
        }
        return result;
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
        HandingBUS handingBUS=new HandingBUS();
        if (handingBUS.checkRepeat(hoaDon.getIdHoaDon(), this.getKeyList()) == false) {
            if (hoaDonDAO.addData(hoaDon)) {
                danhSachHoaDon.add(hoaDon);
                return true;
            }
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

    public ArrayList<HoaDon> searchByNgayLapHoaDon(Date startValue, Date endValue)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for(int index=0;index<danhSachHoaDon.size();index++)
        {
            HoaDon temp=danhSachHoaDon.get(index);
            Date timeTemp=temp.getNgayLapHoaDon();
            if ( (timeTemp.equals(startValue) || timeTemp.after(startValue)) &&
                    (timeTemp.equals(endValue) || timeTemp.before(endValue)) )
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<HoaDon> searchByTongTien(Date startValue, Date endValue,ArrayList<HoaDon> input)
    {
        ArrayList<HoaDon> result=new ArrayList<>();
        for(int index=0;index<input.size();index++)
        {
            HoaDon temp=input.get(index);
            Date timeTemp=temp.getNgayLapHoaDon();
            if ((timeTemp.equals(startValue) || timeTemp.after(startValue)) &&
                    (timeTemp.equals(endValue) || timeTemp.before(endValue)))
            {
                result.add(temp);
            }
        }
        return result;
    }




}
