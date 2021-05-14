package com.minimart.BUS;

import com.minimart.DATA.SanPhamDAO;
import com.minimart.DATA.SanPhamDAO;
import com.minimart.DTO.SanPham;
import com.minimart.DTO.SanPham;
import com.minimart.Handing.HandingBUS;

import java.util.ArrayList;

public class SanPhamBUS {
    private ArrayList<SanPham> dssp = new ArrayList<>();
    private SanPhamDAO SanPhamDAO = new SanPhamDAO();

    public SanPhamBUS() {
        dssp = SanPhamDAO.readData();
    }

    public void readData() {
        dssp = SanPhamDAO.readData();
    }

    public ArrayList<SanPham> getdssp() {
        return dssp;
    }

    public ArrayList<String> getKeyList()
    {
        ArrayList<String> result=new ArrayList<>();

        for (SanPham index : dssp)
        {
            result.add(index.getIdSanPham());
        }
        return result;
    }

    public boolean addData(SanPham SanPham)
    {
        HandingBUS handingBUS=new HandingBUS();
        if(handingBUS.checkRepeat(SanPham.getIdSanPham(), this.getKeyList()) == false)
        {
           if (SanPhamDAO.addData(SanPham))
           {
               dssp.add(SanPham);
               return true;
           }
        }
        return  false;
    }
    public  boolean removeData(String idSanPham) {
        if (SanPhamDAO.removeData( idSanPham))
        {
            for (int index=0;index<dssp.size();index++)
            {
                if(dssp.get(index).getIdSanPham().equals(idSanPham))
                {
                    dssp.remove(index);
                    return  true;
                }
            }
        }
        return  false;
    }
    public boolean updateData(SanPham SanPham)
    {
        if(SanPhamDAO.updateData(SanPham))
        {
            for(int index=0;index<dssp.size();index++)
            {
                if(dssp.get(index).getIdSanPham().equals(SanPham.getIdSanPham()))
                {
                    dssp.set(index,SanPham);
                }
            }
            return  true;
        }
        return false;
    }
    public  ArrayList<SanPham> searchByIdSanPham(String idSanPham)
    {
        ArrayList<SanPham> danhSachChiTietById=new ArrayList<>();
        for (int index=0;index<dssp.size();index++)
        {
            if(dssp.get(index).getIdSanPham().equals(idSanPham))
            {
                danhSachChiTietById.add(dssp.get(index));
            }
        }
        return danhSachChiTietById;
    }
    public  ArrayList<SanPham> searchByTenSanPham(String tenSanPham)
    {
        ArrayList<SanPham> danhSachChiTietByTen=new ArrayList<>();
        for (int index=0;index<dssp.size();index++)
        {
            if(dssp.get(index).getTenSanPham().equals(tenSanPham))
            {
                danhSachChiTietByTen.add(dssp.get(index));
            }
        }
        return danhSachChiTietByTen;
    }
    public String getTenSanPhamByIdSanPham(String idSanPham)
    {
        for (SanPham index : dssp)
        {
            if (index.getIdSanPham().equals(idSanPham))
                return index.getTenSanPham();
        }
        return null;
    }

}