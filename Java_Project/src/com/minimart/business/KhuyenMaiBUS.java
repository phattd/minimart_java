package com.minimart.business;

import com.minimart.data.KhuyenMaiDAO;
import com.minimart.dto.HoaDon;
import com.minimart.dto.KhuyenMai;

import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class KhuyenMaiBUS {
    private ArrayList<KhuyenMai> danhSachKhuyenMai=new ArrayList<>();
    private KhuyenMaiDAO khuyenMaiDAO=new KhuyenMaiDAO();

    public  KhuyenMaiBUS ()
    {

            danhSachKhuyenMai=khuyenMaiDAO.readDB();

    }
    public void readData()
    {
            danhSachKhuyenMai=khuyenMaiDAO.readDB();
    }

    public boolean addData(KhuyenMai khuyenMai)
    {
            if (khuyenMaiDAO.add(khuyenMai))
            {
                danhSachKhuyenMai.add(khuyenMai);
                return true;
            }
        return false;
    }
    public  boolean removeData (String idDotKhuyenMai)
    {
            if (khuyenMaiDAO.delete(idDotKhuyenMai))
            {
                for(int index=0;index<danhSachKhuyenMai.size();index++)
                {
                    if(danhSachKhuyenMai.get(index).getIdDotKhuyenMai().equals(idDotKhuyenMai))
                    {
                        danhSachKhuyenMai.remove(danhSachKhuyenMai.get(index));
                        return true;
                    }
                }
            }
            return false;
    }
    public boolean updateData(KhuyenMai khuyenMai)
    {
        if(khuyenMaiDAO.update(khuyenMai))
        {
            for (int index=0;index<danhSachKhuyenMai.size();index++)
            {
                if(danhSachKhuyenMai.get(index).getIdDotKhuyenMai().equals(khuyenMai.getTenDotKhuyenMai()))
                {
                    danhSachKhuyenMai.set(index,khuyenMai);
                    return  true;
                }
            }
        }
        return false;
    }

    public  KhuyenMai getByIdDotKhuyenMai(String idDotKhuyenMai)
    {
        for (int index=0;index<danhSachKhuyenMai.size();index++)
        {
            if (danhSachKhuyenMai.get(index).getIdDotKhuyenMai().equals(idDotKhuyenMai))
            {
                return danhSachKhuyenMai.get(index);
            }
        }
        return null;
    }

    public ArrayList<KhuyenMai> searchByIdDotKhuyenMai(String idDotKhuyenMai)
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index=0;index<danhSachKhuyenMai.size();index++)
        {
            KhuyenMai temp=danhSachKhuyenMai.get(index);
            if (temp.getIdDotKhuyenMai().toLowerCase().contains(idDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhuyenMai> searchByIdDotKhuyenMai(String idDotKhuyenMai, ArrayList<KhuyenMai> input)
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            KhuyenMai temp=input.get(index);
            if (temp.getIdDotKhuyenMai().toLowerCase().contains(idDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhuyenMai> searchByTenDotKhuyenMai(String tenDotKhuyenMai)
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index=0;index<danhSachKhuyenMai.size();index++)
        {
            KhuyenMai temp=danhSachKhuyenMai.get(index);
            if (temp.getTenDotKhuyenMai().toLowerCase().contains(tenDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhuyenMai> searchByTenDotKhuyenMai(String tenDotKhuyenMai, ArrayList<KhuyenMai> input)
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            KhuyenMai temp=input.get(index);
            if (temp.getTenDotKhuyenMai().toLowerCase().contains(tenDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhuyenMai> searchKhuyenMaiHienTai()
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index=0;index<danhSachKhuyenMai.size();index++)
        {
            KhuyenMai temp=danhSachKhuyenMai.get(index);
            LocalDate current=LocalDate.now();
            if (temp.getNgayKetThuc().isAfter(current))
            {
                result.add(temp);
            }
        }
        return result;
    }

}
