package ApachePOI;

/*
   Main den bir metod çağırmak suretiyle, path i ve sheetName i verilen excelden
   istenilen sütun kadar veriyi okuyup bir List e atınız.Mainde Listi yazdırınız.
   Bu soruda kaynak Excel için : ApacheExcel2.xlsx  in 2.sheet ini kullanabilirsiniz.
 */

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class _09_Soru {
    public static void main(String[] args) {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx";
        String sheetName = "testCitizen";
        int istenenKolonSayısı = 2;

        ArrayList<ArrayList<String>> gelenData = getData(path, sheetName, istenenKolonSayısı);

        for (ArrayList<String> satır : gelenData) {
            for (String hucre : satır)
                System.out.println(hucre + " ");
        }
        System.out.println();


    }

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
}
