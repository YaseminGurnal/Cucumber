package Utilities;

import JDBC.JDBCParent;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class DBUtility extends JDBCParent {
    public static List<List<String>> getListData(String sorgu) {
        List<List<String>> tablo = new ArrayList<>(); //Tablo oluşturduk gelen listeyi atmak için


        try {
            ResultSet rs = statement.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                ArrayList<String> satır = new ArrayList<>();//Satırları bir arrayliste attık
                for (int i = 1; i < rsmd.getColumnCount(); i++)  //Sonra kolon sayısı kadar dön
                    satır.add(rs.getString(i)); //Satırları doldur

                tablo.add(satır); //Ana tabloya ekle

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        DBConnectionClose();

        return tablo;
    }
}


