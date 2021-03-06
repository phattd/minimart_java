package com.minimart.DTO;

public class SanPham {
    private String idSanPham;
    private String tenSanPham;
    private String idLoaiSanPham;
    private int donGia;
    private String donViTinh;
    private int soLuong;



    public SanPham(String idSanPham,String tenSanPham,String idLoaiSanPham,int donGia,String donViTinh, int soLuong)
    {
        this.idSanPham=idSanPham;
        this.tenSanPham=tenSanPham;
        this.idLoaiSanPham=idLoaiSanPham;
        this.donGia=donGia;
        this.donViTinh=donViTinh;
        this.soLuong=soLuong;

    }
    public SanPham(SanPham sanPham)
    {
        this(sanPham.idSanPham, sanPham.tenSanPham, sanPham.idLoaiSanPham, sanPham.donGia,sanPham.donViTinh, sanPham.soLuong);
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





    public void setSanPham(String idSanPham, String tenSanPham, String idLoaiSanPham, int donGia, String donViTinh, int soLuong)
    {
        this.idSanPham=idSanPham;
        this.tenSanPham=tenSanPham;
        this.idLoaiSanPham=idLoaiSanPham;
        this.donGia=donGia;
        this.donViTinh=donViTinh;
        this.soLuong=soLuong;
    }
    public void setSanPham(SanPham sanPham)
    {
        this.idSanPham=sanPham.idSanPham;
        this.tenSanPham=sanPham.tenSanPham;
        this.idLoaiSanPham=sanPham.idLoaiSanPham;
        this.donGia=sanPham.donGia;
        this.donViTinh=sanPham.donViTinh;
        this.soLuong=sanPham.soLuong;
    }
    public SanPham getSanPham()
    {
        return this;
    }
    public Object[] toArray()
    {
        return new Object[] {idSanPham,tenSanPham,idLoaiSanPham,donGia,donViTinh,soLuong};
    }
    public static String[] getHeader()
    {
        return new String[] {"ID S???n Ph???m","T??n S???n Ph???m", "Id Lo???i S???n Ph???m","????n Gi??","????n V??? T??nh","S??? L?????ng"};
    }
}
