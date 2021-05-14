package com.minimart.Test;

import com.minimart.BUS.SanPhamBUS;
import java.sql.Timestamp;
import com.minimart.DTO.SanPham;
import java.util.Date;

public class Test {
    public static void main(String[] args){
        SanPhamBUS ct = new SanPhamBUS();
        Timestamp timestamp = new Timestamp(new Date().getTime());

        SanPham cthd1 = new SanPham("11","1","abc",2000,"dong",2,"dfgsagsd");
        SanPham cthd2 = new SanPham("12","2","abc",2000,"dong",2,"dfgsagsd");
        SanPham cthd3 = new SanPham("11","132","abc",4000,"ddong",65,"dfdsadaagsd");
        SanPham cthd4 = new SanPham("13","3","abc",2000,"dong",2,"dfgsagsd");
        SanPham cthd5 = new SanPham("14","4","abc",2000,"dong",2,"dfgsagsd");
        ct.addData(cthd1);
        ct.addData(cthd2);
        ct.addData(cthd4);
        ct.addData(cthd5);
        ct.removeData("12");
      //  ct.removeAll("4");
        ct.updateData(cthd3);
    }
}
