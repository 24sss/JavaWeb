package javajdbc.books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class in {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try(
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306" +
                        "/test?characterEncoding=UTF-8",
                         "root","150650");
                PreparedStatement s1 = c.prepareStatement("insert into jdbc_test values(null,?,1)")
                )
        {
            long st = System.currentTimeMillis();
            for(int i=0;i<100;i++){
                s1.setString(1,"姓名"+i);
                s1.executeUpdate();
            }
            System.out.println(System.currentTimeMillis()-st);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
