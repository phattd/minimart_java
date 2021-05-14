package com.minimart.BUS;

import com.minimart.DATA.DotKhuyenMaiDAO;
import com.minimart.DTO.DotKhuyenMai;
import com.minimart.Handing.HandingBUS;

import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;

public class DotKhuyenMaiBUS {
    private ArrayList<DotKhuyenMai> danhSachDotKhuyenMai =new ArrayList<>();
    private DotKhuyenMaiDAO dotKhuyenMaiDAO =new DotKhuyenMaiDAO();
    public DotKhuyenMaiBUS()
    {

            danhSachDotKhuyenMai = dotKhuyenMaiDAO.readData();

    }
    // idDotKhuyenMai
    public ArrayList<String> getKeyList()
    {
        ArrayList<String> result=new ArrayList<>();
        for (DotKhuyenMai index : danhSachDotKhuyenMai)
        {
            result.add(index.getIdDotKhuyenMai());
        }
        return result;
    }
    public void readData()
    {
            danhSachDotKhuyenMai = dotKhuyenMaiDAO.readData();
    }

    public boolean addData(DotKhuyenMai dotKhuyenMai)
    {
        HandingBUS handingBUS=new HandingBUS();
        if (handingBUS.checkRepeat(dotKhuyenMai.getIdDotKhuyenMai(), this.getKeyList()) == false) {
            if (dotKhuyenMaiDAO.addData(dotKhuyenMai)) {
                danhSachDotKhuyenMai.add(dotKhuyenMai);
                return true;
            }
        }
        return false;
    }
    public  boolean removeData (String idDotKhuyenMai)
    {
            if (dotKhuyenMaiDAO.removeData(idDotKhuyenMai))
            {
                for(int index = 0; index< danhSachDotKhuyenMai.size(); index++)
                {
                    if(danhSachDotKhuyenMai.get(index).getIdDotKhuyenMai().equals(idDotKhuyenMai))
                    {
                        danhSachDotKhuyenMai.remove(danhSachDotKhuyenMai.get(index));
                        return true;
                    }
                }
            }
            return false;
    }
    public boolean updateData(DotKhuyenMai dotKhuyenMai)
    {
        if(dotKhuyenMaiDAO.updateData(dotKhuyenMai))
        {
            for (int index = 0; index< danhSachDotKhuyenMai.size(); index++)
            {
                if(danhSachDotKhuyenMai.get(index).getIdDotKhuyenMai().equals(dotKhuyenMai.getTenDotKhuyenMai()))
                {
                    danhSachDotKhuyenMai.set(index, dotKhuyenMai);
                    return  true;
                }
            }
        }
        return false;
    }

    public DotKhuyenMai getByIdDotKhuyenMai(String idDotKhuyenMai)
    {
        for (int index = 0; index< danhSachDotKhuyenMai.size(); index++)
        {
            if (danhSachDotKhuyenMai.get(index).getIdDotKhuyenMai().equals(idDotKhuyenMai))
            {
                return danhSachDotKhuyenMai.get(index);
            }
        }
        return null;
    }

    public ArrayList<DotKhuyenMai> searchByIdDotKhuyenMai(String idDotKhuyenMai)
    {
        ArrayList<DotKhuyenMai> result=new ArrayList<>();
        for (int index = 0; index< danhSachDotKhuyenMai.size(); index++)
        {
            DotKhuyenMai temp= danhSachDotKhuyenMai.get(index);
            if (temp.getIdDotKhuyenMai().toLowerCase().contains(idDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<DotKhuyenMai> searchByIdDotKhuyenMai(String idDotKhuyenMai, ArrayList<DotKhuyenMai> input)
    {
        ArrayList<DotKhuyenMai> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            DotKhuyenMai temp=input.get(index);
            if (temp.getIdDotKhuyenMai().toLowerCase().contains(idDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<DotKhuyenMai> searchByTenDotKhuyenMai(String tenDotKhuyenMai)
    {
        ArrayList<DotKhuyenMai> result=new ArrayList<>();
        for (int index = 0; index< danhSachDotKhuyenMai.size(); index++)
        {
            DotKhuyenMai temp= danhSachDotKhuyenMai.get(index);
            if (temp.getTenDotKhuyenMai().toLowerCase().contains(tenDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<DotKhuyenMai> searchByTenDotKhuyenMai(String tenDotKhuyenMai, ArrayList<DotKhuyenMai> input)
    {
        ArrayList<DotKhuyenMai> result=new ArrayList<>();
        for (int index=0;index<input.size();index++)
        {
            DotKhuyenMai temp=input.get(index);
            if (temp.getTenDotKhuyenMai().toLowerCase().contains(tenDotKhuyenMai.toLowerCase()))
            {
                result.add(temp);
            }
        }
        return result;
    }

    public ArrayList<DotKhuyenMai> searchKhuyenMaiHienTai()
    {
        ArrayList<DotKhuyenMai> result=new ArrayList<>();
        for (int index = 0; index< danhSachDotKhuyenMai.size(); index++)
        {
            DotKhuyenMai temp= danhSachDotKhuyenMai.get(index);
            Timestamp current=new Timestamp(new Date().getTime());
            if (temp.getNgayKetThuc().after(current))
            {
                result.add(temp);
            }
        }
        return result;
    }

}
