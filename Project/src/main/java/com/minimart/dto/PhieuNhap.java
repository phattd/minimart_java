package com.minimart.dto;

import java.time.LocalDate;

public class PhieuNhap {
    private String idPhieuNhap;
    private String idNhaCungCap;
    private LocalDate ngayNhap;
    private String idNhanVien;
    private int tongTien;
    public PhieuNhap(){
        this.idPhieuNhap=null;
        this.idNhaCungCap=null;
        this.ngayNhap=null;
        this.idNhanVien=null;
        this.tongTien=0;
    }
    public PhieuNhap(String idPhieuNhap, String idNhaCungCap, LocalDate ngayNhap, String idNhanVien, int tongTien)
    {
        this.idPhieuNhap=idPhieuNhap;
        this.idNhaCungCap=idNhaCungCap;
        this.ngayNhap=ngayNhap;
        this.idNhanVien=idNhanVien;
        this.tongTien=tongTien;
    }
    public PhieuNhap(PhieuNhap phieuNhap)
    {
        this(phieuNhap.idPhieuNhap, phieuNhap.idNhaCungCap, phieuNhap.ngayNhap, phieuNhap.idNhanVien, phieuNhap.tongTien);

    }

    public String getIdPhieuNhap() {
        return idPhieuNhap;
    }

    public String getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setIdPhieuNhap(String idPhieuNhap) {
        this.idPhieuNhap = idPhieuNhap;
    }

    public void setIdNhaCungCap(String idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    public  void setPhieuNhap(String idPhieuNhap, String idNhaCungCap, LocalDate ngayNhap, String idNhanVien, int tongTien)
    {
        this.idPhieuNhap=idPhieuNhap;
        this.idNhaCungCap=idNhaCungCap;
        this.ngayNhap=ngayNhap;
        this.idNhanVien=idNhanVien;
        this.tongTien=tongTien;
    }
    public  void setPhieuNhap(PhieuNhap phieuNhap)
    {
        this.idPhieuNhap=phieuNhap.idPhieuNhap;
        this.idNhaCungCap=phieuNhap.idNhaCungCap;
        this.ngayNhap=phieuNhap.ngayNhap;
        this.idNhanVien=phieuNhap.idNhanVien;
        this.tongTien=phieuNhap.tongTien;
    }
    public PhieuNhap getPhieuNhap()
    {
        return this;
    }
}
