package com.minimart.dto;

import java.time.LocalDate;

public class DotKhuyenMai {
    private String idDotKhuyenMai;
    private String tenDotKhuyeMai;
    private LocalDate   ngayBatDau;
    private LocalDate    ngayKetThuc;

    public DotKhuyenMai(){
        this.idDotKhuyenMai=null;
        this.tenDotKhuyeMai=null;
        this.ngayBatDau=null;
        this.ngayKetThuc=null;
    }
    public DotKhuyenMai(String idDotKhuyenMai, String tenDotKhuyeMai, LocalDate ngayBatDau, LocalDate ngayKetThuc)
    {
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.tenDotKhuyeMai=tenDotKhuyeMai;
        this.ngayBatDau=ngayBatDau;
        this.ngayKetThuc=ngayKetThuc;
    }

    public DotKhuyenMai(DotKhuyenMai dotKhuyenMai)
    {
        this(dotKhuyenMai.idDotKhuyenMai, dotKhuyenMai.tenDotKhuyeMai, dotKhuyenMai.ngayBatDau, dotKhuyenMai.ngayKetThuc);
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
    public void setKhuyenMai(DotKhuyenMai dotKhuyenMai)
    {
        this.idDotKhuyenMai= dotKhuyenMai.idDotKhuyenMai;
        this.tenDotKhuyeMai= dotKhuyenMai.tenDotKhuyeMai;
        this.ngayBatDau= dotKhuyenMai.ngayBatDau;
        this.ngayKetThuc= dotKhuyenMai.ngayKetThuc;
    }
    public  void setKhuyenMai(String idDotKhuyenMai,String tenDotKhuyeMai,LocalDate ngayBatDau,LocalDate ngayKetThuc)
    {
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.tenDotKhuyeMai=tenDotKhuyeMai;
        this.ngayBatDau=ngayBatDau;
        this.ngayKetThuc=ngayKetThuc;
    }
    public DotKhuyenMai getKhuyenMai()
    {
        return this;
    }
}
