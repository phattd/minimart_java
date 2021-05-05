package com.minimart.DTO;

public class SanPham {
    private String idSanPham;
    private String tenSanPham;
    private String idLoaiSanPham;
    private int donGia;
    private String donViTinh;
    private int soLuong;
    private String hinhAnh;

    public SanPham(String idSanPham, String idLoaiSanPham, String tenSanPham, int donGia, int soLuong, String hinhAnh){
        this.idSanPham=null;
        this.tenSanPham=null;
        this.idLoaiSanPham=null;
        this.donGia=0;
        this.donViTinh=null;
        this.soLuong=0;
        this.hinhAnh=null;
    }
    public SanPham(String idSanPham,String tenSanPham,String idLoaiSanPham,int donGia,String donViTinh, int soLuong,String hinhAnh)
    {
        this.idSanPham=idSanPham;
        this.tenSanPham=tenSanPham;
        this.idLoaiSanPham=idLoaiSanPham;
        this.donGia=donGia;
        this.donViTinh=donViTinh;
        this.soLuong=soLuong;
        this.hinhAnh=hinhAnh;
    }
    public SanPham(SanPham sanPham)
    {
        this(sanPham.idSanPham, sanPham.tenSanPham, sanPham.idLoaiSanPham, sanPham.donGia,sanPham.donViTinh, sanPham.soLuong, sanPham.hinhAnh);
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getIdLoaiSanPham() {
        return idLoaiSanPham;
    }

    public int getDonGia() {
        return donGia;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setIdLoaiSanPham(String idLoaiSanPham) {
        this.idLoaiSanPham = idLoaiSanPham;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public void setSanPham(String idSanPham, String tenSanPham, String idLoaiSanPham, int donGia, String donViTinh, int soLuong, String hinhAnh)
    {
        this.idSanPham=idSanPham;
        this.tenSanPham=tenSanPham;
        this.idLoaiSanPham=idLoaiSanPham;
        this.donGia=donGia;
        this.donViTinh=donViTinh;
        this.soLuong=soLuong;
        this.hinhAnh=hinhAnh;
    }
    public void setSanPham(SanPham sanPham)
    {
        this.idSanPham=sanPham.idSanPham;
        this.tenSanPham=sanPham.tenSanPham;
        this.idLoaiSanPham=sanPham.idLoaiSanPham;
        this.donGia=sanPham.donGia;
        this.donViTinh=sanPham.donViTinh;
        this.soLuong=sanPham.soLuong;
        this.hinhAnh=sanPham.hinhAnh;
    }
    public SanPham getSanPham()
    {
        return this;
    }
    public Object[] toArray()
    {
        return new Object[] {idLoaiSanPham,tenSanPham,idLoaiSanPham,donGia,donViTinh,soLuong,hinhAnh};
    }
}
