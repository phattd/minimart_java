package com.minimart.HandingXLSFile;

import com.minimart.BUS.*;
import com.minimart.DTO.*;
import com.minimart.Handing.HandingBUS;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

public class ImportFile {
    public ImportFile(){}
    public File chooseFile()
    {
        JFileChooser chooser=new JFileChooser();

        int returnValue=chooser.showOpenDialog(null);
        if (returnValue==JFileChooser.APPROVE_OPTION)
        {
            String path=chooser.getSelectedFile().getPath();
            String extension=path.substring(path.indexOf("."));
            if(extension.equals(".xls"))
            {
                File file = chooser.getSelectedFile();
                return file;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Vui lòng chọn file .xls");
                return null;
            }
        }
        return null;
    }
    public ArrayList<ArrayList<Object>> readData() throws IOException {
        ArrayList<ArrayList<Object>> result=new ArrayList<>();
        File file=chooseFile();
        FileInputStream inputStream=new FileInputStream(file);
        Workbook workbook=new HSSFWorkbook(inputStream);
        Sheet sheet=workbook.getSheetAt(0);
        int rowCount=sheet.getLastRowNum()- sheet.getFirstRowNum();
        for (int indexRow=1;indexRow<=rowCount;indexRow++)
        {
            Row row=sheet.getRow(indexRow);
            for (int indexCell=0;indexCell<row.getLastCellNum();indexCell++)
            {
                ArrayList<Object> temp=new ArrayList<>();
                if (row.getCell(indexCell).getCellType() == CellType.STRING)
                {
                    temp.add(row.getCell(indexCell).getStringCellValue());
                }
                if (row.getCell(indexCell).getCellType() ==CellType.NUMERIC)
                {
                    temp.add(row.getCell(indexCell).getNumericCellValue());
                }
                result.add(temp);


            }
        }
        return result;

    }

    public String[] getHeader() throws IOException {
        ArrayList<String> result=new ArrayList<>();
        File file=chooseFile();
        FileInputStream inputStream=new FileInputStream(file);
        Workbook workbook=new HSSFWorkbook(inputStream);
        Sheet sheet=workbook.getSheetAt(0);
        Row row=sheet.getRow(0);
        for (int indexCell=0;indexCell<row.getLastCellNum();indexCell++)
        {
            result.add(row.getCell(indexCell).getStringCellValue());

        }
        return result.stream().toArray(String[]::new);

    }

