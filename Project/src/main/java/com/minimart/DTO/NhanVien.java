package com.minimart.DTO;



public class NhanVien {
    private String idNhanVien;
    private String ho;
    private String  ten;
    private String diaChi;
    private String gioiTinh;
    private String soDienThoai;
    private String password;
    private int luong;
    private String idChucVu;


    public NhanVien()
    {
        this.idNhanVien=null;
        this.ho=null;
        this.ten=null;
        this.diaChi=null;
        this.gioiTinh = null;
        this.soDienThoai=null;
        this.password=null;
        this.luong=0;
        this.idChucVu=null;

    }
    public NhanVien(String idNhanVien, String ho, String ten, String diaChi, String gioiTinh, String soDienThoai, String password, int luong, String idChucVu)
    {
        this.idNhanVien=idNhanVien;
        this.ho=ho;
        this.ten=ten;
        this.diaChi=diaChi;
        this.gioiTinh=gioiTinh;
        this.soDienThoai=soDienThoai;
        this.password=password;
        this.luong=luong;
        this.idChucVu=idChucVu;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getLuong() {
        return luong;
    }

    public String getIdChucVu() {
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

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }



    public void setIdChucVu(String idChucVu) {
        this.idChucVu = idChucVu;
    }
    public  void setNhanVien(String idNhanVien, String ho, String ten, String diaChi, String ngaySinh, String soDienThoai, String password, int luong, String idChucVu, String hinhAnh)
    {
        this.idNhanVien=idNhanVien;
        this.ho=ho;
        this.ten=ten;
        this.diaChi=diaChi;
        this.soDienThoai=soDienThoai;
        this.password=password;
        this.luong=luong;
        this.idChucVu=idChucVu;

    }
    public  void setNhanVien(NhanVien nhanVien)
    {
        this.idNhanVien=nhanVien.idNhanVien;
        this.ho=nhanVien.ho;
        this.ten=nhanVien.ten;
        this.diaChi=nhanVien.diaChi;
        this.gioiTinh= gioiTinh;
        this.soDienThoai=nhanVien.soDienThoai;
        this.password=nhanVien.password;
        this.luong=nhanVien.luong;
        this.idChucVu=nhanVien.idChucVu;

    }
    public NhanVien getNhanVien()
    {
        return this;
    }
    public  Object[] toArray()
    {
        return new Object[] {idNhanVien,ho,ten,diaChi,gioiTinh,soDienThoai,password,luong,idChucVu};
    }
    public static String[] getHeader()
    {
        return new String[] {"Id Nhân Viên","Họ","Tên","Địa Chỉ","Giới Tính","Số Điện Thoại","Password","Lương","Id Chức Vụ","Hình Ảnh"};
    }
}
