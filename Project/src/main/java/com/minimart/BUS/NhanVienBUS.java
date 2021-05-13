package com.minimart.BUS;

import com.minimart.DATA.NhanVienDAO;
import com.minimart.DTO.NhanVien;
import com.minimart.Handing.HandingBUS;

import java.util.ArrayList;

public class NhanVienBUS {
    private ArrayList<NhanVien> danhSachNhanVien=new ArrayList<>();
    private NhanVienDAO nhanVienDAO=new NhanVienDAO();

    public NhanVienBUS()
    {
        danhSachNhanVien=nhanVienDAO.readData();
    }
    public void readData()
    {
        danhSachNhanVien=nhanVienDAO.readData();
    }
    public ArrayList<NhanVien> getDanhSachNhanVien()
    {
        return  danhSachNhanVien;
    }

    public ArrayList<String> getKeyList()
    {
        ArrayList<String> result=new ArrayList<>();
        for (NhanVien index : danhSachNhanVien)
        {
            result.add(index.getIdNhanVien());
        }
        return result;
    }
    public boolean addData(NhanVien nhanVien)
    {
        HandingBUS handingBUS=new HandingBUS();
        if (handingBUS.checkRepeat(nhanVien.getIdChucVu(),this.getKeyList())== false)
        {
            if (nhanVienDAO.addData(nhanVien))
            {
                danhSachNhanVien.add(nhanVien);
                return true;
            }
        }
        return false;
    }
    public boolean removeData(String idNhanVien)
    {
        if (nhanVienDAO.removeData(idNhanVien)) {
            for (int index=0;index<danhSachNhanVien.size();index++)
            {
                if (danhSachNhanVien.get(index).getIdNhanVien().equals(idNhanVien))
                {
                    danhSachNhanVien.remove(index);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean updateData(NhanVien nhanVien)
    {
        if (nhanVienDAO.updateData(nhanVien))
        {
            for (int index=0;index<danhSachNhanVien.size();index++)
            {
                danhSachNhanVien.set(index,nhanVien);
                return true;
            }
        }
        return false;
    }
}