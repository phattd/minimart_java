package com.minimart.BUS;

import com.minimart.DATA.ChiTietPhieuNhapDAO;
import com.minimart.DTO.ChiTietPhieuNhap;

import java.util.ArrayList;

public class ChiTietPhieuNhapBUS {
    private ArrayList<ChiTietPhieuNhap> danhSachChiTietNhap=new ArrayList<>();
    private ChiTietPhieuNhapDAO chiTietPhieuNhapDAO=new ChiTietPhieuNhapDAO();
    public ChiTietPhieuNhapBUS()
    {
        danhSachChiTietNhap=chiTietPhieuNhapDAO.readData();
    }
    public void readData()
    {
        danhSachChiTietNhap=chiTietPhieuNhapDAO.readData();
    }
    public  ArrayList<ChiTietPhieuNhap> getDanhSachChiTietNhap()
    {
        return this.danhSachChiTietNhap;
    }
    public ArrayList<String[]> getKeyList()
    {
        ArrayList<String[]> result = new ArrayList<>();
        for (ChiTietPhieuNhap index : danhSachChiTietNhap)
        {
            String[] temp=new String[2];
            temp[0]=index.getIdPhieuNhap();
            temp[1]=index.getIdSanPham();
            result.add(temp);
        }
        return result;
    }
    public boolean addData(ChiTietPhieuNhap chiTietPhieuNhap)
    {
        if(chiTietPhieuNhapDAO.addData(chiTietPhieuNhap))
        {
            danhSachChiTietNhap.add(chiTietPhieuNhap);
            return true;
        }
        return  false;
    }
    public  boolean removeData(String idPhieuNhap,String idSanPham)
    {
        if(chiTietPhieuNhapDAO.removeData(idPhieuNhap,idSanPham))
        {
            for(int index=0;index<danhSachChiTietNhap.size();index++)
            {
                if(danhSachChiTietNhap.get(index).getIdPhieuNhap().equals(idPhieuNhap) && danhSachChiTietNhap.get(index).getIdSanPham().equals(idSanPham))
                {
                    danhSachChiTietNhap.remove(danhSachChiTietNhap.get(index));
                    return true;
                }
            }
        }
        return  false;
    }
    public  boolean removeAllData(String idPhieuNhap)
    {
        if(chiTietPhieuNhapDAO.removeAllData(idPhieuNhap))
        {
            for (int index=0;index<danhSachChiTietNhap.size();index++)
            {
                if (danhSachChiTietNhap.get(index).getIdPhieuNhap().equals(idPhieuNhap))
                {
                    danhSachChiTietNhap.remove(danhSachChiTietNhap.get(index));
                }
            }
            return true;
        }
        return false;
    }
    public  boolean updateData(ChiTietPhieuNhap chiTietPhieuNhap)
    {
        if (chiTietPhieuNhapDAO.updateData(chiTietPhieuNhap))
        {
            for(int index=0;index<danhSachChiTietNhap.size();index++)
            {
                if (danhSachChiTietNhap.get(index).getIdPhieuNhap().equals(chiTietPhieuNhap.getIdPhieuNhap()) && danhSachChiTietNhap.get(index).getIdSanPham().equals(chiTietPhieuNhap.getIdSanPham()))
                {
                    danhSachChiTietNhap.set(index, chiTietPhieuNhap);
                    return true;
                }
            }

        }
        return  false;
    }
    public ArrayList<ChiTietPhieuNhap> searchByIdPhieuNhap(String idPhieuNhap)
    {
        ArrayList<ChiTietPhieuNhap> result=new ArrayList<>();
        for (int index=0;index<danhSachChiTietNhap.size();index++)
        {
            ChiTietPhieuNhap temp=danhSachChiTietNhap.get(index);
            if (temp.getIdPhieuNhap().toLowerCase().contains(idPhieuNhap.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<ChiTietPhieuNhap> searchByIdPhieuNhap(String idPhieuNhap,ArrayList<ChiTietPhieuNhap> input)
    {
        ArrayList<ChiTietPhieuNhap> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            ChiTietPhieuNhap temp=input.get(index);
            if (temp.getIdPhieuNhap().toLowerCase().contains(idPhieuNhap.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<ChiTietPhieuNhap> searchByIdSanPham(String idSanPham)
    {
        ArrayList<ChiTietPhieuNhap> result=new ArrayList<>();
        for (int index=0;index<danhSachChiTietNhap.size();index++)
        {
            ChiTietPhieuNhap temp=danhSachChiTietNhap.get(index);
            if (temp.getIdSanPham().toLowerCase().contains(idSanPham.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<ChiTietPhieuNhap> searchByIdSanPham(String idSanPham,ArrayList<ChiTietPhieuNhap> input)
    {
        ArrayList<ChiTietPhieuNhap> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            ChiTietPhieuNhap temp=input.get(index);
            if (temp.getIdSanPham().toLowerCase().contains(idSanPham.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<ChiTietPhieuNhap> searchBySoLuong(int startValue, int endValue)
    {
        ArrayList<ChiTietPhieuNhap> result=new ArrayList<>();
        for(int index=0;index<danhSachChiTietNhap.size();index++)
        {
            ChiTietPhieuNhap temp=danhSachChiTietNhap.get(index);
            if (temp.getSoLuong()>=startValue && temp.getSoLuong()<=endValue)
            {
                result.add(temp);
            }
        }
        return result;
    }
    public ArrayList<ChiTietPhieuNhap> searchBySoLuong(int startValue, int endValue,ArrayList<ChiTietPhieuNhap> input)
    {
        ArrayList<ChiTietPhieuNhap> result=new ArrayList<>();
        for(int index=0;index<input.size();index++)
        {
            ChiTietPhieuNhap temp=input.get(index);
            if (temp.getSoLuong()>=startValue && temp.getSoLuong()<=endValue)
            {
                result.add(temp);
            }
        }
        return result;
    }

}
