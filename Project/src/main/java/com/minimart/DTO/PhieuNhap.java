package com.minimart.DTO;

import java.sql.Timestamp;

public class PhieuNhap {
    private String idPhieuNhap;
    private String idNhaCungCap;
    private Timestamp ngayNhap;
    private String idNhanVien;
    private int tongTien;
    private String trangThai;
    public PhieuNhap(){
        this.idPhieuNhap=null;
        this.idNhaCungCap=null;
        this.ngayNhap=null;
        this.idNhanVien=null;
        this.tongTien=0;
        this.trangThai="processing";
    }
    public PhieuNhap(String idPhieuNhap, String idNhaCungCap, Timestamp ngayNhap, String idNhanVien, int tongTien, String trangThai)
    {
        this.idPhieuNhap=idPhieuNhap;
        this.idNhaCungCap=idNhaCungCap;
        this.ngayNhap=ngayNhap;
        this.idNhanVien=idNhanVien;
        this.tongTien=tongTien;
        this.trangThai=trangThai;
    }
    public PhieuNhap(PhieuNhap phieuNhap)
    {
        this(phieuNhap.idPhieuNhap, phieuNhap.idNhaCungCap, phieuNhap.ngayNhap, phieuNhap.idNhanVien, phieuNhap.tongTien,phieuNhap.trangThai);

    }

    public String getIdPhieuNhap() {
        return idPhieuNhap;
    }

    public String getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public Timestamp getNgayNhap() {
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

    public void setNgayNhap(Timestamp ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public  void setPhieuNhap(String idPhieuNhap, String idNhaCungCap, Timestamp ngayNhap, String idNhanVien, int tongTien,String trangThai)
    {
        this.idPhieuNhap=idPhieuNhap;
        this.idNhaCungCap=idNhaCungCap;
        this.ngayNhap=ngayNhap;
        this.idNhanVien=idNhanVien;
        this.tongTien=tongTien;
        this.trangThai=trangThai;
    }
    public  void setPhieuNhap(PhieuNhap phieuNhap)
    {
        this.idPhieuNhap=phieuNhap.idPhieuNhap;
        this.idNhaCungCap=phieuNhap.idNhaCungCap;
        this.ngayNhap=phieuNhap.ngayNhap;
        this.idNhanVien=phieuNhap.idNhanVien;
        this.tongTien=phieuNhap.tongTien;
        this.trangThai=trangThai;
    }
    public PhieuNhap getPhieuNhap()
    {
        return this;
    }

    public Object[] toArray()
    {
        return new Object[] {idPhieuNhap,idNhaCungCap,ngayNhap,idNhanVien,tongTien};
    }
    public static String[] getHeader()
    {
        return new String[] {"Id Phi???u Nh???p","Id Nh?? Cung C???p","Ng??y Nh???p","Id Nh??n Vi??n","T???ng Ti???n"};
    }
}
