package com.minimart.dto;

import java.time.LocalDate;
import java.util.Date;

public class KhuyenMai {
    private String idDotKhuyenMai;
    private String tenDotKhuyeMai;
    private LocalDate   ngayBatDau;
    private LocalDate    ngayKetThuc;

    public KhuyenMai(){
        this.idDotKhuyenMai=null;
        this.tenDotKhuyeMai=null;
        this.ngayBatDau=null;
        this.ngayKetThuc=null;
    }
    public KhuyenMai(String idDotKhuyenMai,String tenDotKhuyeMai,LocalDate ngayBatDau,LocalDate ngayKetThuc)
    {
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.tenDotKhuyeMai=tenDotKhuyeMai;
        this.ngayBatDau=ngayBatDau;
        this.ngayKetThuc=ngayKetThuc;
    }

    public KhuyenMai(KhuyenMai khuyenMai)
    {
        this(khuyenMai.idDotKhuyenMai,khuyenMai.tenDotKhuyeMai,khuyenMai.ngayBatDau,khuyenMai.ngayKetThuc);
    }

    public String getIdDotKhuyenMai() {
        return idDotKhuyenMai;
    }

    public String getTenDotKhuyenMai() {
        return tenDotKhuyeMai;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setIdDotKhuyenMai(String idDotKhuyenMai) {
        this.idDotKhuyenMai = idDotKhuyenMai;
    }

    public void setTenDotKhuyeMai(String tenDotKhuyeMai) {
        this.tenDotKhuyeMai = tenDotKhuyeMai;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    public void setKhuyenMai(KhuyenMai khuyenMai)
    {
        this.idDotKhuyenMai=khuyenMai.idDotKhuyenMai;
        this.tenDotKhuyeMai=khuyenMai.tenDotKhuyeMai;
        this.ngayBatDau=khuyenMai.ngayBatDau;
        this.ngayKetThuc=khuyenMai.ngayKetThuc;
    }
    public  void setKhuyenMai(String idDotKhuyenMai,String tenDotKhuyeMai,LocalDate ngayBatDau,LocalDate ngayKetThuc)
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
