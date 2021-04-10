package com.minimart.dto;

public class NhaCungCap {
    private String idNhaCungCap;
    private String tenNhaCungCap;
    private int soDienThoaiNCC;
    private String diaChiNCC;
    public NhaCungCap(){
        this.idNhaCungCap="";
        this.tenNhaCungCap="";
        this.soDienThoaiNCC=0;
        this.diaChiNCC="";
    }
    public NhaCungCap(String idNhaCungCap,String tenNhaCungCap,int soDienThoaiNCC,String diaChiNCC)
    {
        this.idNhaCungCap=idNhaCungCap;
        this.tenNhaCungCap=tenNhaCungCap;
        this.soDienThoaiNCC=soDienThoaiNCC;
        this.diaChiNCC=diaChiNCC;
    }
    public NhaCungCap(NhaCungCap nhaCungCap)
    {
        this(nhaCungCap.idNhaCungCap, nhaCungCap.tenNhaCungCap, nhaCungCap.soDienThoaiNCC, nhaCungCap.diaChiNCC);
    }

    public String getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public int getSoDienThoaiNCC() {
        return soDienThoaiNCC;
    }

    public String getDiaChiNCC() {
        return diaChiNCC;
    }

    public void setIdNhaCungCap(String idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public void setSoDienThoaiNCC(int soDienThoaiNCC) {
        this.soDienThoaiNCC = soDienThoaiNCC;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public void setDiaChiNCC(String diaChiNCC) {
        this.diaChiNCC = diaChiNCC;
    }
    public void setNhaCungCap(String idNhaCungCap,String tenNhaCungCap,int soDienThoaiNCC,String diaChiNCC)
    {
        this.idNhaCungCap=idNhaCungCap;
        this.tenNhaCungCap=tenNhaCungCap;
        this.soDienThoaiNCC=soDienThoaiNCC;
        this.diaChiNCC=diaChiNCC;
    }
    public void setNhaCungCap(NhaCungCap nhaCungCap)
    {
        this.idNhaCungCap=nhaCungCap.idNhaCungCap;
        this.tenNhaCungCap=nhaCungCap.tenNhaCungCap;
        this.soDienThoaiNCC=nhaCungCap.soDienThoaiNCC;
        this.diaChiNCC=nhaCungCap.diaChiNCC;
    }
    public NhaCungCap getNhaCungCap()
    {
        return this;
    }
}
