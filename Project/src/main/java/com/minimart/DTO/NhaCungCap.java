package com.minimart.DTO;

public class NhaCungCap {
    private String idNhaCungCap;
    private String tenNhaCungCap;
    private String soDienThoaiNCC;
    private String diaChiNCC;
    public NhaCungCap(){
        this.idNhaCungCap=null;
        this.tenNhaCungCap=null;
        this.soDienThoaiNCC=null;
        this.diaChiNCC=null;
    }
    public NhaCungCap(String idNhaCungCap, String tenNhaCungCap, String soDienThoaiNCC, String diaChiNCC)
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

    public String getSoDienThoaiNCC() {
        return soDienThoaiNCC;
    }

    public String getDiaChiNCC() {
        return diaChiNCC;
    }

    public void setIdNhaCungCap(String idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public void setSoDienThoaiNCC(String soDienThoaiNCC) {
        this.soDienThoaiNCC = soDienThoaiNCC;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public void setDiaChiNCC(String diaChiNCC) {
        this.diaChiNCC = diaChiNCC;
    }
    public void setNhaCungCap(String idNhaCungCap,String tenNhaCungCap,String soDienThoaiNCC,String diaChiNCC)
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
    public Object[] toArray()
    {
        return new Object[] {idNhaCungCap,tenNhaCungCap,soDienThoaiNCC,diaChiNCC};
    }
}
