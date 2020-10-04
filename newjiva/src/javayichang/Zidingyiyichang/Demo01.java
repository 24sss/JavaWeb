package javayichang.Zidingyiyichang;

import java.util.Scanner;

public class Demo01 {
     static  String[] usernames = {"张三","李四","王五"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        check(username);
    }
    public static void check(String username){
        for (String name : usernames) {
            if(name.equals(username)){
                try {
                    throw new RegisterException("亲，该用户名已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("注册成功");
    }
}
