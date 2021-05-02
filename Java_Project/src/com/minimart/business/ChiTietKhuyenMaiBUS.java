package com.minimart.business;

import com.minimart.data.ChiTietKhuyenMaiDAO;
import com.minimart.dto.ChiTietKhuyenMai;
import com.minimart.dto.DotKhuyenMai;

import java.time.LocalDate;
import java.util.ArrayList;

public class ChiTietKhuyenMaiBUS {
    private ArrayList<ChiTietKhuyenMai> danhSachChiTietKhuyenMai=new ArrayList<>();
    private ChiTietKhuyenMaiDAO chiTietKhuyenMaiDAO=new ChiTietKhuyenMaiDAO();
    public ChiTietKhuyenMaiBUS()
    {
        danhSachChiTietKhuyenMai = chiTietKhuyenMaiDAO.readData();
    }
    public void readData()
    {
        danhSachChiTietKhuyenMai = chiTietKhuyenMaiDAO.readData();
    }
    public  ArrayList<ChiTietKhuyenMai> getDanhSachChiTietKhuyenMai()
    {
        return  this.danhSachChiTietKhuyenMai;
    }
    public boolean addData(ChiTietKhuyenMai chiTietKhuyenMai)
    {
        if(chiTietKhuyenMaiDAO.addData(chiTietKhuyenMai))
        {
            danhSachChiTietKhuyenMai.add(chiTietKhuyenMai);
            return true;
        }
        return  false;
    }
    public  boolean removeData(String idKhuyenMai,String idSanPham)
    {
        if(chiTietKhuyenMaiDAO.removeData(idKhuyenMai,idSanPham)) {
            for (int index=0;index<danhSachChiTietKhuyenMai.size();index++)
            {
                if(danhSachChiTietKhuyenMai.get(index).getIdKhuyenMai().equals(idKhuyenMai) && danhSachChiTietKhuyenMai.get(index).getIdSanPham().equals(idSanPham))
                {
                    danhSachChiTietKhuyenMai.remove(index);
                    return true;
                }
            }

        }
        return false;
    }
    public  boolean updateData(ChiTietKhuyenMai chiTietKhuyenMai)
    {
        if(chiTietKhuyenMaiDAO.updateData(chiTietKhuyenMai))
        {
            for(int index=0;index<danhSachChiTietKhuyenMai.size();index++)
            {
                if(danhSachChiTietKhuyenMai.get(index).getIdKhuyenMai().equals(chiTietKhuyenMai.getIdKhuyenMai()) &&
                danhSachChiTietKhuyenMai.get(index).getIdSanPham().equals(chiTietKhuyenMai.getIdSanPham()))
                {
                    danhSachChiTietKhuyenMai.set(index, chiTietKhuyenMai);
                    return true;
                }
            }
        }
        return false;
    }


    public ArrayList<ChiTietKhuyenMai> searchByIdKhuyenMai (String idKhuyenMai)
    {
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for(int index=0;index<danhSachChiTietKhuyenMai.size();index++)
        {
            ChiTietKhuyenMai temp=danhSachChiTietKhuyenMai.get(index);
            if (temp.getIdKhuyenMai().toLowerCase().contains(idKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<ChiTietKhuyenMai> searchByIdKhuyenMai (String idKhuyenMai,ArrayList<ChiTietKhuyenMai> input)
    {
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for(int index=0;index<input.size();index++)
        {
            ChiTietKhuyenMai temp=input.get(index);
            if (temp.getIdKhuyenMai().toLowerCase().contains(idKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<ChiTietKhuyenMai> searchByTenKhuyenMai (String tenKhuyenMai)
    {
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for(int index=0;index<danhSachChiTietKhuyenMai.size();index++)
        {
            ChiTietKhuyenMai temp=danhSachChiTietKhuyenMai.get(index);
            if (temp.getTenKhuyenMai().toLowerCase().contains(tenKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<ChiTietKhuyenMai> searchByTenKhuyenMai (String tenKhuyenMai,ArrayList<ChiTietKhuyenMai> input)
    {
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for(int index=0;index<input.size();index++)
        {
            ChiTietKhuyenMai temp=input.get(index);
            if (temp.getTenKhuyenMai().toLowerCase().contains(tenKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<ChiTietKhuyenMai> searchByIdSanPham (String idSanPham)
    {
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for(int index=0;index<danhSachChiTietKhuyenMai.size();index++)
        {
            ChiTietKhuyenMai temp=danhSachChiTietKhuyenMai.get(index);
            if (temp.getIdSanPham().toLowerCase().contains(idSanPham.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<ChiTietKhuyenMai> searchByIdSanPham (String idSanPham,ArrayList<ChiTietKhuyenMai> input)
    {
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for(int index=0;index<input.size();index++)
        {
            ChiTietKhuyenMai temp=input.get(index);
            if (temp.getIdSanPham().toLowerCase().contains(idSanPham.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<ChiTietKhuyenMai> searchByPhanTramKhuyenMai(byte startValue,byte endValue)
    {
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for(int index=0;index<danhSachChiTietKhuyenMai.size();index++)
        {
            ChiTietKhuyenMai temp=danhSachChiTietKhuyenMai.get(index);
            if (temp.getPhanTramKhuyenMai()>=startValue && temp.getPhanTramKhuyenMai()<=endValue)
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<ChiTietKhuyenMai> searchByPhanTramKhuyenMai(byte startValue,byte endValue,ArrayList<ChiTietKhuyenMai> input) {
        ArrayList<ChiTietKhuyenMai> result = new ArrayList<>();
        for (int index = 0; index < input.size(); index++) {
            ChiTietKhuyenMai temp = input.get(index);
            if (temp.getPhanTramKhuyenMai() >= startValue && temp.getPhanTramKhuyenMai() <= endValue) {
                result.add(temp);
            }
        }
        return result;
    }


}
