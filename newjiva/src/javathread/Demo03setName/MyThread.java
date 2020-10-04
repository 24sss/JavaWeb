package javathread.Demo03setName;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public MyThread(String name) {
        super(name);
    }
    public MyThread(){}
}
