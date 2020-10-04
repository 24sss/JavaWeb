package javathread.Demo03setName;

public class Thread3 {
    public static void main(String[] args) {
        //方法一：
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();
        //方法二：
        MyThread mt1 = new MyThread("小狗");
        mt1.start();
        //小狗  小强

    }
}
