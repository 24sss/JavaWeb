package javajdbc.books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?" +
                                "characterEncoding=UTF-8",
                        "root","150650");
                Statement s = c.createStatement();

                )
        {System.out.println("连接成功");
            String s1 = "create table jdbc_test(" +
                    "id int auto_increment primary key," +
                    "name varchar(20)" +
                    "age int" +
                    ");";
            s.execute(s1);
        }
        catch (SQLException e){
            e.printStackTrace();
        }


    }
}
