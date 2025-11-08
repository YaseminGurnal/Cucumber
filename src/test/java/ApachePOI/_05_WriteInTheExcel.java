package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _05_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);

        int enSonSatır=sheet.getPhysicalNumberOfRows(); //En son var olan satır no
        Row yeniSatır=sheet.createRow(enSonSatır); //En son boş yer yeni satır oluştur
        Cell yeniHücre=yeniSatır.createCell(0);//Yeni satırda yeni hücre oluştur

        yeniHücre.setCellValue("Merhaba Dünya");
        inputStream.close(); //Okuma modunda kapat

        //Dosyayı kaydet
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream); //Workbook u yaz
        workbook.close();
        fileOutputStream.close();//Yazma modunu kapat
        System.out.println("İşlem tamamlandı");



    }
}
