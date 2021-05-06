package com.minimart.BUS;

import com.minimart.DATA.DanhMucQuyenDAO;
import com.minimart.DTO.DanhMucQuyen;
import com.minimart.Handing.HandingBUS;

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
    //0: IdChucVu/1: IdQuyen
    public ArrayList<String[]> getKeyList()
    {
        ArrayList<String[]> result=new ArrayList<>();
        for (DanhMucQuyen index : danhSachDanhMucQuyen)
        {
            String[] temp=new String[2];
            temp[0]=index.getIdChucVu();
            temp[1]=index.getIdQuyen();
            result.add(temp);
        }
        return result;
    }
    public boolean addData(DanhMucQuyen danhMucQuyen)
    {
        HandingBUS handingBUS=new HandingBUS();
        if(handingBUS.checkRepeat(danhMucQuyen.getIdChucVu(), danhMucQuyen.getIdQuyen(), this.getKeyList()) == false) {
            if (danhMucQuyenDAO.addData(danhMucQuyen)) {
                danhSachDanhMucQuyen.add(danhMucQuyen);
                return true;
            }
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
