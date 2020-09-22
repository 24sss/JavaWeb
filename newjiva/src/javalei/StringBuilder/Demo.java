package javalei.StringBuilder;

public class Demo {
    public static void main(String[] args) {
        //空参数构造方法
        StringBuilder bui = new StringBuilder();//就是"",空字符串。
        System.out.println(bui);

        //有参
        StringBuilder bui1 = new StringBuilder("abc");
        System.out.println(bui1);//abc

    }
}