 /*   public void importNhanVien() throws IOException {
        boolean bool = false;
        int count=0;
        NhanVienBUS  nhanVienBUS=new NhanVienBUS();
        bool=Arrays.equals(NhanVien.getHeader(), this.getHeader());
        if (bool==true)
        {
            File file=chooseFile();
            FileInputStream inputStream=new FileInputStream(file);
            Workbook workbook=new HSSFWorkbook(inputStream);
            Sheet sheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator= sheet.iterator();
            rowIterator.next();

            while (rowIterator.hasNext())
            {
                Row row=rowIterator.next();
                Iterator<Cell> cellIterator=row.cellIterator();
                while (cellIterator.hasNext())
                {
                    HandingBUS handingBUS=new HandingBUS();
                    String idNhanVien=cellIterator.next().getStringCellValue();
                    String hoNV=cellIterator.next().getStringCellValue();
                    String tenNV=cellIterator.next().getStringCellValue();
                    String diaChi=cellIterator.next().getStringCellValue();
                    Timestamp ngaySinh=handingBUS.toDate(cellIterator.next().getStringCellValue());
                    String soDienThoai=cellIterator.next().getStringCellValue();
                    String password=cellIterator.next().getStringCellValue();
                    int luong=(int) cellIterator.next().getNumericCellValue();
                    String idChucVu=cellIterator.next().getStringCellValue();
                    String hinhAnh=cellIterator.next().getStringCellValue();

                    NhanVien nhanVien=new NhanVien(idNhanVien,hoNV,tenNV,diaChi,ngaySinh,soDienThoai,password,luong,idChucVu,hinhAnh);

                    if (nhanVienBUS.addData(nhanVien) == true)
                    {
                        count++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Có "+count+" được thêm vào");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"File không phù hợp.");
        }
    }
*/
    public void importKhachHang() throws IOException {
        boolean bool = false;
        int count=0;
        KhachHangBUS khachHangBUS=new KhachHangBUS();
        bool=Arrays.equals(KhachHang.getHeader(), this.getHeader());
        if (bool==true)
        {
            File file=chooseFile();
            FileInputStream inputStream=new FileInputStream(file);
            Workbook workbook=new HSSFWorkbook(inputStream);
            Sheet sheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator= sheet.iterator();
            rowIterator.next();
            while (rowIterator.hasNext())
            {
                Row row=rowIterator.next();
                Iterator<Cell> cellIterator=row.cellIterator();
                while (cellIterator.hasNext())
                {
                    String idKhachHang=cellIterator.next().getStringCellValue();
                    String hoKhachHang=cellIterator.next().getStringCellValue();
                    String tenKhachHang=cellIterator.next().getStringCellValue();
                    String bacTichLuy=cellIterator.next().getStringCellValue();
                    int diemTichLuy= (int) cellIterator.next().getNumericCellValue();

                    KhachHang khachHang=new KhachHang(idKhachHang,hoKhachHang,tenKhachHang,bacTichLuy,diemTichLuy);
                    if (khachHangBUS.addData(khachHang) == true)
                    {
                        count++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Có "+count+" được thêm vào");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"File không phù hợp.");
        }
    }

    public void importSanPham() throws IOException {
        boolean bool = false;
        int count=0;
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        bool=Arrays.equals(SanPham.getHeader(), this.getHeader());
        if (bool==true)
        {
            File file=chooseFile();
            FileInputStream inputStream=new FileInputStream(file);
            Workbook workbook=new HSSFWorkbook(inputStream);
            Sheet sheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator= sheet.iterator();
            rowIterator.next();

            while (rowIterator.hasNext())
            {
                Row row=rowIterator.next();
                Iterator<Cell> cellIterator=row.cellIterator();
                while (cellIterator.hasNext())
                {
                    String idSanPham=cellIterator.next().getStringCellValue();
                    String tenSanPham=cellIterator.next().getStringCellValue();
                    String idLoaiSanPham=cellIterator.next().getStringCellValue();
                    int donGia= (int) cellIterator.next().getNumericCellValue();
                    String donViTinh=cellIterator.next().getStringCellValue();
                    int soLuong= (int) cellIterator.next().getNumericCellValue();
                    String hinhAnh=cellIterator.next().getStringCellValue();

                    SanPham sanPham=new SanPham(idSanPham,tenSanPham,idLoaiSanPham,donGia,donViTinh,soLuong,hinhAnh);

                    if (sanPhamBUS.addData(sanPham) == true)
                    {
                        count++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Có "+count+" được thêm vào");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"File không phù hợp.");
        }
    }

  /*  public void importHoaDon() throws IOException {
        boolean bool = false;
        int count=0;
        HoaDonBUS hoaDonBUS=new HoaDonBUS();
        bool=Arrays.equals(HoaDon.getHeader(), this.getHeader());
        if (bool==true)
        {
            File file=chooseFile();
            FileInputStream inputStream=new FileInputStream(file);
            Workbook workbook=new HSSFWorkbook(inputStream);
            Sheet sheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator= sheet.iterator();
            rowIterator.next();

            while (rowIterator.hasNext())
            {
                Row row=rowIterator.next();
                Iterator<Cell> cellIterator=row.cellIterator();
                while (cellIterator.hasNext())
                {
                    HandingBUS handingBUS=new HandingBUS();
                    String idHoaDon=cellIterator.next().getStringCellValue();
                    Date ngayLapHoaDon=handingBUS.toDate(cellIterator.next().getStringCellValue());
                    String idNhanVien=cellIterator.next().getStringCellValue();
                    int tongTien= (int) cellIterator.next().getNumericCellValue();
                    int tienKhachDua= (int) cellIterator.next().getNumericCellValue();
                    int tongTienKhuyenMai= (int) cellIterator.next().getNumericCellValue();
                    int tienConLai= (int) cellIterator.next().getNumericCellValue();
                    int tienThua= (int) cellIterator.next().getNumericCellValue();
                    String idKhachHang= cellIterator.next().getStringCellValue();
                    HoaDon hoaDon=new HoaDon(idHoaDon,ngayLapHoaDon,idNhanVien,tongTien,tienKhachDua,tongTienKhuyenMai,tienConLai,tienThua,idKhachHang);
                    if (hoaDonBUS.addData(hoaDon) == true)
                    {
                        count++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Có "+count+" được thêm vào");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"File không phù hợp.");
        }
    }*/

    public void importChiTietHoaDon() throws IOException {
        boolean bool = false;
        int count=0;
        ChiTietHoaDonBUS chiTietHoaDonBUS=new ChiTietHoaDonBUS();
        bool=Arrays.equals(ChiTietHoaDon.getHeader(), this.getHeader());
        if (bool==true)
        {
            File file=chooseFile();
            FileInputStream inputStream=new FileInputStream(file);
            Workbook workbook=new HSSFWorkbook(inputStream);
            Sheet sheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator= sheet.iterator();
            rowIterator.next();

            while (rowIterator.hasNext())
            {
                Row row=rowIterator.next();
                Iterator<Cell> cellIterator=row.cellIterator();
                while (cellIterator.hasNext())
                {
                    String idHoaDon=cellIterator.next().getStringCellValue();
                    String idSanPham=cellIterator.next().getStringCellValue();
                    int soLuong= (int) cellIterator.next().getNumericCellValue();
                    int donGia= (int) cellIterator.next().getNumericCellValue();
                    String idKhuyenMai=cellIterator.next().getStringCellValue();
                    int thanhTien= (int) cellIterator.next().getNumericCellValue();
                    int tienKhuyenMai= (int) cellIterator.next().getNumericCellValue();

                    ChiTietHoaDon chiTietHoaDon=new ChiTietHoaDon(idHoaDon,idSanPham,soLuong,donGia,idKhuyenMai,thanhTien,tienKhuyenMai);

                    if (chiTietHoaDonBUS.addData(chiTietHoaDon) == true)
                    {
                        count++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Có "+count+" được thêm vào");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"File không phù hợp.");
        }
    }

 /*   public void importPhieuNhap() throws IOException {
        boolean bool = false;
        int count=0;
        PhieuNhapBUS phieuNhapBUS=new PhieuNhapBUS();
        bool=Arrays.equals(PhieuNhap.getHeader(), this.getHeader());
        if (bool==true)
        {
            File file=chooseFile();
            FileInputStream inputStream=new FileInputStream(file);
            Workbook workbook=new HSSFWorkbook(inputStream);
            Sheet sheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator= sheet.iterator();
            rowIterator.next();

            while (rowIterator.hasNext())
            {
                Row row=rowIterator.next();
                Iterator<Cell> cellIterator=row.cellIterator();
                while (cellIterator.hasNext())
                {
                    HandingBUS handingBUS=new HandingBUS();
                    String idPhieuNhap=cellIterator.next().getStringCellValue();
                    String idNhaCungCap=cellIterator.next().getStringCellValue();
                    Date ngayNhap=handingBUS.toDate(cellIterator.next().getStringCellValue());
                    String idNhanVien=cellIterator.next().getStringCellValue();
                    int tongTien= (int) cellIterator.next().getNumericCellValue();

                    PhieuNhap phieuNhap=new PhieuNhap(idPhieuNhap,idNhaCungCap,ngayNhap,idNhanVien,tongTien);

                    if (phieuNhapBUS.addData(phieuNhap))
                    {
                        count++;
                    }

                }
            }
            JOptionPane.showMessageDialog(null, "Có "+count+" được thêm vào");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"File không phù hợp.");
        }
    }

*/
    public void importChiTietPhieuNhap() throws IOException {
        boolean bool = false;
        int count=0;
        ChiTietPhieuNhapBUS chiTietPhieuNhapBUS=new ChiTietPhieuNhapBUS();
        bool=Arrays.equals(ChiTietPhieuNhap.getHeader(), this.getHeader());
        if (bool==true)
        {
            File file=chooseFile();
            FileInputStream inputStream=new FileInputStream(file);
            Workbook workbook=new HSSFWorkbook(inputStream);
            Sheet sheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator= sheet.iterator();
            rowIterator.next();

            while (rowIterator.hasNext())
            {
                Row row=rowIterator.next();
                Iterator<Cell> cellIterator=row.cellIterator();
                while (cellIterator.hasNext())
                {
                    String idPhieuNhap=cellIterator.next().getStringCellValue();
                    String idSanPham=cellIterator.next().getStringCellValue();
                    int soLuong= (int) cellIterator.next().getNumericCellValue();
                    int donGia= (int) cellIterator.next().getNumericCellValue();
                    int thanhTien= (int) cellIterator.next().getNumericCellValue();
                    ChiTietPhieuNhap chiTietPhieuNhap=new ChiTietPhieuNhap(idPhieuNhap,idSanPham,soLuong,donGia,thanhTien);
                    if (chiTietPhieuNhapBUS.addData(chiTietPhieuNhap) == true)
                    {
                        count++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Có "+count+" được thêm vào");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"File không phù hợp.");
        }
    }








}
