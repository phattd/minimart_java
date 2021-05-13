package com.minimart.BUS;

import com.minimart.DATA.PhieuNhapDAO;
import com.minimart.DATA.PhieuNhapDAO;
import com.minimart.DTO.PhieuNhap;
import com.minimart.DTO.PhieuNhap;

import java.util.ArrayList;
import java.util.Date;

public class PhieuNhapBUS {
    private ArrayList<PhieuNhap> dspn = new ArrayList<>();
    private com.minimart.DATA.PhieuNhapDAO PhieuNhapDAO = new PhieuNhapDAO();

    public PhieuNhapBUS() {
        dspn = PhieuNhapDAO.readData();
    }

    public void readData() {
        dspn = PhieuNhapDAO.readData();
    }

    public ArrayList<PhieuNhap> getdspn() {
        return dspn;
    }

    public boolean addData(PhieuNhap PhieuNhap)
    {
        if(PhieuNhapDAO.addData(PhieuNhap))
        {
            dspn.add(PhieuNhap);
            return  true;
        }
        else
        {
            return  false;
        }
    }
    public  boolean removeData(String idPhieuNhap) {
        if (PhieuNhapDAO.removeData( idPhieuNhap))
        {
            for (int index=0;index<dspn.size();index++)
            {
                if(dspn.get(index).getIdPhieuNhap().equals(idPhieuNhap))
                {
                    dspn.remove(index);
                    return  true;
                }
            }
        }
        return  false;
    }

    public boolean updateDada(PhieuNhap PhieuNhap)
    {
        if(PhieuNhapDAO.updateData(PhieuNhap))
        {
            for(int index=0;index<dspn.size();index++)
            {
                if(dspn.get(index).getIdPhieuNhap().equals(PhieuNhap.getIdPhieuNhap()))
                {
                    dspn.set(index,PhieuNhap);
                }
            }
            return  true;
        }
        return false;
    }
    public  ArrayList<PhieuNhap> searchByIdPhieuNhap(String idPhieuNhap)
    {
        ArrayList<PhieuNhap> danhSachChiTietById=new ArrayList<>();
        for (int index=0;index<dspn.size();index++)
        {
            if(dspn.get(index).getIdPhieuNhap().equals(idPhieuNhap))
            {
                danhSachChiTietById.add(dspn.get(index));
            }
        }
        return danhSachChiTietById;
    }
    public  ArrayList<PhieuNhap> searchByIdNCC(String idNCC)
    {
        ArrayList<PhieuNhap> danhSachChiTietById=new ArrayList<>();
        for (int index=0;index<dspn.size();index++)
        {
            if(dspn.get(index).getIdNhaCungCap().equals(idNCC))
            {
                danhSachChiTietById.add(dspn.get(index));
            }
        }
        return danhSachChiTietById;
    }
    public  ArrayList<PhieuNhap> searchByNgayNhap(Date ngay)
    {
        ArrayList<PhieuNhap> danhSachChiTietByDate=new ArrayList<>();
        for (int index=0;index<dspn.size();index++)
        {
            if(dspn.get(index).getNgayNhap().equals(ngay))
            {
                danhSachChiTietByDate.add(dspn.get(index));
            }
        }
        return danhSachChiTietByDate;
    }
}