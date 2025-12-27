package JDBC;

import com.mongodb.DB;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _10_Soru extends JDBCParent {
    //language tablosundaki tüm satırları ve tüm sütunları yazdırınız
    //aynı msql ekran sonucunda olduğu gibi
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();
        ResultSet resultSet = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = resultSet.getMetaData();

        int kolonSayısı = rsmd.getColumnCount();//Kolonu aldık

        for (int i = 1; i <= kolonSayısı; i++) {
            System.out.println(rsmd.getColumnName(i) + "\t");//Kolon isimlerini aldık

        }
        while (resultSet.next()) {//Kaç kere dönüceği belli olmadığı için
            for (int i = 1; i < kolonSayısı; i++) {
                System.out.println(resultSet.getString(i) + "\t");//Bu bölüm satırdaki kolonları yazdırır
            }

        }


        DBConnectionOpen();
    }


}


