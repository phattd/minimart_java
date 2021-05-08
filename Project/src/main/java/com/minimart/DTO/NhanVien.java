package com.minimart.DTO;

import java.time.LocalDate;
import java.util.Date;

public class NhanVien {
    private String idNhanVien;
    private String ho;
    private String  ten;
    private String diaChi;
    private Date ngaySinh;
    private String soDienThoai;
    private String password;
    private int luong;
    private String idChucVu;
    private String hinhAnh;

    public NhanVien()
    {
        this.idNhanVien=null;
        this.ho=null;
        this.ten=null;
        this.diaChi=null;
        this.ngaySinh = null;
        this.soDienThoai=null;
        this.password=null;
        this.luong=0;
        this.idChucVu=null;
        this.hinhAnh=null;
    }
    public NhanVien(String idNhanVien, String ho, String ten, String diaChi, Date ngaySinh, String soDienThoai, String password, int luong, String idChucVu,String hinhAnh)
    {
        this.idNhanVien=idNhanVien;
        this.ho=ho;
        this.ten=ten;
        this.diaChi=diaChi;
        this.ngaySinh = ngaySinh;
        this.soDienThoai=soDienThoai;
        this.password=password;
        this.luong=luong;
        this.idChucVu=idChucVu;
        this.hinhAnh=hinhAnh;
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

    public String getSoDienThoai() {
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

    public String getIdChucVu() {
        return idChucVu;
    }

    public Date getNgaySinh() {
        return ngaySinh;
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

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setIdChucVu(String idChucVu) {
        this.idChucVu = idChucVu;
    }
    public  void setNhanVien(String idNhanVien, String ho, String ten, String diaChi, Date ngaySinh, String soDienThoai, String password, int luong, String idChucVu, String hinhAnh)
    {
        this.idNhanVien=idNhanVien;
        this.ho=ho;
        this.ten=ten;
        this.diaChi=diaChi;
        this.ngaySinh = ngaySinh;
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
        this.ngaySinh = ngaySinh;
        this.soDienThoai=nhanVien.soDienThoai;
        this.password=nhanVien.password;
        this.luong=nhanVien.luong;
        this.idChucVu=nhanVien.idChucVu;
        this.hinhAnh=nhanVien.hinhAnh;
    }
    public NhanVien getNhanVien()
    {
        return this;
    }
    public  Object[] toArray()
    {
        return new Object[] {idNhanVien,ho,ten,diaChi,ngaySinh,soDienThoai,password,luong,idChucVu,hinhAnh};
    }
    public static String[] getHeader()
    {
        return new String[] {"Id Nhân Viên","Họ","Tên","Địa Chỉ","Ngày Sinh","Số Điện Thoại","Password","Lương","Id Chức Vụ","Hình Ảnh"};
    }
}
