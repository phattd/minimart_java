package com.minimart.DTO;

import java.util.Date;

public class DotKhuyenMai {
    private String idDotKhuyenMai;
    private String tenDotKhuyeMai;
    private Date  ngayBatDau;
    private Date    ngayKetThuc;

    public DotKhuyenMai(){
        this.idDotKhuyenMai=null;
        this.tenDotKhuyeMai=null;
        this.ngayBatDau=null;
        this.ngayKetThuc=null;
    }
    public DotKhuyenMai(String idDotKhuyenMai, String tenDotKhuyeMai, Date ngayBatDau, Date ngayKetThuc)
    {
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.tenDotKhuyeMai=tenDotKhuyeMai;
        this.ngayBatDau=ngayBatDau;
        this.ngayKetThuc=ngayKetThuc;
    }

    public DotKhuyenMai(DotKhuyenMai dotKhuyenMai)
    {
        this(dotKhuyenMai.idDotKhuyenMai, dotKhuyenMai.tenDotKhuyeMai, dotKhuyenMai.ngayBatDau, dotKhuyenMai.ngayKetThuc);
    }

    public String getIdDotKhuyenMai() {
        return idDotKhuyenMai;
    }

    public String getTenDotKhuyenMai() {
        return tenDotKhuyeMai;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setIdDotKhuyenMai(String idDotKhuyenMai) {
        this.idDotKhuyenMai = idDotKhuyenMai;
    }

    public void setTenDotKhuyeMai(String tenDotKhuyeMai) {
        this.tenDotKhuyeMai = tenDotKhuyeMai;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    public void setKhuyenMai(DotKhuyenMai dotKhuyenMai)
    {
        this.idDotKhuyenMai= dotKhuyenMai.idDotKhuyenMai;
        this.tenDotKhuyeMai= dotKhuyenMai.tenDotKhuyeMai;
        this.ngayBatDau= dotKhuyenMai.ngayBatDau;
        this.ngayKetThuc= dotKhuyenMai.ngayKetThuc;
    }
    public  void setKhuyenMai(String idDotKhuyenMai,String tenDotKhuyeMai,Date ngayBatDau,Date ngayKetThuc)
    {
        this.idDotKhuyenMai=idDotKhuyenMai;
        this.tenDotKhuyeMai=tenDotKhuyeMai;
        this.ngayBatDau=ngayBatDau;
        this.ngayKetThuc=ngayKetThuc;
    }
    public DotKhuyenMai getKhuyenMai()
    {
        return this;
    }
    public Object[] toArray()
    {
        return new Object[] {idDotKhuyenMai,tenDotKhuyeMai,ngayBatDau,ngayKetThuc};
    }
    public static  String[] getHeader()
    {
        return new String[] {"Id Đợt Khuyến Mãi","Tên Đợt Khuyến Mãi","Ngày Bắt Đầu","Ngày Kết Thúc"};
    }
}
