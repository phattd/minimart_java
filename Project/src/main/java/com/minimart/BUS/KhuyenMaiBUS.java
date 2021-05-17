package com.minimart.BUS;

import com.minimart.DATA.KhuyenMaiDAO;
import com.minimart.DTO.KhuyenMai;
import com.minimart.Handing.HandingBUS;

import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;

public class KhuyenMaiBUS {
    private ArrayList<KhuyenMai> danhSachKhuyenMai =new ArrayList<>();
    private KhuyenMaiDAO khuyenMaiDAO =new KhuyenMaiDAO();
    public KhuyenMaiBUS()
    {

            danhSachKhuyenMai = khuyenMaiDAO.readData();

    }
    // idKhuyenMai
    public ArrayList<String> getKeyList()
    {
        ArrayList<String> result=new ArrayList<>();
        for (KhuyenMai index : danhSachKhuyenMai)
        {
            result.add(index.getIdKhuyenMai());
        }
        return result;
    }
    public void readData()
    {
            danhSachKhuyenMai = khuyenMaiDAO.readData();
    }

    public boolean addData(KhuyenMai khuyenMai)
    {
        HandingBUS handingBUS=new HandingBUS();
        if (handingBUS.checkRepeat(khuyenMai.getIdKhuyenMai(), this.getKeyList()) == false) {
            if (khuyenMaiDAO.addData(khuyenMai)) {
                danhSachKhuyenMai.add(khuyenMai);
                return true;
            }
        }
        return false;
    }
    public  boolean removeData (String idKhuyenMai)
    {
            if (khuyenMaiDAO.removeData(idKhuyenMai))
            {
                for(int index = 0; index< danhSachKhuyenMai.size(); index++)
                {
                    if(danhSachKhuyenMai.get(index).getIdKhuyenMai().equals(idKhuyenMai))
                    {
                        danhSachKhuyenMai.remove(danhSachKhuyenMai.get(index));
                        return true;
                    }
                }
            }
            return false;
    }
    public boolean updateData(KhuyenMai khuyenMai)
    {
        if(khuyenMaiDAO.updateData(khuyenMai))
        {
            for (int index = 0; index< danhSachKhuyenMai.size(); index++)
            {
                if(danhSachKhuyenMai.get(index).getIdKhuyenMai().equals(khuyenMai.getTenKhuyenMai()))
                {
                    danhSachKhuyenMai.set(index, khuyenMai);
                    return  true;
                }
            }
        }
        return false;
    }

    public KhuyenMai getByIdKhuyenMai(String idKhuyenMai)
    {
        for (int index = 0; index< danhSachKhuyenMai.size(); index++)
        {
            if (danhSachKhuyenMai.get(index).getIdKhuyenMai().equals(idKhuyenMai))
            {
                return danhSachKhuyenMai.get(index);
            }
        }
        return null;
    }

    public ArrayList<KhuyenMai> searchByIdKhuyenMai(String idKhuyenMai)
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index = 0; index< danhSachKhuyenMai.size(); index++)
        {
            KhuyenMai temp= danhSachKhuyenMai.get(index);
            if (temp.getIdKhuyenMai().toLowerCase().contains(idKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhuyenMai> searchByIdKhuyenMai(String idKhuyenMai, ArrayList<KhuyenMai> input)
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            KhuyenMai temp=input.get(index);
            if (temp.getIdKhuyenMai().toLowerCase().contains(idKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhuyenMai> searchByTenKhuyenMai(String tenKhuyenMai)
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index = 0; index< danhSachKhuyenMai.size(); index++)
        {
            KhuyenMai temp= danhSachKhuyenMai.get(index);
            if (temp.getTenKhuyenMai().toLowerCase().contains(tenKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhuyenMai> searchByTenKhuyenMai(String tenKhuyenMai, ArrayList<KhuyenMai> input)
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            KhuyenMai temp=input.get(index);
            if (temp.getTenKhuyenMai().toLowerCase().contains(tenKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<KhuyenMai> searchKhuyenMaiHienTai()
    {
        ArrayList<KhuyenMai> result=new ArrayList<>();
        for (int index = 0; index< danhSachKhuyenMai.size(); index++)
        {
            KhuyenMai temp= danhSachKhuyenMai.get(index);
            Timestamp current=new Timestamp(new Date().getTime());
            if (temp.getNgayKetThuc().after(current))
            {
                result.add(temp);
            }
        }
        return result;
    }

}
