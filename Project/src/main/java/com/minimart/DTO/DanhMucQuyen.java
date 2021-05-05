package com.minimart.DTO;

public class DanhMucQuyen {
    private String idChucVu;
    private String idQuyen;
    public DanhMucQuyen(){
        idChucVu=null;
        idQuyen=null;
    }
    public DanhMucQuyen(String idChucVu,String idQuyen)
    {
        this.idChucVu=idChucVu;
        this.idQuyen=idQuyen;
    }
    public  DanhMucQuyen(DanhMucQuyen danhMucQuyen)
    {
        this(danhMucQuyen.idChucVu, danhMucQuyen.idQuyen);
    }

    public String getIdChucVu() {
        return idChucVu;
    }

    public String getIdQuyen() {
        return idQuyen;
    }

    public void setIdChucVu(String idChucVu) {
        this.idChucVu = idChucVu;
    }

    public void setIdQuyen(String idQuyen) {
        this.idQuyen = idQuyen;
    }
    public void setDanhMucQuyen(String idChucVu,String idQuyen)
    {
        this.idChucVu=idChucVu;
        this.idQuyen=idQuyen;
    }
    public void setDanhMucQuyen(DanhMucQuyen danhMucQuyen)
    {
        this.idChucVu=danhMucQuyen.idChucVu;
        this.idQuyen=danhMucQuyen.idQuyen;
    }
    public DanhMucQuyen getDanhMucQuyen()
    {
        return  this;

    }
}
