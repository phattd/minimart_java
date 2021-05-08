package com.minimart.DTO;

public class ChiTietHoaDon {
    private String idHoaDon;
    private String idSanPham;
    private int soLuong;
    private int donGia;
    private String idKhuyenMai;
    private int thanhTien;
    private int tienKhuyenMai;
    public ChiTietHoaDon(){
        idHoaDon=null;
        idSanPham=null;
        soLuong=0;
        donGia=0;
        idKhuyenMai=null;
        thanhTien=0;
        tienKhuyenMai=0;
    }
    public ChiTietHoaDon(String idHoaDon,String idSanPham,int soLuong,int donGia,String idKhuyenMai,int thanhTien,int tienKhuyenMai)
    {
        this.idHoaDon=idHoaDon;
        this.idSanPham=idSanPham;
        this.soLuong=soLuong;
        this.donGia=donGia;
        this.idKhuyenMai=idKhuyenMai;
        this.thanhTien=thanhTien;
        this.tienKhuyenMai=tienKhuyenMai;
    }
    public ChiTietHoaDon(ChiTietHoaDon chiTietHoaDon)
    {
        this(chiTietHoaDon.idHoaDon, chiTietHoaDon.idSanPham, chiTietHoaDon.soLuong,
                chiTietHoaDon.donGia, chiTietHoaDon.idKhuyenMai, chiTietHoaDon.thanhTien, chiTietHoaDon.tienKhuyenMai);
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getTienKhuyenMai() {
        return tienKhuyenMai;
    }

    public int getDonGia() {
        return donGia;
    }

    public String getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setIdKhuyenMai(String idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void setTienKhuyenMai(int tienKhuyenMai) {
        this.tienKhuyenMai = tienKhuyenMai;
    }

    public void setChiTietThanhTien(ChiTietHoaDon chiTietHoaDon)
    {
        this.idHoaDon=chiTietHoaDon.idHoaDon;
        this.idSanPham=chiTietHoaDon.idSanPham;
        this.soLuong=chiTietHoaDon.soLuong;
        this.donGia=chiTietHoaDon.donGia;
        this.idKhuyenMai=chiTietHoaDon.idKhuyenMai;
        this.thanhTien=chiTietHoaDon.thanhTien;
        this.tienKhuyenMai=tienKhuyenMai;
    }
    public void setChiTietThanhTien(String idHoaDon,String idSanPham,int soLuong,int donGia,String idKhuyenMai,int thanhTien,int tienKhuyenMai)
    {
        this.idHoaDon=idHoaDon;
        this.idSanPham=idSanPham;
        this.soLuong=soLuong;
        this.donGia=donGia;
        this.idKhuyenMai=idKhuyenMai;
        this.thanhTien=thanhTien;
        this.tienKhuyenMai=tienKhuyenMai;
    }
    public ChiTietHoaDon getChiTietHoaDon()
    {
        return  this;
    }

    public Object[] toArray()
    {
        return new Object[] {idHoaDon,idSanPham,soLuong,donGia,idKhuyenMai,thanhTien,tienKhuyenMai};
    }
    public static String[] getHeader()
    {
        return new String[] {"Id Hóa Đơn","Id Sản Phẩm","Số Lượng","Đơn Giá","Id Khuyến Mãi","Thành Tiền","Tiền Khuyến Mãi"};
    }
}
