package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _07_Soru extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        //City tablosundaki tüm satırlardaki  şehir isimlerini relative  ile yazdırınız
        DBConnectionOpen();
        ResultSet resultSet = statement.executeQuery("select city from city");

        resultSet.last();
        int sonSatır = resultSet.getRow();  //Son satırdan ilk satıra git ve oradan başla
        resultSet.first();

        for (int i = 1; i < sonSatır; i++) {
            resultSet.relative(1); //Bulunduğun yerden 1 den başla git 
            System.out.println(resultSet.getString(1));

        }

        DBConnectionClose();

    }
}
