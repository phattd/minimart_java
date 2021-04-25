package com.minimart.business;

import com.minimart.data.KhachHangDAO;
import com.minimart.dto.BacTichLuy;
import com.minimart.dto.KhachHang;

import java.util.ArrayList;

public class KhachHangBUS {
    private ArrayList<KhachHang> danhSachKhachHang=new ArrayList<>();
    private KhachHangDAO khachHangDAO=new KhachHangDAO();

    public  KhachHangBUS()
    {
        danhSachKhachHang= khachHangDAO.readDB();
    }
    public void readData()
    {
        danhSachKhachHang=khachHangDAO.readDB();
    }
    public  ArrayList<KhachHang> getDanhSachKhachHang()
    {
        return  danhSachKhachHang;
    }
    public boolean addData(KhachHang khachHang)
    {
        if (khachHangDAO.add(khachHang))
        {
            danhSachKhachHang.add(khachHang);
            return true;
        }
        return false;
    }
    public boolean removeData (String idKhachHang)
    {
        if (khachHangDAO.delete(idKhachHang))
        {
            for (int index=0;index<danhSachKhachHang.size();index++)
            {
                if (danhSachKhachHang.get(index).getIdKhachHang().equals(idKhachHang))
                {
                    danhSachKhachHang.remove(index);
                    return true;
                }
            }
        }
        return false;
    }
    public  boolean updateData(KhachHang khachHang)
    {
        if (khachHangDAO.update(khachHang))
        {
            for (int index=0;index<danhSachKhachHang.size();index++)
            {
                if (danhSachKhachHang.get(index).getIdKhachHang().equals(khachHang.getIdKhachHang()))
                {
                    danhSachKhachHang.set(index,khachHang);
                    return true;
                }
            }
        }
        return  false;
    }
    public boolean updateData(String idKhachHang,int diemTichLuy)
    {
        if (khachHangDAO.updateDiemTichLuy(idKhachHang,diemTichLuy))
        {
            for (int index=0;index<danhSachKhachHang.size();index++)
            {
                if (danhSachKhachHang.get(index).getIdKhachHang().equals(idKhachHang))
                {
                    danhSachKhachHang.get(index).setDiemTichLuy(diemTichLuy);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean updateData(String idKhachHang,String bacTichLuy)
    {
        if (khachHangDAO.updateBacTichLuy(idKhachHang,bacTichLuy))
        {
            for (int index=0;index<danhSachKhachHang.size();index++)
            {
                if (danhSachKhachHang.get(index).getIdKhachHang().equals(idKhachHang))
                {
                    danhSachKhachHang.get(index).setBacTichLuy(bacTichLuy);
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<KhachHang> searchByIdKhachHang(String idKhachHang)
    {
        ArrayList<KhachHang> result=new ArrayList<>();
        for (int index=0;index<danhSachKhachHang.size();index++)
        {
            KhachHang temp=danhSachKhachHang.get(index);
            if (temp.getIdKhachHang().toLowerCase().contains(idKhachHang.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<KhachHang> searchByIdKhachHang(String idKhachHang,ArrayList<KhachHang> input)
    {
        ArrayList<KhachHang> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            KhachHang temp=input.get(index);
            if (temp.getIdKhachHang().toLowerCase().contains(idKhachHang.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhachHang> searchByTenKhachHang(String tenKhachHang)
    {
        ArrayList<KhachHang> result=new ArrayList<>();
        for (int index=0;index<danhSachKhachHang.size();index++)
        {
            KhachHang temp=danhSachKhachHang.get(index);
            if (temp.getTenKhachHang().toLowerCase().contains(tenKhachHang.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<KhachHang> searchByTenKhachHang(String tenKhachHang,ArrayList<KhachHang> input)
    {
        ArrayList<KhachHang> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            KhachHang temp=input.get(index);
            if (temp.getTenKhachHang().toLowerCase().contains(tenKhachHang.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhachHang> searchByDiemTichLuy(int startValue,int endValue)
    {
        ArrayList<KhachHang> result=new ArrayList<>();
        for (int index=0;index<danhSachKhachHang.size();index++)
        {
            KhachHang temp=danhSachKhachHang.get(index);
            if (temp.getDiemTichLuy()>=startValue && temp.getDiemTichLuy()<=endValue)
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<KhachHang> searchByDiemTichLuy(int startValue,int endValue,ArrayList<KhachHang> input)
    {
        ArrayList<KhachHang> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            KhachHang temp=input.get(index);
            if (temp.getDiemTichLuy()>=startValue && temp.getDiemTichLuy()<=endValue)
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhachHang> searchByBacTichLuy(String startValue,String endValue)
    {
        ArrayList<KhachHang> result=new ArrayList<>();
        for (int index=0;index<danhSachKhachHang.size();index++)
        {
            KhachHang temp=danhSachKhachHang.get(index);
            BacTichLuy bacTichLuy=temp.getBacTichLuyByBacTicLuy();
            BacTichLuy start=BacTichLuy.getBacTichLuy(startValue);
            BacTichLuy end=BacTichLuy.getBacTichLuy(endValue);
            if ((bacTichLuy.equals(start) || bacTichLuy.isBigger(start)) && (bacTichLuy.isLess(end) || bacTichLuy.equals(end)))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhachHang> searchByBacTichLuy(String startValue,String endValue,ArrayList<KhachHang> input)
    {
        ArrayList<KhachHang> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            KhachHang temp=input.get(index);
            BacTichLuy bacTichLuy=temp.getBacTichLuyByBacTicLuy();
            BacTichLuy start=BacTichLuy.getBacTichLuy(startValue);
            BacTichLuy end=BacTichLuy.getBacTichLuy(endValue);
            if ((bacTichLuy.equals(start) || bacTichLuy.isBigger(start)) && (bacTichLuy.isLess(end) || bacTichLuy.equals(end)))
            {
                result.add(temp);
            }
        }
        return result;
    }






}
