package com.minimart.BUS;

import com.minimart.DATA.PhanQuyenDAO;
import com.minimart.DATA.PhieuNhapDAO;
import com.minimart.DATA.PhanQuyenDAO;
import com.minimart.DTO.ChiTietHoaDon;
import com.minimart.DTO.PhanQuyen;
import com.minimart.DTO.PhanQuyen;
import com.minimart.DTO.SanPham;
import com.minimart.Handing.HandingBUS;

import java.util.ArrayList;

public class PhanQuyenBUS {
    private ArrayList<PhanQuyen> dsq = new ArrayList<>();
    private PhanQuyenDAO PhanQuyenDAO = new PhanQuyenDAO();


    public PhanQuyenBUS() {
        dsq = PhanQuyenDAO.readData();
    }

    public void readData() {
        dsq = PhanQuyenDAO.readData();
    }

    public ArrayList<PhanQuyen> getdsq() {
        return dsq;
    }

    public ArrayList<String> getKeyList()
    {
        ArrayList<String> result=new ArrayList<>();

        for (PhanQuyen index : dsq)
        {
            result.add(index.getIdQuyen());
        }
        return result;
    }
    public boolean addData(PhanQuyen PhanQuyen) {
        HandingBUS handingBUS = new HandingBUS();
        if (handingBUS.checkRepeat(PhanQuyen.getIdQuyen(), this.getKeyList()) == false) {
            if (PhanQuyenDAO.addData(PhanQuyen)) {
                dsq.add(PhanQuyen);
                return true;
            }
        }
        return false;
    }
    public  boolean removeData(String idQuyen) {
        if (PhanQuyenDAO.removeData( idQuyen))
        {
            for (int index=0;index<dsq.size();index++)
            {
                if(dsq.get(index).getIdQuyen().equals(idQuyen))
                {
                    dsq.remove(index);
                    return  true;
                }
            }
        }
        return  false;
    }
    public boolean updateData(PhanQuyen PhanQuyen)
    {
        if(PhanQuyenDAO.updateData(PhanQuyen))
        {
            for(int index=0;index<dsq.size();index++)
            {
                if(dsq.get(index).getIdQuyen().equals(PhanQuyen.getIdQuyen()))
                {
                    dsq.set(index,PhanQuyen);
                }
            }
            return  true;
        }
        return false;
    }
    public  ArrayList<PhanQuyen> searchByIdQuyen(String idQuyen)
    {
        ArrayList<PhanQuyen> danhSachChiTietById=new ArrayList<>();
        for (int index=0;index<dsq.size();index++)
        {
            if(dsq.get(index).getIdQuyen().equals(idQuyen))
            {
                danhSachChiTietById.add(dsq.get(index));
            }
        }
        return danhSachChiTietById;
    }
    public  ArrayList<PhanQuyen> searchByTenQuyen(String tenQuyen)
    {
        ArrayList<PhanQuyen> danhSachChiTietByTen=new ArrayList<>();
        for (int index=0;index<dsq.size();index++)
        {
            if(dsq.get(index).getTenQuyen().equals(tenQuyen))
            {
                danhSachChiTietByTen.add(dsq.get(index));
            }
        }
        return danhSachChiTietByTen;
    }
}