package com.minimart.DTO;

public class LoaiSanPham {
    private String idLoaiSanPham;
    private String tenSanPham;
    public LoaiSanPham(){
        idLoaiSanPham=null;
        tenSanPham=null;
    }
    public LoaiSanPham(String idLoaiSanPham,String tenSanPham)
    {
        this.idLoaiSanPham=idLoaiSanPham;
        this.tenSanPham=tenSanPham;
    }
    public  LoaiSanPham(LoaiSanPham loaiSanPham)
    {
        this(loaiSanPham.idLoaiSanPham, loaiSanPham.tenSanPham);
    }

    public String getIdLoaiSanPham() {
        return idLoaiSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setIdLoaiSanPham(String idLoaiSanPham) {
        this.idLoaiSanPham = idLoaiSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }
    public void setLoaiSanPham(String idLoaiSanPham,String tenSanPham)
    {
        this.idLoaiSanPham=idLoaiSanPham;
        this.tenSanPham=tenSanPham;
    }
    public void setLoaiSanPham(LoaiSanPham loaiSanPham)
    {
        this.idLoaiSanPham=loaiSanPham.idLoaiSanPham;
        this.tenSanPham=loaiSanPham.tenSanPham;
    }
    public LoaiSanPham getLoaiSanPham()
    {
        return  this;
    }
    public Object[] toArray()
    {
        return new Object[] {idLoaiSanPham,tenSanPham};
    }
}
