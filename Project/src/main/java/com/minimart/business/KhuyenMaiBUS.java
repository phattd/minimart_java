package com.minimart.business;

import com.minimart.data.KhuyenMaiDAO;
import com.minimart.dto.KhuyenMai;

import java.util.ArrayList;

public class KhuyenMaiBUS {
    private ArrayList<KhuyenMai> danhSachKhuyenMai =new ArrayList<>();
    private KhuyenMaiDAO khuyenMaiDAO=new KhuyenMaiDAO();

    public KhuyenMaiBUS()
    {
        danhSachKhuyenMai= khuyenMaiDAO.readData();
    }
    public void readData()
    {
        danhSachKhuyenMai=khuyenMaiDAO.readData();
    }
    public ArrayList<KhuyenMai> getDanhSachKhuyenMai()
    {
        return danhSachKhuyenMai;
    }

    public boolean addData(KhuyenMai khuyenMai)
    {
        if(khuyenMaiDAO.addData(khuyenMai))
        {
            danhSachKhuyenMai.add(khuyenMai);
            return true;
        }
        return false;
    }
    public boolean removeData(String idKhuyenMai)
    {
        if (khuyenMaiDAO.removeData(idKhuyenMai))
        {
            for (int index=0;index<danhSachKhuyenMai.size();index++)
            {
                if (danhSachKhuyenMai.get(index).getIdKhuyenMai().equals(idKhuyenMai))
                {
                    danhSachKhuyenMai.remove(index);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean updateData(KhuyenMai khuyenMai)
    {
        if (khuyenMaiDAO.updateData(khuyenMai))
        {
            for (int index=0;index<danhSachKhuyenMai.size();index++)
            {
                if (danhSachKhuyenMai.get(index).getIdKhuyenMai().equals(khuyenMai.getIdKhuyenMai()))
                {
                    danhSachKhuyenMai.set(index,khuyenMai);
                    return true;
                }
            }
        }
        return false;
    }
    public ArrayList<KhuyenMai> searchByIdKhuyenMai(String idKhuyenMai)
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();

        for (KhuyenMai index : danhSachKhuyenMai)
        {
            if (index.getIdKhuyenMai().toLowerCase().contains(idKhuyenMai))
            {
                result.add(index);
            }
        }
        return result;

    }

}
