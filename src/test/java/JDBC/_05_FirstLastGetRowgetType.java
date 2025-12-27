package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowgetType extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();
        ResultSet resultSet = statement.executeQuery("select city from city");

        resultSet.last();//Son satıra gider
        System.out.println("Son satır=" + resultSet.getString(1));
        int kaçınçıSatır = resultSet.getRow();//Sorgunun sonucunda dönen kayıt sayısı
        System.out.println("kaçınçıSatır = " + kaçınçıSatır);

        resultSet.first();//İlk satıra gider


        DBConnectionClose();
    }
}
