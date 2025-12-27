package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet resultSet= statement.executeQuery("Select * from language");
        resultSet.next();//Bir adım ileri git anlamında next
        System.out.println("1.Satır ="+resultSet.getString(2));//2 index değil kolon sırası English
        System.out.println("2.Satır ="+resultSet.getString(2)); //İtalian

        resultSet.previous();//1 adım geri git yani English olan yere gelir
        System.out.println("1.Satır ="+resultSet.getString(2));



        DBConnectionClose();
    }
}
