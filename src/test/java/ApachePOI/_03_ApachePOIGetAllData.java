package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0); //İlk sayfa

        //Zoo.length kaç satrım var
        int rowCount = sheet.getPhysicalNumberOfRows();//Satır sayısını aldım
        System.out.println("rowCount = " + rowCount);

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);//Satırı aldım //1.satır gibii devamı 2.satır
            int cellCount = row.getPhysicalNumberOfCells();//SAtırdaki hücre sayısı
            for (int j = 0; j < cellCount; j++) {
                System.out.print(row.getCell(j)+" ");

            }
            System.out.println();
        }

        //2.Yol
        for (int i = 0; i <sheet.getPhysicalNumberOfRows();  i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.print(sheet.getRow(i).getCell(j)+" ");

            }
            System.out.println();
        }

    }
}
