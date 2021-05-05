package com.minimart.business;

import com.minimart.data.LoaiSanPhamDAO;
import com.minimart.dto.LoaiSanPham;

import java.util.ArrayList;

public class LoaiSanPhamBUS {
    private ArrayList<LoaiSanPham> danhSachLoaiSanPham = new ArrayList<>();
    private LoaiSanPhamDAO loaiSanPhamDAO = new LoaiSanPhamDAO();

    public LoaiSanPhamBUS() {
        danhSachLoaiSanPham = loaiSanPhamDAO.readDB();
    }

    public void readData()
    {
        danhSachLoaiSanPham=loaiSanPhamDAO.readDB();
    }
    public ArrayList<LoaiSanPham> getDanhSachLoaiSanPham()
    {
        return this.danhSachLoaiSanPham;
    }
    public boolean addData(LoaiSanPham loaiSanPham)
    {
        if (loaiSanPhamDAO.add(loaiSanPham))
        {
            danhSachLoaiSanPham.add(loaiSanPham);
            return true;
        }
        return false;
    }
    public boolean removeData(String idLoaiSanPham)
    {
        if(loaiSanPhamDAO.delete(idLoaiSanPham))
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
        if (loaiSanPhamDAO.update(loaiSanPham))
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
