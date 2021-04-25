package com.minimart.business;

import com.minimart.data.ChiTietKhuyenMaiDAO;
import com.minimart.data.ChiTietPhieuNhapDAO;
import com.minimart.dto.ChiTietKhuyenMai;
import com.minimart.dto.KhuyenMai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

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
    public  boolean removeData(String idKhuyenMai,String idDotKhuyenMai)
    {
        if(chiTietKhuyenMaiDAO.removeData(idKhuyenMai,idDotKhuyenMai)) {
            for (int index=0;index<danhSachChiTietKhuyenMai.size();index++)
            {
                if(danhSachChiTietKhuyenMai.get(index).getIdKhuyenMai().equals(idKhuyenMai) && danhSachChiTietKhuyenMai.get(index).getIdDotKhuyenMai().equals(idDotKhuyenMai))
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
                danhSachChiTietKhuyenMai.get(index).getIdDotKhuyenMai().equals(chiTietKhuyenMai.getIdDotKhuyenMai()))
                {
                    danhSachChiTietKhuyenMai.set(index, chiTietKhuyenMai);
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<ChiTietKhuyenMai> getByIdDotKhuyenMai (String idDotKhuyenMai)
    {
        ArrayList<ChiTietKhuyenMai> tempList=new ArrayList<>();
        for(int index=0;index<danhSachChiTietKhuyenMai.size();index++)
        {
            if(danhSachChiTietKhuyenMai.get(index).getIdDotKhuyenMai().equals(idDotKhuyenMai))
            {
                tempList.add(danhSachChiTietKhuyenMai.get(index));
            }
        }
        return tempList;
    }

    public ArrayList<ChiTietKhuyenMai> searchByIdDotKhuyenMai (String idDotKhuyenMai)
    {
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for(int index=0;index<danhSachChiTietKhuyenMai.size();index++)
        {
            ChiTietKhuyenMai temp=danhSachChiTietKhuyenMai.get(index);
            if (temp.getIdDotKhuyenMai().toLowerCase().contains(idDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<ChiTietKhuyenMai> searchByIdDotKhuyenMai (String idDotKhuyenMai,ArrayList<ChiTietKhuyenMai> input)
    {
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for(int index=0;index<input.size();index++)
        {
            ChiTietKhuyenMai temp=input.get(index);
            if (temp.getIdDotKhuyenMai().toLowerCase().contains(idDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }
    public KhuyenMai getDotKhuyenMai(String idDotKhuyenMai)
    {
        KhuyenMaiBUS khuyenMaiBUS=new KhuyenMaiBUS();
        for (int index=0;index<danhSachChiTietKhuyenMai.size();index++)
        {
            if(danhSachChiTietKhuyenMai.get(index).getIdDotKhuyenMai().equals(idDotKhuyenMai))
            {
                return khuyenMaiBUS.getByIdDotKhuyenMai(danhSachChiTietKhuyenMai.get(index).getIdDotKhuyenMai());

            }
        }
        return null;

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

        public ArrayList<ChiTietKhuyenMai> getChiTietKhuyenMaiByIdSanPham(String idSanPham)
    {
        LocalDate localDate=LocalDate.now();
        ArrayList<ChiTietKhuyenMai> result=new ArrayList<>();
        for (int index=0;index<danhSachChiTietKhuyenMai.size();index++)
        {
            LocalDate tempStartDate=this.getDotKhuyenMai(danhSachChiTietKhuyenMai.get(index).getIdDotKhuyenMai()).getNgayBatDau();
            LocalDate tempEndDate=this.getDotKhuyenMai(danhSachChiTietKhuyenMai.get(index).getIdDotKhuyenMai()).getNgayKetThuc();
            if(danhSachChiTietKhuyenMai.get(index).getIdSanPham().equals(idSanPham) &&  localDate.isAfter(tempStartDate) && localDate.isBefore(tempEndDate))
            {
                result.add(danhSachChiTietKhuyenMai.get(index));
            }
        }

        return  result;
    }
}
