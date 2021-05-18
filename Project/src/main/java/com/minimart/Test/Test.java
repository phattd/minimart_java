package com.minimart.Test;

import com.minimart.BUS.SanPhamBUS;
import java.sql.Timestamp;
import com.minimart.DTO.SanPham;
import java.util.Date;

public class Test {
    public static void main(String[] args){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            System.out.println(("edgrg"+timestamp.getTime()).hashCode());
        }
}
