package com.minimart.HandingPDFFile;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.minimart.DTO.HoaDon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;

public class PrintPDF {
    private final File fontFile = new File("./Font/vuArial.ttf");
    private final BaseFont font=BaseFont.createFont(fontFile.getAbsolutePath(),BaseFont.IDENTITY_H,BaseFont.EMBEDDED);

    public PrintPDF() throws IOException, DocumentException {
    }

    public void printBill(HoaDon hoaDon) throws DocumentException, IOException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String nameFile= "./billSave/"+hoaDon.getIdHoaDon()+"-"+timestamp.getTime()+".pdf";
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(nameFile));
        document.open();
        //Tạo Header
        Image image=Image.getInstance("C:\\Users\\Admin\\Pictures\\Dekiemtra2018-2019monLTDT\\test.jpg");
        document.add(image);
        String str="Bill No. 12345678 \nEmployee No. 87241\nCustomer No.7234793274\nAddress 273, An Duong Vuong, Quận 5";
        Paragraph header =new Paragraph(str,new Font(font,20));
        document.add(header);
        String line="===================================";
        Paragraph drawLine=new Paragraph(line);
        document.add(drawLine);
        //Tạo Nội Dung
        /*PdfPTable table = new PdfPTable(2);
        table.setWidthPercentage(50);
        table.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.setWidths(new int[]{5, 1});
        table.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        table.addCell("Name: " + DATA[0][0]);
        table.addCell(DATA[0][1]);
        table.addCell("Surname: " + new Phrase(DATA[1][0],new Font(font,12)));
        table.addCell(DATA[1][1]);
        table.addCell("School: " + DATA[2][0]);
        table.addCell(DATA[1][1]);
        document.add(table);*/
        //Tạo Phần Tổng Tiền
        document.add(drawLine);
        PdfPTable tableTotal = new PdfPTable(2);
        tableTotal.setWidthPercentage(50);
        tableTotal.setHorizontalAlignment(Element.ALIGN_LEFT);
        tableTotal.setWidths(new int[]{5, 1});
        tableTotal.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        tableTotal.addCell(new Phrase("Tổng Cộng: ",new Font(font,12)));
        tableTotal.addCell(""+hoaDon.getTongTien());
        tableTotal.addCell(new Phrase("Tiền Khuyến Mãi: ",new Font(font,12)));
        tableTotal.addCell(""+hoaDon.);
        tableTotal.addCell(new Phrase("Tổng Cộng: ",new Font(font,12)));
        tableTotal.addCell("0");
        tableTotal.addCell(new Phrase("Tổng Cộng: ",new Font(font,12)));
        tableTotal.addCell("0");
        tableTotal.addCell(new Phrase("Tổng Cộng: ",new Font(font,12)));
        tableTotal.addCell(new Phrase("Tổng Cộng: ",new Font(font,12)));
        document.add(tableTotal);
        document.close();

    }
}
