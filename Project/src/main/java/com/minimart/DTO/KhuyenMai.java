package com.minimart.DTO;

import java.sql.Timestamp;



public class KhuyenMai {
            private String idKhuyenMai;
            private String tenKhuyenMai;
            private Timestamp  ngayBatDau;
            private Timestamp  ngayKetThuc;
            private String moTa;

            public KhuyenMai(String idKhuyenMai, String tenKhuyenMai, Timestamp ngayBatDau, Timestamp ngayKetThuc, String moTa){
                this.idKhuyenMai=null;
                this.tenKhuyenMai=null;
                this.ngayBatDau=null;
                this.ngayKetThuc=null;
                this.moTa = null;
            }


            public KhuyenMai(KhuyenMai KhuyenMai)
            {
                this(KhuyenMai.idKhuyenMai, KhuyenMai.tenKhuyenMai, KhuyenMai.ngayBatDau, KhuyenMai.ngayKetThuc , KhuyenMai.moTa);
            }

            public String getIdKhuyenMai() {
                return idKhuyenMai;
            }

            public String getTenKhuyenMai() {
                return tenKhuyenMai;
            }

            public Timestamp getNgayBatDau() {
                return ngayBatDau;
            }

            public Timestamp getNgayKetThuc() {
                return ngayKetThuc;
            }

            public void setIdKhuyenMai(String idKhuyenMai) {
                this.idKhuyenMai = idKhuyenMai;
            }

            public void setTenKhuyenMai(String tenKhuyenMai) {
                this.tenKhuyenMai = tenKhuyenMai;
            }

            public void setNgayBatDau(Timestamp ngayBatDau) {
                this.ngayBatDau = ngayBatDau;
            }

            public void setMoTa(String moTa) {
                this.moTa = moTa;
            }

            public String getMoTa() {
                return moTa;
            }

            public void setNgayKetThuc(Timestamp ngayKetThuc) {
                this.ngayKetThuc = ngayKetThuc;
            }
            public void setKhuyenMai(KhuyenMai khuyenMai)
            {
                this.idKhuyenMai= khuyenMai.idKhuyenMai;
                this.tenKhuyenMai= khuyenMai.tenKhuyenMai;
                this.ngayBatDau= khuyenMai.ngayBatDau;
                this.ngayKetThuc= khuyenMai.ngayKetThuc;
                this.moTa = khuyenMai.moTa;
            }
            public  void setKhuyenMai(String idKhuyenMai,String tenKhuyenMai,Timestamp ngayBatDau,Timestamp ngayKetThuc,String moTa)
            {
                this.idKhuyenMai=idKhuyenMai;
                this.tenKhuyenMai=tenKhuyenMai;
                this.ngayBatDau=ngayBatDau;
                this.ngayKetThuc=ngayKetThuc;
                this.moTa = moTa;
            }
            public KhuyenMai getKhuyenMai()
            {
                return this;
            }
            public Object[] toArray()
            {
                return new Object[] {idKhuyenMai,tenKhuyenMai,ngayBatDau,ngayKetThuc,moTa};
            }
            public static  String[] getHeader()
            {
                return new String[] {"Id Khuyến Mãi","Tên  Khuyến Mãi","Ngày Bắt Đầu","Ngày Kết Thúc","Mô Tả"};
            }
        }