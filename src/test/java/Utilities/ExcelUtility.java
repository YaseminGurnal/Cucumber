package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtility {
    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int istenenKolonSayısı) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        Sheet sheet = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> satir = new ArrayList<>();
            for (int j = 0; j < istenenKolonSayısı; j++) {
                satir.add(sheet.getRow(i).getCell(j).toString());
            }
            tablo.add(satir);
        }


        return null;
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

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


