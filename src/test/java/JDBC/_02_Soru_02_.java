package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Soru_02_ extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet sonuç = statement.executeQuery("select * from city");

        while (sonuç.next())
            System.out.println(sonuç.getString("city"));

        DBConnectionClose();
    }
}
