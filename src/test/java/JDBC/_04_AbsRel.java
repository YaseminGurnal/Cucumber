package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_AbsRel extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet resultSet = statement.executeQuery("select * from film");

        resultSet.absolute(10);//Direk 10. satıra gider
        System.out.println("10.Satır=" + resultSet.getString("title"));
        System.out.println("5.Satır=" + resultSet.getString("title"));//Direk 5. satıra gider

        resultSet.relative(5);//Bulunduğun yerden 5. satıra git
        System.out.println("5.Satır=" + resultSet.getString("title"));

        resultSet.relative(1);






        DBConnectionClose();
    }
}
