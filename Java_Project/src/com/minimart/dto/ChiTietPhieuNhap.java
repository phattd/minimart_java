package com.minimart.dto;

public class ChiTietPhieuNhap {
    private String idPhieuNhap;
    private String idSanPham;
    private int soLuong;
    private int donGia;
    private int thanhTien;

    public ChiTietPhieuNhap(){
        idPhieuNhap=null;
        idSanPham=null;
        soLuong=0;
        donGia=0;
        thanhTien=0;
    }
    public ChiTietPhieuNhap(String idPhieuNhap,String idSanPham,int soLuong,int donGia,int thanhTien){
        this.idPhieuNhap=idPhieuNhap;
        this.idSanPham=idSanPham;
        this.soLuong=soLuong;
        this.donGia=donGia;
        this.thanhTien=thanhTien;
    }
    public ChiTietPhieuNhap(ChiTietPhieuNhap chiTietPhieuNhap){
        this(chiTietPhieuNhap.idPhieuNhap, chiTietPhieuNhap.idSanPham, chiTietPhieuNhap.soLuong, chiTietPhieuNhap.donGia, chiTietPhieuNhap.thanhTien);
    }

    public String getIdPhieuNhap() {
        return idPhieuNhap;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public void setIdPhieuNhap(String idPhieuNhap) {
        this.idPhieuNhap = idPhieuNhap;
    }
    public void setChiTietPhieuNhap(String idPhieuNhap,String idSanPham,int soLuong,int donGia,int thanhTien){
        this.idPhieuNhap=idPhieuNhap;
        this.idSanPham=idSanPham;
        this.soLuong=soLuong;
        this.donGia=donGia;
        this.thanhTien=thanhTien;
    }
    public void setChiTietPhieuNhap(ChiTietPhieuNhap chiTietPhieuNhap){
        this.idPhieuNhap=chiTietPhieuNhap.idPhieuNhap;
        this.idSanPham=chiTietPhieuNhap.idSanPham;
        this.soLuong=chiTietPhieuNhap.soLuong;
        this.donGia=chiTietPhieuNhap.donGia;
        this.thanhTien=chiTietPhieuNhap.thanhTien;
    }
    public ChiTietPhieuNhap getChiTietPhieuNhap()
    {
        return this;
    }
}
