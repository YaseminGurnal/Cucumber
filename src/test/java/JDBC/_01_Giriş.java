package JDBC;

import java.sql.*;

public class _01_Giriş {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql//demo.mersys.io:33906/sakila";
        String username="admin";
        String password="Techno24Study.%=";

        //Bağlantı bilgilerini girdik DB server a bağlandık
        Connection bağlantı= DriverManager.getConnection(url,username,password);

        //Sorgu ekranı açtık
        Statement sorguEkranı=bağlantı.createStatement();

        //Sorgu ekranına sorguyu yazdım ve çalıştırdım
        ResultSet sonucTablosu= sorguEkranı.executeQuery("select * from customer");

        //Altta sonuçlar gözüküyordu programda burada next ile her bir satıra ulaşıp alıyorum
        sonucTablosu.next();
        String ad=sonucTablosu.getNString("first_name");
        String soyad=sonucTablosu.getNString("last_name");
        System.out.println("1.Satır ad ve soyad="+ad+" "+soyad);

        bağlantı.close();


    }
}
