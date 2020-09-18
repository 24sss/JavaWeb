package javajichu.mod3jiekou.fore;

public interface Myinterface {
    public default void method1(){
        System.out.println("测试私有化方法一");
        my();
    }
    public default void method2(){
        System.out.println("测试私有化方法二");
        my();
    }

    private void my(){
        System.out.println("aaaaa");
    }
}
