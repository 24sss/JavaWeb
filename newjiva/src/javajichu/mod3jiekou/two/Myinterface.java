package javajichu.mod3jiekou.two;

public interface Myinterface {
    public abstract void method1();
    public default void method2(){
        System.out.println("定义默认方法");
    }

}
