package com.minimart.business;

import com.minimart.data.ChiTietKhuyenMaiDAO;
import com.minimart.data.ChiTietPhieuNhapDAO;
import com.minimart.dto.ChiTietKhuyenMai;

import java.util.ArrayList;

public class ChiTietKhuyenMaiBUS {
    private ArrayList<ChiTietKhuyenMai> danhSachChiTietKhuyenMai=new ArrayList<>();
    private ChiTietKhuyenMaiDAO chiTietKhuyenMaiDAO=new ChiTietKhuyenMaiDAO();
}
