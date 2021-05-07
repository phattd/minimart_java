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
        danhSachNhanVien=nhanVienDAO.readDB();
    }
    public void readData()
    {
        danhSachNhanVien=nhanVienDAO.readDB();
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
            if (nhanVienDAO.add(nhanVien))
            {
                danhSachNhanVien.add(nhanVien);
                return true;
            }
        }
        return false;
    }
    public boolean removeData(String idNhanVien)
    {
        if (nhanVienDAO.delete(idNhanVien)) {
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
        if (nhanVienDAO.update(nhanVien.getIdNhanVien(),nhanVien.getHo(),nhanVien.getTen(),nhanVien.getDiaChi(),nhanVien.getNgaySinh(),nhanVien.getSoDienThoai(),nhanVien.getLuong(),nhanVien.getIdChucVu(),nhanVien.getHinhAnh()))
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
