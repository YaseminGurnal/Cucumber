package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _04_GetASpecificData {
    /**
     * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
     * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
     * yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
     * bulup ve sonucun döndürülmesi için metod kullanınız.
     * src/test/java/ApachePOI/resources/LoginData.xlsx
     */
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
        //İstenen anahtar kelimeyi kullnıcıdan al
        Scanner oku = new Scanner(System.in);
        System.out.println("Aranacak kelime");
        String aranacakKelime = oku.nextLine();

        String dönenData = ExceldenGetir(aranacakKelime, path);
        System.out.println("dönenData = " + dönenData);


    }
    public static String ExceldenGetir(String aranacakKelime, String path) throws IOException {
        String dönecekData = "";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {//Sayfadaki satırı al
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranacakKelime)) {//sayfadaki i.ci satırı al ilk hücreyi al
                //Stringe çevir equals ile kelimeyi ara

                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    dönecekData = dönecekData + " " + sheet.getRow(i).getCell(j);

                }
            }

        }

        return dönecekData;
    }
}
