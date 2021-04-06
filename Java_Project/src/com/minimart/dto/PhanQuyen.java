package com.minimart.dto;

public class PhanQuyen {
    private String idQuyen;
    private String tenQuyen;
    public PhanQuyen(){}
    public PhanQuyen(String idQuyen,String tenQuyen)
    {
        this.idQuyen=idQuyen;
        this.tenQuyen=tenQuyen;
    }
    public  PhanQuyen(PhanQuyen phanQuyen)
    {
        this(phanQuyen.idQuyen, phanQuyen.tenQuyen);
    }

    public String getIdQuyen() {
        return idQuyen;
    }

    public String getTenQuyen() {
        return tenQuyen;
    }

    public void setIdQuyen(String idQuyen) {
        this.idQuyen = idQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        this.tenQuyen = tenQuyen;
    }
    public  void setPhanQuyen(String idQuyen,String tenQuyen)
    {
        this.idQuyen=idQuyen;
        this.tenQuyen=tenQuyen;
    }
    public  void setPhanQuyen(PhanQuyen phanQuyen)
    {
        this.idQuyen=phanQuyen.idQuyen;
        this.tenQuyen=phanQuyen.tenQuyen;
    }
    public PhanQuyen getPhanQuyen()
    {
        return this;
    }
}
