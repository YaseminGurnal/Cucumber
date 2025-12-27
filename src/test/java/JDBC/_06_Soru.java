package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_Soru extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        //City tablosundaki tüm satırlardaki  şehir isimlerini absolute ile yazdırınız
        DBConnectionOpen();
        ResultSet resultSet = statement.executeQuery("select city from city");

        resultSet.last();
        int sonSatır = resultSet.getRow();

        for (int i = 0; i < sonSatır; i++) { //Son astıra kadr git
            resultSet.absolute(i);//1.ci satır 2.ci satır
            System.out.println(resultSet.getString("city"));//1 de verebilirdik city adı olan 1

        }

        DBConnectionClose();

    }
}
