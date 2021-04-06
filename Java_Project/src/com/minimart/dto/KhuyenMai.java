package com.minimart.dto;

import java.util.Date;

public class KhuyenMai {
    private String idDotKhuyenMai;
    private String tenDotKhuyeMai;
    private Date   ngayBatDau;
    private Date    ngayKetThuc;

    public KhuyenMai(){}
    public KhuyenMai(String idDotKhuyenMai,String tenDotKhuyeMai,Date ngayBatDau,Date ngayKetThuc)
    {
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.tenDotKhuyeMai=tenDotKhuyeMai;
        this.ngayBatDau=ngayBatDau;
        this.ngayKetThuc=ngayKetThuc;
    }
    public KhuyenMai(KhuyenMai khuyenMai)
    {
        this.idDotKhuyenMai=khuyenMai.idDotKhuyenMai;
        this.tenDotKhuyeMai=khuyenMai.tenDotKhuyeMai;
        this.ngayBatDau=khuyenMai.ngayBatDau;
        this.ngayKetThuc=khuyenMai/ngayKetThuc;
    }
    public KhuyenMai(KhuyenMai khuyenMai)
    {
        this(khuyenMai.idDotKhuyenMai,khuyenMai.tenDotKhuyeMai,khuyenMai.ngayBatDau,khuyenMai.ngayKetThuc);
    }

    public String getIdDotKhuyenMai() {
        return idDotKhuyenMai;
    }

    public String getTenDotKhuyeMai() {
        return tenDotKhuyeMai;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setIdDotKhuyenMai(String idDotKhuyenMai) {
        this.idDotKhuyenMai = idDotKhuyenMai;
    }

    public void setTenDotKhuyeMai(String tenDotKhuyeMai) {
        this.tenDotKhuyeMai = tenDotKhuyeMai;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    public  void setKhuyenMai(String idDotKhuyenMai,String tenDotKhuyeMai,Date ngayBatDau,Date ngayKetThuc)
    {
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.tenDotKhuyeMai=tenDotKhuyeMai;
        this.ngayBatDau=ngayBatDau;
        this.ngayKetThuc=ngayKetThuc;
    }
    public KhuyenMai getKhuyenMai()
    {
        return this;
    }
}
