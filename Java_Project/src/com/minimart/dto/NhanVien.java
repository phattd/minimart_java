package com.minimart.dto;

public class NhanVien {
    private String idNhanVien;
    private String ho;
    private String  ten;
    private String diaChi;
    private int soDienThoai;
    private String password;
    private int luong;
    private int idChucVu;
    private String hinhAnh;

    public NhanVien()
    {
    }
    public NhanVien(String idNhanVien, String ho, String ten, String diaChi, int soDienThoai, String password, int luong, int idChucVu,String hinhAnh)
    {
        this.idNhanVien=idNhanVien;
        this.ho=ho;
        this.ten=ten;
        this.diaChi=diaChi;
        this.soDienThoai=soDienThoai;
        this.password=password;
        this.luong=luong;
        this.idChucVu=idChucVu;
        this.hinhAnh=hinhAnh;
    }
    public NhanVien(NhanVien nhanVien)
    {
        this(nhanVien.idNhanVien, nhanVien.ho, nhanVien.ten, nhanVien.diaChi, nhanVien.soDienThoai, nhanVien.password, nhanVien.luong, nhanVien.idChucVu, nhanVien.hinhAnh);
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public String getPassword() {
        return password;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getLuong() {
        return luong;
    }

    public int getIdChucVu() {
        return idChucVu;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setIdChucVu(int idChucVu) {
        this.idChucVu = idChucVu;
    }
    public  void setNhanVien(String idNhanVien,String ho,String ten,String diaChi,int soDienThoai,String password,int luong,int idChucVu,String hinhAnh)
    {
        this.idNhanVien=idNhanVien;
        this.ho=ho;
        this.ten=ten;
        this.diaChi=diaChi;
        this.soDienThoai=soDienThoai;
        this.password=password;
        this.luong=luong;
        this.idChucVu=idChucVu;
        this.hinhAnh=hinhAnh;
    }
    public  void setNhanVien(NhanVien nhanVien)
    {
        this.idNhanVien=nhanVien.idNhanVien;
        this.ho=nhanVien.ho;
        this.ten=nhanVien.ten;
        this.diaChi=nhanVien.diaChi;
        this.soDienThoai=nhanVien.soDienThoai;
        this.password=nhanVien.password;
        this.luong=nhanVien.luong;
        this.idChucVu=nhanVien.idChucVu;
        this.hinhAnh=hinhAnh;
    }
    public NhanVien getNhanVien()
    {
        return this;
    }
}
