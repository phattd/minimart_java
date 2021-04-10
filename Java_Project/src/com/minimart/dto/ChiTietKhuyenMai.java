package com.minimart.dto;

public class ChiTietKhuyenMai {
    private String idKhuyenMai;
    private String tenKhuyenMai;
    private String idDotKhuyenMai;
    private byte phanTramKhuyenMai;
    private String noiDungKhuyenMai;
    private String idSanPham;

    public ChiTietKhuyenMai(){
        idKhuyenMai="";
        tenKhuyenMai="";
        idDotKhuyenMai="";
        phanTramKhuyenMai=0;
        noiDungKhuyenMai="";
        idSanPham="";
    }
    public ChiTietKhuyenMai(String idKhuyenMai,String tenKhuyenMai,String idDotKhuyenMai,byte phanTramKhuyenMai,String noiDungKhuyenMai,String idSanPham)
    {
        this.idKhuyenMai=idKhuyenMai;
        this.tenKhuyenMai=tenKhuyenMai;
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.phanTramKhuyenMai=phanTramKhuyenMai;
        this.noiDungKhuyenMai=noiDungKhuyenMai;
        this.idSanPham=idSanPham;
    }
    public ChiTietKhuyenMai(ChiTietKhuyenMai chiTietKhuyenMai)
    {
        this(chiTietKhuyenMai.idKhuyenMai, chiTietKhuyenMai.tenKhuyenMai, chiTietKhuyenMai.idDotKhuyenMai, chiTietKhuyenMai.phanTramKhuyenMai, chiTietKhuyenMai.noiDungKhuyenMai, chiTietKhuyenMai.idSanPham);
    }

    public String getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public String getIdDotKhuyenMai() {
        return idDotKhuyenMai;
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

    public void setIdDotKhuyenMai(String idDotKhuyenMai) {
        this.idDotKhuyenMai = idDotKhuyenMai;
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
        this.idDotKhuyenMai= chiTietKhuyenMai.idDotKhuyenMai;
        this.phanTramKhuyenMai= chiTietKhuyenMai.phanTramKhuyenMai;
        this.noiDungKhuyenMai= chiTietKhuyenMai.noiDungKhuyenMai;
        this.idSanPham= chiTietKhuyenMai.idSanPham;
    }
    public void setChiTietKhuyenMai(String idKhuyenMai,String tenKhuyenMai,String idDotKhuyenMai,byte phanTramKhuyenMai,String noiDungKhuyenMai,String idSanPham)
    {
        this.idKhuyenMai=idKhuyenMai;
        this.tenKhuyenMai=tenKhuyenMai;
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.phanTramKhuyenMai=phanTramKhuyenMai;
        this.noiDungKhuyenMai=noiDungKhuyenMai;
        this.idSanPham=idSanPham;
    }
    public ChiTietKhuyenMai getChiTietKhuyenMai()
    {
        return this;
    }
}
