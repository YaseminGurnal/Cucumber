package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import tech.grasshopper.pdf.pojo.cucumber.Row;

import java.io.FileInputStream;
import java.io.IOException;

public class _02_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx";
        //Java dosya okuma nesnesine bu yolu vererek bağlantı kuruyorum
        FileInputStream dosyaOkumaBağlantısı = new FileInputStream(path);

        //Dosya okuma işlemcisi üzrinden çalışma kitabını alıyorum
        //Hafızada workBook alıp oluşturdu
        Workbook çalışmaKitabı = WorkbookFactory.create(dosyaOkumaBağlantısı);

        //İstediğim çalışma sayfasını alıyorum
        Sheet çalışmaSayfası = çalışmaKitabı.getSheet("Sheet 1");

        //İstenen satırı alıyorum
        Row satır = (Row) çalışmaSayfası.getRow(0);

        //İstenen sütündaki hücreyi al
        Cell hücre = (Cell) satır.getCells();
        System.out.println("hücre = " + hücre);
    }
}
