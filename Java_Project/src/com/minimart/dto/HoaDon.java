package com.minimart.dto;

import java.util.Date;

public class HoaDon {
    private String idHoaDon;
    private Date ngayLapHoaDon;
    private String idNhanVien;
    private int tongTien;
    private int tienKhachDua;
    private int tongTienKhuyenMai;
    private int tienConLai;
    private int tienThua;
    private String idKhachHang;

    public HoaDon(){
        this.idHoaDon=null;
        this.ngayLapHoaDon=null;
        this.idNhanVien="";
        this.tongTien=0;
        this.tienKhachDua=0;
        this.tongTienKhuyenMai=0;
        this.tienConLai=0;
        this.tienThua=0;
        this.idKhachHang=null;
    }

    public HoaDon(String idHoaDon,Date ngayLapHoaDon,String idNhanVien,int tongTien,int tienKhachDua,int tongTienKhuyenMai,int tienConLai,int tienThua,String idKhachHang)
    {
        this.idHoaDon=idHoaDon;
        this.ngayLapHoaDon=ngayLapHoaDon;
        this.idNhanVien=idNhanVien;
        this.tongTien=tongTien;
        this.tienKhachDua=tienKhachDua;
        this.tongTienKhuyenMai=tongTienKhuyenMai;
        this.tienConLai=tienConLai;
        this.tienThua=tienThua;
        this.idKhachHang=idKhachHang;
    }
    public  HoaDon(HoaDon hoaDon)
    {
        this(hoaDon.idHoaDon, hoaDon.ngayLapHoaDon, hoaDon.idNhanVien, hoaDon.tongTien, hoaDon.tienKhachDua, hoaDon.tongTienKhuyenMai, hoaDon.tienConLai, hoaDon.tienThua, hoaDon.idKhachHang);
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public Date getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }


    public String getIdKhachHang() {
        return idKhachHang;
    }

    public int getTongTien() {
        return tongTien;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public void setNgayLapHoaDon(Date ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    public void setHoaDon(String idHoaDon,Date ngayLapHoaDon,String idNhanVien,int tongTien,int tienKhachDua,int tongTienKhuyenMai,int tienConLai,int tienThua,String idKhachHang)
    {
        this.idHoaDon=idHoaDon;
        this.ngayLapHoaDon=ngayLapHoaDon;
        this.idNhanVien=idNhanVien;
        this.tongTien=tongTien;
        this.tienKhachDua=tienKhachDua;
        this.tongTienKhuyenMai=tongTienKhuyenMai;
        this.tienConLai=tienConLai;
        this.tienThua=tienThua;
        this.idKhachHang=idKhachHang;
    }
    public void setHoaDon(HoaDon hoaDon)
    {
        this.idHoaDon=idHoaDon;
        this.ngayLapHoaDon=ngayLapHoaDon;
        this.idNhanVien=idNhanVien;
        this.tongTien=tongTien;
        this.tienKhachDua=tienKhachDua;
        this.tongTienKhuyenMai=tongTienKhuyenMai;
        this.tienConLai=tienConLai;
        this.tienThua=tienThua;
        this.idKhachHang=idKhachHang;
    }
    public HoaDon getHoaDon()
    {
        return this;
    }
}
