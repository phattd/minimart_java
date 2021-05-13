package com.minimart.DTO;

public class LoaiSanPham {
    private String idLoaiSanPham;
    private String tenLoaiSanPham;
    public LoaiSanPham(){
        idLoaiSanPham=null;
        tenLoaiSanPham=null;
    }
    public LoaiSanPham(String idLoaiSanPham,String tenSanPham)
    {
        this.idLoaiSanPham=idLoaiSanPham;
        this.tenLoaiSanPham=tenSanPham;
    }
    public  LoaiSanPham(LoaiSanPham loaiSanPham)
    {
        this(loaiSanPham.idLoaiSanPham, loaiSanPham.tenLoaiSanPham);
    }

    public String getIdLoaiSanPham() {
        return idLoaiSanPham;
    }

    public String getTenLoaiSanPham() {
        return tenLoaiSanPham;
    }

    public void setIdLoaiSanPham(String idLoaiSanPham) {
        this.idLoaiSanPham = idLoaiSanPham;
    }

    public void setTenLoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }
    public void setLoaiSanPham(String idLoaiSanPham,String tenSanPham)
    {
        this.idLoaiSanPham=idLoaiSanPham;
        this.tenLoaiSanPham=tenSanPham;
    }
    public void setLoaiSanPham(LoaiSanPham loaiSanPham)
    {
        this.idLoaiSanPham=loaiSanPham.idLoaiSanPham;
        this.tenLoaiSanPham=loaiSanPham.tenLoaiSanPham;
    }
    public LoaiSanPham getLoaiSanPham()
    {
        return  this;
    }
    public Object[] toArray()
    {
        return new Object[] {idLoaiSanPham,tenLoaiSanPham};
    }
}
