package JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _09_GetMetaData extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet resultSet = statement.executeQuery("select * from city");

        //Sorgu sonucunda data dışındaki veriler kolan sayısı ve kolon isimleri
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int kolonSayısı = rsmd.getColumnCount();//Kolon sayısını aldık
        System.out.println("kolonSayısı = " + kolonSayısı);

        for (int i = 1; i <= kolonSayısı; i++) {
            System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i));

        }
        resultSet.next();
        for (int i = 1; i <= kolonSayısı; i++) {
            System.out.println(i + "Kolon=" + resultSet.getString(i));
        }


        DBConnectionClose();
    }
}
