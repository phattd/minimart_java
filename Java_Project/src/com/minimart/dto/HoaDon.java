package com.minimart.dto;

import java.util.Date;

public class HoaDon {
    private String idHoaDon;
    private Date ngayLapHoaDon;
    private String idNhanVien;
    private int tongTien;
    private String idKhachHang;

    public HoaDon(){}

    public HoaDon(String idHoaDon,Date ngayLapHoaDon,String idNhanVien,int tongTien,String idKhachHang)
    {
        this.idHoaDon=idHoaDon;
        this.ngayLapHoaDon=ngayLapHoaDon;
        this.idNhanVien=idNhanVien;
        this.tongTien=tongTien;
        this.idKhachHang=idKhachHang;
    }
    public  HoaDon(HoaDon hoaDon)
    {
        this(hoaDon.idHoaDon, hoaDon.ngayLapHoaDon, hoaDon.idNhanVien, hoaDon.tongTien, hoaDon.idKhachHang);
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
    public void setHoaDon(String idHoaDon,Date ngayLapHoaDon,String idNhanVien,int tongTien,String idKhachHang)
    {
        this.idHoaDon=idHoaDon;
        this.ngayLapHoaDon=ngayLapHoaDon;
        this.idNhanVien=idNhanVien;
        this.tongTien=tongTien;
        this.idKhachHang=idKhachHang;
    }
    public void setHoaDon(HoaDon hoaDon)
    {
        this.idHoaDon=hoaDon.idHoaDon;
        this.ngayLapHoaDon=hoaDon.ngayLapHoaDon;
        this.idNhanVien=hoaDon.idNhanVien;
        this.tongTien=hoaDon.tongTien;
        this.idKhachHang=hoaDon.idKhachHang;
    }
    public HoaDon getHoaDon()
    {
        return this;
    }
}
