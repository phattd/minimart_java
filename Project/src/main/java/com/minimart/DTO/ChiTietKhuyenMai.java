package com.minimart.DTO;

public class ChiTietKhuyenMai {
    private String idKhuyenMai;
    private String idSanPham;
    private byte phanTramKhuyenMai;
    private int dieuKienSL;
    private String dieuKienKH;

    public ChiTietKhuyenMai(){
        idKhuyenMai=null;
        idSanPham = null;
        phanTramKhuyenMai=0;
        dieuKienSL = 0;
        dieuKienKH = null;
    }
    public ChiTietKhuyenMai(String idKhuyenMai,String idSanPham, byte phanTramKhuyenMai,int dieuKienSL, String dieuKienKH)
    {
        this.idKhuyenMai=idKhuyenMai;
        this.idSanPham=idSanPham;
        this.phanTramKhuyenMai=phanTramKhuyenMai;
        this.dieuKienSL = dieuKienSL;
        this.dieuKienKH=dieuKienKH;

    }
    public ChiTietKhuyenMai(ChiTietKhuyenMai chiTietKhuyenMai)
    {
        this(chiTietKhuyenMai.idKhuyenMai,chiTietKhuyenMai.idSanPham, chiTietKhuyenMai.phanTramKhuyenMai, chiTietKhuyenMai.dieuKienSL, chiTietKhuyenMai.dieuKienKH);
    }

    public String getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public byte getPhanTramKhuyenMai() {
        return phanTramKhuyenMai;
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

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public void setDieuKienKH(String dieuKienKH) {
        this.dieuKienKH = dieuKienKH;
    }

    public void setDieuKienSL(int dieuKienSL) {
        this.dieuKienSL = dieuKienSL;
    }

    public int getDieuKienSL() {
        return dieuKienSL;
    }

    public String getDieuKienKH() {
        return dieuKienKH;
    }

    public void setChiTietKhuyenMai(ChiTietKhuyenMai chiTietKhuyenMai)
    {
        this.idKhuyenMai= chiTietKhuyenMai.idKhuyenMai;
        this.idSanPham= chiTietKhuyenMai.idSanPham;
        this.phanTramKhuyenMai= chiTietKhuyenMai.phanTramKhuyenMai;
        this.dieuKienSL = chiTietKhuyenMai.dieuKienSL;
        this.dieuKienKH= chiTietKhuyenMai.dieuKienKH;

    }
    public void setChiTietKhuyenMai(String idKhuyenMai,String idSanPham, byte phanTramKhuyenMai,int dieuKienSL, String dieuKienKH)
    {
        this.idKhuyenMai=idKhuyenMai;
        this.idSanPham=idSanPham;
        this.phanTramKhuyenMai=phanTramKhuyenMai;
        this.dieuKienSL = dieuKienSL;
        this.dieuKienKH=dieuKienKH;

    }
    public ChiTietKhuyenMai getChiTietKhuyenMai()
    {
        return this;
    }

    public Object[] toArray()
    {
        return new Object[] {idKhuyenMai, idSanPham, phanTramKhuyenMai, dieuKienSL, dieuKienKH};
    }
    public static String[] getHeader()
    {
        return new String[] {"Id Khuyến Mãi","Id Sản Phẩm","Phần Trăm Khuyến Mãi", "Điều Kiện Số Lượng","Điều Kiện Khách Hàng"};
    }
}