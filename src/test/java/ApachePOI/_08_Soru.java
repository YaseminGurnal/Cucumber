package ApachePOI;

import io.cucumber.java.sl.Ce;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class _08_Soru {

// YeniExcel2.xlsx adında bir yeni excele merhaba Dünya 1 şeklinde yazı yazınız.
// Daha sonra program her yeniden çalıştırıldığında altına Merhaba Dünya 2...3
// şeklinde eklesin. Yani dosya yok ise oluşturup yazsın, daha sonra hep altına eklesin.

    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/Merhaba.xlsx";
        File dosya = new File(path);

        if (!dosya.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sayfa 1");
            Row yeniSatır = sheet.createRow(0);
            Cell yeniHucre = yeniSatır.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya 1");
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Dosya oluşturuldu.");

        } else {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            int enSonSAtır = sheet.getPhysicalNumberOfRows();
            Row yeniSatır = sheet.createRow(enSonSAtır);
            Cell yeniHucre = yeniSatır.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya " + (enSonSAtır + 1));
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Dosyaya eklendi.");
        }
        System.out.println("İşlem tamamlandı.");
    }
}
