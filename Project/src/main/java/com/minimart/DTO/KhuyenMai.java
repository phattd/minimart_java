package com.minimart.DTO;

public class KhuyenMai {
    private String idKhuyenMai;
    private  String idDotKhuyenMai;
    private String moTaKhuyenMai;

    public KhuyenMai()
    {
        idDotKhuyenMai=null;
        idKhuyenMai=null;
        moTaKhuyenMai=null;
    }
    public KhuyenMai(String idDotKhuyenMai,String idKhuyenMai,String moTaKhuyenMai)
    {
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.idKhuyenMai=idKhuyenMai;
        this.moTaKhuyenMai=moTaKhuyenMai;
    }

    public  KhuyenMai(KhuyenMai khuyenMai)
    {
        this(khuyenMai.idDotKhuyenMai, khuyenMai.idKhuyenMai, khuyenMai.moTaKhuyenMai);
    }

    public void setIdDotKhuyenMai(String idDotKhuyenMai) {
        this.idDotKhuyenMai = idDotKhuyenMai;
    }

    public void setIdKhuyenMai(String idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public void setMoTaKhuyenMai(String moTaKhuyenMai) {
        this.moTaKhuyenMai = moTaKhuyenMai;
    }

    public String getIdDotKhuyenMai() {
        return idDotKhuyenMai;
    }

    public String getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public String getMoTaKhuyenMai() {
        return moTaKhuyenMai;
    }
    public void setKhuyenMai(String idDotKhuyenMai,String idKhuyenMai,String moTaKhuyenMai)
    {
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.idKhuyenMai=idKhuyenMai;
        this.moTaKhuyenMai=moTaKhuyenMai;
    }
    public KhuyenMai getKhuyenMai()
    {
        return this;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" +
                "idDotKhuyenMai='" + idDotKhuyenMai + '\'' +
                ", idKhuyenMai='" + idKhuyenMai + '\'' +
                ", moTaKhuyenMai='" + moTaKhuyenMai + '\'' +
                '}';
    }
}
