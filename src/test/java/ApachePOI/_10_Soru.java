package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _10_Soru {

    /*
       Main den bir metod çağırmak suretiyle, henüz oluşturulmamış
       path i verilen excel için, program her çalıştıkça içine "test passed"
       yazısını ekleyen metodu yazınız.
       Yani dosya yoksa oluştur ilk satıra yaz, sonra dosya oluşacağı için
       dosya varsa en son satırın altına yaz.


     */
    public static void main(String[] args) {

        String path = "src/test/java/ApachePOI/resource/TestSonuclari.xlsx";

        String testSonuc = "Test Passed";

        writeToExcel(path, testSonuc); //excel create
        writeToExcel(path, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, testSonuc); //dosya artık var ekleyecek
    }

    public static void writeToExcel(String path, String testResult) {
        File dosya = new File(path);

        try {
            if (!dosya.exists()) {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Sayfa 1");
                Row yeniSatır = sheet.createRow(0);
                Cell yeniHucre = yeniSatır.createCell(0);
                yeniHucre.setCellValue(testResult);
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
                yeniHucre.setCellValue(testResult);
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
                System.out.println("Dosyaya eklendi.");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}

