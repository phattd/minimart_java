package com.minimart.BUS;

import com.minimart.DATA.NhaCungCapDAO;

import com.minimart.DTO.NhaCungCap;
import com.minimart.Handing.HandingBUS;

import java.util.ArrayList;
import java.util.Locale;

public class NhaCungCapBUS {
    private ArrayList<NhaCungCap> danhSachNhaCungCap=new ArrayList<>();
    private NhaCungCapDAO nhaCungCapDAO=new NhaCungCapDAO();

    public NhaCungCapBUS()
    {
        danhSachNhaCungCap= nhaCungCapDAO.readDB();
    }
    public void readData()
    {
        danhSachNhaCungCap=nhaCungCapDAO.readDB();
    }
    public ArrayList<NhaCungCap> getDanhSachNhaCungCap()
    {
        return danhSachNhaCungCap;
    }
    public ArrayList<String> getKeyList()
    {
        ArrayList<String> result=new ArrayList<>();
        for (NhaCungCap index : danhSachNhaCungCap)
        {
            result.add(index.getIdNhaCungCap());
        }
        return  result;
    }
    public boolean addData(NhaCungCap nhaCungCap)
    {
        HandingBUS handingBUS=new HandingBUS();
        if (handingBUS.checkRepeat(nhaCungCap.getIdNhaCungCap() , this.getKeyList()) == false)
        {
            if (nhaCungCapDAO.add(nhaCungCap))
            {
                danhSachNhaCungCap.add(nhaCungCap);
                return true;
            }
        }
        return false;
    }
    public boolean removeData(String idNhaCungCap)
    {
        if (nhaCungCapDAO.delete(idNhaCungCap))
        {
            for (int index=0;index<danhSachNhaCungCap.size();index++)
            {
                if (danhSachNhaCungCap.get(index).getIdNhaCungCap().equals(idNhaCungCap))
                {
                    danhSachNhaCungCap.remove(index);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean updateData(NhaCungCap nhaCungCap)
    {
        if (nhaCungCapDAO.update(nhaCungCap.getIdNhaCungCap(),nhaCungCap.getTenNhaCungCap(), nhaCungCap.getSoDienThoaiNCC(), nhaCungCap.getDiaChiNCC()))
        {
            for (int index=0;index<danhSachNhaCungCap.size();index++)
            {
                if (danhSachNhaCungCap.get(index).getIdNhaCungCap().equals(nhaCungCap.getIdNhaCungCap()))
                {
                    danhSachNhaCungCap.set(index,nhaCungCap);
                    return true;
                }
            }

        }
        return false;
    }
    public ArrayList<NhaCungCap> searchByIdNhaCungCap(String idNhaCungCap)
    {
        ArrayList<NhaCungCap> result=new ArrayList<>();
        for (int index=0;index<danhSachNhaCungCap.size();index++)

        {
            NhaCungCap temp=danhSachNhaCungCap.get(index);
            if (temp.getIdNhaCungCap().toLowerCase().contains(idNhaCungCap.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result
    }

    public ArrayList<NhaCungCap> searchByIdNhaCungCap(String idNhaCungCap, ArrayList<NhaCungCap> input)
    {
        ArrayList<NhaCungCap> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)

        {
            NhaCungCap temp=input.get(index);
            if (temp.getIdNhaCungCap().toLowerCase().contains(idNhaCungCap.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result
    }
    public ArrayList<NhaCungCap> searchByTenNhaCung(String tenNhaCungCap)
    {
        ArrayList<NhaCungCap> result=new ArrayList<>();
        for (int index=0;index<danhSachNhaCungCap.size();index++)
        {
            NhaCungCap temp= danhSachNhaCungCap.get(index);
            if (temp.getTenNhaCungCap().toLowerCase().contains(tenNhaCungCap.toLowerCase())
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<NhaCungCap> searchByTenNhaCung(String tenNhaCungCap, ArrayList<NhaCungCap> input)
    {
        ArrayList<NhaCungCap> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            NhaCungCap temp= input.get(index);
            if (temp.getTenNhaCungCap().toLowerCase().contains(tenNhaCungCap.toLowerCase())
            {
                result.add(temp);
            }
        }
        return result;
    }

}
