package com.minimart.BUS;

import com.minimart.DATA.SanPhamDAO;
import com.minimart.DTO.SanPham;

import java.util.ArrayList;

public class SanPhamBUS {
    private ArrayList<SanPham> danhSachSanPham=new ArrayList<>();
    private SanPhamDAO sanPhamDAO=new SanPhamDAO();

    public SanPhamBUS()
    {

    }
    public void readData()
    {

    }


    public boolean addData(SanPham sanPham) {
        return true;
    }

    public String getTenSanPhamByIdSanPham(String idSanPham)
    {
        for (SanPham index : danhSachSanPham)
        {
            if (index.getIdSanPham().equals(idSanPham))
                return index.getTenSanPham();
        }
        return null;
    }
}
