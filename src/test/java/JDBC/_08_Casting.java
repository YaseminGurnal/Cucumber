package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _08_Casting extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet resultSet = statement.executeQuery("select city_id,city,country_id from city");
        resultSet.next();
        System.out.println("İd=" + resultSet.getString(1));//Getstring ile bütün tipleri alabilirim
        System.out.println("İd=" + resultSet.getString("city_id"));

        int city_id = resultSet.getInt("city_id");//Kolonun tipine uygun get ilede alabilirsin integer,string gibi..
        System.out.println("city_id = " + city_id);


        DBConnectionClose();
    }
}
