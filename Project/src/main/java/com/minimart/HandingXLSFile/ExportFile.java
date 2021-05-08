package com.minimart.HandingXLSFile;

import com.minimart.DTO.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class ExportFile {
    public ExportFile(){}
    public void writeFile(ArrayList<Object[]> data, String fileName,String sheetName) throws IOException {
        String fullName=fileName+".xls";
        String path="./exports/"+fullName;
        File file=new File(path);
        FileOutputStream outputStream=new FileOutputStream(file);
        Workbook workbook=new HSSFWorkbook();
        Sheet sheet= workbook.createSheet(sheetName);
        int numRow=0;

        for (Object[] index : data)
        {
            Row row= sheet.createRow(numRow++);
            int cellNum=0;
            for (Object obj : index)
            {
                Cell cell= row.createCell(cellNum++);
                if(obj instanceof String)
                    cell.setCellValue((String) obj);
                else if(obj instanceof Double)
                    cell.setCellValue((Double)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
        if(!Desktop.isDesktopSupported())
        {
            JOptionPane.showMessageDialog(null,"Not support on this device");
            return;
        }
        Desktop desktop=Desktop.getDesktop();
        if(file.exists())
        {
            desktop.open(file);

        }
    }
    public  void exportSanPham(String[] header, ArrayList<SanPham> data)
    {
        ArrayList<Object[]> result=new ArrayList<>();
        result.add(header);

        for (int index=0;index<data.size();index++)
        {
            result.add(data.get(index).toArray());
        }
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String nameFile="SPEF"+timestamp;
        try {
            writeFile(result,nameFile,"San Pham");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void exportNhanVien(String[] header, ArrayList<NhanVien> data)
    {
        ArrayList<Object[]> result=new ArrayList<>();
        result.add(header);

        for (int index=0;index<data.size();index++)
        {
            result.add(data.get(index).toArray());
        }
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String nameFile="NVEF"+timestamp;
        try {
            writeFile(result,nameFile,"Nhan Vien");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void exportKhachHang(String[] header, ArrayList<KhachHang> data)
    {
        ArrayList<Object[]> result=new ArrayList<>();
        result.add(header);

        for (int index=0;index<data.size();index++)
        {
            result.add(data.get(index).toArray());
        }
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String nameFile="KHEF"+timestamp;
        try {
            writeFile(result,nameFile, "Khach Hang");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void exportChucVu(String[] header, ArrayList<ChucVu> data)
    {
        ArrayList<Object[]> result=new ArrayList<>();
        result.add(header);

        for (int index=0;index<data.size();index++)
        {
            result.add(data.get(index).toArray());
        }
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long time=timestamp.getTime();
        String nameFile="CVEF"+time;
        try {
            writeFile(result,nameFile, "Chuc Vu");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void exportLoaiSanPham(String[] header, ArrayList<LoaiSanPham> data)
    {
        ArrayList<Object[]> result=new ArrayList<>();
        result.add(header);

        for (int index=0;index<data.size();index++)
        {
            result.add(data.get(index).toArray());
        }
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String nameFile="LSPEF"+timestamp;
        try {
            writeFile(result,nameFile, "Loai San Pham");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void exportNhaCungCap(String[] header, ArrayList<NhaCungCap> data)
    {
        ArrayList<Object[]> result=new ArrayList<>();
        result.add(header);

        for (int index=0;index<data.size();index++)
        {
            result.add(data.get(index).toArray());
        }
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long time= timestamp.getTime();
        String nameFile="NCCEF"+time;
        try {
            writeFile(result,nameFile, "Nha Cung Cap");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportHoaDon(String[] header, ArrayList<HoaDon> dataSheet1)
    {


    }
    public void exportPhieuNhap(String[] header, ArrayList<Object[]> data)
    {

    }
    public void exportKhuyenMai(String[] header, ArrayList<Object> data)
    {

    }

}
