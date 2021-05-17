package com.minimart.DTO;

public class KhuyenMai {
    private String idKhuyenMai;
    private String tenKhuyenMai;
    private  String idDotKhuyenMai;
    private String moTaKhuyenMai;

    public KhuyenMai()
    {
        idKhuyenMai=null;
        tenKhuyenMai = null;
        idDotKhuyenMai=null;
        moTaKhuyenMai=null;
    }
    public KhuyenMai(String idKhuyenMai,String tenKhuyenMai, String idDotKhuyenMai,String moTaKhuyenMai)
    {
        this.idKhuyenMai=idKhuyenMai;
        this.tenKhuyenMai = tenKhuyenMai;
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.moTaKhuyenMai=moTaKhuyenMai;
    }

    public  KhuyenMai(KhuyenMai khuyenMai)
    {
        this(khuyenMai.idKhuyenMai,khuyenMai.tenKhuyenMai, khuyenMai.idDotKhuyenMai, khuyenMai.moTaKhuyenMai);
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

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
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

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setKhuyenMai(String idKhuyenMai,String tenKhuyenMai, String idDotKhuyenMai, String moTaKhuyenMai)
    {
        this.idKhuyenMai=idKhuyenMai;
        this.tenKhuyenMai = tenKhuyenMai;
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.moTaKhuyenMai=moTaKhuyenMai;
    }
    public KhuyenMai getKhuyenMai()
    {
        return this;
    }

    public Object[] toArray()
    {
        return new Object[] {idKhuyenMai,tenKhuyenMai,idDotKhuyenMai,moTaKhuyenMai};
    }
    public static String[] getHeader()
    {
        return new String[] {"Id Khuyến Mãi", "Tên Khuyến Mãi", "Id Đợt Khuyến Mãi", "Mô Tả Khuyến Mãi"};
    }
}
