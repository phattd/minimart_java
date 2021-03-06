package com.minimart.BUS;

import com.minimart.DATA.LoaiSanPhamDAO;
import com.minimart.DTO.LoaiSanPham;
import com.minimart.Handing.HandingBUS;

import java.util.ArrayList;

public class LoaiSanPhamBUS {
    private ArrayList<LoaiSanPham> danhSachLoaiSanPham = new ArrayList<>();
    private LoaiSanPhamDAO loaiSanPhamDAO = new LoaiSanPhamDAO();

    public LoaiSanPhamBUS() {
        danhSachLoaiSanPham = loaiSanPhamDAO.readData();
    }

    public void readData()
    {
        danhSachLoaiSanPham=loaiSanPhamDAO.readData();
    }
    public ArrayList<LoaiSanPham> getDanhSachLoaiSanPham()
    {
        return this.danhSachLoaiSanPham;
    }

    public ArrayList<String> getKeyList()
    {
        ArrayList<String> result=new ArrayList<>();
        for (LoaiSanPham index : danhSachLoaiSanPham)
        {
            result.add(index.getIdLoaiSanPham());
        }
        return result;
    }
    public boolean addData(LoaiSanPham loaiSanPham)
    {
        HandingBUS handingBUS=new HandingBUS();
        if (handingBUS.checkRepeat(loaiSanPham.getIdLoaiSanPham(), this.getKeyList())==false) {
            if (loaiSanPhamDAO.addData(loaiSanPham)) {
                danhSachLoaiSanPham.add(loaiSanPham);
                return true;
            }
        }
        return false;
    }
    public boolean removeData(String idLoaiSanPham)
    {
        if(loaiSanPhamDAO.removeData(idLoaiSanPham))
        {
            for (int index=0; index<danhSachLoaiSanPham.size();index++)
            {
                if (danhSachLoaiSanPham.get(index).getIdLoaiSanPham().equals(idLoaiSanPham))
                {
                    danhSachLoaiSanPham.remove(index);
                    return true;
                }
            }

        }
        return false;
    }
    public boolean updateData(LoaiSanPham loaiSanPham)
    {
        if (loaiSanPhamDAO.updateData(loaiSanPham))
        {
            for (int index=0;index<danhSachLoaiSanPham.size();index++)
            {
                if(danhSachLoaiSanPham.get(index).getIdLoaiSanPham().equals(loaiSanPham.getIdLoaiSanPham()))
                {
                    danhSachLoaiSanPham.set(index,loaiSanPham);
                    return true;
                }
            }
        }
        return false;
    }
    public ArrayList<LoaiSanPham> searchByIdLoaiSanPham(String idLoaiSanPham)
    {
        ArrayList<LoaiSanPham> temp=new ArrayList<>();
        for (LoaiSanPham index : danhSachLoaiSanPham )
        {
            if (index.getIdLoaiSanPham().equals(idLoaiSanPham))
            {
                temp.add(index);
            }
        }
        return temp;
    }
    public ArrayList<LoaiSanPham> searchByTenLoaiSanPham(String tenLoaiSanPham)
    {
        ArrayList<LoaiSanPham> temp=new ArrayList<>();
        for (LoaiSanPham index : danhSachLoaiSanPham )
        {
            if (index.getIdLoaiSanPham().equals(tenLoaiSanPham))
            {
                temp.add(index);
            }
        }
        return temp;
    }



}
