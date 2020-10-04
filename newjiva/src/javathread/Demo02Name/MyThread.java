package javathread.Demo02Name;

public class MyThread extends Thread {
    @Override
    public void run() {
       /*方法一：
        String name = getName();
        System.out.println(name);
        */
        //方法二：
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);
        //System.out.println(Thread.currentThread().getName());
    }
}
