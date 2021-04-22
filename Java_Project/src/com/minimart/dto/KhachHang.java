package com.minimart.dto;

public class KhachHang {
    private String idKhachHang;
    private String hoKhachHang;
    private String tenKhachHang;
    private BacTichLuy bacTichLuy;
    private int diemTichLuy;
    public KhachHang(String idKhachHang, String tenKhachHang, String hoKhachHang, String bacTichLuy, int trangthai)
    {
        this.idKhachHang=null;
        this.hoKhachHang=null;
        this.tenKhachHang=null;
        this.bacTichLuy=BacTichLuy.Normal;
        this.diemTichLuy=0;
    }
    public KhachHang(String idKhachHang,String hoKhachHang,String tenKhachHang, BacTichLuy bacTichLuy,int diemTichLuy)
    {
        this.idKhachHang=idKhachHang;
        this.hoKhachHang=hoKhachHang;
        this.tenKhachHang=tenKhachHang;
        this.bacTichLuy=bacTichLuy;
        this.diemTichLuy=diemTichLuy;
    }
    public KhachHang(KhachHang khachHang)
    {
        this(khachHang.idKhachHang, khachHang.hoKhachHang, khachHang.tenKhachHang, khachHang.bacTichLuy, khachHang.diemTichLuy);
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public String getHoKhachHang() {
        return hoKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public BacTichLuy getBacTichLuy() {
        return bacTichLuy;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public void setHoKhachHang(String hoKhachHang) {
        this.hoKhachHang = hoKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setBacTichLuy(BacTichLuy bacTichLuy) {
        this.bacTichLuy = bacTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }
    public void setKhachHang(String idKhachHang,String hoKhachHang,String tenKhachHang, BacTichLuy bacTichLuy,int diemTichLuy)
    {
        this.idKhachHang=idKhachHang;
        this.hoKhachHang=hoKhachHang;
        this.tenKhachHang=tenKhachHang;
        this.bacTichLuy=bacTichLuy;
        this.diemTichLuy=diemTichLuy;
    }
    public void setKhachHang(KhachHang khachHang)
    {
        this.idKhachHang=khachHang.idKhachHang;
        this.hoKhachHang=khachHang.hoKhachHang;
        this.tenKhachHang=khachHang.tenKhachHang;
        this.bacTichLuy=khachHang.bacTichLuy;
        this.diemTichLuy=khachHang.diemTichLuy;
    }
    public KhachHang getKhachHang()
    {
        return this;
    }
}
