package javajichu.mod3jiekou.StaTic;

public interface Myinterface {
    public static  void method(){
        System.out.println("静态方法私有化吧");
        my();
    }

    private static void my(){
        System.out.println("aaaa");
    }
}
