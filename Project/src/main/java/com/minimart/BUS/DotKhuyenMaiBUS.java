package com.minimart.BUS;

import com.minimart.DATA.DotKhuyenMaiDAO;
import com.minimart.DTO.DotKhuyenMai;

import java.time.LocalDate;
import java.util.ArrayList;

public class DotKhuyenMaiBUS {
    private ArrayList<DotKhuyenMai> danhSachDotKhuyenMai =new ArrayList<>();
    private DotKhuyenMaiDAO dotKhuyenMaiDAO =new DotKhuyenMaiDAO();

    public DotKhuyenMaiBUS()
    {

            danhSachDotKhuyenMai = dotKhuyenMaiDAO.readDB();

    }
    public void readData()
    {
            danhSachDotKhuyenMai = dotKhuyenMaiDAO.readDB();
    }

    public boolean addData(DotKhuyenMai dotKhuyenMai)
    {
            if (dotKhuyenMaiDAO.add(dotKhuyenMai))
            {
                danhSachDotKhuyenMai.add(dotKhuyenMai);
                return true;
            }
        return false;
    }
    public  boolean removeData (String idDotKhuyenMai)
    {
            if (dotKhuyenMaiDAO.delete(idDotKhuyenMai))
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
        if(dotKhuyenMaiDAO.update(dotKhuyenMai))
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
            LocalDate current=LocalDate.now();
            if (temp.getNgayKetThuc().isAfter(current))
            {
                result.add(temp);
            }
        }
        return result;
    }

}
