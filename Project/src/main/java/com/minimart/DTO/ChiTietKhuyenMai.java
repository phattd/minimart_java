package com.minimart.DTO;

public class ChiTietKhuyenMai {
    private String idKhuyenMai;
    private byte phanTramKhuyenMai;
    private String noiDungKhuyenMai;
    private String idSanPham;

    public ChiTietKhuyenMai(){
        idKhuyenMai=null;
        phanTramKhuyenMai=0;
        noiDungKhuyenMai=null;
        idSanPham=null;
    }
    public ChiTietKhuyenMai(String idKhuyenMai,byte phanTramKhuyenMai,String noiDungKhuyenMai,String idSanPham)
    {
        this.idKhuyenMai=idKhuyenMai;
        this.phanTramKhuyenMai=phanTramKhuyenMai;
        this.noiDungKhuyenMai=noiDungKhuyenMai;
        this.idSanPham=idSanPham;
    }
    public ChiTietKhuyenMai(ChiTietKhuyenMai chiTietKhuyenMai)
    {
        this(chiTietKhuyenMai.idKhuyenMai, chiTietKhuyenMai.phanTramKhuyenMai, chiTietKhuyenMai.noiDungKhuyenMai, chiTietKhuyenMai.idSanPham);
    }

    public String getIdKhuyenMai() {
        return idKhuyenMai;
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
        this.phanTramKhuyenMai= chiTietKhuyenMai.phanTramKhuyenMai;
        this.noiDungKhuyenMai= chiTietKhuyenMai.noiDungKhuyenMai;
        this.idSanPham= chiTietKhuyenMai.idSanPham;
    }
    public void setChiTietKhuyenMai(String idKhuyenMai,byte phanTramKhuyenMai,String noiDungKhuyenMai,String idSanPham)
    {
        this.idKhuyenMai=idKhuyenMai;
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
                ", phanTramKhuyenMai=" + phanTramKhuyenMai +
                ", noiDungKhuyenMai='" + noiDungKhuyenMai + '\'' +
                ", idSanPham='" + idSanPham + '\'' +
                '}';
    }

    public Object[] toArray()
    {
        return new Object[] {idKhuyenMai,phanTramKhuyenMai,noiDungKhuyenMai,idSanPham};
    }
    public static String[] getHeader()
    {
        return new String[] {"Id Khuyến Mãi","Phần Trăm Khuyến Mãi","Nội Dung Khuyến Mãi","Id Sản Phẩm"};
    }
}
