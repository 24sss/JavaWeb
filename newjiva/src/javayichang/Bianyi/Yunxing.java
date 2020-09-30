package javayichang.Bianyi;

public class Yunxing {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        try{//可能出现异常的代码
            System.out.println(a[3]);
        }
        catch (Exception e){//异常处理逻辑
            System.out.println(e); //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }
        System.out.println("后续代码");//后续代码
    }
}
