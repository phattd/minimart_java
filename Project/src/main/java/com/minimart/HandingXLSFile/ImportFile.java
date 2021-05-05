package com.minimart.HandingXLSFile;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

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
        JOptionPane.showMessageDialog(null,"Lỗi JChooserFile! Vui lòng khởi động lại phần mềm!");
        return null;
    }
    public ArrayList<Object[]> readData()
    {
        ArrayList<Object[]> result=new ArrayList<>();
        File file=chooseFile();
        try {
            FileInputStream inputStream=new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Workbook workbook=new HSSFWorkbook();
        Sheet sheet=workbook.getSheetAt(0);
        int rowCount=sheet.getLastRowNum()- sheet.getFirstRowNum();
        for (int indexRow=0;indexRow<rowCount;indexRow++)
        {
            Row row=sheet.getRow(indexRow);
            for (int indexCell=0;indexCell<row.getLastCellNum();indexCell++)
            {
                ArrayList<Object> temp=new ArrayList<>();

                temp.add(row.getCell(indexCell));

            }
        }
        return null;

    }
}
