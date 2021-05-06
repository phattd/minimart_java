package com.minimart.BUS;

import com.minimart.DATA.ChucVuDAO;
import com.minimart.DTO.ChucVu;
import com.minimart.Handing.HandingBUS;

import java.util.ArrayList;

public class ChucVuBUS {
    private ArrayList<ChucVu> danhSachChucVu=new ArrayList<>();
    private ChucVuDAO chucVuDAO =new ChucVuDAO();

    public  ChucVuBUS()
    {
        danhSachChucVu= chucVuDAO.readData();
    }
    public  void readData()
    {
        danhSachChucVu=chucVuDAO.readData();
    }
    public ArrayList<String> getKeyList()
    {
        ArrayList<String> result=new ArrayList<>();
        for (ChucVu index: danhSachChucVu)
        {
            result.add(index.getIdChucVu());
        }
        return result;
    }
    public  boolean addData(ChucVu chucVu)
    {
        HandingBUS handingBUS=new HandingBUS();
        if (handingBUS.checkRepeat(chucVu.getIdChucVu(), this.getKeyList()) == false) {
            if (chucVuDAO.addData(chucVu)) {
                danhSachChucVu.add(chucVu);
                return true;
            }
        }
        return  false;
    }
    public ArrayList<ChucVu> getDanhSachChucVu()
    {
        return  this.danhSachChucVu;
    }
    public  boolean removeData(String idChucVu)
    {
        if(chucVuDAO.removeData(idChucVu))
        {
            for (int index=0;index<danhSachChucVu.size();index++)
            {
                if (danhSachChucVu.get(index).getIdChucVu().equals(idChucVu))
                {
                    danhSachChucVu.remove(danhSachChucVu.get(index));
                    return true;
                }
            }
        }
        return false;
    }
    public boolean updateData(ChucVu chucVu)
    {
        if (chucVuDAO.updateData(chucVu))
        {
            for (int index=0;index<danhSachChucVu.size();index++)
            {
                if(danhSachChucVu.get(index).getIdChucVu().equals(chucVu.getIdChucVu()))
                {
                    danhSachChucVu.set(index,chucVu);
                    return true;
                }
            }
        }
        return false;
    }
    public ChucVu searchByIdChucVu(String idChucVu)
    {
        for (int index=0;index<danhSachChucVu.size();index++)
        {
            if (danhSachChucVu.get(index).getIdChucVu().equals(idChucVu))
            {
                return danhSachChucVu.get(index);
            }
        }
        return null;
    }

}
