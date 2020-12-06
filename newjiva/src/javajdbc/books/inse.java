package javajdbc.books;

import java.sql.*;

public class inse {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try(
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306" +
                        "/test?characterEncoding=UTF-8",
                                "root","150650"
                        );
                Statement s = c .createStatement();

        )
        {
            long st = System.currentTimeMillis();
            for(int i=1;i<100;i++){
                s.executeUpdate("insert into jdbc_test values(" +
                        "null,'姓名"+i+"',1)");
            }
            System.out.println(System.currentTimeMillis()-st);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
