package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlDemo1 {

    public static void main(String[] arr) throws Exception {
        //注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root",
                "12345678");
        Statement statement = connection.createStatement();
        String sql = "update account set balance = 500 where id = 1";
        int count = statement.executeUpdate(sql);

        System.out.println(count);
        statement.close();
        connection.close();



    }
}
