package com.minimart.dto;

public class ChiTietKhuyenMai {
    private String idKhuyenMai;
    private String tenKhuyenMai;
    private byte phanTramKhuyenMai;
    private String noiDungKhuyenMai;
    private String idSanPham;

    public ChiTietKhuyenMai(){
        idKhuyenMai=null;
        tenKhuyenMai=null;
        phanTramKhuyenMai=0;
        noiDungKhuyenMai=null;
        idSanPham=null;
    }
    public ChiTietKhuyenMai(String idKhuyenMai,String tenKhuyenMai,byte phanTramKhuyenMai,String noiDungKhuyenMai,String idSanPham)
    {
        this.idKhuyenMai=idKhuyenMai;
        this.tenKhuyenMai=tenKhuyenMai;
        this.phanTramKhuyenMai=phanTramKhuyenMai;
        this.noiDungKhuyenMai=noiDungKhuyenMai;
        this.idSanPham=idSanPham;
    }
    public ChiTietKhuyenMai(ChiTietKhuyenMai chiTietKhuyenMai)
    {
        this(chiTietKhuyenMai.idKhuyenMai, chiTietKhuyenMai.tenKhuyenMai, chiTietKhuyenMai.phanTramKhuyenMai, chiTietKhuyenMai.noiDungKhuyenMai, chiTietKhuyenMai.idSanPham);
    }

    public String getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }


    public byte getPhanTramKhuyenMai() {
        return phanTramKhuyenMai;
    }

    public String getNoiDungKhuyenMai() {
        return noiDungKhuyenMai;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdKhuyenMai(String idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }



    public void setPhanTramKhuyenMai(byte phanTramKhuyenMai) {
        this.phanTramKhuyenMai = phanTramKhuyenMai;
    }

    public void setNoiDungKhuyenMai(String noiDungKhuyenMai) {
        this.noiDungKhuyenMai = noiDungKhuyenMai;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }
    public void setChiTietKhuyenMai(ChiTietKhuyenMai chiTietKhuyenMai)
    {
        this.idKhuyenMai= chiTietKhuyenMai.idKhuyenMai;
        this.tenKhuyenMai= chiTietKhuyenMai.tenKhuyenMai;
        this.phanTramKhuyenMai= chiTietKhuyenMai.phanTramKhuyenMai;
        this.noiDungKhuyenMai= chiTietKhuyenMai.noiDungKhuyenMai;
        this.idSanPham= chiTietKhuyenMai.idSanPham;
    }
    public void setChiTietKhuyenMai(String idKhuyenMai,String tenKhuyenMai,byte phanTramKhuyenMai,String noiDungKhuyenMai,String idSanPham)
    {
        this.idKhuyenMai=idKhuyenMai;
        this.tenKhuyenMai=tenKhuyenMai;
        this.phanTramKhuyenMai=phanTramKhuyenMai;
        this.noiDungKhuyenMai=noiDungKhuyenMai;
        this.idSanPham=idSanPham;
    }
    public ChiTietKhuyenMai getChiTietKhuyenMai()
    {
        return this;
    }


    @Override
    public String toString() {
        return "ChiTietKhuyenMai{" +
                "idKhuyenMai='" + idKhuyenMai + '\'' +
                ", tenKhuyenMai='" + tenKhuyenMai + '\'' +
                ", phanTramKhuyenMai=" + phanTramKhuyenMai +
                ", noiDungKhuyenMai='" + noiDungKhuyenMai + '\'' +
                ", idSanPham='" + idSanPham + '\'' +
                '}';
    }
}
