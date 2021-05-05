package com.minimart.business;

import com.minimart.data.DanhMucQuyenDAO;
import com.minimart.dto.ChucVu;
import com.minimart.dto.DanhMucQuyen;

import java.util.ArrayList;

public class DanhMucQuyenBUS {
    private ArrayList<DanhMucQuyen> danhSachDanhMucQuyen=new ArrayList<>();
    private DanhMucQuyenDAO danhMucQuyenDAO=new DanhMucQuyenDAO();

    public  DanhMucQuyenBUS()
    {
        danhSachDanhMucQuyen=danhMucQuyenDAO.readData();
    }
    public void readData()
    {
        danhSachDanhMucQuyen=danhMucQuyenDAO.readData();
    }
    public ArrayList<DanhMucQuyen> getDanhSachDanhMucQuyen()
    {
        return  this.danhSachDanhMucQuyen;
    }
    public boolean addData(DanhMucQuyen danhMucQuyen)
    {
        if (danhMucQuyenDAO.addData(danhMucQuyen))
        {
            danhSachDanhMucQuyen.add(danhMucQuyen);
            return  true;
        }
        return false;
    }
    public boolean removeData(DanhMucQuyen danhMucQuyen)
    {
        if (danhMucQuyenDAO.removeData(danhMucQuyen))
        {
            for (int index=0;index<danhSachDanhMucQuyen.size();index++)
            {
                if (danhSachDanhMucQuyen.get(index).getIdQuyen().equals(danhMucQuyen.getIdQuyen()) &&
                 danhSachDanhMucQuyen.get(index).getIdChucVu().equals(danhMucQuyen.getIdChucVu()))

                {
                    danhSachDanhMucQuyen.remove(index);
                    return true;
                }
            }
        }
        return false;
    }
    public ArrayList<String>  searchIdQuyenByIdChucVu(String idChucVu)
    {
        ArrayList<String> temp=new ArrayList<>();
        for (DanhMucQuyen index : danhSachDanhMucQuyen)
        {
            if (index.getIdChucVu().equals(idChucVu))
            {
                temp.add(index.getIdQuyen());
            }
        }
        return temp;
    }

}
