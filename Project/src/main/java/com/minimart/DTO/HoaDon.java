package com.minimart.DTO;

import java.sql.Timestamp;

public class HoaDon {
    private String idHoaDon;
    private Timestamp ngayLapHoaDon;
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

    public HoaDon(String idHoaDon, Timestamp ngayLapHoaDon, String idNhanVien, int tongTien, int tienKhachDua, int tongTienKhuyenMai, int tienConLai, int tienThua, String idKhachHang)
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
    public String getIdHoaDon() {
        return idHoaDon;
    }

    public Timestamp getNgayLapHoaDon() {
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

    public int getTienConLai() {
        return tienConLai;
    }

    public int getTienKhachDua() {
        return tienKhachDua;
    }

    public int getTienThua() {
        return tienThua;
    }

    public int getTongTienKhuyenMai() {
        return tongTienKhuyenMai;
    }

    public void setTienConLai(int tienConLai) {
        this.tienConLai = tienConLai;
    }

    public void setTienKhachDua(int tienKhachDua) {
        this.tienKhachDua = tienKhachDua;
    }

    public void setTienThua(int tienThua) {
        this.tienThua = tienThua;
    }

    public void setTongTienKhuyenMai(int tongTienKhuyenMai) {
        this.tongTienKhuyenMai = tongTienKhuyenMai;
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

    public void setNgayLapHoaDon(Timestamp ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    public void setHoaDon(String idHoaDon, Timestamp ngayLapHoaDon, String idNhanVien, int tongTien, int tienKhachDua, int tongTienKhuyenMai, int tienConLai, int tienThua, String idKhachHang)
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

    public Object[] toArray()
    {
        return new Object[] {idHoaDon,ngayLapHoaDon,idNhanVien,tongTien,tienKhachDua,tongTienKhuyenMai,tienConLai,tienThua,idKhachHang};
    }
    public static String[] getHeader()
    {
        return new String[] {"Id H??a ????n","Ng??y L???p H??a ????n","Id Nh??n Vi??n","T???ng Ti???n","Ti???n Kh??ch ????a","T???ng Ti???n Khuy???n M??i","Ti???n C??n L???i","Ti???n Th???a","ID Kh??ch H??ng"};
    }

}
